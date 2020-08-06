import java.util.Scanner;
import java.util.Calendar;

public class Remediozada {
    public static void main(String[] args) {
        boolean mesB = true;
        int mes, diaF;
        Calendar ano = Calendar.getInstance();
        Scanner x = new Scanner(System.in);

        System.out.print("Mês: ");
        mes = x.nextInt();

        System.out.print("Dia final do mês: ");
        diaF = x.nextInt();

        if (mes == 2 || mes == 4 || mes == 5 || mes == 8 || mes == 11 || mes == 12) {
            mesB = true;
        } else {
            mesB = false;
        }

        if (mesB == true) {
            for (int contador = 1; contador <= diaF; contador++) {
                if (contador % 2 == 0) {
                    System.out.println("Dia " + contador + "/" + mes + "/" + ano.get(Calendar.YEAR) + " usar 200mg");
                } else {
                    System.out.println("Dia " + contador + "/" + mes + "/" + ano.get(Calendar.YEAR) + " usar 400mg");
                }
            }
        } else {
            for (int contador = 1; contador <= diaF; contador++) {
                if (contador % 2 == 0) {
                    System.out.println("Dia " + contador + "/" + mes + "/" + ano.get(Calendar.YEAR) +  " usar 400mg");
                } else {
                    System.out.println("Dia " + contador + "/" + mes + "/" + ano.get(Calendar.YEAR) +  " usar 200mg");
                }
            }
        }

    }
}