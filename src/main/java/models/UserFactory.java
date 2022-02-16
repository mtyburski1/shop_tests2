package models;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class UserFactory {
    public static User getRandomUser(){
        Random random = new Random();
        Faker faker = new Faker();

        User user = new User.Builder()
                .gender(faker.random().nextInt(0, 1))
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .email(faker.internet().emailAddress())
                .password(faker.internet().password())
                .offersEmailCheck(true)
                .privacyCheck(true)
                .newsletterCheck(true)
                .psgdprCheck(true)
                .build();

        return user;
    }
    public static User getRegisteredUser(){
        User user =new User.Builder()
                .gender(0)
                .firstName("Jan")
                .lastName("Kowalski")
                .email("siema.eniu@gmail.com")
                .password("razdwatrzy")
                .offersEmailCheck(true)
                .privacyCheck(true)
                .newsletterCheck(true)
                .psgdprCheck(true)
                .build();
        return user;
    }
    public static User getAlreadyRegisteredUser(){
        User user = new User.Builder()
                .email("email10@test.test")
                .password("jsdjka10")
                .build();
        return user;
    }
}
