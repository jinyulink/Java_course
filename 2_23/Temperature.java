import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create a Scanner object to obtain from the command window
        double fahrenheit, celsius;
        System.out.print("Enter a Fahrenheit temperature: ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f degrees Fahrenheit is %.1f degrees Celsius", fahrenheit, celsius);
    }
}
