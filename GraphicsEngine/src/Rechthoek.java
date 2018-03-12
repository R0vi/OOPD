import processing.core.PApplet;

public class Rechthoek extends Figuur {

    public Rechthoek(float x, float y, float breedte, float hoogte) {
        super(x, y, breedte, hoogte);
    }

    @Override
    public void geefWeer(PApplet app, float startX, float startY) {
        app.rect(startX + this.x, startY + this.y, breedte, hoogte);
    }

    @Override
    protected boolean isMuisBinnen(int muisX, int muisY) {
        if (muisX >= x && muisX < x + breedte &&
                muisY >= y && muisY < y + hoogte) {
            return true;
        }
        return false;
    }
}
