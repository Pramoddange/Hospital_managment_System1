package models;

import java.util.ArrayList;

public class Doctor {
    String docId;
    String docDegree;
    long phoneNumber;
    String name;
    String speciality;
    long salary;
    String timeSlot;
    ArrayList<Patient>patientList;

    public Doctor(String docId, String docDegree, long phoneNumber, String name, String speciality, long salary, String timeSlot) {
        this.docId = docId;
        this.docDegree = docDegree;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.speciality = speciality;
        this.salary = salary;
        this.timeSlot = timeSlot;
       this.patientList=new ArrayList<>();
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getDocDegree() {
        return docDegree;
    }

    public void setDocDegree(String docDegree) {
        this.docDegree = docDegree;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
}
