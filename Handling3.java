3)Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments).

class Non_Numeric extends Exception
{
Non_Numeric()
{ 
super("the value  is non numeric \n"); 
}
}
class Handling3
{
public static void main(String args[])
{
int a,b,c=0; 
try
{
a=Integer.parseInt(args[0]); 
throw new Non_Numeric();
}
catch(NumberFormatException e)
{
System.out.println(e);
} 
catch(Non_Numeric e)
{  
System.out.println(e);
}
}
}
