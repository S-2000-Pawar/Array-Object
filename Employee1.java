//1.Write a program to print the name, salary and date of joining of 10 employees in a company. Use array of objects

class Employee
{
   
   public void company(String name[],int salary[],int date[])
   {
      for(int i=0;i<30;i++)
     {
        System.out.println("name" +name[i]+        "  "         +"salary" +salary[i]+       "   "             +"date" +date[i]);
     }
   }
}
      
 public class Employee1
 {
      public static void main(String[] args)
      { 
        
   
      String name[]={"Tom","Jerry","Mogali","Doremon","mr.bean","honeybeen","popoye","Tarzen","Nobita","Parmen"};
      int salary[]={43233,45672,12543,67561,76564,87675,89765,76547,45673,78654};
      int date[]={2000,2002,2005,2007,2015,2014,2018,2017,2019,2020};
      Employee emp=new Employee();
      emp.company(name,salary,date);
      
     }
}