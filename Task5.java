public class Task5 {
  public static void main(String[] args) {
    System.out.println(task5("12322"));
  }

  static boolean task5 (String str) {

    StringBuilder builder = new StringBuilder(str);
    String newText = builder.reverse().toString();
    return newText.equals(str);

  }
}
