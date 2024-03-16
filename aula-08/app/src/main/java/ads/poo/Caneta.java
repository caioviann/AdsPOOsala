package ads.poo;

public class Caneta {
    private String cor;
    private int quanTinta;


    public Caneta(int quanTinta, String cor) {
        this.quanTinta = quanTinta;
        this.cor = cor;
    }

   public Caneta(String cor){
        this(100, cor);
   }
   public Caneta(){

            this(100,"vermelha");
   }
}
