public class Zapping {
    private static int canal = 0;
    private static final int K_NUMCANALES = 100;
    public static void main(String[] args) {
        cambiarCanal(20, 50);
    }

    public static int siguenteCanal() {
        return canal++;
    }

    public static int anteriorCanal() {
        return canal--;
    }

    public static int cambiarCanal(int canalOrigen, int canalDestino) {
        int numClics = 0;
        for (int i = 1; i < K_NUMCANALES; i++) {
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