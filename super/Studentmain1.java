/* superclass Person */
class Person
{
	String name;
	int age;
    Person(String name,int age)
    {
		this.name=name;
		this.age=age;
        System.out.println("Person class Constructor  "+name+" age"+age);
    }
}
 
/* subclass Student extending the Person class */
class Student extends Person
{
    Student()
    {
        // invoke or call parent class constructor
       super("MSIT",25);
        System.out.println("Student class Constructor");
		 
    }
}
 
/* Driver program to test*/
class Studentmain1
{
    public static void main(String[] args)
    {
        Student s = new Student();
    }
}