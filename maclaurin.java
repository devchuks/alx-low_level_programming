import java.util.Scanner;

class HelloWorld {
    public static double Factorial(double num){
        int result = 1; // since we're doing multiplication if the first term is 0 everything would be 0 so use 1 instead
        int counter;
        for (counter = 1; counter <= num; counter++) {
            result = result * counter; // keeps multiplying the result by the next number in the counter (i.e. 1x2=2, 2x3=6, 6x4=24, 24x5=120, etc)
        } return result;
    }
    
   public static double Maclaurin(double x, double n) {
        double answer;
        
        // using the Maclaurin formula -1^n * (x^(2n+1))/(2n+1)!
        answer = Math.pow(-1, n) * ((Math.pow(x, ((2 * n) + 1))) / (Factorial((2 * n) + 1)));
        return answer;
    }
    
    public static void main(String[] args) {
        int counter;
        double mac = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter angle: ");
        double angle = input.nextDouble();
        double x = angle * (Math.PI / 180); // convert the angle to Radians
        
        System.out.print("Enter any of number of terms: ");
        double term = input.nextDouble();
        
        for (counter = 0; counter <= term; counter++) {
            mac = mac + Maclaurin(x, counter); // sum of the first n terms of the Maclaurin series x-(x^3/3!)+(x^5/5!)-(x^7/7!)+...+(x^n/n!)
        }
        System.out.println("Using Maclaurin Series, the approximate value of Sin " + (int) angle + " is: \n" + mac);
    }
    
}
