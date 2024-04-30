public class Zapping {
    private static final int K_NUMCANALES = 99;
    public static void main(String[] args) {

    }

    public static int cambiarCanal(int canalOrigen, int canalDestino) {
        int distanciaDelante = Math.abs(canalDestino - canalOrigen);
        int distanciaAtras = K_NUMCANALES - distanciaDelante;
        int numClics = 0;
        if (distanciaDelante <= distanciaAtras) {
            numClics = distanciaDelante;
        } else {
            numClics = distanciaAtras;
        }
        return numClics;
    }
}