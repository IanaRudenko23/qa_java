package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {

    private static final String EXPECTED_EXCEPTION_MESSAGE = "Используйте допустимые значения пола животного - самей или самка";
    Predator predator = new Feline();

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", predator);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> result = lion.getFood();
        assertEquals(expectedResult, result);
    }

    @Test
    public void lionConstructorException() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Заяц", predator));
        assertEquals(EXPECTED_EXCEPTION_MESSAGE, exception.getMessage());
    }

}