class GeheelGetal {
  int waarde;
  
  GeheelGetal(int startwaarde) {
   waarde = startwaarde;
  } 
}

void setup() {
  int getal1 = 10;
  GeheelGetal getal2 = new GeheelGetal(10);

  println("getal1: " + getal1);
  println("getal2: " + getal2.waarde);
  println("-----------------------");
  
  telErTienBijOp(getal1);
  telErTienBijOp(getal2);
  
  println("getal1: " + getal1);
  println("getal2: " + getal2.waarde);

}

void telErTienBijOp(int getal) {
  getal += 10;  
}

void telErTienBijOp(GeheelGetal getal) {
  getal.waarde += 10;
}