package Model;

public class Participant {
    private int participantId;
    private String name;
    private String email;
    private String phone;
    private String registrationStatus;

    public Participant(int participantId, String name, String email, String phone, String registrationStatus) {
        this.participantId = participantId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.registrationStatus = registrationStatus;
    }

    public Participant() {
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
    
}
