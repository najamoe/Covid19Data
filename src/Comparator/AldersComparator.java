package Comparator;
import Covid19Data.Covid19Data;

import java.util.Comparator;

public class AldersComparator implements Comparator<Covid19Data>{
    public int compare (Covid19Data a1, Covid19Data a2){
        return a1.getAldersGruppe().compareTo(a2.getAldersGruppe());
    }

}

