package POO1;
public class Reloj {
    private int hours;
    private int minutes;
    private int seconds;
    private int mode;
    public static final int DEFAULT = 0;
    public static final int DEFAULTMODE = 12;

    public Reloj(){
        this.hours = DEFAULT;
        this.minutes = DEFAULT;
        this.seconds = DEFAULT;
        this.mode = DEFAULTMODE;

    }
    public Reloj(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours, int mode) {
        if (mode != 24){
            while (hours > 12){
                hours = hours - 12;
            }
        } else {
            while (hours >= 24){
                hours = hours - 24;
            }
        }
        if (hours < 0){
            this.hours = DEFAULT;
        } else{
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        while (minutes > 59) {
            minutes = minutes - 60;
            hours = hours + 1;
            setHours(hours,mode);
        }
        if (minutes < 0){
            this.minutes = DEFAULT;
        } else {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        while (seconds > 59) {
            seconds = seconds - 60;
            minutes = minutes + 1;
        }
        if (seconds < 0){
            this.seconds = DEFAULT;
        } else {
            this.seconds = seconds;
        }
    }
    public void showReloj(){
        System.out.print("En modo " + getMode() + " la hora es: ");
        System.out.printf("%02d:%02d:%02d", getHours(),getMinutes(),getSeconds());
        System.out.println("\n");
    }
    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        if (mode != 12 && mode != 24){
            this.mode = DEFAULTMODE;
        } else {
            this.mode = mode;
        }
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
