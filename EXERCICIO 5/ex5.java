import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.next();
        System.out.println(inverteString(palavra));
    }
    public static String inverteString(String palavra) {
        String inverteStr = "";

        for (int i = 0; i < palavra.length(); i++)
            inverteStr += palavra.charAt(palavra.length() -1 - i);

        return inverteStr;
    }
}
