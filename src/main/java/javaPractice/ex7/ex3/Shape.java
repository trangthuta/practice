package javaPractice.ex7.ex3;

abstract class Shape {
    protected String color ;
    protected Boolean filled  ;

    public Shape(String color, Boolean filled) {
        this.color = "red";
        this.filled = true;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void isFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea() ;
    public abstract double getPerimeter() ;

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", isFilled=" + filled +
                '}';
    }
}
