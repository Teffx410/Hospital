package core;

import java.util.ArrayList;

public class Team {

    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Team(int idT, int iCD) {
        this.id = idT;
        this.teamLeader = new ConsultantDoctor(this, iCD, this);
        patients = new ArrayList<>();
        doctors = new ArrayList<>();

    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    public ArrayList<Patient> getPatients() {
        return this.patients;
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Doctor> getDoctors() {
        return this.doctors;
    }

}
