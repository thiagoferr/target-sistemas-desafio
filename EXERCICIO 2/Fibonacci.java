import java.util.Scanner;

public class Fibonacci {
    /* EXERCICIO 1 */

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int valor = sc.nextInt();
       System.out.println(Fibonacci(valor));
       sc.close();
   }
   public static boolean Fibonacci(int valor) {
       int count = 0;
       int index = 1;

       if(valor == 0 || valor == 1) return true;

       while(count < valor) {
           count = count + index;
           index = count + index;
           if (count == valor || index == valor) return true;
       }
       return false;
   }

}


