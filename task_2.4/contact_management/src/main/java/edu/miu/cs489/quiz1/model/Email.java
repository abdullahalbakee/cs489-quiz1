package edu.miu.cs489.quiz1.model;

public class Email {
    private String label;
    private String email;

    public Email(String label, String email) {
        this.label = label;
        this.email = email;
    }

    public String getLabel() {
        return label;
    }

    public String getEmail() {
        return email;
    }
}
