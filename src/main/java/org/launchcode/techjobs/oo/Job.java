package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //Initializes a unique ID
    public Job(){
        id = nextId;
        nextId++;
    }
    //Initializes secondary constructor using the other fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {


        String dataNotAvailable = "Data not available";
        String newline = System.lineSeparator();

        if(this.getEmployer()==null){
            return newline +
                    "ID: "+this.getId()+newline+
                    "Name: " +dataNotAvailable+
                    "Employer: "+dataNotAvailable+
                    "Location: "+dataNotAvailable+
                    "Position Type: "+dataNotAvailable+
                    "Core Competency: "+dataNotAvailable+
                    newline;
        }

        String name = this.getName();
        String employer = this.getEmployer().getValue();
        String location = this.getLocation().getValue();
        String position = this.getPositionType().getValue();
        String competency = this.getCoreCompetency().getValue();



        String jobName = name.isBlank() ? dataNotAvailable : name;
        String jobEmployer = employer.isBlank() ? dataNotAvailable : employer;
        String jobLocation = location.isBlank() ? dataNotAvailable : location;
        String jobPositionType = position.isBlank() ? dataNotAvailable : position;
        String jobCoreCompetency = competency.isBlank()? dataNotAvailable : competency;

        return newline +
                "ID: "+this.getId()+newline+
                "Name: " +jobName+newline+
                "Employer: "+jobEmployer+newline+
                "Location: "+jobLocation+newline+
                "Position Type: "+jobPositionType+newline+
                "Core Competency: "+jobCoreCompetency+
                newline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
