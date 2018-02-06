String[] idLijst = {"8b3", "4bf", "9h0"};

void setup() {
  //println(plakCodeVoorId(idLijst[0], "NL"));
  println(plakCodeVoorIdLijst(idLijst, "NL"));
}

String plakCodeVoorId(String id, String code) {
  return code + id;
}

String[] plakCodeVoorIdLijst(String[] lijst, String code) {
  String[] nieuwelijst = new String[lijst.length];
  for (int i = 0; i < lijst.length; i++) {
    nieuwelijst[i] = code + lijst[i];
  }
  return nieuwelijst;
}