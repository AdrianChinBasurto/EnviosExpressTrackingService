package com.enviosexpress.soap;

import javax.xml.ws.WebFault;

@WebFault(name = "TrackingNotFoundException")
public class TrackingNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;
    private String invalidTrackingNumber;

    public TrackingNotFoundException(String message, String invalidTrackingNumber) {
        super(message);
        this.invalidTrackingNumber = invalidTrackingNumber;
    }

    public String getFaultInfo() {
        return "Número de seguimiento inválido: " + invalidTrackingNumber;
    }

    public String getInvalidTrackingNumber() {
        return invalidTrackingNumber;
    }
}
