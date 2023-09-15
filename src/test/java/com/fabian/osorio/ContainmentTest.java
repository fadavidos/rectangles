package com.fabian.osorio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainmentTest {

    @Test
    public void containsEj1() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(3, 6);
        Point bottomRight2 = new Point(5, 5);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertTrue(rect1.contains(rect2));
    }

    @Test
    public void containsEj2() {
        Point topLeft1 = new Point(2, 6);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(4, 5);
        Point bottomRight2 = new Point(5, 3);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertFalse(rect1.contains(rect2));
    }

    @Test
    public void containsEj3() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(3, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(5, 6);
        Point bottomRight2 = new Point(6, 4);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertFalse(rect1.contains(rect2));
    }

}
