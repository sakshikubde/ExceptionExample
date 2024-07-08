package ExceptionAssigment;

public class XyzStudent {

	public static void findById(Student s[],int rollNo)
	{
		boolean found=false;
		for(Student student:s)
		{
		if(student.rollNo==rollNo)
		{
			student.getData();
			if(student instanceof CollegeStudent)
			{
				System.out.println("This is of College Student  ");
			}else if(student instanceof SchoolStudent)
			{
				System.out.println("This is of School Student   ");

			}
		 found=true;
			break;
			
		}
		
		}
		if(!found)
		{
			System.out.println(" Student with RollNo=  "+rollNo+" not found");

		}	
	}
	
	public static int countGrade(Student s[])
	{
		int count=0;
		for(Student student:s)
		{
			if(student.percentage>75)
			{
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
	     // Array to store student objects
		Student s[]= new Student[4];
		
		 // Create two CollegeStudent objects
		CollegeStudent collegeStudent= new CollegeStudent(11, 75.54f, 3);
		CollegeStudent collegeStudent2=new CollegeStudent(12, 68.24f, 2);
		
		SchoolStudent schoolStudent=new SchoolStudent(21, 85.24f, "12th");
		SchoolStudent schoolStudent2=new SchoolStudent(22, 76.25f, "10th");	
		
		 // Store objects in the array
		s[0]=collegeStudent;
		s[1]=collegeStudent2;
		s[2]=schoolStudent;
		s[3]=schoolStudent2;
		
		System.out.println("Displaying Student Data.....");
	     // Display all records
		for(Student student:s)
		{
			student.getData();
		}
		
		//find for student by roll no
		System.out.println();
		findById(s, 22);
		
		System.out.println();
		int gradeCount= countGrade(s);
		System.out.println("Students In A grade= "+gradeCount);
		
	}
}
