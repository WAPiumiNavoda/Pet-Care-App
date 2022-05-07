package com.mobileapplicationdevelopment.dogvio.data;

import com.mobileapplicationdevelopment.dogvio.SocialDogListAdapter;

public class SocialDog {
    private String name;
    private String breed;
    private String sex;
    private int age;
    private String contactNumber;
    private String image;
    private String description;
    private double longtitude;
    private double latitude;

    public SocialDog(String name, String breed, String sex, int age,
                     String contactNumber, String image, String description,
                     double longtitude, double latitude) {
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.age = age;
        this.contactNumber = contactNumber;
        this.image = image;
        this.description = description;
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    public SocialDog(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
