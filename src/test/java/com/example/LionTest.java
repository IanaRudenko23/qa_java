package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {
    Feline feline = new Feline();

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> result = lion.getFood();
        assertEquals(expectedResult, result);
        System.out.println(result);

    }

    @Test (expected = Exception.class)
    public void lionConstructorException () throws Exception {
        Lion lion = new Lion("Заяц", feline);
    }


}