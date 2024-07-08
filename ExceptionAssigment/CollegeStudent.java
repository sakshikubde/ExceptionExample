package ExceptionAssigment;

public class CollegeStudent extends Student {

	private int semester;

	public CollegeStudent() {
		super();
		semester=0;
	}

	public CollegeStudent(int rollNo, float percentage,int semester) {
		super(rollNo, percentage);
	
		this.semester=semester;
	}

	
	public void getData() {
	
		super.getData();
		{
			System.out.println("College RollNo= "+rollNo+" College Percentage= "+percentage+" College Semester= "+semester);
		}
	}
	
	
	
}
