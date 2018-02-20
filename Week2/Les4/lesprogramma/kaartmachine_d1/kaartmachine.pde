class kaartMachine {
  String filmname;
  float filmprijs, 
         bedrag; 

  kaartMachine(String filmname, float filmprijs) {
    this.filmname = filmname;
    this.filmprijs = filmprijs;
  }

  void geldInwerpen(float aantal) {
    if (aantal < 0) {
      println("Ingeworpen bedrag moet meer dan 0 zijn");
    } else {
      this.bedrag += aantal;
      println("totale ingeworpen bedrag is: " + this.bedrag);
    }
  }

  void bepaalWisselgeld() {
    float wisselgeld = this.bedrag - this.filmprijs;
    if (wisselgeld > 0) {
      println("Je wisselgeld is " + wisselgeld + " euro");
    }
  }

  void printTicket() {
    println("1 ticket voor de movie: " + this.filmname + " Prijs: " + this.filmprijs + " Euro");
  }

  void betaal() {
    if (bedrag >= filmprijs) {
      bepaalWisselgeld();
      printTicket();
    } else {
      println("Het ingeworpen bedrag is niet genoeg");
    }
  }
}