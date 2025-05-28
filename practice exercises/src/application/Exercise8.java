package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Figure;
import model.entities.Square;
import model.entities.Triangle;

public class Exercise8 {
    public static void main(String[] args) {
        
        List<Figure> myFigures = new ArrayList<>();
        myFigures.add(new Square(3));
        myFigures.add(new Triangle(3, 4));

        System.out.println("Total area: " + totalArea(myFigures));
    }

    public static double totalArea(List<Figure> list) {
        double sum = 0.0;

        for (Figure figure : list) {
            sum += figure.area();
        }

        return sum;
    }
}
