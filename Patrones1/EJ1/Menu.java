package Patrones1.EJ1;

import java.util.Scanner;

public class Menu {
    Maquina maquina;
    Producto coca = new Producto("coca", 300);


    public Menu(Maquina maquina) {
        this.maquina = maquina;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Realizar acción: " +
                "a) insertar, d) seleccionar, j) devolver, s) salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a': maquina.insertarDinero(300); break;
                case 'd': maquina.seleccionarProducto(coca); break;
                case 'j': maquina.devolverDinero(); break;
                case 's': System.out.println("Hasta pronto!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }
}
