import java.io.IOException;

public class Principal {

    public static void lanzaExcepcion () throws IOException {
        throw new IOException("Excepcion Verificada");
    }

    public static void lanzaNoVerificada () throws RuntimeException {
        throw new RuntimeException("Excepcion No Verificada.");
    }

    public static void main (String []args) {
        System.out.println("Excepciones verificadas y no verificadas.");

        // Es obligatorio utilizar try-catch en excepciones verificadas
        // es decir aquellas excepciones que no son subclases de RunTimeException
        try {
            lanzaExcepcion();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Es opcional usar try-catch en excepciones no verificadas
        // es decir aquellas excepciones que son subclase de RunTimeExcepction
        lanzaNoVerificada();
    }
}
