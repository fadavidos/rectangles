package com.fabian.osorio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IntersectionTest {

    @Test
    public void intersectionEj1() {
        Point topLeft1 = new Point(2, 6);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(4, 5);
        Point bottomRight2 = new Point(5, 3);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertTrue(rect1.intersects(rect2));
    }

    @Test
    public void intersectionEj2() {
        Point topLeft1 = new Point(2, 6);
        Point bottomRight1 = new Point(3, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(5, 6);
        Point bottomRight2 = new Point(6, 4);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertFalse(rect1.intersects(rect2));
    }

    @Test
    public void intersectionEj3() {
        Point topLeft1 = new Point(2, 6);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(4, 7);
        Point bottomRight2 = new Point(5, 5);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertTrue(rect1.intersects(rect2));
    }

    @Test
    public void intersectionEj4() {
        Point topLeft1 = new Point(2, 6);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(4, 9);
        Point bottomRight2 = new Point(5, 7);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertFalse(rect1.intersects(rect2));
    }

    @Test
    public void intersectionEj5() {
        Point topLeft1 = new Point(2, 6);
        Point bottomRight1 = new Point(3, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(5, 5);
        Point bottomRight2 = new Point(7, 4);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertFalse(rect1.intersects(rect2));
    }

    @Test
    public void intersectionEj6() {
        Point topLeft1 = new Point(2, 6);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(4, 3);
        Point bottomRight2 = new Point(1, 5);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertFalse(rect1.intersects(rect2));
    }

    @Test
    public void intersectionEj7() {
        Point topLeft1 = new Point(2, 6);
        Point bottomRight1 = new Point(3, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(1, 5);
        Point bottomRight2 = new Point(4, 4);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertTrue(rect1.intersects(rect2));
    }


}
