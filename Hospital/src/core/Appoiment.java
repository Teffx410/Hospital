
package core;


public class Appoiment {
    private Patient patient;
    private Doctor doctor;   

    public Appoiment(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }
    
 
}
