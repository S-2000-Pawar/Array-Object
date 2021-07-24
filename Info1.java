/*5. Write a program to create a directory that contains the following information.
(a) Name of a person
(b) Address
(c) Telephone Number (if available with STD code)
(d) Mobile Number (if available)
(e) Head of the family */
 
class Info1
{
  
   public static void main(String[] args)
  { 
   
    String name[]={"Tom","Jerry","Mogali","Doremon"};
    String add[]={"Pune","Mumbai","Sangli","Satara"};
    int tele[]={43233,4567,1254,6756};
    String head[]={"Jerry","AB","CD","MN"};
     
     Info1 std=new Info1();
     for(int i=0;i<16;i++)
     {
        System.out.println("name" +name[i]+        "  "         +"add" +add[i]+       "   "             +"tele" +tele[i]+    "  "       +"head" +head[i]);
     }
   
 }
}
   