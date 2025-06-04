package com.enviosexpress.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.*;

@WebService(serviceName = "TrackingService", targetNamespace = "http://logistica.com/ws/tracking")
public class TrackingService {

    private static Map<String, Paquete> paquetes = new HashMap<>();

    static {
        Paquete p = new Paquete();
        p.setTrackingNumber("PE1234567890");
        p.setStatus("En tránsito");
        p.setCurrentLocation("Lima - Perú");
        p.setEstimatedDeliveryDate("2025-04-15");

        TrackingEvent e1 = new TrackingEvent();
        e1.setDate("2025-04-05");
        e1.setDescription("Paquete recibido en bodega central");
        e1.setLocation("Lima");

        TrackingEvent e2 = new TrackingEvent();
        e2.setDate("2025-04-07");
        e2.setDescription("Salida hacia Lima");
        e2.setLocation("Arequipa");

        p.setHistory(Arrays.asList(e1, e2));

        paquetes.put(p.getTrackingNumber(), p);
    }

    @WebMethod(operationName = "GetTrackingStatus")
    public GetTrackingStatusResponse getTrackingStatus(@WebParam(name = "trackingNumber") String trackingNumber) throws Exception {
        if (trackingNumber == null || trackingNumber.trim().isEmpty()) {
            throw new Exception("El número de tracking no puede estar vacío.");
        }

        Paquete p = paquetes.get(trackingNumber);
        if (p == null) {
            throw new Exception("Tracking number no encontrado.");
        }

        GetTrackingStatusResponse response = new GetTrackingStatusResponse();
        response.setStatus(p.getStatus());
        response.setCurrentLocation(p.getCurrentLocation());
        response.setEstimatedDeliveryDate(p.getEstimatedDeliveryDate());
        response.setHistory(p.getHistory());

        return response;
    }
}
