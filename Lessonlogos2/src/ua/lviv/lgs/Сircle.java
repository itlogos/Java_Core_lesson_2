package ua.lviv.lgs;

public class Сircle {
    
    private double radius;
    private double diameter;
    private double squareСircle;
    private double perimeterСircle;

    
    
    Сircle (){
        this.radius = 3;
        squareСircle = 3.14 * radius * radius;
        perimeterСircle = 2 * 3.14 * radius;
    }
    
     Сircle (double diameter) {
        this.diameter = diameter;
        squareСircle = 3.14 * diameter * diameter / 4;
        perimeterСircle = 3.14 * diameter;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String toString() {
        return "Площа кола = " + squareСircle + ", Периметр кола = " + perimeterСircle;
    }
    
}
  


