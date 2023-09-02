
interface Shape {
    double calculateArea();
    double calculateVolume();
}


class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}


class Cuboid extends Rectangle implements Shape {
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {

        return 2 * (length * width + width * height + height * length);
    }

    public double calculateVolume() {

        return length * width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        double length = 5.0;
        double width = 3.0;
        double height = 4.0;

 
        Cuboid cuboid = new Cuboid(length, width, height);

 
        System.out.println("Cuboid Area: " + cuboid.calculateArea());
        System.out.println("Cuboid Volume: " + cuboid.calculateVolume());
    }
}
