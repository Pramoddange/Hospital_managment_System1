package database;

import models.Patient;

import java.util.HashMap;

public class PatientDatabase {
    HashMap<String, Patient>patientDatabase;
    public PatientDatabase(){
        this.patientDatabase=new HashMap<>();
    }
    public void addPatient(Patient obj){
        String pId= obj.getpId();
        patientDatabase.put(pId,obj);
    }
    public  int getTotalPatientCount(){
        return patientDatabase.size();
    }
    public Patient getPatient(String pId){
        return patientDatabase.get(pId);
    }
}
