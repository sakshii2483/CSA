//taking input from user and count number of vowels and words in a string
import java.util.Scanner;
public class TaskTwo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence ");
    String str = sc.nextLine();
    int count = 0;
    for(int i = 0; i < str.length(); i++)
      {
        if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
        {
          count++;
        }  
      } 
    System.out.println("Number of vowels in the sentence is " + count);
    String[] words = str.split(" ");
    System.out.println("Number of words in the sentence is " + words.length);
    sc.close();
  }
}