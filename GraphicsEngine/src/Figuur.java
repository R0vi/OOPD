import processing.core.PApplet;

public abstract class Figuur extends WeergaveObject {
    protected int kleur;

    public Figuur(float x, float y, float breedte, float hoogte) {
        super(x, y, breedte, hoogte);
    }

    public void setKleur(int kleur) {
        this.kleur = kleur;
    }

    public int getKleur() {
        return kleur;
    }
}
