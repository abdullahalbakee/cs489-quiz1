package edu.miu.cs489.quiz1.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;

    private List<Phone> phones;
    private List<Email> emails;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        phones = new ArrayList<>();
        emails = new ArrayList<>();
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
