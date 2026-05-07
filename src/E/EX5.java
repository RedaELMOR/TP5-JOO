package E;

public class EX5 {

    static class calcul {

        static double racineCarree(int x) {

            if (x < 0) {
                throw new IllegalArgumentException(
                    "nombre negatif interdit"
                );
            }
            return Math.sqrt(x);
        }
    }
    public static void main(String[] args) {
    	
        System.out.println(
            calcul.racineCarree(1)
        );
        System.out.println(
            calcul.racineCarree(-2)
        );
    }
}