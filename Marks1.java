//2.Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by the user and the roll numbers are automatically assigned.


class Marks
{
  int arr[];
  Marks(int rollno,int mark[])
  {
      int Total=0,Average;
      for(int i=0;i<3;i++)
      {
         Total=mark[i]+Total;
      }
      Average=Total/3;
      System.out.println("Rollno"+rollno+ " " +"Average"+Average);
  }
}
public class Marks1
{
   public static void main(String[] args)
   {
      
      int arr[]={40,45,55};
      Marks m1=new Marks(1,arr);
      
      int arr1[]={35,80,65};
      Marks m2=new Marks(2,arr1);
       
      int arr2[]={90,85,83};
      Marks m3=new Marks(3,arr2);
      
      int arr3[]={37,43,53};
      Marks m4=new Marks(4,arr3);
      
      int arr4[]={67,65,72};
      Marks m5=new Marks(5,arr4);
       
      int arr5[]={54,65,70}; 
      Marks m6=new Marks(6,arr5);
       
      int arr6[]={77,73,79};
      Marks m7=new Marks(7,arr6);
       
      int arr7[]={93,84,87};
      Marks m8=new Marks(8,arr7);
      
   }
}