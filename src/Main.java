import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int continuar = -1;
        int respuesta = -1;



        List <String> preguntas = new ArrayList<>();
        List <Integer> valorPreguntas = new ArrayList<>();
        List<Integer> respuestasUsuario = new ArrayList<>();

        preguntas.add("¿El personal fue amable y atento durante tu visita?");
        valorPreguntas.add(8);
        preguntas.add("¿Recibiste tu pedido en un tiempo razonable? ");
        valorPreguntas.add(7);
        preguntas.add("¿Te ofrecieron recomendaciones o asistencia al elegir tu Menú?");
        valorPreguntas.add(5);
        preguntas.add("¿La comida llegó caliente y en buen estado? ");
        valorPreguntas.add(8);
        preguntas.add("¿Los ingredientes parecían frescos y bien preparados?");
        valorPreguntas.add(7);
        preguntas.add("¿El sabor de la comida cumplió tus expectativas?");
        valorPreguntas.add(4);
        preguntas.add("¿El restaurante estaba limpio y ordenado?");
        valorPreguntas.add(6);
        preguntas.add("¿Los cubiertos y platos estaban correctamente higienizados?");
        valorPreguntas.add(7);
        preguntas.add("¿Los baños estaban limpios y bien abastecidos?");
        valorPreguntas.add(8);
        preguntas.add("¿El ambiente del restaurante fue agradable? ");
        valorPreguntas.add(4);
        preguntas.add("¿El precio de los Menus te pareció justo en relacion con la calidad?");
        valorPreguntas.add(4);
        preguntas.add("¿Recomendarías este restaurante a otras personas?");
        valorPreguntas.add(5);
;
        //Capturar datos
        while (continuar != 0) {

            System.out.println("Digite un numero de opción: ");
            System.out.println("1) Agregar preguntas");
            System.out.println("2) Responder encuesta");
            System.out.println("3) Generar calculo");
            System.out.println("0) Salir");

            respuesta = teclado.nextInt();
            teclado.nextLine();

            switch (respuesta) {
                case 0:
                    continuar = 0;
                    break;

                case 1:
                    while (preguntas.size() < 20) {
                        System.out.println("Introduce tu pregunta numero " + (preguntas.size() + 1));
                        String nuevaPregunta = teclado.nextLine();
                        preguntas.add(nuevaPregunta);


                        System.out.println("Ingresa el valor de la pregunta de 1 a 10: ");
                        int valor = teclado.nextInt();
                        teclado.nextLine();

                        valorPreguntas.add(valor);

                    }
                    break;
                case 2:

                    System.out.println("Responde con 1 (Sí) o 2 (No) a las siguientes preguntas:");
                    for (int i = 0; i < preguntas.size(); i++) {
                        System.out.println((i + 1) + ") " + preguntas.get(i));
                        int respuestaUsuario;
                        do {
                            System.out.print("Respuesta: ");
                            respuestaUsuario = teclado.nextInt();
                        } while (respuestaUsuario != 1 && respuestaUsuario != 2);

                        respuestasUsuario.add(respuestaUsuario);
                    }
                case 3:
                    int total = 0;
                    int ponderado = 0;
                    for (int i = 0; i < respuestasUsuario.size(); i++) {
                        if (respuestasUsuario.get(i) == 1) {
                            ponderado += valorPreguntas.get(i);
                        }
                        total += valorPreguntas.get(i);
                    }
                    double porcentaje = (double) ponderado / total * 100;
                    System.out.println("Resultado ponderado de satisfacción: " + porcentaje + "%");
                    break;
            }
        }

    }
}