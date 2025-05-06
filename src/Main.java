import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int respuestaMenu = -1;
        String[] preguntas = new String[10];
        int[] valorPreguntas = new int[10];
        int[] respuestasPregunta = new int[10];

        //Capturar datos
        while (respuestaMenu != 0) {

            System.out.println("Digite un numero de opción: ");
            System.out.println("1) Agregar preguntas");
            System.out.println("2) Responder encuesta");
            System.out.println("3) Generar calculo");
            System.out.println("0) Salir");
            respuestaMenu = teclado.nextInt();
            switch (respuestaMenu) {
                case 0:
                    break;

                case 1: {
                    if(preguntas[9] != null) {
                        System.out.println("Las preguntas fueron capturadas, desea agregar nuevas? 1) Si, 2) No");
                        System.out.println();
                        if (teclado.nextInt() != 1){
                            break;
                        }
                    }
                    for (int i = 0; i < preguntas.length; i++) {
                        teclado.nextLine();
                        System.out.println("Introduce tu pregunta numero " + (i + 1));
                        preguntas[i] = teclado.nextLine();
                        System.out.println("Ingresa el valor de la pregunta de 1 a 10: ");
                        valorPreguntas[i] = teclado.nextInt();
                    }
                    break;
                }
                case 2: {
                    if(preguntas[0] == null){
                        System.out.println("No hay pregustas almacenada");
                        System.out.println();
                        break;
                    }
                    System.out.println("preguntas[9] " + preguntas[9]);
                    if(respuestasPregunta[9] != 0) {
                        System.out.println("Las preguntas fueron respondidas, desea responder nuevamente? 1) Si, 2) No");
                        System.out.println();
                        if (teclado.nextInt() != 1){
                            break;
                        }
                    }
                    for(int i = 0; i < preguntas.length; i++) {
                        System.out.println("Responde 1 para SI y 2 para NO a la siguiente pregunta: ");
                        System.out.println();
                        System.out.println((i + 1) + ") " + preguntas[i]);
                        respuestasPregunta[i] = teclado.nextInt();
                    }

                    break;
                }
                case 3: {
                    float calculoTotal = 0;
                    float valorTotalPreguntas = 0;
                    float porcentajeTotal = 0;
                    for(int i = 0; i < valorPreguntas.length; i++){
                        valorTotalPreguntas += valorPreguntas[i];
                    }
                    for(int i = 0; i < respuestasPregunta.length; i++){
                        if(respuestasPregunta[i] == 1){
                            calculoTotal += valorPreguntas[i];
                        }
                    }


                    System.out.println("calculoTotal: " + calculoTotal);
                    System.out.println("valorTotalPreguntas :" + valorTotalPreguntas);

                    porcentajeTotal = (calculoTotal / valorTotalPreguntas) * 100;

                    System.out.println("El res1ultado de la encuneta es:");
                    System.out.println( porcentajeTotal + "%");
                    System.out.println( "----------------------");
                }
            }
        }

    }
}