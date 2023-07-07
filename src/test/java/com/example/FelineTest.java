package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {
    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, feline.eatMeat());
    }


    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult, feline.getFamily());


    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int expectedResult = 1;
        assertEquals(expectedResult, feline.getKittens());
    }

    @Test
    public void testCountKittens() {
        Feline feline = new Feline();
        int expectedResult = feline.getKittens();
        assertNotNull(expectedResult);
    }

}