package core;

import java.util.ArrayList;

public abstract class Doctor {

    protected int id;
    protected Team team;
    protected ArrayList<Appoiment> appoiments;
    protected ArrayList<Patient> patients;

    public Doctor(int id, Team team) {
        this.id = id;
        this.team = team;
        appoiments = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public void setAppoiment(Appoiment appoiment) {
        appoiments.add(appoiment);
    }

    public void setPatient(Patient patient) {
        patients.add(patient);
    }
}
