import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CalculadoraConResultados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> resultados = new ArrayList<>();

        while (true) {
            try {
                System.out.println("\nCalculadora de Área y Perímetro");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                System.out.println("4. Rectángulo");
                System.out.println("5. Pentágono");
                System.out.println("6. Mostrar resultados");
                System.out.println("7. Salir");
                System.out.print("\nElige una figura: ");
                int figura = scanner.nextInt();

                if (figura == 7) {
                    System.out.println("Saliendo del programa...");
                    break;
                }

                if (figura == 6) {
                    mostrarResultados(resultados);
                    continue;
                }

                System.out.println("1. Calcular Área");
                System.out.println("2. Calcular Perímetro");
                System.out.print("Elige una operación: ");
                int operacion = scanner.nextInt();

                switch (figura) {
                    case 1: // Círculo
                        System.out.print("Ingresa el radio del círculo: ");
                        double radio = scanner.nextDouble();
                        if (operacion == 1) {
                            double area = Math.PI * Math.pow(radio, 2);
                            String resultado = "El área del círculo es: " + area;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        } else {
                            double perimetro = 2 * Math.PI * radio;
                            String resultado = "El perímetro del círculo es: " + perimetro;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        }
                        break;
                    case 2: // Cuadrado
                        System.out.print("Ingresa el lado del cuadrado: ");
                        double ladoCuadrado = scanner.nextDouble();
                        if (operacion == 1) {
                            double area = Math.pow(ladoCuadrado, 2);
                            String resultado = "El área del cuadrado es: " + area;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        } else {
                            double perimetro = 4 * ladoCuadrado;
                            String resultado = "El perímetro del cuadrado es: " + perimetro;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        }
                        break;
                    case 3: // Triángulo
                        System.out.print("Ingresa la base del triángulo: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingresa la altura del triángulo: ");
                        double altura = scanner.nextDouble();
                        if (operacion == 1) {
                            double area = (base * altura) / 2;
                            String resultado = "El área del triángulo es: " + area;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        } else {
                            System.out.print("Ingresa el lado 1 del triángulo: ");
                            double lado1 = scanner.nextDouble();
                            System.out.print("Ingresa el lado 2 del triángulo: ");
                            double lado2 = scanner.nextDouble();
                            System.out.print("Ingresa el lado 3 del triángulo: ");
                            double lado3 = scanner.nextDouble();
                            double perimetro = lado1 + lado2 + lado3;
                            String resultado = "El perímetro del triángulo es: " + perimetro;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        }
                        break;
                    case 4: // Rectángulo
                        System.out.print("Ingresa la longitud del rectángulo: ");
                        double longitud = scanner.nextDouble();
                        System.out.print("Ingresa el ancho del rectángulo: ");
                        double ancho = scanner.nextDouble();
                        if (operacion == 1) {
                            double area = longitud * ancho;
                            String resultado = "El área del rectángulo es: " + area;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        } else {
                            double perimetro = 2 * (longitud + ancho);
                            String resultado = "El perímetro del rectángulo es: " + perimetro;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        }
                        break;
                    case 5: // Pentágono
                        System.out.print("Ingresa el lado del pentágono: ");
                        double ladoPentagono = scanner.nextDouble();
                        System.out.print("Ingresa el apotema del pentágono: ");
                        double apotema = scanner.nextDouble();
                        if (operacion == 1) {
                            double area = (5 * ladoPentagono * apotema) / 2;
                            String resultado = "El área del pentágono es: " + area;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        } else {
                            double perimetro = 5 * ladoPentagono;
                            String resultado = "El perímetro del pentágono es: " + perimetro;
                            resultados.add(resultado);
                            System.out.println(resultado);
                        }
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, elija una opción válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un valor numérico.");
                scanner.next(); // Limpiar el buffer del scanner
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void mostrarResultados(List<String> resultados) {
        System.out.println("Resultados almacenados:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
    }
}

