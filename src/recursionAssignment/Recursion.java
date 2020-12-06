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

  /**
  * Takes in string and replace every occurance of "pi" with 3.14
  *
  * @param String str: The str that we are modifying
  * @return String str but with every occurance of "pi" replaced with 3.14
  * @author J. Lin
  */ 
  public static String changePi(String str) {

    // Base case: if the string is less than 2 characters long, than nothing can be replaced, then return the string
    if (str.length() < 2) {
      return str;
    }

    // If the first two letters are "pi" then replace them with 3.14 and recursively call the rest of the string from 3.14 onwards
    if (str.substring(0,2).equals("pi")) {
      return "3.14" + changePi(str.substring(2)); 
    }

    // If the letters are not "pi" then recursively call the rest of the string from the second character onwards
    return str.charAt(0) + changePi(str.substring(1));

  } 

  /**
  * Takes in an array and returns a boolean if there is a number followed by a number 10 times larger
  *
  * @param int[] intNums: The array we are checking
  * @return true or false of whether there is a number followed by a number 10 times larger in the array
  * @author J. Lin
  */ 
  public static boolean array220(int[] intNums, int index) {

    // Base case: if the current index is greater than the size of the array - 2, it means it is the last element in the array, so return false
    if (index > intNums.length - 2) {
      return false;
    }

    // If the element at the current index is equal to the element in the next index / 10, then return true
    if (intNums[index] == intNums[index + 1] / 10) {
      return true;
    }

    // Otherwise, recursively check the rest of the indexes by doing a recursive check but increases index by 1
    return array220(intNums, index + 1);
    
  }

}
