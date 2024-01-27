package domain;

import com.github.javafaker.Faker;

public class RandomUserData {

    public static String getRandomCorrectEmail() {
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }

    public static String getRandomPassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }
}
