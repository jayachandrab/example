package p2;
import p1.*;
 
//This class is having default access modifier
class GeekNew
{
    public static void main(String args[])
       {  
          //accessing class Geek from package p1
          Geeks obj = new Geek();
 
          obj.display();
       }
}