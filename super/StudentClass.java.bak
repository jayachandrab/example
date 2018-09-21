class Address
{
   int streetNum;
   String city;
   String state;
   String country;
   Address(int street, String c, String st, String coun)
   {
       this.streetNum=street;
       this.city =c;
       this.state = st;
       this.country = coun;
   }
}
class StudentClass
{
   int rollNum;
   String studentName;
   //Creating HAS-A relationship with Address class
   Address studentAddr;
   
   StudentClass(int roll, String name, Address addr){
       this.rollNum=roll;
       this.studentName=name;
       this.studentAddr = addr;
   }


	void display()
	{

		System.out.println(this.studentName);
		System.out.println(this.rollNum);
		System.out.println(this.studentAddr.city);

	}

   public static void main(String args[])
	{
		Address ad=new Address(1,"hyd","TS","IND");

		StudentClass ob=new StudentClass(1233,"MSIT",ad);
        ob.display();
		StudentClass ob1=new StudentClass(12345,"JNTU",ad);
        ob1.display();

		
	}
   
}
