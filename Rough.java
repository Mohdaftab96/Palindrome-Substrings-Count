
//Given a string, the task is to count all palindrome sub string in a given string.
// Length of palindrome sub string is greater than or equal to 2.

//String str = "abaab";
//Counting Substring Paindromic is : 3

//String str = "abbaeae";
//Counting Substring Paindromic is : 4


public class Rough{

      static boolean isPalindrom(String s){
  
          int left = 0;
          int right = s.length()-1;
  
          while(left < right){
              if(s.charAt(left) != s.charAt(right)){
                  return false;
              }
              left++;
              right--;
          }
          return true;
      }
  
      static int countPalindromic(String str, int n){
  
          int count = 0;
          String sum = "";
          for(int i=0; i<n; i++){
              for(int j=i+1;j<=n; j++){
                  sum = str.substring(i,j);
                  int n1 = sum.length();
  
  //                if(n1 >= 2){
                      if(isPalindrom(sum) && n1 >= 2){
                          count = count + 1;
  //                        System.out.print(sum + " ");
  //                    }
                  }
              }
          }
          return count;
      }
  
      /* Driver program*/
      public static void main(String args[])
      {
  //        String str = "abbaeae";
          String str = "abaab";
          int n = str.length();
  
  
  //        countPalindromic(str, n);
          System.out.println("Counting Substring Paindromic is : " + countPalindromic(str, n));
  
      }
  }
  
  
