package com.UnistTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelTest {
    Vowel vowel = new Vowel();
    @Test
    void vowelCount() {
        assertEquals(0,vowel.vowelCount(" b m"));
        assertEquals(1,vowel.vowelCount(" b a $"));
        assertEquals(2,vowel.vowelCount("Anass"));
        assertEquals(1,vowel.vowelCount("Mjid"));
        assertEquals(3,vowel.vowelCount("Asmae"));
        assertEquals(0,vowel.vowelCount(null));
        assertEquals(0,vowel.vowelCount(""));
    }
}