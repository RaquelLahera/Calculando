import java.lang.ProcessBuilder;

public class Lanzador {
    public static void main(String[] args) {
        try {
            // Creamos el ProcessBuilder e iniciamos sesión en la MV/consola
            ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", System.getProperty("java.class.path"), "Calculador", "1", "1000");

            // Heredamos pantalla del padre
            processBuilder.inheritIO();

            // Iniciamos el subproceso
            Process process = processBuilder.start();

            // Esperamos a que el proceso termine
            int exitCode = process.waitFor();

            // Imprimimos el código de finalización
            System.out.println("Código de finalización del S.O.: " + exitCode);

            // Verificamos el código de salida
            if (exitCode == 0) {
                System.out.println("Proceso finalizado correctamente");
            } else {
                System.out.println("Proceso finalizado con error");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
