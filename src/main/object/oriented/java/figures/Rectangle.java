package object.oriented.java.figures;

public class Rectangle implements Figure {

    public Integer base;
    public double height;
    public Double area = null;

    public Integer getArea(){
        area = base * height;
        return area;
    }

    public String toString(){
        return "Rectangle" + ", " + area;
    }
}
