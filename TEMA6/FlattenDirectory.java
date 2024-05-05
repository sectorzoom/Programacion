import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FlattenDirectory {
    public static void main(String[] args) throws IOException {
        String directorio = "C:/Users/david/OneDrive/Desktop/niats";
        flattenDirectory(new File(directorio));
    }

    private static void flattenDirectory(File directory) throws IOException {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    flattenDirectory(file);
                    file.delete();
                } else {
                        moveFile(file);
                }
            }
        }
    }

    private static void moveFile(File file) throws IOException {
        Path source = file.toPath();
        Path destination = Path.of("C:/Users/david/OneDrive/Desktop/niats").resolve(file.getName());
        Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Se movió '" + source + "' a '" + destination + "'.");
    }
}
