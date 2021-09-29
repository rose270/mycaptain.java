import.java.util.Scanner;
public class switchcase{
    public static void main(String args[]){
      int choice;
      System.out.println("1.hi\t2.hey\t3.hello\t");
      Scanner s = new Scanner(System.in);
      choice = s.nextInt();
      switch(choice)
      {
        case 1 : System.out.println("Hi");
               break;
        case 2 : System.out.println("Hey");
               break;
        case 3 : System.out.println("Hello");
               break;
        default: System.out.println("invalid input");
               break;
      }
    }
}
