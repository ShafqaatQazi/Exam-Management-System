



public class Subjects extends Students
{
   public int length;
   public String [] Sub;

   public void SubjectName()
   {
       
       System.out.println("Enter a Number of subjects:");
       length=input.nextInt();
       
       int a = this.length;
       Sub   = new String[a]; 
       int i=0;
       while(i<a)
       {
          System.out.println("Enter a Name of subjects:");
           this.Sub[i]=input.next();
           i++;
       }   
           
   }
   public void AddSubjects()
   {
       SubjectName();
   }
   public void RemoveSubjects()
   {
        SubjectName();
   }
   public void ReplaceSubjects()
   {
       String Subject;
       String Subject1;
       System.out.println("Enter the name of subject with whom you want to replace :");
       
       for(int i=0 ;i<length ; i++)
       {
           System.out.println(i+ ":" + Sub[i]);
       
           Subject=input.nextLine();
           if(Subject.equals(Sub[i]))
           {
               System.out.println("Enter name of subject :");
               Subject1=input.nextLine();
               Sub[i]=Subject1;
           }
       }
   }
   public void printSubject()
   {
      System.out.println("Subjects :");
      for(int i=0;i<length;i++)
      {
          System.out.println(Sub[i]+" ");
      }
   }
   public void addition()
   {
       int i;
       System.out.println("Enter the number action you want to perform :");
       System.out.println("1.Add subjects\n2.Remove Subjects\n3.Replace Subjects\n4.See your subjects:");
       i=input.nextInt();
       switch(i)
       {
           case 1:
           {
               AddSubjects();
               break;
           }
           case 2:
           {
               RemoveSubjects();
               break;
           }
           case 3:
           {
               ReplaceSubjects();
               break;
           }
           case 4:
           {
               printSubject();
               break;
           }
           default:
           {
               System.out.println("invalid input");
               break;
           }
       } 
   }

}
