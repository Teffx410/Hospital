
package core;

import java.util.ArrayList;


public class Ward {
    private int id;
    private ArrayList<Patient> patients;

    public Ward(int id) {
        this.id = id;
        patients = new ArrayList<>();
    }
    
    public void addPatient (Patient patient){
        this.patients.add(patient);        
    }
    
    public int getId() {
        return this.id;
    }
    
    public ArrayList<Patient> getPatients() {
        return this.patients;
    }
}
