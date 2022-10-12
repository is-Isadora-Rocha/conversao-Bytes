import java.math.BigDecimal;
import java.util.*;
public class DefinirBytes {
    public static void main(String[] args) {
          /*
    Kilobyte 1K = 1024 B [2^10] 1000
    Mega 1MB = 1024 KB [2^10*2^10] 1.000.000
    Giga 1GB = 1024 MB 1.000.000.000 2^10*3
    Tera 1TB = 1024 GB 1.000.000.000.000
    Peta 1PB = 1024 TB 1.000.000.000.000.000
    Exa 1EB = 1024 PB 1.000.000.000.000.000.000
    Zetta 1ZB = 1024 EB 1.000.000.000.000.000.000.000
    Yotta 1YB = 1024 ZB 1.000.000.000.000.000.000.000.000
    EX: 555 = 555.00B // 10000000 = 9.54MB
    int kilo = 1024;
        int mega = kilo * 1024;
        int giga = mega * 1024;
        BigDecimal tera = BigDecimal.valueOf(giga * 1024);
     */
        converter();
    }

    public static String converter() {
        Scanner scan = new Scanner(System.in);
        String conversao = String.valueOf(true);
        BigDecimal kilo = new BigDecimal(1024);
        BigDecimal mega = kilo.multiply(new BigDecimal(1024));
        BigDecimal giga = mega.multiply(new BigDecimal(1024));
        BigDecimal tera = giga.multiply(new BigDecimal(1024));
        BigDecimal peta = tera.multiply(new BigDecimal(1024));
        BigDecimal exa = peta.multiply(new BigDecimal(1024));
        BigDecimal zetta = exa.multiply(new BigDecimal(1024));
        BigDecimal yotta = zetta.multiply(new BigDecimal(1024));


        boolean chave = true;
        while (chave) {
            int escolha;
//            int tamBytes;
            BigDecimal tamBytes;
            System.out.println("Insira o tamanho em Bytes");
            tamBytes = scan.nextBigDecimal();
            BigDecimal byteDecimal = tamBytes;


            System.out.println("Escolha uma conversão para BYTE:");
            System.out.print("(1) KiloByte\n(2) MegaByte\n(3) GigaByte\n(4) TeraByte\n(5) PetaByte");
            System.out.println("\n(6) ExaByte\n(7) ZettaByte\n(8) YottaByte");

            scan = new Scanner(System.in);
            escolha = scan.nextInt();


            switch (escolha) {
                case 1:
                    BigDecimal k = kilo;
                    conversao = String.valueOf(byteDecimal.divide(k));
                    System.out.println(conversao);
                    break;

                case 2:
                    BigDecimal m = mega;
                    conversao = String.valueOf(byteDecimal.divide(m));
                    System.out.println(conversao);
                    break;

                case 3:
                    BigDecimal g = giga;
                    conversao = String.valueOf(byteDecimal.divide(g));
                    System.out.println(conversao);
                    break;

                case 4:
                    BigDecimal t = tera;
                    conversao = String.valueOf(byteDecimal.divide(t));
                    System.out.println(conversao);

                case 5:
                    BigDecimal p = peta;
                    conversao = String.valueOf(byteDecimal.divide(p));
                    System.out.println(conversao);
                    break;

                case 6:
                    BigDecimal e = exa;
                    conversao = String.valueOf(byteDecimal.divide(e));
                    System.out.println(conversao);
                    break;

                case 7:
                    BigDecimal z = zetta;
                    conversao = String.valueOf(byteDecimal.divide(z));
                    System.out.println(conversao);
                    break;

                case 8:
                    BigDecimal y = yotta;
                    conversao = String.valueOf(byteDecimal.divide(y));
                    System.out.println(conversao);
                    break;
            }
        }
        return null;
    }
}