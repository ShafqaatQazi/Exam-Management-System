import java.util.*;
public class Information
{
    String InstituteName;
    String Department;
    String Program;
  
   Scanner input=new Scanner(System.in);
  public void information()
  {
    System.out.println("Enter the Information:");
    System.out.println("Enter the Institute Name:");
    InstituteName=input.nextLine();
    System.out.println("Enter the Department:");
    Department=input.nextLine();
    System.out.println("Enter the program:");
    Program=input.nextLine();  
  }
  public void printinfo()
  {
     System.out.println("Institute name: " +InstituteName );
     System.out.println("Department :"+Department);
     System.out.println("Program :"+Program);
  }
  public void choice()
  {
      int i;
      System.out.println("Enter you want to perform ");
      System.out.println("1.Change the information\n2.See the information you entered\n3.Continue ");
      i=input.nextInt();
      switch(i)
      {
          case 1:
          {
              information();
              break;
          }
          case 2:
          {
              printinfo();
              break;
          }
          case 3:
          {
             System.out.println("Continued");
             break;
          }
          default:
          {
              System.out.print("Invalid input");
              break;
          }
      }      
  }   
}
