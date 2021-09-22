public class Prime {
    public static boolean isPrime(int n) {
    if (n <= 1) {
    return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) {
    return false;
    }
    }
    return true;
    }
    void display_prime(){
    System.out.println("\nPrime numbers between 1 to 10000: \n");
    for(int i=1; i<10000; i++){
    if(isPrime(i)){
    System.out.print(i+", ");
    }
    }
    }
    public static void main(String[] args) {
    Prime obj = new Prime();
    obj.display_prime();
    }
   }