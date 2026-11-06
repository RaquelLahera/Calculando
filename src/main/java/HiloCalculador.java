public class HiloCalculador extends Thread {
    private SumaAcumulada totalSumAc;
    private int inicio;
    private int fin;
    private boolean procesarPares;

    // Creamos el constructor
    public HiloCalculador(SumaAcumulada totalSumAc, int inicio, int fin, boolean procesarPares) {
        this.totalSumAc = totalSumAc;
        this.inicio = inicio;
        this.fin = fin;
        this.procesarPares = procesarPares;
    }

    // Creamos el método run con toda la lógica
    public void run() {
        // Bucle for para recorrer todos los hilos
        for (int i = inicio; i <= fin; i++) {
            // Condicionales para saber si son pares o impares
            if ((i % 2 == 0) && (procesarPares)) {
                totalSumAc.incrementar(i);
                System.out.println("El proceso " + getName() + " es par.");
            }

            if ((i % 2 != 0) && (!procesarPares)) {
                totalSumAc.incrementar(i);
                System.out.println("El proceso " + getName() + " es impar.");
            }
        }
    }
}
