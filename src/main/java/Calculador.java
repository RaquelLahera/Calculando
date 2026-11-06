public class Calculador {
    public static void main(String[] args) throws InterruptedException {

        // inicializamos inicio y fin
        int inicio = Integer.parseInt(args[0]);
        int fin = Integer.parseInt(args[1]);

        // Inicializamos e instanciamos Suma Acumulada
        SumaAcumulada sumAcum = new SumaAcumulada();

        // Creamos e instanciamos los hilos basándonos en HiloCalculador
        HiloCalculador HiloPar = new HiloCalculador(sumAcum, inicio, fin, true);
        HiloCalculador HiloImpar = new HiloCalculador(sumAcum, inicio, fin, false);

        // Lanzamos ambos hilos
        HiloPar.start();
        HiloImpar.start();

        // Forzamos la espera
        HiloPar.join();
        HiloImpar.join();

        // Imprimimos el resultado
        System.out.println("Resultado acumulado: " + sumAcum.getTotal());
    }
}
