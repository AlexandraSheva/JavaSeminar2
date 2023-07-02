/**
 * Task1. Написать метод, который вернет строку длинны N, которая состоит из чередующихся символов
 * c1 и c2, начиная с C1.N - четное число. 
 */
public class Task1 {

  public static void main(String[] args) {
    System.out.println(task1(10,'a', 'b' ));
  }

  static String task1 (int n, char c1, char c2) {

    if (n%2==0) {
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i<n/2; i++) {
        stringBuilder.append(c1).append(c2);
      }
      return stringBuilder.toString();
    } else {
      System.out.println("N is not even number!");
      return null;
    }
    
  }
}