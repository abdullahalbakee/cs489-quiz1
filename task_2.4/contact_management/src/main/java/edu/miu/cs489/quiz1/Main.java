package edu.miu.cs489.quiz1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import edu.miu.cs489.quiz1.model.Contact;
import edu.miu.cs489.quiz1.model.Email;
import edu.miu.cs489.quiz1.model.Phone;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
        contact1.getPhones().add(new Phone("Home", "240-133-0011"));
        contact1.getPhones().add(new Phone("Mobile", "240-112-0123"));
        contact1.getEmails().add(new Email("Home", "dave.sang@gmail.com"));
        contact1.getEmails().add(new Email("Work", "dsanger@argos.com"));

        Contact contact2 = new Contact("Carlos", "Jimenez", "Zappos", "Director");

        Contact contact3 = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        contact3.getPhones().add(new Phone("Work", "412-116-9988"));
        contact3.getEmails().add(new Email("Work", "ali@bmi.com"));

        List<Contact> contactList = List.of(contact1, contact2, contact3);
        printContacts(contactList);
    }

    private static void printContacts(List<Contact> contactList) {
        var sortedContacts = contactList.stream()
                .sorted(Comparator.comparing(Contact::getLastName))
                .toList();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = null;
        try {
            json = objectMapper.writeValueAsString(sortedContacts);
        } catch (JsonProcessingException e) {
            System.out.println("Could not write JSON");
        }
        System.out.println("All Contacts in JSON Format");
        System.out.println(json);
    }
}