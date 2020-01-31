package object.oriented.java;

import object.oriented.java.SystemException;
import object.oriented.java.figures.Figure;

import java.util.Comparator;

public class FigureAreaComparator implements Comparator<Figure> {
    @Override
    public int compare(Figure f1, Figure f2) {
        try {
            return (int)(f1.getArea() - f2.getArea());
        } catch (SystemException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
