package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return width*height;
    }
    public double perimeter(){
        return (width+height)*2;
    }
    public double diagonal(){
        return Math.sqrt(height*height + width*width);
    }
    public String toString(){
        return "AREA = "
            + String.format("%.2f\n", this.area())
            + "PERIMETER = "
            + String.format("%.2f\n", this.perimeter())
            + "DIAGONAL = "
            + String.format("%.2f\n", this.diagonal());
    }
}
