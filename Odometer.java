import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> totalValues = new ArrayList<Integer>();
        
            int givenValue = 0;
            while ((givenValue = scanner.nextInt()) != -1) {
                int dataSetValueCount = givenValue;
                int oldTime = 0;
                int miles = 0;
                int counter = 0;
                while ((counter++) < dataSetValueCount) {
                    int speed = scanner.nextInt();
                    int currentTime = scanner.nextInt();
                    miles += speed * (currentTime - oldTime);
                    oldTime = currentTime;
                }
                totalValues.add(miles);
            }
            for (int miles : totalValues) {
                System.out.println(miles + " miles");
            }
            scanner.close();
      
    }
}