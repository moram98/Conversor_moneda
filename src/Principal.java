import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccion;

        do {
            System.out.println("===== Conversor de Monedas =====");
            System.out.println("Seleccione la conversión que desea realizar:");
            System.out.println("\n--- Dólar (USD) ---");
            System.out.println("1. Dólar (USD) a Peso Argentino (ARS)");
            System.out.println("2. Peso Argentino (ARS) a Dólar (USD)");
            System.out.println("3. Dólar (USD) a Real Brasileño (BRL)");
            System.out.println("4. Real Brasileño (BRL) a Dólar (USD)");
            System.out.println("5. Dólar (USD) a Peso Colombiano (COP)");
            System.out.println("6. Peso Colombiano (COP) a Dólar (USD)");
            System.out.println("\n7. Salir");
            System.out.println("===============================");
            System.out.print("Ingrese una opción: ");


            while (true) {
                eleccion = scanner.nextInt();

                if (eleccion >= 1 && eleccion <= 7) {
                    break;
                } else {
                    System.out.println("Opción no válida. Intente nuevamente.");
                    System.out.print("Ingrese una opción válida entre 1-7: ");
                }
            }

            if (eleccion == 7) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingrese el monto a convertir: ");
            double monto = scanner.nextDouble();

            String moneda = "", monedaConvertida = "";

            switch (eleccion) {
                case 1 -> {
                    moneda = "USD";
                    monedaConvertida = "ARS";
                }
                case 2 -> {
                    moneda = "ARS";
                    monedaConvertida = "USD";
                }
                case 3 -> {
                    moneda = "USD";
                    monedaConvertida = "BRL";
                }
                case 4 -> {
                    moneda = "BRL";
                    monedaConvertida = "USD";
                }
                case 5 -> {
                    moneda = "USD";
                    monedaConvertida = "COP";
                }
                case 6 -> {
                    moneda = "COP";
                    monedaConvertida = "USD";
                }
            }

            try {

                double result = ConsultaDeMoneda.convertirMoneda(moneda, monedaConvertida, monto);
                System.out.println("\n================= Resultado de la Conversión =================");
                System.out.printf("Monto original: %.2f %s%n", monto, moneda);
                System.out.printf("Monto convertido: %.2f %s%n", result, monedaConvertida);
                System.out.println("***********************************************************\n");
            } catch (Exception e) {
                System.out.println("Ocurrió un error al realizar la conversión: " + e.getMessage());
            }

        } while (true);
    }
}
