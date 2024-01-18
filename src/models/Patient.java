package models;

public class Patient {
    long pId;
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

    public long getpId() {
        return pId;
    }

    public void setpId(long pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
