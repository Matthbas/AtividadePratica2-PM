/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package desafio1;

/**
 *
 * @author Francisco de Paula Dias Neto
 */
public class Circle {
    // variáveis de instancia privadas, isto é, não acessíveis de fora desta classe.
    private double radius = 1.0;
    private Point center;
    private String color;
    private double perimeter;
    // primeiro construtor o qual atribui valores iniciais a ambos: radius e color.
    public Circle() {
        setPerimeter();
        center = new Point();
        center.setCoordinates(0, 0);
        this.color = "red";
    }
    // Segundo construtor que inicia radius com o parâmetro recebido, e matem color com
    //o valor padrão definido.
    public Circle(double radius) {
        this();
        this.radius = radius;
        this.setPerimeter(); // cria o objeto com o primeiro construtor:.Circle()
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private void setPerimeter() {
        this.perimeter = 2*radius*Math.PI;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    @Override
    public String toString() {
        return "Circulo: raio = " + radius + " cor = " + color;
    }

    public String getColor() {
        return color;
    }
    // Metodo de acesso para obter o valor armazenado em radius
    public double getRadius() {
        return radius;
    }
    // Metodo de acesso para computar a área de um circulo.
    public double getArea() {
        return radius*radius*Math.PI;
        // PI é a constante. Math é a classe onde PI é definido.
    }
}
