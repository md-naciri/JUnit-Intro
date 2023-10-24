package com.UnistTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElecTest {
    Elec elec = new Elec();

    @Test
    void isPowerLessThan2000W() {
        assertTrue(elec.isPowerLessThan2000W(220,4));
        assertTrue(elec.isPowerLessThan2000W(220,10));
        assertTrue(elec.isPowerLessThan2000W(220,9));
    }
}