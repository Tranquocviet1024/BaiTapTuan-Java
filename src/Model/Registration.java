package Model;


public class Registration {
    private int registrationId;
    private int eventId;
    private int participantId;
    private String status;

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Registration(int registrationId, int eventId, int participantId, String status) {
        this.registrationId = registrationId;
        this.eventId = eventId;
        this.participantId = participantId;
        this.status = status;
    }

    public Registration() {
    }
}
