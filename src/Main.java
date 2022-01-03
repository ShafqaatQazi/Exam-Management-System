import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
       
       Administration Admin=new Administration();
       
       Admin.info();
       Admin.login(); 
       Admin.change();
       

       int Choice;
       int num;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter a Number of Students  ");
       num=input.nextInt();
       
       Record Obj[]=new Record[num]; 
       for(int i=0;i<=num;i++)
       {
           Obj[i]=new Record();
           Obj[i].record();
       }
      
       System.out.println("Enter 1.Print Record of Specific registration no.\n2.Exit :");
       Choice=input.nextInt();
       switch(Choice)
       {
          case 1:
          {
              String regno;
              System.out.println("Enter registration no you want to print the data:");
              regno=input.nextLine();
              for(int i=0;i<=num;i++)
              {
                 if(regno.equals(Obj[i].Regno))
                 {
                     Obj[i].printinfo();
                     Obj[i].printSubject();
                     Obj[i].grade();
                     Obj[i].Marks();
                     
                 }
              }
          }
  
       }
     
    }
     
}
