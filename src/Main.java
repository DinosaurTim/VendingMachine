//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadFile file = new ReadFile();
        ArrayList<String> names = new ArrayList<>();
        String text = file.reader(new File("C:\\Users\\128YBorenko\\IdeaProjects\\Vending Machine\\src\\contents.txt"));
        Scanner scan = new Scanner(text);

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        System.out.println("Vending Machine");
        System.out.println("Choose from one of the options below:");

    }
}