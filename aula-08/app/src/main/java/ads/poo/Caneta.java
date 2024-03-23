package ads.poo;

public class Caneta {
    private final String COR;
    private int quanTinta;
    private final String MARCA = "bic";

    public Caneta(int quanTinta, String cor) {
        this.quanTinta = quanTinta;
        this.COR = cor;
    }

   public Caneta(String cor){
        this(100, cor);
   }
   public Caneta(){

            this(100,"Preta");
   }
   public String desenhar(){
        return "Desenhando";
   }
}
