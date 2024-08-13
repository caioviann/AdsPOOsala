package ads.poo;

import java.util.Objects;

public class Ball {
    private String type;
    private double size;
    private double weight;
    private String color;

    public Ball(String type, double size, double weight, String color) {
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(size, ball.size) == 0 && Double.compare(weight, ball.weight) == 0 && Objects.equals(type, ball.type) && Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size, weight, color);
    }

    @Override
    public String toString() {
        return "Bola{" +
                "tipo='" + type + '\'' +
                ", tamanho=" + size +
                ", peso=" + weight +
                ", cor='" + color + '\'' +
                '}';
    }
}
