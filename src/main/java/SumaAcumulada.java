public class SumaAcumulada {
    private int total = 0;

    // Creamos el método sincronizado incrementar
    public synchronized void incrementar(int valor) {
        total += valor;
    }

    // Getter de total recuperar el valor final acumulado
    public int getTotal() {
        return total;
    }
}