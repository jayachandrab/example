class Student
{
	private Student()
	{

	}

	public static Student getStudent()
	{
			return new Student();
	}
}
class FacotryPattern 
{
	public static void main(String[] args) 
	{
		Student ob=Student.getStudent();
		System.out.println("Hello World!");
	}
}
