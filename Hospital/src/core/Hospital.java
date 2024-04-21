package core;

import java.util.ArrayList;

public class Hospital {

    protected ArrayList<Team> teams;
    protected ArrayList<Ward> wards;

    public Hospital() {
        teams = new ArrayList<>();
        wards = new ArrayList<>();
    }

    public void addTeam(int idT, int idCD) {
        teams.add(new Team(idT, idCD));
    }

    public Team getTeam(int id) {
        for (Team team : this.teams) {
            if (team.getId() == id) {
                return team;
            }
        }
        return null;
    }

    public Ward getWard(int id) {
        for (Ward ward : this.wards) {
            if (ward.getId() == id) {
                return ward;
            }
        }
        return null;
    }

    public void addJuniorDoctor(Team team, int id) {
        team.addDoctor(new JuniorDoctor(id, team));
    }

    public void addWard(int id) {
        wards.add(new Ward(id));
    }

    public void addPatient(Ward ward, Team team, int id) {
        Patient patient = new Patient(ward, team, id);
        ward.addPatient(patient);
        team.addPatient(patient);
    }

    public Patient getPatient(int id) {
        for (Team team : this.teams) {
            for (Patient patient : team.getPatients()) {
                if (patient.getId() == id) {
                    return patient;
                }
            }
        }
        return null;
    }

    public Doctor getDoctor(int id) {
        for (Team team : this.teams) {
            for (Doctor doctor : team.getDoctors()) {
                if (doctor.getId() == id) {
                    return doctor;
                }
            }
        }
        return null;
    }

    public void assignPatientDoctor(Patient patient, int id) {
        Doctor doctor = getDoctor(patient.getTeam().getId() + id);
        patient.setDoctor(doctor);
        doctor.setPatient(patient);
    }

    public void assignAppoiment(Patient patient, int id) {
        Doctor doctor = getDoctor(patient.getTeam().getId() + id);
        Appoiment appoiment = new Appoiment(patient, doctor);
        patient.setAppoiment(appoiment);
        doctor.setAppoiment(appoiment);
    }

    public void numberDoctorsPatient() {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                System.out.println("Patient " + patient.getId() + " has " + patient.getDoctors().size() + " doctors");
            }
        }

    }

    public void numberPatientsTeam() {
        for (Team team : this.teams) {
            System.out.println("Team " + team.getId() + " has " + team.getPatients().size() + " patients");
        }
    }

    public void relationAppoiments() {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                System.out.println("Patient " + patient.getId() + " has " + patient.getAppoiments().size());
                for (Appoiment appoiment : patient.getAppoiments()) {
                    System.out.println("Patient " + patient.getId() + " has  an appoiment with the doctor " + appoiment.getDoctor().getId());
                }
            }
        }
    }

}
