//program to perform different operations on strings

public class TaskOne 
  {
    public static void main(String[] args)
    {
      //creating string using literal and new keyword
      String str1 = "Java Programming";
      String str2 = new String("Learning Java");
      //printing strings
      System.out.println("String str1: " + str1);
      System.out.println("String str2: " + str2);
      //finding length of string
      System.out.println("Length of string str1: " + str1.length());
      //converting string to lowercase
      System.out.println("Lowercase of string str1: " + str1.toLowerCase());
      //converting string to uppercase
      System.out.println("Uppercase of string str1: " + str1.toUpperCase());
      //concatenating two strings
      System.out.println("Concatenation of str1 and str2: " + str1.concat(str2));
      //comparing two strings using equals method
      System.out.println("Comparison of str1 and str2 using equals method : " + str1.equals(str2));
      //comparing two strings using compareTo method
      System.out.println("Comparison of str1 and str2 using compareTo method : " + str1.compareTo(str2));
      //finding a character at a specific index
      System.out.println("Character at index 6 in str1: " + str1.charAt(6));
      //finding index of a specific character using indexOf method
      System.out.println("Index of character 'a' in str2: " + str2.indexOf('a'));
      //finding index of a specific character using lastIndexOf method
      System.out.println("Last index of character 'a' in str1: " +     str1.lastIndexOf('a'));
      //extracting a substring from a string
      System.out.println("Substring of str1 from index 5 to 12: " + str1.substring(5, 12));
      //replacing a character in a string
      System.out.println("Replacing 'a' with 'e' in str1: " + str1.replace('a', 'e'));
    }
  }