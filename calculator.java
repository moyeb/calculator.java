// Java Classes & Objects 2
// Assignment: calculator.java

public class JavaCalculator {
  public static double add(int a, int b) {
    return (double)a+b;
  }

  public static double subtract(int a, int b) {
    return (double)a-b;
  }

  public static double multiply(int a, int b){
    return (double)a*b;
  }

  public static double divide(int a, int b) {
    return (double)a/b;
  }
  public static double square(int a) {
    return (double)a*a;
  }

  public static void main(String[] args) {
    // Testing
    System.out.println(divide(16,2));
    System.out.println(add(15,3));
  }

}

import java.math.*;
public class MagicCalculator extends JavaCalculator {
    public static double squareRoot(int a) {
      return Math.sqrt(a);
    }
    public static double sine(int a) {
      return Math.sin(a);
    }
    public static double cosine(int a) {
      return Math.cos(a);
    }
    public static double tangent(int a) {
      return Math.tan(a);

    }
    public static double factorial(int a) {
      if (a == 0) {
        return 1;
      } else {
        return(a*factorial(a-1));
      }

    }
    public static void main(String[] args) {
    // Testing
    System.out.print(squareRoot(16));
    System.out.println(tangent(16));
  }

}
