package Model;

import java.time.LocalDateTime;


public class Event {
    private int eventId;
    private String eventName;
    private LocalDateTime dateTime;
    private String location;
    private String description;
    private int maxParticipants;

    public Event() {
    }
    public Event(int eventId, String eventName, LocalDateTime dateTime, String location, String description, int maxParticipants) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.dateTime = dateTime;
        this.location = location;
        this.description = description;
        this.maxParticipants = maxParticipants;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }
    
    
}
