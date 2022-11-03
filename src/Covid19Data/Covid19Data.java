package Covid19Data;

public class Covid19Data {

    private String region;
    private String aldersGruppe;
    private int tilfælde;
    private int døde;
    private int indlagteIcu;
    private int indlagte;
    private String dato;

    public Covid19Data() {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.tilfælde = tilfælde;
        this.døde = døde;
        this.indlagteIcu = indlagteIcu;
        this.indlagte = indlagte;
        this.dato = dato;
    }



    public void setRegion(String region) {
        this.region = region;
    }

    public void setAldersGruppe(String aldersGruppe) {
        this.aldersGruppe = aldersGruppe;
    }

    public void setTilfælde(int tilfælde) {
        this.tilfælde = tilfælde;
    }

    public void setDøde(int døde) {
        this.døde = døde;
    }

    public void setIndlagteIcu(int indlagteIcu) {
        this.indlagteIcu = indlagteIcu;
    }

    public void setIndlagte(int indlagte) {
        this.indlagte = indlagte;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersGruppe() {
        return aldersGruppe;
    }

    public int getTilfælde() {
        return tilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagteIcu() {
        return indlagteIcu;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return "\n" +
                "region='" + region + '\'' +
                ", aldersGruppe='" + aldersGruppe + '\'' +
                ", tilfælde=" + tilfælde +
                ", døde=" + døde +
                ", indlagteIcu=" + indlagteIcu +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'' +
                '}';
    }
}

