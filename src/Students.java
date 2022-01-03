
public class Students extends Information
{
   public String StudentName;
   public String CNIC;
   public String Regno;
   public String Fall;
   public String Section;
   
   
   public void information()
   {
       super.information();
       System.out.println("Enter student information :");
       System.out.println("Enter Student Name :");
       StudentName=input.nextLine();
       System.out.println("Enter CNIC/Bform No :");
       CNIC=input.nextLine();
       System.out.println("Enter Fall :");
       Fall=input.nextLine();
       System.out.println("Enter  Section:");
       Section=input.nextLine();
       System.out.println("Enter Regno :");
       Regno=input.nextLine();
      
   }
   public void printinfo()
   {
     System.out.println("Student Name: " +StudentName );
     System.out.println("CNIC/Bform No :"+CNIC);
     System.out.println("Fall  "+Fall);
     System.out.println("Section :"+Section);
     System.out.println("Regno "+Regno);
     super.printinfo();

   }
   
}
