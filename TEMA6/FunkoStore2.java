import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FunkoStore2 {
    private List<Funko> funkos;
    private final String binaryFilePath;

    public FunkoStore2(String binaryFilePath) {
        this.binaryFilePath = binaryFilePath;
        this.funkos = new ArrayList<>();
        loadFunkos();
    }

    private void loadFunkos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(binaryFilePath))) {
            funkos = (List<Funko>) ois.readObject();
            System.out.println("Funkos cargados correctamente desde el archivo binario.");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo binario. Se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los funkos desde el archivo binario.");
            e.printStackTrace();
        }
    }

    private void saveFunkos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(binaryFilePath))) {
            oos.writeObject(funkos);
            System.out.println("Funkos actualizados correctamente en el archivo binario.");
        } catch (IOException e) {
            System.err.println("Error al guardar los funkos en el archivo binario.");
            e.printStackTrace();
        }
    }

    public void addFunko(String nombre, String modelo, Date launch, double precio) {
        funkos.add(new Funko(nombre, modelo, launch, precio));
        saveFunkos();
    }

    public void deleteFunko(String nombre) {
        for (Funko funko : funkos) {
            if (funko.nombre.equals(nombre)) {
                funkos.remove(funko);
                System.out.println("Funko borrado correctamente.");
                saveFunkos();
                return;
            }
        }
        System.out.println("Funko no encontrado.");
    }

    public void showAllFunkos() {
        for (Funko funko : funkos) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(funko.launch);
            System.out.println(funko.nombre + " - Modelo: " + funko.modelo + " - Año: " + formattedDate + " - Precio: " + funko.precio);
        }
    }

    public void showMostExpensiveFunko() {
        if (!funkos.isEmpty()) {
            Funko mostExpensive = funkos.getFirst();
            for (int i = 1; i < funkos.size(); i++) {
                Funko currentFunko = funkos.get(i);
                if (currentFunko.precio > mostExpensive.precio) {
                    mostExpensive = currentFunko;
                }
            }
            System.out.println("Funko más caro: " + mostExpensive.nombre + " - Precio: " + mostExpensive.precio);
        } else {
            System.out.println("No hay funkos disponibles.");
        }
    }

    public void showAveragePrice() {
        double total = 0;
        for (Funko funko : funkos) {
            total += funko.precio;
        }
        double average = total / funkos.size();
        System.out.println("Media de precio de los funkos: " + average);
    }

    public void showFunkosByModel() {
        Map<String, List<String>> models = new HashMap<>();
        for (Funko funko : funkos) {
            if (!models.containsKey(funko.modelo)) {
                models.put(funko.modelo, new ArrayList<>());
            }
            models.get(funko.modelo).add(funko.nombre);
        }

        for (Map.Entry<String, List<String>> entry : models.entrySet()) {
            System.out.println("Modelo: " + entry.getKey());
            for (String funko : entry.getValue()) {
                System.out.println("  - " + funko);
            }
        }
    }

    public void showFunkosFromYear(int year) {
        boolean found = false;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Funko funko : funkos) {
            String formattedDate = dateFormat.format(funko.launch);
            System.out.println(funko.nombre + " - Modelo: " + funko.modelo + " - Fecha de lanzamiento: " + formattedDate + " - Precio: " + funko.precio);
            found = true;
        }
        if (!found) {
            System.out.println("No se encontraron funkos del año " + year);
        }
    }
}
