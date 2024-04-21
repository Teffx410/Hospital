package core;

import java.util.ArrayList;

public class Patient {

    private int id;
    private Team team;
    private Ward ward;
    private ArrayList<Appoiment> appoiments;
    private ArrayList<Doctor> doctors;

    public Patient(Ward ward, Team team, int id) {
        this.id = id;
        this.team = team;
        this.ward = ward;
        appoiments = new ArrayList<>();
        doctors = new ArrayList<>();
    }

    public Patient(int id, ArrayList<Doctor> doctors) {
        this.id = id;
        this.doctors = doctors;
    }

    public int getId() {
        return this.id;
    }

    public void setDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void setAppoiment(Appoiment appoiment) {
        appoiments.add(appoiment);
    }

    public Team getTeam() {
        return this.team;
    }
    
    public ArrayList<Doctor> getDoctors(){
        return this.doctors;
    }
    
    public ArrayList<Appoiment> getAppoiments(){
        return this.appoiments;
    }

}
