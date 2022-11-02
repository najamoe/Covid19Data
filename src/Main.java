import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<String> datas;
    private static final String fileName = "data/11_noegletal_pr_region_pr_aldersgruppe.csv";

    private static void showMenu() {
        System.out.println("""
                1) load data
                                    
                """);
    }

    public static void main(String[] args) throws Exception {
        FileHandler fileHandler = new FileHandler();

        Scanner sc = new Scanner(System.in);
        int userInput = 99;
        while (userInput != 0) {

            userInput = sc.nextInt();
            switch (userInput) {
                case 1 -> fileHandler.loadData();

                default -> System.out.println("unknown command - try again");
            }
        }
    }
}
