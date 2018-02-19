class Damsteen {
  int x, y, diameter;
  color colour;
  boolean selected;

  Damsteen (int x, int y, int diameter, color colour, boolean selected) {
    this.x = x;
    this.y = y;
    this.diameter = diameter;
    this.colour = colour;
    this.selected = selected;
  }

  void tekenDamsteen() {
    fill(colour);
    if (selected) { 
      stroke(3);
    } else { 
      noStroke();
    }
    ellipse(x, y, diameter, diameter);
  }
}

void setup() {
  size(250, 250);
  noStroke();

  Damsteen[] damstenen = {
    new Damsteen(100, 50, 20, #ffffff, true), 
    new Damsteen(100, 100, 20, #000000, true), 
    new Damsteen(200, 50, 20, #ffffff, false), 
    new Damsteen(200, 100, 20, #000000, false)
  };

  drawDamstenen(damstenen);
}

void drawDamstenen(Damsteen[] damstenen) {
  for (int i =0; i<damstenen.length; i++) {
    damstenen[i].tekenDamsteen();
  }
}