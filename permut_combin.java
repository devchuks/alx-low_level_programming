import java.util.Scanner;

class HelloWorld {
    public static int factorial(int n){
        int result = 1;
        int counter;
        for (counter = 1; counter <= n; counter++){
            result = result * counter;
        } return result;
    }
    
    public static int permutation(int n, int r){
        int result = factorial(n) / factorial(n-r);
        return result;
    }
    
    public static int combination(int n, int r){
        int result = factorial(n) / (factorial(n - r) * factorial(r));
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type P for Permutation or C for Combination: ");
        String answer = input.nextLine();
        
        if (answer.equalsIgnoreCase("p")){
            System.out.print("Enter n: ");
            int n = input.nextInt();
        
            System.out.print("Enter r: ");
            int r = input.nextInt();
            
            System.out.println(n + " P " + r + " is: " + permutation(n,r));
        } else if (answer.equalsIgnoreCase("c")){
            System.out.print("Enter n: ");
            int n = input.nextInt();
        
            System.out.print("Enter r: ");
            int r = input.nextInt();
            
            System.out.println(n + " C " + r + " is: " + combination(n,r));
        } else {
            System.out.println("Incorrect entry");
        }
    }
}
