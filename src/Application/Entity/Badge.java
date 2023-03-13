package Application.Entity;

public class Badge {
    private int numBadge;
    private String badge;

    public Badge(int numBadge, String badge) {
        this.numBadge = numBadge;
        this.badge = badge;
    }

    public int getNumBadge() {
        return numBadge;
    }

    public void setNumBadge(int numBadge) {
        this.numBadge = numBadge;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }
}