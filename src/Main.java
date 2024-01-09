import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ex 1");

        Moltiplica moltiplicazione = new Moltiplica();

        System.out.println(moltiplicazione.moltiplicazione(4, 5));
        System.out.println(moltiplicazione.moltiplicazione(7,8));

        Concatena concatena = new Concatena();

        System.out.println(concatena.concatStIn("CosLu", 97));

        ArrayChaos inferi = new ArrayChaos();

        System.out.println(Arrays.toString(inferi.scatenaInferno(new String[]{"1", "2", "3", "4", "5"}, "Boh")));

        System.out.println("Ex 2");

        Scanner scan = new Scanner(System.in);
        String[] inputStrings = new String[3];
        System.out.println("Insert first string then Enter");
        inputStrings[0] = scan.nextLine();
        System.out.println("Insert second string then Enter");
        inputStrings[1] = scan.nextLine();
        System.out.println("Insert third string then Enter");
        inputStrings[2] = scan.nextLine();

        System.out.println("Here the strings concatenated");
        System.out.println(inputStrings[0] + inputStrings[1] + inputStrings[2]);

        System.out.println("Here they are in reverse order");
        System.out.println(inputStrings[2] + inputStrings[1] + inputStrings[0]);

        System.out.println("Ex 3");

        Rettangolo rettangoLu = new Rettangolo();

        System.out.println(rettangoLu.perimetroRettangolo(12.5, 50.13));
        System.out.println(rettangoLu.perimetroRettangolo(20.7, 48.76));

        ParieDispari paredisp = new ParieDispari();

       System.out.println("Insert integer then Enter");
       int result = paredisp.pariODispari(Integer.parseInt(scan.nextLine()));

       System.out.println(result);

       scan.close();
    }
}