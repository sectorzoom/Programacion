package POO4.Ej4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        biblioteca();
    }
    public static void biblioteca(){
        ArrayList<Articulos> listaArticulos = new ArrayList<>();
        int codigoArticulo = 1;
        selection(listaArticulos, codigoArticulo);
    }
    public static void showMenu(){
        System.out.println("""
                Selecciona una opción:
                1.Añadir ítem
                2.Buscar ítem
                3.Eliminar ítem
                4.Listado de la Biblioteca
                5.Salir""");
    }
    public static int returnOptionMenu(){
        showMenu();
        System.out.println("Opcion:");
        return validNumValue();
    }
    public static void selection(ArrayList<Articulos> listaArticulos, int codigoArticulo){
        int option = 0;
        while (option != 5){
            option = returnOptionMenu();
            switch (option){
                case 1:
                    codigoArticulo = anyadirItem(listaArticulos, codigoArticulo);
                    break;
                case 2:
                    buscarItem(listaArticulos);
                    break;
                case 3:
                    eliminarItem(listaArticulos);
                    break;
                case 4:
                    mostrarListado(listaArticulos);
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        }
    }

    public static int anyadirItem(ArrayList<Articulos> listaArticulos, int codigoArticulo){
        int option;
        do {
            System.out.println("""
                    ¿Qué artículo quieres añadir?:
                    1.Libro
                    2.Revista
                    3.DVD""");
            option = validNumValue();
            if(option<0 || option>3){
                System.out.println("Valor inválido introduce un valor entre 1 y 3");
            }
        } while (option < 1 || option > 3);
        String titulo;
        int paginas;
        switch (option){
            case 1:
                System.out.println("Introduce su título, cantidad de páginas e ISBN");
                titulo = scanner.nextLine();
                paginas = validNumValue();
                int ISBN = validNumValue();
                listaArticulos.add(new Libros(codigoArticulo,titulo,paginas,ISBN));
                codigoArticulo++;
                break;
            case 2:
                System.out.println("Introduce su título, cantidad de páginas y tema");
                titulo = scanner.nextLine();
                paginas = validNumValue();
                String tema = scanner.nextLine();
                listaArticulos.add(new Revistas(codigoArticulo, titulo, paginas, tema));
                codigoArticulo++;
                break;
            case 3:
                System.out.println("Introduce su título, género y duración en minutos");
                titulo = scanner.nextLine();
                String genero = scanner.nextLine();
                int duracion = validNumValue();
                listaArticulos.add(new DVD(codigoArticulo, titulo, genero,duracion));
                codigoArticulo++;
                break;
            default:
                System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                break;
        }
        return codigoArticulo;
    }
    public static void buscarItem(ArrayList<Articulos> listaArticulos){
        System.out.println("¿Qué artículo deseas buscar? (Escribe el id del artículo)");
        int id = validNumValue()-1;
        System.out.println(listaArticulos.get(id));
    }
    public static void eliminarItem(ArrayList<Articulos> listaArticulos){
        System.out.println("¿Que artículo deseas eliminar? (Escribe el id del artículo)");
        int id = validNumValue()-1;
        listaArticulos.remove(id);
        for(int i = id; i<listaArticulos.size();i++){
            listaArticulos.get(id).setCodigoArticulo(id+1);
        }
    }
    public static void mostrarListado(ArrayList<Articulos> listaArticulos){
        for (Articulos listaArticulo : listaArticulos) {
            System.out.println(listaArticulo.toString());
        }
    }
    public static int validNumValue() {
        Scanner scanner = new Scanner(System.in);
        boolean numeroValido = false;
        int number = 0;
        while (!numeroValido) {
            try {
                number = scanner.nextInt();
                if (number < 0){
                    System.out.println("Por favor, escriba un número correcto.");
                }else{
                    numeroValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero.");
                scanner.next();
            }
        }
        return number;
    }

}
