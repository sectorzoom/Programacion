import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FunkoStore {
    private final ArrayList<Funko> funkos;
    private final String csvPath;

    public FunkoStore(String csvPath) {
        this.csvPath = csvPath;
        this.funkos = new ArrayList<>();
        loadFunkos();
    }

    private void loadFunkos() {
        try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
            String line;
            // Leer la primera línea (encabezado)
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String nombre = parts[1];
                String modelo = parts[2];
                double precio;
                try {
                    precio = Double.parseDouble(parts[3]);
                } catch (NumberFormatException e) {
                    System.err.println("Error al convertir el precio a double en la línea: " + line);
                    e.printStackTrace();
                    continue;
                }
                String fechaString = parts[4];
                Date fechaLanzamiento;
                try {
                    fechaLanzamiento = new SimpleDateFormat("yyyy-MM-dd").parse(fechaString);
                } catch (ParseException e) {
                    System.out.println("Formato de fecha incorrecto. Utiliza el formato yyyy-MM-dd.");
                    break;
                }
                funkos.add(new Funko(nombre, modelo, fechaLanzamiento, precio));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    private void saveFunkos() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvPath))) {
            bw.write("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");
            bw.newLine();

            for (Funko funko : funkos) {
                // Formatear la fecha de lanzamiento antes de escribirla en el archivo CSV
                String formattedDate = dateFormat.format(funko.getLaunch());

                // Escribir los datos de cada funko en una nueva línea del archivo CSV
                bw.write(UUID.randomUUID() + "," + funko.nombre + "," + funko.modelo + "," + funko.precio + "," + formattedDate);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void addFunko(String nombre, String modelo, Date launch, double precio) {
        funkos.add(new Funko(nombre, modelo, launch, precio));
        saveFunkos();
    }

    public void deleteFunko(String nombre) {
        for (int i = 0; i < funkos.size(); i++) {
            Funko funko = funkos.get(i);
            if (funko.nombre.equals(nombre)) {
                funkos.remove(i);
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
        for (Funko funko : funkos) {
            String fecha = funko.launch.toString();
            String[] parts = fecha.split(",");
            int funkoYear = Integer.parseInt(parts[0]);
            if (funkoYear == year) {
                System.out.println(funko.nombre + " - Modelo: " + funko.modelo + " - Precio: " + funko.precio);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No se encontraron funkos del año " + year);
        }
    }
}
