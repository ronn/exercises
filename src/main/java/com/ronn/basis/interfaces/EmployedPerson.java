package com.ronn.basis.interfaces;

public class EmployedPerson extends Person implements  TaxPayer{

    String jobAddress;
    String ssn;

    public EmployedPerson(String jobAddress, String ssn) {
        this.jobAddress = jobAddress;
        this.ssn = ssn;
    }

    public EmployedPerson(String height, String weight, String fname, String lname) {
        this.height = height;
        this.weight = weight;
        this.fname = fname;
        this.lname = lname;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public double payTaxes() {
        //calculate taxex
        return 10.5;
    }

    @Override
    public String getTaxId() {
        return ssn;
    }
}