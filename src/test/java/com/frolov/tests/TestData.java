package com.frolov.tests;

import com.github.javafaker.Faker;

public class TestData {

    public static final Faker faker = new Faker();
    public static final Integer lowerEquivalenceAmount = faker.number().numberBetween(1, 50000),
            highestEquivalenceAmount = faker.number().numberBetween(7500000, 10000000),
            validEquivalenceAmount = faker.number().numberBetween(50000, 7500000);
    public static String phoneNumber = "846" + faker.phoneNumber().subscriberNumber(7),
            email = faker.internet().emailAddress();
    public static final String mainUrl = "https://www.alfabank.ru";
}

