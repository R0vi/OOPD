import processing.core.PApplet;

public class Figuur {
    protected float x, y, vx, vy, ax, ay;
    protected int kleur;

    public Figuur(float x, float y) {
        this.x = x;
        this.y = y;
        kleur = 0xFFFFFFFF;
        zetStil();
    }

    public void doeStap() {
        if (!staatStil()) {
            pasVersnellingToe();
            pasSnelheidToe();
        }
    }

    public void setSnelheid(float vx, float vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public void setVersnelling(float ax, float ay) {
        this.ax = ax;
        this.ay = ay;
    }

    public void setKleur(int kleur) {
        this.kleur = kleur;
    }

    private void pasVersnellingToe() {
        vx += ax;
        vy += ay;
    }

    private void pasSnelheidToe() {
        x += vx;
        y += vy;
    }

    public void zetStil() {
        vx = vy = ax = ay = 0;
    }

    public boolean staatStil() {
        return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
    }
}
