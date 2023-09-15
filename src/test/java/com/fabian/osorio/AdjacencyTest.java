package com.fabian.osorio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdjacencyTest {

    @Test
    public void adjacencyNoAdjacentEj1() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(3, 6);
        Point bottomRight2 = new Point(5, 5);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("No adjacent" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencySubLineEj1() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(1, 6);
        Point bottomRight2 = new Point(2, 5);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Sub-line" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencySubLineEj2() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(4, 4);
        Point bottomRight2 = new Point(5, 3);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Sub-line" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencySubLineEj3() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(6, 5);
        Point bottomRight2 = new Point(8, 4);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Sub-line" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencySubLineEj4() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(2, 10);
        Point bottomRight2 = new Point(4, 7);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Sub-line" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencyProperEj1() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(1, 7);
        Point bottomRight2 = new Point(2, 4);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Proper" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencyProperEj2() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(2, 4);
        Point bottomRight2 = new Point(6, 2);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Proper" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencyProperEj3() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(6, 7);
        Point bottomRight2 = new Point(8, 4);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Proper" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencyProperEj4() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(2, 10);
        Point bottomRight2 = new Point(6, 7);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Proper" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencyPartialEj1() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(3, 10);
        Point bottomRight2 = new Point(7, 7);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Partial" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencyPartialEj2() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(1, 8);
        Point bottomRight2 = new Point(2, 5);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Partial" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencyPartialEj3() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(1, 4);
        Point bottomRight2 = new Point(7, 2);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Partial" ,rect1.adjacent(rect2));
    }

    @Test
    public void adjacencyPartialEj4() {
        Point topLeft1 = new Point(2, 7);
        Point bottomRight1 = new Point(6, 4);
        Rectangle rect1 = new Rectangle(topLeft1, bottomRight1);

        Point topLeft2 = new Point(6, 10);
        Point bottomRight2 = new Point(8, 6);
        Rectangle rect2 = new Rectangle(topLeft2, bottomRight2);

        assertEquals("Partial" ,rect1.adjacent(rect2));
    }


}
