package Ch8;// Exercise 8.4 Template: Rectangle.java
// Definition of class Rectangle

public class Rectangle {
// Instance Variables
    // the length of the rectangle
    // the width of the rectangle
    private double length;
    private double width;

// Constructor
    // constructor without parameters public Rectangle(), note default length=1.0, width=1.0
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    // constructor with length and width supplied public Rectangle( ..., ...)
    public Rectangle(double length, double width) {
        if (length <= 0.0 || length > 20.0) {
            throw new IllegalArgumentException("length must be between 0 and 20");
        }

        if (width <= 0 || width > 20) {
            throw new IllegalArgumentException("width must be between 0 and 20");
        }

        this.width = length;
        this.length = width;
    }

// Methods
    // validate and set length
    public void setLength(double length) {
        if (length < 0 || length >= 20) {
            throw new IllegalArgumentException("length must be between 0 and 20");
        }
        this.length = length;
    }

    // validate and set width
    public void setWidth(double width) {
        if (width < 0 || width >= 20) {
            throw new IllegalArgumentException("width must be between 0 and 20");
        }
        this.width = width;
    }

    // get value of length
    public double getLength() {
        return length;
    }

    // get value of width
    public double getWidth() {
        return width;
    }

    // calculate rectangle's perimeter
    public double getPerimeter() {
        // double perimeter = (length * 2) + (width * 2);
        return (length * 2) + (width * 2);
    }
    // calculate rectangle's area
    public double getArea() {
        return length * width;
    }

    // display info about the rectangle, width, length, perimeter and area.
    public String toString() {
        return String.format("width: %.2f, length: %.2f, perimeter: %.2f, area: %.2f",
                getWidth(), getLength(), getPerimeter(), getArea());
    }

} // end class Rectangle


//Ex 8.4 (Rectangle Class)
//        Create a class Rectangle with attributes "length" and "width", each of which defaults to "1".
//        Provide methods that CALCULATE "perimeter" and "area".
//        It has "get" and "set" methods for BOTH length and width"
//        The set methods should VERIFY that length and width are "floating point numbers LARGER than 0.0, and LESS than 20.0"
//        Write a program to test the class Rectangle (RectangleTest.java)


