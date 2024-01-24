package POO2;
import java.util.Random;
import java.util.Scanner;
public class PeopleAndAccountManager {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Person[] people = new Person[10];
        int numPeople = 0;
        int option;
        String dni;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Instanciar objetos de tipo Persona");
            System.out.println("2. Instanciar objetos de tipo Cuenta y asociarlos a una persona");
            System.out.println("3. Mostrar datos de una persona (por su DNI)");
            System.out.println("4. Recibir la nómina mensual de una persona (por DNI y número de cuenta)");
            System.out.println("5. Recibir un pago (por DNI y número de cuenta)");
            System.out.println("6. Realizar transferencia entre cuentas");
            System.out.println("7. Imprimir las personas morosas");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    people[numPeople] = instantiateAnObjectOfTypePerson();
                    numPeople++;
                    break;
                case 2:
                    instantiateObjectsOfTypeAccount(people,numPeople);
                    break;
                case 3:
                    System.out.print("Ingrese el DNI de la persona: ");
                    String dniQuery = scanner.next();
                    while (validateDNI(dniQuery)) {
                        System.out.print("DNI inválido. Por favor, ingrese un DNI válido: ");
                        dniQuery = scanner.next();
                    }
                    Person personQuery = searchPersonByDni(people, dniQuery, numPeople);

                    if (personQuery != null) {
                        showPersonData(personQuery);
                    } else {
                        System.out.println("No se encontró ninguna persona con ese DNI.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el DNI de la persona: ");
                    String dniPayroll = scanner.next();
                    while (validateDNI(dniPayroll)) {
                        System.out.print("DNI inválido. Por favor, ingrese un DNI válido: ");
                        dniPayroll = scanner.next();
                    }
                    Person personPayroll = searchPersonByDni(people, dniPayroll, numPeople);

                    if (personPayroll != null) {
                        System.out.print("Ingrese el número de cuenta: ");
                        String numAccountPayroll = scanner.next();
                        System.out.print("Ingrese el monto de la nómina: ");
                        double amountPayroll = scanner.nextDouble();

                        receivePayroll(people, dniPayroll, numAccountPayroll, amountPayroll, numPeople);
                    } else {
                        System.out.println("No se encontró ninguna persona con ese DNI.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el DNI del receptor del pago: ");
                    String dniReceiver = scanner.next();
                    while (validateDNI(dniReceiver)) {
                        System.out.print("DNI inválido. Por favor, ingrese un DNI válido: ");
                        dniReceiver = scanner.next();
                    }
                    Person receiver = searchPersonByDni(people, dniReceiver, numPeople);

                    if (receiver != null) {
                        System.out.print("Ingrese el número de cuenta del receptor: ");
                        String numReceiverAccount = scanner.next();

                        Account receiverAccount = searchAccountByNum(receiver.getAccounts(), numReceiverAccount);

                        if (receiverAccount != null) {
                            System.out.print("Ingrese el monto del pago: ");
                            double paymentAmount = scanner.nextDouble();

                            receivePayment(receiver, receiverAccount, paymentAmount);
                        } else {
                            System.out.println("La cuenta del receptor no existe.");
                        }
                    } else {
                        System.out.println("No se encontró al receptor con ese DNI.");
                    }
                    break;

                case 6:
                    System.out.print("Ingrese el DNI del remitente: ");
                    String senderDni = scanner.next();
                    while (validateDNI(senderDni)) {
                        System.out.print("DNI inválido. Por favor, ingrese un DNI válido: ");
                        senderDni = scanner.next();
                    }
                    Person sender = searchPersonByDni(people, senderDni, numPeople);

                    if (sender != null) {
                        System.out.print("Ingrese el número de cuenta del remitente: ");
                        String numAccountSender = scanner.next();

                        Account senderAccount = searchAccountByNum(sender.getAccounts(), numAccountSender);

                        if (senderAccount != null) {
                            System.out.print("Ingrese el DNI del destinatario: ");
                            String dniReceiverr = scanner.next();
                            while (validateDNI(dniReceiverr)) {
                                System.out.print("DNI inválido. Por favor, ingrese un DNI válido: ");
                                dniReceiverr = scanner.next();
                            }
                            Person receiverr = searchPersonByDni(people, dniReceiverr, numPeople);

                            if (receiverr != null) {
                                System.out.print("Ingrese el número de cuenta del destinatario: ");
                                String numAccountReceiver = scanner.next();

                                Account receiverAccount = searchAccountByNum(receiverr.getAccounts(), numAccountReceiver);

                                if (receiverAccount != null) {
                                    System.out.print("Ingrese el monto de la transferencia: ");
                                    double paymentAmount = scanner.nextDouble();

                                    makeTransfer(sender, senderAccount, receiverr, receiverAccount, paymentAmount);
                                } else {
                                    System.out.println("La cuenta del destinatario no existe.");
                                }
                            } else {
                                System.out.println("No se encontró al destinatario con ese DNI.");
                            }
                        } else {
                            System.out.println("La cuenta del sender no existe.");
                        }
                    } else {
                        System.out.println("No se encontró al remitente con ese DNI.");
                    }
                    break;

                case 7:
                    System.out.println("Personas morosas:");
                    printSlowPayerPeople(people, numPeople);
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (option != 0);

        scanner.close();
    }
    private static Person instantiateAnObjectOfTypePerson(){
        System.out.print("Ingrese el DNI de la persona: ");
        String dni = scanner.next();
        while (validateDNI(dni)) {
            System.out.print("DNI inválido. Por favor, ingrese un DNI válido: ");
            dni = scanner.next();
        }
        System.out.println("Persona creada exitosamente.");
        return new Person(dni);
    }
    private static void instantiateObjectsOfTypeAccount(Person[] people, int numPeople){
        System.out.print("Ingrese el DNI de la persona a la que desea asociar la cuenta: ");
        String dniPerson = scanner.next();
        while (validateDNI(dniPerson)) {
            System.out.print("DNI inválido. Por favor, ingrese un DNI válido: ");
            dniPerson = scanner.next();
        }
        Person person = searchPersonByDni(people, dniPerson, numPeople);

        if (person != null) {
            Account account = createNewAccount();
            person.addAccounts(account);
        } else {
            System.out.println("No se encontró ninguna persona con ese DNI.");
        }
    }
    private static Account createNewAccount(){
        String numAccount = generateRandomAccount();
        System.out.println("Su numero de cuenta es " + numAccount);
        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        double initialBalance = scanner.nextDouble();

        return new Account(numAccount, initialBalance);
    }
    private static void showPersonData(Person person) {
        System.out.println("Datos de la persona:");
        System.out.println("DNI: " + person.getDni());
        System.out.println("Cuentas asociadas:");

        for (int i = 0; i < person.getAccounts().length; i++) {
            if (person.getAccounts()[i] != null) {
                System.out.println("Número de cuenta: " + person.getAccounts()[i].getNumAccount());
                System.out.println("Saldo disponible: " + person.getAccounts()[i].getAvailableBalance());
            }
        }
    }


    private static Person searchPersonByDni(Person[] people, String dni, int numPeople) {
        for (int i = 0; i < numPeople; i++) {
            if (people[i].getDni().equals(dni)) {
                return people[i];
            }
        }
        return null;
    }
    private static void receivePayroll(Person[] people, String dni, String numAccount, double payrollAmount, int numPeople) {
        Person persona = searchPersonByDni(people, dni, numPeople);

        if (persona != null) {
            Account account = searchAccountByNum(persona.getAccounts(), numAccount);

            if (account != null) {
                account.receiveCredit(payrollAmount);
                System.out.println("Nómina recibida correctamente en la cuenta " + numAccount + ". Nuevo saldo: " + account.getAvailableBalance());
            } else {
                System.out.println("La cuenta especificada no pertenece a la persona.");
            }
        } else {
            System.out.println("No se encontró ninguna persona con ese DNI.");
        }
    }
    private static void receivePayment(Person receiver, Account receiverAccount, double paymentAmount) {
        receiverAccount.receiveCredit(paymentAmount);
        System.out.println("Pago recibido correctamente en la cuenta " + receiverAccount.getNumAccount() +
                " del receptor " + receiver.getDni() + ". Nuevo saldo: " + receiverAccount.getAvailableBalance());
    }


    private static void makeTransfer(Person sender, Account senderAccount,
                                     Person receiver, Account receiverAccount, double amountTransfer) {
        if (senderAccount.getAvailableBalance() >= amountTransfer) {
            senderAccount.payBill(amountTransfer);
            receiverAccount.receiveCredit(amountTransfer);
            System.out.println("Transferencia exitosa de " + amountTransfer + " desde la cuenta " +
                    senderAccount.getNumAccount() + " del remitente " + sender.getDni() +
                    " a la cuenta " + receiverAccount.getNumAccount() + " del receptor " +
                    receiver.getDni());
        } else {
            System.out.println("Saldo insuficiente en la cuenta del remitente.");
        }
    }


    private static Account searchAccountByNum(Account[] accounts, String numAccount) {
        for (Account account : accounts) {
            if (account != null && account.getNumAccount().equals(numAccount)) {
                return account;
            }
        }
        return null;
    }


    private static void printSlowPayerPeople(Person[] people, int numPeople) {
        boolean thereAreSlowPayer = false;

        for (int i = 0; i < numPeople; i++) {
            if (people[i].isSlowPayer()) {
                thereAreSlowPayer = true;
                System.out.println("DNI: " + people[i].getDni());
                System.out.println("Cuentas morosas:");

                for (int j = 0; j < people[i].getAccounts().length; j++) {
                    if (people[i].getAccounts()[j] != null && people[i].getAccounts()[j].getAvailableBalance() < 0) {
                        System.out.println("Número de cuenta: " + people[i].getAccounts()[j].getNumAccount());
                        System.out.println("Saldo disponible: " + people[i].getAccounts()[j].getAvailableBalance());
                    }
                }
            }
        }

        if (!thereAreSlowPayer) {
            System.out.println("No hay people morosas.");
        }
    }
    private static boolean validateDNI(String dni) {
        if (dni.length() != 9) {
            return true;
        }

        String numbers = dni.substring(0, 8);
        char letter = dni.charAt(8);

        try {
            int num = Integer.parseInt(numbers);
            char calculatedLetter = calculateDniLetter(num);
            return letter != calculatedLetter;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    private static char calculateDniLetter(int num) {
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letters.charAt(num % 23);
    }
    private static String generateRandomAccount() {
        StringBuilder account = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            account.append(random.nextInt(10));
        }

        return account.toString();
    }

}





