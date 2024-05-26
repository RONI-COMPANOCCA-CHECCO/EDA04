import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Turista<?>> turistas = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese el nombre del turista o '0':");
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("0")) {
                break;
            }

            System.out.println("Ingrese el documento de identidad:");
            String documento = scanner.nextLine();

            if (documento.matches("\\d+")) {
                turistas.add(new Turista<>(nombre, Integer.parseInt(documento)));
            } else {
                turistas.add(new Turista<>(nombre, documento));
            }
        }

        // lista de turistas registrados
        System.out.println("Turistas registrados:");
        for (Turista<?> turista : turistas) {
            System.out.println(turista);
        }
    }
}

