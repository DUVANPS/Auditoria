import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int continuar = -1;
        int respuesta = -1;
        String[] preguntas = new String[10];
        int[] valorPreguntas = new int[10];


        //Capturar datos
        while (continuar != 0) {

            System.out.println("Digite un numero de opción: ");
            System.out.println("1) Agregar preguntas");
            System.out.println("2) Responder encuesta");
            System.out.println("3) Generar calculo");
            System.out.println("0) Salir");
            respuesta = teclado.nextInt();
            switch (respuesta) {
                case 0:
                    break;

                case 1:
                    while (preguntas.length < 10) {
                        System.out.println("Introduce tu pregunta numero " + (preguntas.length + 1));
                        preguntas[preguntas.length] = teclado.nextLine();
                        System.out.println("Ingresa el valor de la pregunta de 1 a 10: ");
                        valorPreguntas[valorPreguntas.length] = teclado.nextInt();

                    }
                    break;
                case 2:
                    for (int i = 0; i < preguntas.length; i++) {
                        System.out.println("Responde 1 para si y 2 para no a las siguientes preguntas: ");
                    }
            }
        }

    }
}