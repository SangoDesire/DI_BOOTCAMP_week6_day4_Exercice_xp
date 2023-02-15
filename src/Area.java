public class Area {
    private double longueur;
    private double largeur;

    public Area() {
    }

    public Area(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double returnArea() {
        return Math.round(longueur * largeur);
    }

    @Override
    public String toString() {
        return "Area{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
