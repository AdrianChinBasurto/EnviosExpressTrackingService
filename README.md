# EnviosExpressTrackingService
# 📦 EnvíosExpress S.A.C. - API SOAP Seguimiento de Paquetes

- Actividad de Aprendizaje 2 de Arquitectura de Software.

## 👨‍🏫 Docente
Ing. Geovanny Cudco

## 🧑‍💻 Desarrollado por
- Yandri Stalin Gaona Cumbicus
- Adrian Alberto Chin
- NRC: 23447


---

## 📌 Objetivo

Ofrecer a los clientes de EnvíosExpress S.A.C. la posibilidad de consultar el estado actual de sus paquetes a través de una API SOAP segura y estandarizada.

---

## ⚙️ Características

- Consulta de estado actual del paquete por número de seguimiento (tracking number).
- Respuesta con estado, ubicación, fecha estimada y eventos.
- Manejo de errores personalizado con mensajes claros.
- Servicio implementado en Java con JAX-WS y desplegado en Payara Server.

---

## 🧱 Entidades del sistema

### Paquete
- trackingNumber
- senderName
- receiverName
- origin
- destination
- weight
- dimensions
- status
- currentLocation
- estimatedDeliveryDate
- history (lista de `TrackingEvent`)

### TrackingEvent
- date
- description
- location

---

## 🧪 Ejemplo de invocación SOAP (SoapUI)

### 📨 Request
```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:log="http://logistica.com/ws/tracking">
   <soapenv:Header/>
   <soapenv:Body>
      <log:GetTrackingStatus>
         <log:trackingNumber>PE1234567890</log:trackingNumber>
      </log:GetTrackingStatus>
   </soapenv:Body>
</soapenv:Envelope>


## 📤 Response              
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/">
   <soapenv:Body>
      <log:GetTrackingStatusResponse xmlns:log="http://logistica.com/ws/tracking">
         <log:status>En tránsito</log:status>
         <log:currentLocation>Lima - Perú</log:currentLocation>
         <log:estimatedDeliveryDate>2025-04-15</log:estimatedDeliveryDate>
         <log:history>
            <log:event>
               <log:date>2025-04-05</log:date>
               <log:description>Paquete recibido en bodega central</log:description>
               <log:location>Lima</log:location>
            </log:event>
            <log:event>
               <log:date>2025-04-07</log:date>
               <log:description>Salida hacia Lima</log:description>
               <log:location>Arequipa</log:location>
            </log:event>
         </log:history>
      </log:GetTrackingStatusResponse>
   </soapenv:Body>
</soapenv:Envelope>

🧨 Manejo de errores
Si el número de tracking está vacío o no existe, se responde con un SOAP Fault personalizado:
<soap:Fault>
   <faultcode>soap:Server</faultcode>
   <faultstring>Tracking number no encontrado.</faultstring>
</soap:Fault>


🛠️ Cómo desplegar
Clona este repositorio.
-Abre el proyecto en Apache NetBeans IDE 14.
-Asegúrate de tener Java 17.
-Despliega el servicio en un servidor local.
-Accede al WSDL en: http://localhost:8080/TrackingService?wsdl

🔍 Pruebas en SoapUI
- Carga el archivo `pruebas-soapui.xml` en SoapUI.
- Ejecuta las pruebas del request con diferentes tracking numbers.






