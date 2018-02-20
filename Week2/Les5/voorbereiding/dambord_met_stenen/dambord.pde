class Dambord {
  Damsteen[] stenen = {
    new Damsteen(10, 10, 20, 255), 
    new Damsteen(50, 10, 20, 255), 
    new Damsteen(10, 50, 20, 0), 
    new Damsteen(50, 50, 20, 0), 
  };

  void tekenDamstenen() {
    for (int i = 0; i < stenen.length; i++) {
      stenen[i].tekenDamsteen();
    }
  }
}