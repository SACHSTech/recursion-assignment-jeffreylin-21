package recursionAssignment;

/**
* ICS4U TDD and Recursion Assignment
* @author: J. Lin
*
*/

public class Recursion{

  /**
  * Takes in an int and return the number of times 7 appears as a digit
  *
  * @param int n: The int that is being checked
  * @return the number of times 7 appears as a digit
  * @author J. Lin
  */  
  public static int count7(int n) {
    
    // Base case, if the number is == 0, then return 0
    if (n == 0) {
      return 0;
    }

    // If the right most number is 7, return 1 + the number of times 7 appears in the rest of the int using a recursive call
    if (n % 10 == 7) {
      return 1 + count7(n / 10);
    }

    // If the rightmost digit is not 7, then return the number of times 7 appears in the rest of the int using a recursive call
    else {
      return count7(n / 10);
    }

  }

  public static String changePi(String str){

    if(str.length() < 2) {
      return str;
    }

    if (str.substring(0,2).equals("pi")) {
      return "3.14" + changePi(str.substring(2)); 
    }

    return str.charAt(0) + changePi(str.substring(1));

  } 

  public static boolean array220(int[] intNums, int index) {

    if (index > intNums.length - 2){
      return false;
    }

    if (intNums[index] == intNums[index+1] / 10) {
      return true;
    }

    return array220(intNums, index+1);
    
  }

}
