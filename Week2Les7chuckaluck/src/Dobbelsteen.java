import java.util.Random;

class Dobbelsteen {
    public int waarde;

    Dobbelsteen() {
        Random rand = new Random();
        waarde = rand.nextInt(6)+1;
    }

    public String toString() {
        return("De gedobbelde waarde is" + waarde);
    }
}