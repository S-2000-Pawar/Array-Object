//3. Write a program to calculate the average height of all the students of a class. The number of students and their heights are entered by the user.


import java.util.Scanner;
class Average1
{
   public static void main(String[] args)
   {
      int n;
      float sum=0,avg,height;
      Scanner Scanner;
      Scanner=new Scanner(System.in);
      System.out.println("Enter number of student");
      n=Scanner.nextInt();
      System.out.println("Enter height of student");
      
        for(int i=0;i<n;i++)
        {
        System.out.println("Student" + (i+1) );
        height=Scanner.nextFloat();
        sum=sum+height;
        
     }
    
     avg=sum/n;
     System.out.println("Average height" +avg);
   }
}
      

