package models;

public class Patient {
    int pId;
    String name;
    String disease;
    int age;
    long phoneNumber;
    String gender;
    String emailId;
    Doctor doctor;
    Room room;

    public Patient(int pId, String name, String disease, int age, long phoneNumber, String gender, String emailId,Doctor doctor,Room room) {
        this.pId = pId;
        this.name = name;
        this.disease = disease;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.emailId = emailId;
        this.doctor=doctor;
        this.room=room;
    }
}
