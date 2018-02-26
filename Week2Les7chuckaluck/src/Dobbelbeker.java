public class Dobbelbeker {
    private int dice[] = new int[3];
    private int maxDices = 3;

    int[] worp() {
        for (int i = 0; i < maxDices; i++) {
            Dobbelsteen dobbie = new Dobbelsteen();
            dice[i] = dobbie.waarde;
        }
        return dice;
    }

    public String toString() {
        String output = "";

        for (int i = 0; i < maxDices; i++) {
            output += dice[i] + " ";
        }

        return output;
    }
}