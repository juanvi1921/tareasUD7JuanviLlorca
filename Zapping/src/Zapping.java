public class Zapping {
    private static int canal = 1;
    private static int numClics = 0;
    private static final int K_NUMCANALES = 100;
    public static void main(String[] args) {
        cambiarCanal(20, 50);
    }

    public static int siguenteCanal() {
        numClics++;
        return canal++;
    }

    public static int anteriorCanal() {
        numClics++;
        return canal--;
    }

    public static int cambiarCanal(int canalOrigen, int canalDestino) {

        for (int i = 0; i < K_NUMCANALES; i++) {
            if (canalDestino > canalOrigen) {
                siguenteCanal();
                if (canal == canalDestino) {
                    return numClics;
                }
            } else if (canalDestino < canalOrigen) {
                anteriorCanal();
                if (canal == canalDestino) {
                    return numClics;
                }
            }
        }
        return numClics;
    }
}