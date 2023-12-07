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
        shiftValuesUp(hotel,room,power,floor, floor);
        shiftValuesDown(hotel,room,power,floor, floor);
        showMatrix(hotel);
    }
    public static void shiftValuesUp(int[][]hotel, int room, int power, int floor, int floorPower){
        while (room != -1) {
            for (int i = power; i != 0; i--) {
                hotel[floor][room] = i;
                floor--;
                if (floor < 0) {
                    break;
                }
            }
            floor = floorPower;
            for (int i = power; i != 0; i--) {
                hotel[floor][room] = i;
                floor++;
                if (floor > 11) {
                    break;
                }
            }
            floor = floorPower;
            room--;
            power--;
        }
    }
    public static void shiftValuesDown(int[][]hotel, int room, int power, int floor, int floorPower){
        while (room != 5) {
            for (int i = power; i != 0; i--) {
                hotel[floor][room] = i;
                floor--;
                if (floor < 0) {
                    break;
                }
            }
            floor = floorPower;
            for (int i = power; i != 0; i--) {
                hotel[floor][room] = i;
                floor++;
                if (floor > 11) {
                    break;
                }
            }
            floor = floorPower;
            room++;
            power--;
        }
    }
    public static void showMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
