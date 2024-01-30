package POO2_2;

public class CuentaBancaria {
    private final String iban;
    private final String name;
    private final String surname;
    private double balance;
    private static final int maxBankOverdraft = -50;

    private double[] movements;


    public CuentaBancaria(String iban, String name, String surname, double[] movements) {
        this.iban = iban;
        this.name = name;
        this.surname = surname;
        this.balance = 0;
        this.movements = movements;
    }

    public String getIban() {
        return iban;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
            this.balance = balance;
    }

    public double[] getMovements() {
        return movements;
    }

    public void setMovements(double[] movements) {
        this.movements = movements;
    }
    public void bankDeposit(double deposit, int numMovement, double[] movements){
        if (deposit > 0){
            balance = balance + deposit;
            movements[numMovement] = deposit;
            notifyTreasury(deposit);
        }
    }
    public void bankwithdrawal(double deposit, int numMovement, double[] movements){
        if (deposit > 0){
            if (balance >= maxBankOverdraft){
                balance = balance - deposit;
                movements[numMovement] = balance;
                negativeBalance();
            }
        }
    }
    public void negativeBalance(){
        if (balance < 0){
            System.out.println("AVISO: Saldo Negativo");
        }
    }
    public void notifyTreasury(double deposit){
        if (deposit > 3000){
            System.out.println("AVISO: Notificar a Hacienda");
        }
    }
    public String toString(){
        return  "Nombre titular = " + name +
                "\nApellidos titular = " + surname +
                "\nIBAN = " + iban +
                "\nSaldo = " + balance;
    }

}
