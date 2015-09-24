public class RandomInteger { 
    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);

        // a pseudo-random real between 0.0 and 1.0
        double r = Math.random(); 

        // a pseudo-random integer between 0 and N-1
        int n = (int) (r * N);

        System.out.println("Your random integer is: " + n);
    }
}
