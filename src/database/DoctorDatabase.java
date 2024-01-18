package database;

import models.Doctor;
import models.Patient;

import java.util.HashMap;

public class DoctorDatabase {
    HashMap<String, Doctor> doctorDB;
    DoctorDatabase() {
        this.doctorDB = new HashMap<>();
    }
}
