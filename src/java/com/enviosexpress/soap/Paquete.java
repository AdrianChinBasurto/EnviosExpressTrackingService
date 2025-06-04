package com.enviosexpress.soap;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Package")
public class Paquete {
    private String trackingNumber;
    private String senderName;
    private String receiverName;
    private String origin;
    private String destination;
    private double weight;
    private String dimensions;
    private String status;
    private String currentLocation;
    private String estimatedDeliveryDate;
    private List<TrackingEvent> history;

    @XmlElement
    public String getTrackingNumber() { return trackingNumber; }
    public void setTrackingNumber(String trackingNumber) { this.trackingNumber = trackingNumber; }

    @XmlElement
    public String getSenderName() { return senderName; }
    public void setSenderName(String senderName) { this.senderName = senderName; }

    @XmlElement
    public String getReceiverName() { return receiverName; }
    public void setReceiverName(String receiverName) { this.receiverName = receiverName; }

    @XmlElement
    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    @XmlElement
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    @XmlElement
    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    @XmlElement
    public String getDimensions() { return dimensions; }
    public void setDimensions(String dimensions) { this.dimensions = dimensions; }

    @XmlElement
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @XmlElement
    public String getCurrentLocation() { return currentLocation; }
    public void setCurrentLocation(String currentLocation) { this.currentLocation = currentLocation; }

    @XmlElement
    public String getEstimatedDeliveryDate() { return estimatedDeliveryDate; }
    public void setEstimatedDeliveryDate(String estimatedDeliveryDate) { this.estimatedDeliveryDate = estimatedDeliveryDate; }

    @XmlElement(name = "history")
    public List<TrackingEvent> getHistory() { return history; }
    public void setHistory(List<TrackingEvent> history) { this.history = history; }
}

