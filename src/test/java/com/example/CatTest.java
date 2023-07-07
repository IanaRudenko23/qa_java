package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
public class CatTest {
    Feline feline = new Feline();
    @Test
    public void getSound() {
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";
        assertEquals(expectedResult, cat.getSound());

    }

    @Test
    public void getFood() throws Exception{
        Cat cat = new Cat(feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, cat.getFood());

    }



}