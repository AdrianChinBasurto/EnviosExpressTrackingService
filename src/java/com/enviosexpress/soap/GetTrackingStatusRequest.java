package com.enviosexpress.soap;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GetTrackingStatusRequest")
public class GetTrackingStatusRequest {
    private String trackingNumber;

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
