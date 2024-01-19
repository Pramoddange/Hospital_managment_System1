package models;

public class Room {
    String roomId;
    boolean isOccupied;
    Doctor doctor;
    Patient patient;

    public Room(String roomId, boolean isOccupied, Doctor doctor, Patient patient) {
        this.roomId = roomId;
        this.isOccupied = isOccupied;
        this.doctor = doctor;
        this.patient = patient;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
