package Rekursion;

public class Rekursionsschritte {
    public static void main(String[] args) {
        recursiveFunctionA(0);

        System.out.println("--------");

        recursiveFunctionB(0);
    }
    public static void recursiveFunctionA (int num) {
        //es wird gleich am Anfang ausgegeben

        System.out.printf("%d\n", num);

        if (num >= 4) {
            return;
        } else {
            recursiveFunctionA(num+1);
        }
    }
    public static void recursiveFunctionB(int num) {
        // es wird ausgegeben erst nachdem die Methode abgebrochen wird
        if (num >= 4)
            return;
        else
            recursiveFunctionB(num+1);
        System.out.printf("%d\n", num);
    }
    public static int calcMultiplication (int multiplier, int multiplicand) {
        if (multiplier == 0) {
            return 0;
        } else {
            return multiplicand + calcMultiplication(multiplicand, multiplier - 1);
        }
    }
}
