package Actividades_Matrices;
import java.util.Arrays;
import java.util.Scanner;
public class Actividad3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        hotel();
    }

    public static void hotel() {
        int[][] hotel = new int[12][5];
        for (int[] ints : hotel) {
            Arrays.fill(ints, 0);
        }
        locationRouter(hotel);
    }

    public static void locationRouter(int[][] hotel) {
        System.out.println("Por favor, introduzca dónde se encuentra su router:");
        System.out.println("Primero, introduzca el piso (1 al 12):");
        int numFloors = 12;
        int floor = validValue(numFloors);
        System.out.println("Ahora introduzca la habitación (1 al 5):");
        int numRooms = 5;
        int room = validValue(numRooms);
        hotel[floor][room] = powerRouter();
        mapOfPower(hotel, floor, room);
    }

    public static int powerRouter() {
        System.out.println("Ahora introduzca la potencia del router:");
        return in.nextInt();
    }

    public static int validValue(int num) {
        int value = -1;
        while (value < 0 || value > num - 1) {
            value = in.nextInt() - 1;
            if (value < 0 || value > num - 1) {
                System.out.println("Por favor, introduzca un valor válido entre 1 y " + num);
            }
        }
        return value;
    }

    public static void mapOfPower(int[][] hotel, int floor, int room) {
        int power = hotel[floor][room];
        int startPower = power;
        int startRoom = room;
        for (int i = room; i < hotel[0].length; i++){
            if (power > 0){
                lineOfPower(hotel,power,floor,room);
            }
            room++;
            power--;
        }
        room = startRoom;
        power = startPower;
        for (int i = room; i >= 0; i--){
            if (power > 0){
                lineOfPower(hotel,power,floor,room);
            }
            room--;
            power--;
        }
        showMatrix(hotel);
    }
    public static void lineOfPower(int[][]hotel, int power, int floor, int room){
        int startFloor = floor;
        for(int i = power; i != 0; i--){
            if (floor >= 0){
                hotel[floor][room] = i;
                floor--;
            }
        }
        floor = startFloor;
        for(int i = power; i != 0; i--){
            if (floor < 11){
                hotel[floor][room] = i;
                floor++;
            }
        }
    }
    public static void showMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}