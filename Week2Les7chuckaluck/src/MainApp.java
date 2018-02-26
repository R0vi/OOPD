
public class MainApp {
    public static void main(String[] args) {
        Chuckaluckspel spel = new Chuckaluckspel(100);
        spel.speelronde(3, 5);
        System.out.print(spel);
        spel.speelronde(3, 20);
        System.out.print(spel);
        spel.speelronde(4, 10);
        System.out.print(spel);
    }
}