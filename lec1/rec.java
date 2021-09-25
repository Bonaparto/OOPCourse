package lec1;

public class rec {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.0, 5.0);
        Rectangle r3 = new Rectangle(135.5, 215.9);

        System.out.println("\nColor of this rectangle is " + r1.Color());
        System.out.println("Area of this rectangle is " + r2.Area());
        System.out.println("Perimeter of this rectangle is " + r3.Perimeter() + "\n");

        System.out.println("Current length of this rectangle a side is " + r3.side_a);
        r3.decrease_side_a(-150.0);
        System.out.println("Current length of this rectangle a side is " + r3.side_a + "\n");

        System.out.println("Current length of this rectangle b side is " + r3.side_b);
        r3.decrease_side_b(130.0);
        System.out.println("Current length of this rectangle b side is " + r3.side_b + "\n");

        System.out.println("Current length of this rectangle b side is " + r3.side_b);
        r3.decrease_side_b(-130.0);
        System.out.println("Current length of this rectangle b side is " + r3.side_b + "\n");

        System.out.println("Current sides of this rectangle are " + r2.side_a + " " + r2.side_b);
        r2.switch_sides();
        System.out.println("Current sides of this rectangle are " + r2.side_a + " " + r2.side_b + "\n");

        System.out.println("Current sides of this rectangle are " + r1.side_a + " " + r1.side_b);
        r1.increase_side_a(-130);
        r1.increase_side_a(132.1);
        r1.increase_side_b(200.4);
        System.out.println("Current sides of this rectangle are " + r1.side_a + " " + r1.side_b + "\n");

        System.out.println("The area of this rectangle wtih sides " + r1.side_a + ", " + r1.side_b + " is " + r1.Area() + "\n");

        System.out.println("The perimeter of this rectangle with sides " + r3.side_a + ", " + r3.side_b + " is " + r3.Perimeter() + "\n");

        System.out.println("The color of this rectangle is " + r2.color);
        r2.change_color("yellow");
        System.out.println("The new color of this rectangle is " + r2.color);
    }
}

class Rectangle {

    double side_a, side_b;
    String color;

    Rectangle() {
        side_a = 1.0;
        side_b = 1.0;
        color = "black";
    }
    
    Rectangle(String z) {
        side_a = 1.0;
        side_b = 1.0;
        color = z;
    }

    Rectangle(double x, double y) {
        if(x <= 0 || y <= 0) System.out.println("Error, side cannot be less or equal 0.");
        else {
            side_a = x;
            side_b = y;
            color = "black";
        }
    }

    Rectangle(double x, double y, String z) {
        if(x <= 0 || y <= 0) System.out.println("Error, side cannot be less or equal 0.");
        else {
            side_a = x;
            side_b = y;
            color = z;
        }
    }
    
    double Perimeter() {
        return (side_a + side_b) * 2;
    }

    double Area() {
        return side_a * side_b;
    }

    String Color() {
        return color;
    }

    void change_color(String s) {
        color = s;
    }

    void switch_sides() {
        double temp = side_a;
        side_a = side_b;
        side_b = temp; 
    }

    void increase_side_a(double x) {
        if(x < 0) System.out.println("Cannot use negative number");
        else {
            side_a += x;
            System.out.println("Sucessfully done!");
        }
    }

    void decrease_side_a(double x) {
        if(x > 0) System.out.println("Cannot use positive number");
        else if(side_a + x <= 0) System.out.println("Error, side cannot be less or equal 0.");
        else {
            side_a += x;
            System.out.println("Sucessfully done!");
        }
    }

    void increase_side_b(double x) {
        if(x < 0) System.out.println("Cannot use negative number");
        else {
            side_b += x;
            System.out.println("Sucessfully done!");
        }
    }

    void decrease_side_b(double x) {
        if(x > 0) System.out.println("Cannot use positive number");
        else if(side_b + x <= 0) System.out.println("Error, side cannot be less or equal 0.");
        else {
            side_b += x;
            System.out.println("Sucessfully done!");
        }
    }
}