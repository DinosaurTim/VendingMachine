import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public String reader (File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String text = "";

        while (scanner.hasNextLine()) {
            text += "\n" + scanner.nextLine();
        }

        return text;
    }
}
