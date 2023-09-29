public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("A continuación se mostrarán los primeros 20 números primos.");
        int numero = 2;
        int contador = 0;
        while (contador < 20) {
            boolean esprimo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esprimo = false;
                    break;
                    }
            }
            if (esprimo) {
                System.out.print(numero + " ");
                contador++;
            }
            numero++;

        }
    }
}
