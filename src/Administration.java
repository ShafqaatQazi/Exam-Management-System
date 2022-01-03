/*
 * @author ShafqaatQAzi
 */
import java.util.Scanner;
public class Administration 
{
   public String Username;
   private String password;
   private String Username1;
   private String password1;
   
   Scanner input1=new Scanner(System.in);
   private void setinfo()
   {
       Username="admin";
       password="admin";
   }
   public void info()
   {
       setinfo();
   }
   public void login()
   {
       System.out.println("LOGIN "); 
       boolean i,n ;
       i=false;
       while(i==false)
       {
          System.out.print("Enter Username ");
          Username1=input1.nextLine();
          if(Username.equals(Username1))
          {
              i=true;
          }
          else
          {
              i=false;
              System.out.println("Incorrect Username");
          }
        
       }
       n=false;
       while(n==false)
       {
          System.out.print("Enter Password ");
          password1=input1.nextLine(); 

          if(password.equals(password1))
          {
              n=true;
          }
          else
          {
              System.out.print("Incorrect Password");
              n=false;
          }
       }
   }
   public void change()
   {
       String userinput;
       String userinput1;
        int a;
        System.out.println("would you like to change user name or password :");
        System.out.println("1.Yes\n2.No");
        a=input1.nextInt();
        switch(a)
        {
            case 1:
            {
                System.out.println("input username :");
                userinput=input1.next();
                Username=userinput;
                System.out.println("input password");
                userinput1=input1.next();
                password=userinput1;
                break;
            }
            case 2:
            {
                break;
            }
            default:
            {
                System.out.println("Invalid Input");
                break;
            }
        }
   }
}
