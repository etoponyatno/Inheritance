package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartphoneTest {

    Product smartphone1 = new Smartphone(1, "phone1", 1000, "producer1");

    @Test
    public void shouldMatchName() {
        String text = "phone1";
        assertTrue(smartphone1.matches(text));
    }

}
