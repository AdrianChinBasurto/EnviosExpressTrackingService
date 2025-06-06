# EnviosExpressTrackingService
# 📦 EnvíosExpress S.A.C. - API SOAP Seguimiento de Paquetes

- Actividad de Aprendizaje 2 de Arquitectura de Software.

## 👨‍🏫 Docente
Ing. Geovanny Cudco

## 🧑‍💻 Desarrollado por
- Yandri Stalin Gaona Cumbicus
- Adrian Basurto chin
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
