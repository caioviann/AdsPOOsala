
package ads.poo;
import barcode.CodigoDeBarra;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;
public class App {

    public static void main(String[] args) throws IOException, WriterException {

        //Scanner linha = new Scanner(System.in);
        //int linhas = 1;

        //while(linha.hasNext()){
            //String aux = linha.nextLine();

            //System.out.println(linhas + "- " + aux.toUpperCase());
            //linhas++;
       // if (args.length > 0) {
         //   System.out.println("Olá " + args[0]);

        CodigoDeBarra.gerarCodigoDeBarra("123456", "saida.png");
        QRCodeWriter qrCodeWriter = new QRCodeWriter();

        String msg = "alo alo";

        BitMatrix bitMatrix = qrCodeWriter.encode(msg, BarcodeFormat.QR_CODE, 600, 600);

        Path arquivo = FileSystems.getDefault().getPath("qrcode.png");

        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", arquivo);
        }
    }

