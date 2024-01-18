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
}
