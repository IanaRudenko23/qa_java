package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    Feline feline = new Feline();
    private final String sex;//самец, самка
    private final boolean hasMane;


    public LionParametrizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[] getSumData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }


    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(hasMane,lion.doesHaveMane());

    }



}