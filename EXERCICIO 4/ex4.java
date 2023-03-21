public class ex4 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double calcPercentual = 0;

        calcPercentual = sp + rj + mg + es + outros;
        String.format("%2f", sp/calcPercentual);
        System.out.println(
                "\nSP: " + String.format("%.2f", sp/calcPercentual * 100 ) + "%" +
                "\nRJ: " + String.format("%.2f", rj/calcPercentual * 100) + "%" +
                "\nMG: " + String.format("%.2f", mg/calcPercentual * 100) + "%" +
                "\nES: " + String.format("%.2f", es/calcPercentual * 100) + "%" +
                "\nOutros: " + String.format("%.2f", outros/calcPercentual * 100) + "%"
        );
    }
}
