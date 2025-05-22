class Fibonacci {

  public static int calc(int n) {
    if (n <= 1) {
      return n;
    }
    return calc(n - 1) + calc(n - 2);
  }

  public static void main(String args[]) {
    int n = 10;
    int result = calc(n);
    System.out.println("Fibonacci von " + n + " ist: " + result);
  }
}
