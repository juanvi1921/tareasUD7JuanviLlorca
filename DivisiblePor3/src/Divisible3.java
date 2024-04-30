public class Divisible3 {
    public static void main(String[] args) {

    }

    public static long generarNumLargo(int numEntrada) {
        StringBuilder numLargo = new StringBuilder();
        long resultadoNumLargo = 0;
        for (int i = 1; i <= numEntrada; i++) {
            numLargo.append(i);
        }
        resultadoNumLargo = Long.parseLong(String.valueOf(numLargo));
        return resultadoNumLargo;
    }

    public static String compruebaDivisiblePor3(int numEntrada) {
        long numLargoEntrada;
        numLargoEntrada = generarNumLargo(numEntrada);
        if (divisiblePor3(numLargoEntrada)) {
            return "SI";
        } else {
            return "NO";
        }
    }

    public static boolean divisiblePor3(long num){
        if (num % 3 == 0) return true;
        else return false;
    }
}