public class Shape {
    public double area() {
        return 0; 
    }

    public double area(double base, double height) {
        return 0.5 * base * height; 
    }

    public double area(double length, int width) {
        return length * width; 
    }

    public double area(double radius) {
        return Math.PI * radius * radius; 
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area (unknown shape): " + shape.area());

        double base = 6;
        double height = 4;
        double rectangleLength = 5;
        int rectangleWidth = 3;
        double radius = 2.5;

        System.out.println("Area of triangle: " + shape.area(base, height));
        System.out.println("Area of rectangle: " + shape.area(rectangleLength, rectangleWidth));
        System.out.println("Area of circle: " + shape.area(radius));
    }
}

