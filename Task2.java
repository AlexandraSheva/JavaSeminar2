import java.util.Arrays;

public class Task2 {
  public static void main(String[] args) {
    System.out.println(task2("aaaaabbbbbccccdddaa"));
  }

  static String task2 (String str) {

    char [] chars = str.toCharArray();
    Arrays.sort(chars);
    int count = 0;
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 1; i<chars.length; i++) {
      if(chars[i] == chars[i-1]) {
        count++;
      
      } else {
        stringBuilder.append(chars[i-1]).append(count+1);
        count = 0;
      }
      
    }
    stringBuilder.append(chars[chars.length - 1]).append(count+1);
    return stringBuilder.toString();

  }
}
