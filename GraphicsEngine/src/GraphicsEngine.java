import processing.core.PApplet;

import java.util.ArrayList;

public class GraphicsEngine extends PApplet {

    public ArrayList<WeergaveObject> wo = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("GraphicsEngine", args);
    }

    public void settings() {
        size(250,250);
    }

    public void setup() {
        Rechthoek r1 = new Rechthoek(0, 0, 10, 10);
        Rechthoek r2 = new Rechthoek(r1.breedte - 5, -5, 10, 10);
        WeergaveObjectContainer doos = new WeergaveObjectContainer(10,50,20,20);
        doos.voegToe(r1);
        doos.voegToe(r2);
        wo.add(doos);
        HalloReageerder hr = new HalloReageerder();
        doos.voegReageerderToe(hr);
    }

    public void draw() {
        this.background(255);
        for (WeergaveObject o : wo) {
            o.geefWeer(this, 0 ,0);
        }
    }

    public void mousePressed() {
        for (WeergaveObject o : wo) {
            o.geefMousePressedGebeurtenis(this.mouseX, this.mouseY);
        }
    }

    public void keyPressed() {
        switch (keyCode) {
            case UP:
                for (WeergaveObject o : wo) {
                    o.setSnelheid(0, -1);
                    o.doeStap();
                }
                break;
            case DOWN:
                for (WeergaveObject o : wo) {
                    o.setSnelheid(0, 1);
                    o.doeStap();
                }
                break;
            case LEFT:
                for (WeergaveObject o : wo) {
                    o.setSnelheid(-1, 0);
                    o.doeStap();
                }
                break;
            case RIGHT:
                for (WeergaveObject o : wo) {
                    o.setSnelheid(1, 0);
                    o.doeStap();
                }
                break;
        }
    }
}