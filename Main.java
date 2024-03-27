import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Igual a Python, para mayor comodidad
     * 
     * @param message String para imprimir en pantalla
     * @return la entrada del usuario en String
     */
    private static String input(String message) {
        scanner = scanner.reset();
        System.out.print(message);
        var x = scanner.nextLine().trim();
        scanner = scanner.reset();
        return x;
    }

    /**
     * Para que el usuario pueda leer un mensaje detalladamente
     */
    private static void getCh() {
        System.out.println("Presione ENTER para continuar...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Shape shape = null;

        while (true) {
            try {
                int choice = Integer.parseInt(input("""
                        Seleccione la propiedad a calcular:
                            1. Área
                            2. Perímetro
                        >>>\s"""));

                if (choice > 2 || choice < 0) {
                    System.err.println("Esa opción no existe");
                    getCh();
                    continue;
                }

                int shapeChoice = Integer.parseInt(input("""
                        Seleccione la figura:
                            1. Círculo
                            2. Triángulo
                            3. Cuadrado
                        >>>\s"""));

                if (shapeChoice > 3 || shapeChoice < 0) {
                    System.err.println("Esa opción no existe");
                    getCh();
                    continue;
                }

                switch (shapeChoice) {
                    case 1 -> shape = new Circle(Double.parseDouble(input("Ingrese el radio: ")));
                    case 2 -> shape = new Triangle(
                            Double.parseDouble(input("Ingrese uno de los lados: ")),
                            Double.parseDouble(input("Ahora, ingrese otro de los lados: ")),
                            Double.parseDouble(input("Y ahora el último: ")));
                    case 3 -> shape = new Square(Double.parseDouble(input("Ingrese un lado: ")));
                    default -> {
                        System.err.println("Entrada no valida");
                        getCh();
                        continue;
                    }
                }

                switch (choice) {
                    case 1 -> System.out.printf("El área es: %.2f\n", shape.getArea());
                    case 2 -> System.out.printf("El perímetro es: %.2f\n", shape.getPerimeter());
                    default -> {
                        System.err.println("Selección no válida.");
                        getCh();
                        continue;
                    }
                }

                if (input("¿Desea realizar otro cálculo? (s/n): ").equalsIgnoreCase("n"))
                    break;
            } catch (NumberFormatException e) {
                System.err.println("Eso no fue un número, intentalo de nuevo");
                getCh();
                continue;
            }
        }
        scanner.close();
    }
}
