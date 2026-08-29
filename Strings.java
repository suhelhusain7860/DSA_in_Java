import java.util.Scanner;

public class Strings {
  
       
       // for(int i=0; i<str.length(); i++){
          //  System.out.println(str.charAt(i) + " ");
        }
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz@1234");
        

        // //Strings are IMMUTABLE
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
     //   String fullName = "Tony Stark";
       // System.out.println(fullName.length());
       
       //concatenation
//        String firstName = "Suhel";
//        String lastName = "Husain";
//        String fullName = firstName+" "+lastName; 
//        System.out.println(fullName.charAt(1));
// //seeing the lacture six
      
//     }


// Question no 1
/*public static boolean isPalindrome(String str){
   for(int i=0; i<str.length()/2; i++){
      int n = str.length();
      if(str.charAt(i) != str.charAt(n-1-i)){
         //not a palindrome
         return false;

      }
   }
   return true;
   
}

   String str = "racecar";
   System.out.println(isPalindrome(str));
}/* */

//   Question no 2
/*public static float getShortestPath(String path){
   int x = 0, y=0;
   for(int i=0; i<path.length(); i++ ){
      char dir = path.charAt(i);
      //South
      if(dir == 'S'){
         y--;

      }
      //North
      else if(dir =='N'){
         y++;
      }
      //West
      else if(dir =='W'){
         x--;
      }
         //East
         else {
            x++;

         }
      }
      int X2 = (x*x);
      int Y2 = y*y;

      return(float)Math.sqrt(X2 +Y2);
   }

   


   String path  = "WEENESENN";
   System.out.println(getShortestPath(path));
}/* */


   //String function compare
   /*String s1 = "Tony";
   String s2 = "Tony";
   String s3 = new String("Tony");
   if(s1 == s2){
      System.out.println("String are equal");

   }else{
      System.out.println("Strings are not equal");
   }
   if(s1 == s3){
      System.out.println("String are equal ");

   } else{
      System.out.println("Strings are not equal");
   }
   if(s1.equals(s3)){
      System.out.println("Strings are equal");
   } else{
      System.out.println("Strings are not equal");
   }
   }/* */


   //String function
 // public static String subString(String str, int si, int ei){
   /*   String substr;
      for(int i = si; i<ei; i++){
         substr +=  str.charAt(i);


      }
      return substr;
   }
      public static void main(String[] args) {
       //  substring
       String str = "HelloWorld";
       System.out.println(str.substring(0,5));
      

  /* */


  //Question no 3
 /*  String substr = "";
  for(int i=si; i<ei; i++){
   substr += str.charAt(i);

  }
  return substr;
}
public static void main(String[] args) {
   String fruits[] = {"apple", "mango","banana"};

   String largest = fruits[0];
   for(int i=1; i<fruits.length; i++){
      if(largest.compareTo(Fruits[i]) <0){
         largest = fruits[i];

      }

   }
   System.out.println(largest);
} /* */


  /*  StringBuilder sb = new StringBuilder("");
   for(char ch='a'; ch<='z'; ch++){
      sb.append(ch);


   }// abcdefghijklmnop
   //0(26)
   //0(pn^2)
   System.out.println(sb);
}
/* */


/*public static String toUpperCase(String str){
   StringBuilder sb = new StringBuilder("");
   char ch = Character.toUpperCase(str.charAt(0));
   sb.append(ch);
   for(int i=1; i<str.length(); i++){
      if(str.charAt(i) == ' ' && i<str.length()-1){
         sb.append(str.charAt(i));
         i++;
         sb.append(Character.toUpperCase(str.charAt(i)));
      }else{
         sb.append(str.charAt(i));

      }
   }
   return sb.toString();
}
public static void main(String[] args) {

String str = "hi, i am suhel";
System.out.println(toUpperCase(str));
}/* */

//Question no 5
public static String compress(String str){
   String newStr="";
   for(int i=0; i<str.length(); i++){
      Integer count = 1;
      while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
         count++;
         i++;
      }
      newStr += str.charAt(i);
      if(count>1){
         newStr += count.toString();
      }

         
      }
      return newStr;
   }
   public static void main(String[] args) {
      String str = "abcd";
      System.out.println(compress(str));

      }
   




