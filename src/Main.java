//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //boolean running = true;
        ReadFile file = new ReadFile();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        String text = file.reader(new File("C:\\Users\\128YBorenko\\IdeaProjects\\Vending Machine\\src\\contents.txt"));
        Scanner scan = new Scanner(text);

        int count = 0;
        while (scan.hasNext()) {
            if (count % 2 == 0) {
                names.add(scan.next());
            } else {
                quantities.add(Integer.valueOf(scan.next()));
            }
            count++;
        }

        for (Integer quantity : quantities) {
            System.out.println(quantity);
        }

        System.out.println("Vending Machine");
        System.out.println("Choose from one of the options below:");
        for (String name : names) {
            System.out.println(name);
        }
        Scanner scan2 = new Scanner(System.in);
        String answer = scan2.next();
        for (int i=0; i<5; i++){
            if (answer.equals(names.get(i))) {
                if (quantities.get(i) > 0) {
                    quantities.set(i, quantities.get(i) - 1);
                }
                else {
                    System.out.println("Not enough stuff.");
                }
            }
        }
    }
}