package model.entities;

public class Square implements Figure{
    
    private double size;

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double area() {
        return Math.pow(size, 2);
    } 
}
