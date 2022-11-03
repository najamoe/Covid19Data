import Comparator.RegionComparator;
import Covid19Data.Covid19Data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        FileHandler fileHandler = new FileHandler();

        ArrayList<Covid19Data> dataene;

        dataene = fileHandler.loadData();

        Collections.sort(dataene, new RegionComparator().thenComparing(new RegionComparator().reversed()));
        System.out.println("Dataliste:" + "\n" +
                "primær sortering er alder, sekundær sortering er region " + dataene);
    }
    }
