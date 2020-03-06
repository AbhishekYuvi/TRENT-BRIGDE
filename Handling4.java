4)	On a single track two vehicles are running. As vehicles are going in same direction there is no problem. If the vehicles are running in different direction there is a chance of collision. To avoid collisions write a Java program using exception handling. You are free to make necessary assumptions.

import java.io.*;
class collision extends Exception
{
collision(String s)
{ 
super(s);
}
}
class Handling4
{
public static void main(String ar[])
{
String t1=null,t2=null; try
{
DataInputStream in= new DataInputStream(System.in); System.out.println("enter the direction of vehicle1:(left/right):"); t1=in.readLine();
System.out.println("enter the direction of vehicle2:(left/right):"); t2=in.readLine();
if(!t1.equals(t2))
throw new collision("truck2 has to go on "+ t1 +" direction");
}
catch(collision e)
{
System.out.println(e); t2=t1;
System.out.println("the collision has been avoided  by redirection truck2");
}
catch(Exception e)
{ 
System.out.println(e); 
} 
System.out.println("direction of truck1 :"+t1); 
System.out.println("direction of truck2 :"+t2);
}
}
