
public class Grades extends Subjects
{
   public int Marks[];
   public char Grades[];
   
   public void marks()
   {
       
       Marks = new int[length];
       System.out.println("Enter the marks of subjects:");
       for(int i=0;i<length;i++)
       {
           System.out.println("Enter the marks of "+Sub[i]);
           Marks[i]=input.nextInt();
       }
   }
   public boolean grades()
   {
       Grades = new char[length];       
       System.out.println("Grades of Subjects:");
       for(int i=0;i<length;i++)
       {
           if(Marks[i]>=85 && Marks[i]<=100)
           {
               Grades[i]='A';
               System.out.println("Grade of subject :"+Sub[i]+" "+Grades[i]);
               
           }
           if(Marks[i]>=75 && Marks[i]<=84)
           {
               Grades[i]='B';
               System.out.println("Grade of subject :"+Sub[i]+" "+Grades[i]);
           }
           if(Marks[i]>=60 && Marks[i]<=74)
           {
               Grades[i]='C';
               System.out.println("Grade of subject :"+Sub[i]+" "+Grades[i]);
           }
           if(Marks[i]>=50 && Marks[i]<=64)
           {
               Grades[i]='D';
                System.out.println("Grade of subject :"+Sub[i]+" "+Grades[i]);
           }
           if(Marks[i]>=40 && Marks[i]<=49)
           {
               Grades[i]='E';
                System.out.println("Grade of subject :"+Sub[i]+" "+Grades[i]);
           }
           if(Marks[i]>=0 && Marks[i]<=39)
           {
               Grades[i]='F';
                System.out.println("Grade of subject :"+Sub[i]+" "+Grades[i]);
           }
       }
       System.out.println("Enter 1 to exit 0 to next student record:");
       int a = input.nextInt();
       if (a==1)
       {
           return false;
       }
       else
       {
           return true;
       }
   }
   public void Marks()
   {
       System.out.println("Enter the marks of subjects:");
       for(int i=0;i<=length;i++)
       {
         System.out.println(Marks[i]+" ");
       }
   }
   public void grade()
   {
      System.out.println("Grades :");
      for(int i=0;i<=length;i++)
      {
          System.out.println(Grades[i]+" ");
      }
   }
}
