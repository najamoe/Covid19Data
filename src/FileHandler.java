import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

import Covid19Data.Covid19Data;

public class FileHandler {

    public ArrayList<Covid19Data> loadData() throws IOException {
        Scanner scan = new Scanner(new File("data/11_noegletal_pr_region_pr_aldersgruppe.csv"), StandardCharsets.ISO_8859_1);
        ArrayList<Covid19Data> dataene = new ArrayList<Covid19Data>();
        scan.nextLine();
        while (scan.hasNextLine()) {
            //læs linje
            String linje = scan.nextLine();

            Covid19Data data = parseCSVLine(linje);

            dataene.add(data);
        }
        return dataene;
    }
       private Covid19Data parseCSVLine(String linje) {
            //split linjen og læg tokens (tokens er en opdelt tekststreng til delstrenge) i attributter 
            String[] attributter = linje.split(";");
            //Opret data object med konverterede attributter
            Covid19Data data = new Covid19Data();
            
            data.setRegion(attributter[0]);
            data.setAldersGruppe(attributter[1]);
            data.setTilfælde(Integer.parseInt(attributter[2]));
            data.setDøde(Integer.parseInt(attributter[3]));
            data.setIndlagte(Integer.parseInt(attributter[4]));
            data.setDato(attributter[5]);
            return data;
        }
}


//I stedet for bare at udskrive hver linje fra csv-filen, skal du lave en anden metode der modtager
// linjen (som en samlet String) splitter den op i flere strenge, adskilt af
// hvert semikolon, og så parser de strenge til hver sin
// attribut (for eksempel skal du bruge Integer.parseInt til at parse en string til en int-attribut).
//
//Lad loadData metoden oprette en ArrayList af Covid19Data objekter ud fra filens linjer
// – husk at ignorere den første linje der indeholder overskrifterne.

