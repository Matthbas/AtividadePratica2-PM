package desafio1;

import java.lang.Exception;

public class Triangle {
    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(double edge1, double edge2, double edge3) throws Exception {
        validateEdges(edge1, edge2, edge3);
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public void validateEdges(double edge1, double edge2, double edge3) throws Exception {
        if (edge1 + edge2 <= edge3) {
            throw new Exception();
        }
        if (edge2 + edge3 <= edge1) {
            throw new Exception();
        }
        if (edge3 + edge1 <= edge2) {
            throw new Exception();
        }
    }

    public double getPerimeter() {
        return edge1 + edge2 + edge3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - edge1) * (p - edge2) * (p - edge3)));
    }

    public String getTriagleType() {
        return "";
    }

    @Override
    public String toString() {
        return "Lados: " + edge1 + ", " + edge2 + ", "  + edge3 + "\n" +
            "Área: " + getArea() + "\n" + "Perimetro: " + getPerimeter() + "\n" +
            "Tipo do triagulo: " + getTriagleType();
    }
}