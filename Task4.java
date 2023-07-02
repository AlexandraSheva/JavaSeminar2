import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4 {
  public static void main(String[] args) {
    task4(wordRepeat("Test", 20));
  }

  static String wordRepeat (String word, int n) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < n; i++) {
      stringBuilder.append(word);
      
    }
    System.out.println(stringBuilder.toString());
    return stringBuilder.toString();

  }

  static void task4(String str) {

    String path = "log.txt";

    Logger logger = Logger.getAnonymousLogger();

    FileHandler fileHandler = null;

    try {
      fileHandler = new FileHandler(path, true);

    } catch (IOException e) {
      e.printStackTrace();
    }

    logger.addHandler(fileHandler);
    SimpleFormatter simpleFormatter = new SimpleFormatter();
    fileHandler.setFormatter(simpleFormatter);


    try(FileWriter fileWriter = new FileWriter("g/g/g/g/g/text.txt", true)) {
      fileWriter.write(str);
      fileWriter.flush();

    } catch (Exception e) {
      e.printStackTrace();
      logger.log(Level.WARNING, e.getMessage());
    } 
    
    fileHandler.close();
    logger.getHandlers()[0].close();;
    
  }
}
