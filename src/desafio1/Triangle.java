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
        int compareEdge12 = Double.compare(edge1, edge2);
        int compareEdge23 = Double.compare(edge2, edge3);
        int compareEdge13 = Double.compare(edge1, edge3);

        if (compareEdge12 == 0 && compareEdge23 == 0)
            return "Equilátero.";
        else if (compareEdge12 == 0 || compareEdge13 == 0 || compareEdge23 == 0) 
            return "Isosceles.";
        else
            return "Escaleno.";
    }

    public String getInternAngles() {
        double cousine3 = 
            (Math.pow(edge1, 2) + Math.pow(edge2, 2) - Math.pow(edge3, 2)) / (2*edge1*edge2);
        double angle3 = Math.toDegrees(Math.acos(cousine3));

        double cousine2 = 
            (Math.pow(edge1, 2) + Math.pow(edge3, 2) - Math.pow(edge2, 2)) / (2*edge1*edge3);
        double angle2 = Math.toDegrees(Math.acos(cousine2));

        double cousine1 = 
            (Math.pow(edge2, 2) + Math.pow(edge3, 2) - Math.pow(edge1, 2)) / (2*edge2*edge3);
        double angle1 = Math.toDegrees(Math.acos(cousine1));

        return angle1 + ", " + angle2 + ", " + angle3;
    }

    @Override
    public String toString() {
        return "Lados: " + edge1 + ", " + edge2 + ", "  + edge3 + "\n" +
            "Área: " + getArea() + "\n" + "Perimetro: " + getPerimeter() + "\n" +
            "Tipo do triagulo: " + getTriagleType() + "\n" +
            "Angulos internos: " + getInternAngles();
    }
}