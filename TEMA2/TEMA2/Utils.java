package TEMA2;

public class Utils {
    public static void main(String[] args) {
    }
    public static double miles2kilometers (double miles) {
        return (miles * 1.60934);
    }
    public static double getTaxes (double euros, double percent) {
        percent = percent / 100;
        return (Math.round (euros * percent * 100) / 100.0);
    }

    public static double getNetPrice (double euros, double percent) {
        return ((double) Math.round((getTaxes(euros, percent) + euros) * 100) / 100);
    }

    public static int getCoins (double euros) {
        int count = 0;
        while (euros >= 1.99) {
            euros -= 2;
            count++;
        }
        count = count * 10;
        while (euros >= 0.99) {
            euros -= 1;
            count++;
        }
        count = count * 10;
        while (euros >= 0.49) {
            euros -= 0.5;
            count++;
        }
        count = count * 10;
        while (euros >= 0.19) {
            euros -= 0.20;
            count++;
        }
        count = count * 10;
        while (euros >= 0.09) {
            euros -= 0.10;
            count++;
        }
        count = count * 10;
        while (euros >= 0.049) {
            euros -= 0.05;
            count++;
        }
        count = count * 10;
        while (euros >= 0.019) {
            euros -= 0.02;
            count++;
        }
        count = count * 10;
        while (euros >= 0.009) {
            euros -= 0.01;
            count++;
        }
        return count;
    }
    public static char getNIF (int dni) {
        double restDni = dni % 23;
        return switch ((int) restDni) {
            case 0 -> 'T';
            case 1 -> 'R';
            case 2 -> 'W';
            case 3 -> 'A';
            case 4 -> 'G';
            case 5 -> 'M';
            case 6 -> 'Y';
            case 7 -> 'F';
            case 8 -> 'P';
            case 9 -> 'D';
            case 10 -> 'X';
            case 11 -> 'B';
            case 12 -> 'N';
            case 13 -> 'J';
            case 14 -> 'Z';
            case 15 -> 'S';
            case 16 -> 'Q';
            case 17 -> 'V';
            case 18 -> 'H';
            case 19 -> 'L';
            case 20 -> 'C';
            case 21 -> 'K';
            case 22 -> 'E';
            default -> 0;
        };
    }
    public static boolean isValidNIF (int dni, char nif) {
        return nif == getNIF(dni) || nif == Character.toLowerCase(getNIF(dni));
    }
    public static double calculateIRPF (double wages) {
        double irpf = 0;
        if (wages <= 12449 && wages > 0) {
            irpf = wages * 0.19;
        }
        if (wages >= 12450 && wages <= 20199) {
            irpf = 12449*0.19 + (wages-12449) * 0.24;
        }
        if (wages >= 20200 && wages <= 35199) {
            irpf = 12449*0.19 + ((20199-12450) * 0.24) + (wages-20199) * 0.3;
        }
        if (wages >= 35200 && wages <= 59999) {
            irpf = 12449*0.19 + ((20199-12450) * 0.24) + ((35199-20200) * 0.3) + (wages-35199) * 0.37;
        }
        if (wages >= 60000 && wages <= 299999) {
            irpf = 12449*0.19 + ((20199-12450) * 0.24) + ((35199-20200) * 0.3) +((59999-35200) * 0.37) + (wages-59999) * 0.45;
        }
        if (wages >= 300000) {
            irpf = 12449*0.19 + ((20199-12450) * 0.24) + ((35199-20200) * 0.3) +((59999-35200) * 0.37) + ((299999-60000) * 0.45) + (wages-299999) * 0.47;
        }
        return (Math.round (irpf * 100) / 100.0);
    }
}
