import processing.core.PApplet;

import java.util.ArrayList;

public class MainApp extends PApplet {
    private ArrayList<IDoelwit> knoppenLijst = new ArrayList<IDoelwit>();

    public static void main(String[] args) {
        PApplet.main("MainApp");
    }

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        RadioKnop rk = new RadioKnop(this, 50, 50, 40, 40);
        RadioKnop rk2 = new RadioKnop(this, 100, 50, 40, 40);
        RadioKnop rk3 = new RadioKnop(this, 150, 50, 40, 40);

        rk.voegDoelwitToe(rk2);
        rk.voegDoelwitToe(rk3);
        rk2.voegDoelwitToe(rk);
        rk2.voegDoelwitToe(rk3);
        rk3.voegDoelwitToe(rk);
        rk3.voegDoelwitToe(rk2);

        knoppenLijst.add(rk);
        knoppenLijst.add(rk2);
        knoppenLijst.add(rk3);
    }

    public void draw() {
        background(0);
        for (IDoelwit k : knoppenLijst) {
            ((RadioKnop) k).tekenKnop();
        }
    }

    public void mousePressed() {
        for (IDoelwit k : knoppenLijst) {
            if (((RadioKnop) k).isMuisOverKnop()) {
                k.schakel();
            }
        }
    }
}