package models;

import database.DoctorDatabase;
import database.PatientDatabase;
import database.RoomDatabase;

public class Hospital {
    private String name;
    private String address;
    private long phoneNumber;
    private String emailId;
    private PatientDatabase patientDatabase;
    private DoctorDatabase doctorDatabase;
    private RoomDatabase roomDatabase;
    public Hospital(String name, String address, long phoneNumber, String emailId) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.patientDatabase=new PatientDatabase();
        this.doctorDatabase = new DoctorDatabase();
        this.roomDatabase=new RoomDatabase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public void admitPatient(String name,int age,long phoneNumber,String emailId,String gender,String disease){
        //patient will provide detailed
        //Now it is work of hospital to assign of all feature
        //using database to save the patient obj
        //1.generate id of patient
        int totalPatientCount=patientDatabase.getTotalPatientCount();
        String pId="PID"+totalPatientCount;
        //2.get doctor who handling minimumNo of patient
        Doctor doctor=doctorDatabase.getMinimumPatientDoctor();
        //3.get room which is not occupied
        Room room=roomDatabase.getUnoccupiedRoom();
        room.setOccupied(true);
        Patient p= new Patient(pId,name,disease,age,phoneNumber,gender,emailId,doctor,room,true);
        doctor.patientList.add(p);
        System.out.println("Patient got admitted successfully ->"+p);
    }
    public void createRoom(){
        String roomId="ROMID"+(roomDatabase.getTotalRooms()+1);
        Room room=new Room(roomId,false,null,null);
        roomDatabase.addRoomToDb(room);
        System.out.println("Room added Successfully->"+room);
    }
    public void appointDoctor(String docDegree,String name,long phoneNumber,String speciality,int salary,String timeSlot){
        String docId="DOCID"+(doctorDatabase.getDoctorID()+1);
        Doctor doc=new Doctor(docId,docDegree,phoneNumber,name,speciality,salary,timeSlot);
        doctorDatabase.addDoctorToDB(doc);
        System.out.println("Doctor created successfully ->"+doc);
    }

}
