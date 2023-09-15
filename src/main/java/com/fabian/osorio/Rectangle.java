package com.fabian.osorio;


public class Rectangle {
    Point topLeft;
    Point topRight;
    Point bottomLeft;
    Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.topRight = new Point(bottomRight.x, topLeft.y);
        this.bottomLeft = new Point(topLeft.x, bottomRight.y);
    }

    public boolean intersects(Rectangle other) {
        boolean xOverlap = this.topLeft.x <= other.bottomRight.x && this.bottomRight.x >= other.topLeft.x;
        boolean yOverlap = this.topLeft.y >= other.bottomRight.y && this.bottomRight.y <= other.topLeft.y;
        return xOverlap && yOverlap;
    }

    public boolean contains(Rectangle other) {
        boolean topLeftInside = this.topLeft.x <= other.topLeft.x && this.topLeft.y >= other.topLeft.y;
        boolean bottomRightInside = this.bottomRight.x >= other.bottomRight.x && this.bottomRight.y <= other.bottomRight.y;
        return topLeftInside && bottomRightInside;
    }

    public String adjacent(Rectangle other) {
        if(!this.intersects(other) || this.contains(other)) {
            return "No adjacent";
        }

        if ((this.topLeft.equals(other.topRight) && this.bottomLeft.equals(other.bottomRight)) ||
                (this.bottomLeft.equals(other.topLeft) && this.bottomRight.equals(other.topRight)) ||
                (this.topRight.equals(other.topLeft) && this.bottomRight.equals(other.bottomLeft)) ||
                (this.topLeft.equals(other.bottomLeft) && this.topRight.equals(other.bottomRight))) {
            return "Proper";
        }

        if ((this.topLeft.y >= other.topRight.y && this.bottomLeft.y <= other.bottomRight.y && (this.topLeft.x == other.topRight.x)) ||
                (this.bottomLeft.x <= other.topLeft.x && this.bottomRight.x >= other.topRight.x && (this.bottomLeft.y == other.topLeft.y)) ||
                (this.topRight.y >= other.topLeft.y && this.bottomRight.y <= other.bottomLeft.y) && (this.topRight.x == other.topLeft.x) ||
                (this.topLeft.x <= other.bottomLeft.x && this.topRight.x >= other.bottomRight.x && (this.topLeft.y == other.bottomLeft.y))) {
            return "Sub-line";
        }
        return "Partial";
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}