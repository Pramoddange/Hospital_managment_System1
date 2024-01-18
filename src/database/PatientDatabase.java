package database;

import models.Patient;

import java.util.HashMap;

public class PatientDatabase {
    HashMap<Long, Patient>patientDB;
    PatientDatabase(){
        this.patientDB=new HashMap<>();
    }
    public void addPatient(Patient obj){
        long pId=obj.getpId();
        patientDB.put(pId,obj);
    }
    public Patient getPatient(long pId){
        return patientDB.get(pId);
    }
}
