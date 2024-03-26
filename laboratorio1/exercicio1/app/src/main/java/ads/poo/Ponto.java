package ads.poo;

public class Ponto {
    private double x;
    private double y;


    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
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

       return Math.sqrt(Math.pow((p.getX() - this.x), 2) + Math.pow((p.getY() - this.y), 2));

    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
