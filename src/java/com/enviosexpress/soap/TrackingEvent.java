package com.enviosexpress.soap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TrackingEvent")
public class TrackingEvent {
    private String date;
    private String description;
    private String location;

    @XmlElement
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @XmlElement
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @XmlElement
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}

