package com.demoqa.tests;

import com.github.javafaker.Faker;

public class TestData {

    static Faker faker = new Faker();
    // faker.number().numberBetween(min, max);
    // min - inclusive, max - exclusive : https://dius.github.io/java-faker/apidocs/index.html

    static String
            sourcePicture = "pictures/Picture.pic",
            checkPicture = "Picture.pic",
            studentState = "Uttar Pradesh",
            studentCity = "Lucknow";

    public static String getDayOfBirth() {
        int  dateBirthday = faker.number().numberBetween(1, 29);
        if (dateBirthday < 10) {
            return "0" + dateBirthday;
        }
        else {
            return dateBirthday + "";
        }
    }

    public static String getMonthOfBirth() {
        String month = "";
        int num = faker.number().numberBetween(0, 12);
        switch (num) {
            case 0: month = "January"; break;
            case 1: month = "February"; break;
            case 2: month = "March"; break;
            case 3: month = "April"; break;
            case 4: month = "May"; break;
            case 5: month = "June"; break;
            case 6: month = "July"; break;
            case 7: month = "August"; break;
            case 8: month = "September"; break;
            case 9: month = "October"; break;
            case 10: month = "November"; break;
            case 11: month = "December"; break;
        }
        return month;
    }
    public static String getGenderRandom() {
        String gender = "";
        int num = faker.number().numberBetween(1, 4);
        switch (num) {
            case 1: gender = "Male"; break;
            case 2: gender = "Female"; break;
            case 3: gender = "Other"; break;
        }
        return gender;
    }

    public static String getSubjectsRandom() {
        String subject = "";
        int num = faker.number().numberBetween(0,5);
        switch (num) {
            case 0: subject = "Arts"; break;
            case 1: subject = "Biology"; break;
            case 2: subject = "Maths"; break;
            case 3: subject = "Accounting"; break;
            case 4: subject = "Chemistry"; break;
        }
        return subject;
    }

    public static String getRandomHobby() {
        String hobby = "";
        int num = faker.number().numberBetween(0, 3);
        switch (num) {
            case 0: hobby = "Sports"; break;
            case 1: hobby = "Music"; break;
            case 2:  hobby = "Reading"; break;
        }
        return hobby;
    }
}
