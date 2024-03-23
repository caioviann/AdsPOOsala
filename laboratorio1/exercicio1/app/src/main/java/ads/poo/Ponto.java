package ads.poo;

public class Ponto {
    private double x;
    private double y;


    public Ponto(double x, double y) {

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distancia(Ponto p){
           return Math.sqrt(Math.pow(p - this.x) + Math.pow(p - this.y));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
