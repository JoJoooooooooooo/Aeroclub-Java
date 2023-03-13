package Application.Entity;

public class Qualif {
    private int numQualif;
    private String qualif;

    public Qualif(int numQualif, String qualif) {
        this.numQualif = numQualif;
        this.qualif = qualif;
    }

    public int getNumQualif() {
        return numQualif;
    }

    public void setNumQualif(int numQualif) {
        this.numQualif = numQualif;
    }

    public String getQualif() {
        return qualif;
    }

    public void setQualif(String qualif) {
        this.qualif = qualif;
    }
}
