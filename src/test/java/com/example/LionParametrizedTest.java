package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private static final int EXPECTED_KITTENS_COUNT = 1;

    Predator predator = new Feline();
    private final String sex;//самец, самка
    private final boolean hasMane;

    public LionParametrizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Пол {0} Наличие гривы {1}")
    public static Object[] getLionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }


    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(sex, predator);
        assertEquals(EXPECTED_KITTENS_COUNT, lion.getKittens());
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, predator);
        assertEquals(hasMane, lion.doesHaveMane());

    }


}