class Product {
  String naam;
  int prijs;

  Product(String productnaam, int productprijs) {
    this.naam = productnaam;
    this.prijs = productprijs;
  }
}

void setup() {
  Product product1 = new Product("pc", 1500);
  Product product2 = new Product("mac", 2000);

  Product[] productlijst = {product1, product2};

  for (int i = 0; i < productlijst.length; i++) {
    println(productlijst[i].naam  + " kost: " + productlijst[i].prijs  + " euro");
  }
}