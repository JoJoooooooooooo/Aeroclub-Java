package Application.Entity;

public class Motif {
    private int numMotif;
    private String motif;

    public Motif(int numMotif, String motif) {
        this.numMotif = numMotif;
        this.motif = motif;
    }

    public int getNumMotif() {
        return numMotif;
    }

    public void setNumMotif(int numMotif) {
        this.numMotif = numMotif;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}
