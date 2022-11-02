import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private ArrayList<String> datas;
    //private static final String fileName = "data/11_noegletal_pr_region_pr_aldersgruppe.csv";
    File F = new File("data/11_noegletal_pr_region_pr_aldersgruppe.csv");

    public void loadData() throws Exception {
        Scanner scan = new Scanner(F, StandardCharsets.ISO_8859_1);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
    }


}

//Ret din prototype-kode til, så hver linje bliver læst ind, og “parset” til et Covid19Data objekt.
//
//I stedet for bare at udskrive hver linje fra csv-filen, skal du lave en anden metode der modtager
// linjen (som en samlet String) splitter den op i flere strenge, adskilt af
// hvert semikolon, og så parser de strenge til hver sin
// attribut (for eksempel skal du bruge Integer.parseInt til at parse en string til en int-attribut).
//
//Lad loadData metoden oprette en ArrayList af Covid19Data objekter ud fra filens linjer
// – husk at ignorere den første linje der indeholder overskrifterne.

