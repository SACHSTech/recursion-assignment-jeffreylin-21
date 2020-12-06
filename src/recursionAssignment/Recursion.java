package recursionAssignment;

public class Recursion{

  public static int count7(int n){
    
    if (n == 0){
      return 0;
    }

    if (n % 10 == 7) {
      return 1 + count7(n / 10);
    }
    else {
      return count7(n / 10);
    }

  }

  public static String changePi(String str){
    if (str.equals("pi")) {
      str = "pi";
    }
    return str;
  } 
}
