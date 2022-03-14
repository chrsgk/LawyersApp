package com.example.lawyersapp.data;

import java.util.UUID;

public class Lawyer {
    private String id;
    private String name;
    private String speciality;
    private String phoneNumber;
    private String bio;
    private String avatarUri;

    public Lawyer( String name, String speciality, String phoneNumber, String bio, String avatarUri) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
        this.bio = bio;
        this.avatarUri = avatarUri;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBio() {
        return bio;
    }

    public String getAvatarUri() {
        return avatarUri;
    }
}
