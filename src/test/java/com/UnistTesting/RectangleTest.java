package com.UnistTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle();
    @Test
    void perimeter() {
        assertEquals(16,rectangle.perimeter(2,6));
    }


}