package ravi_intellij;

interface Shape {
    double perimeter();
    double area();
}

class Circle implements Shape{
    private double radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}

class UseMyShape{
    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println("Area of circle:"+c.area());
        System.out.println("Perimeter of circle:"+c.perimeter());
    }
}
