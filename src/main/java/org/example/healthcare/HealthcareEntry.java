package org.example.healthcare;

public class HealthcareEntry {
    private Subscriber Subscriber;
    private Patient Patient;
    private Case Case;
    private Service Service;

    // getters and setters

    public Subscriber getSubscriber() {
        return Subscriber;
    }

    public void setSubscriber(Subscriber Subscriber) {
        this.Subscriber = Subscriber;
    }

    public Patient getPatient() {
        return Patient;
    }

    public void setPatient(Patient Patient) {
        this.Patient = Patient;
    }

    public Case getCaseInfo() {
        return Case;
    }

    public void setCaseInfo(Case Case) {
        this.Case = Case;
    }

    public Service getService() {
        return Service;
    }

    public void setService(Service Service) {
        this.Service = Service;
    }
}
