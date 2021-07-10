package com.demoqa.automation.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("es-ES"));


    private String firstName, lastName, email, numberMobile,  subjects, currentAddress, state, city, extensionSubmittingForm, uploadPicture;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getNumberMobile() {
        return numberMobile;
    }

    public String getSubjects() {
        return subjects;
    }

    public String gete() {
        return uploadPicture;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
    public String getExtensionSubmittingForm() {
        return extensionSubmittingForm;
    }

    public DataInjection() {
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.numberMobile = Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.currentAddress = faker.address().fullAddress();
        this.subjects = "Arts";
        this.state = "NCR";
        this.city = "Gurgaon";
        this.extensionSubmittingForm = "Thanks for submitting the form";
        this.uploadPicture = "C:\\Users\\Lulu\\Pictures\\img1.jpg";





    }
}
