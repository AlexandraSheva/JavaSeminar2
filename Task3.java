import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
  public static void main(String[] args) {
    task3(wordRepeat("Test", 20));
  }

  static String wordRepeat (String word, int n) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < n; i++) {
      stringBuilder.append(word);
      
    }
    System.out.println(stringBuilder.toString());
    return stringBuilder.toString();

  }

  static void task3(String str) {

    String path = "text.txt";
    try(FileWriter fileWriter = new FileWriter(path, true)) {
      fileWriter.write(str);
      fileWriter.flush();

    } catch (Exception e) {
      e.printStackTrace();
    } 
    
    
  }
}
