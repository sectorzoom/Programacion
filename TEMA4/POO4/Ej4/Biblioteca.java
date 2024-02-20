package POO4.Ej4;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void showMenu(){
        System.out.println("Selecciona una opción:\n" +
                "1.Añadir ítem\n" +
                "2.Buscar ítem\n" +
                "3.Eliminar ítem\n" +
                "4.Listado de la Biblioteca\n" +
                "5.Salir");
    }
    public static int returnOptionMenu(){
        showMenu();
        System.out.println("Opcion:");
        return scanner.nextInt();
    }
    public static void selection(int option){
        option = returnOptionMenu();
        ArrayList<Articulos> listaArticulos = new ArrayList<>();
        switch (option){
            case 1:
                anyadirItem(listaArticulos);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
        }
    }

    public static Articulos anyadirItem(ArrayList<Articulos> listaArticulos){
        System.out.println("¿Qué artículo quieres añadir?:\n" +
                "1.Libro\n2.Revista\n3.DVD");
        int option = scanner.nextInt();
        int codigoArticulo = 1;
        switch (option){
            case 1:
                System.out.println("Introduce su título, cantidad de páginas e ISBN");
                listaArticulos.add(new Libros(codigoArticulo,scanner.nextLine(),scanner.nextInt(),scanner.nextInt()));
        }
    }
}
