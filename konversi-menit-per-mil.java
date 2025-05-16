import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double miles, minutes;

        System.out.print("How many total miles did you run? ");
        String inputString = input.readLine();
        miles = Double.parseDouble(inputString);

        System.out.print("How many minutes did it take you? ");
        inputString = input.readLine();
        minutes = Double.parseDouble(inputString);

        double pace = minutes / miles;
        System.out.printf("Your average pace was %.2f minutes per mile\n", pace);
    }
}
