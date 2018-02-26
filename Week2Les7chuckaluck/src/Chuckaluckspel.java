public class Chuckaluckspel {
    private int saldo;
    private int geluksgetal;
    private int rondecount = 0;
    private int[] worpen;

    Chuckaluckspel (int saldo) {
        this.saldo = saldo;
    }

    public void speelronde (int geluksgetal, int inzet) {
        if (geluksgetal <= 6 && geluksgetal >= 1) {
            this.geluksgetal = geluksgetal;
        }
        Dobbelbeker dobbelbeker = new Dobbelbeker();
        this.worpen = dobbelbeker.worp();
        int aantalwon = 0;
        for(int worp: this.worpen) {
            if(worp == geluksgetal) {
                aantalwon++;
            }
        }
        this.saldo += uitbetaling(inzet, aantalwon);
        this.rondecount++;
    }

    private int uitbetaling (int inzet, int aantalwon) {
        int betaling = 0;
        switch (aantalwon) {
            case 1:
                betaling = inzet;
                break;
            case 2:
                betaling = inzet*2;
                break;
            case 3:
                betaling = inzet*10;
                break;
            default:
                betaling -= inzet;

        }
        return betaling;
    }

    public String toString() {
        return "---------------------------- \n" +
                "Ronde: " + this.rondecount + "\n" +
                "Geluksgetal: " + this.geluksgetal + "\n" +
                "Worp: " + this.worpen[0] + " " + this.worpen[1] + " " + this.worpen[1] + "\n" +
                "Saldo: " + this.saldo + "\n";
    }

}
