package com.example.tl_proodos;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    @Test
    public void testRomanNumerals() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i + " -> " + RomanNumerals(i));
        }
    }
}

