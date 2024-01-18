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
}
