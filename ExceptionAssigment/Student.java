package ExceptionAssigment;

public class Student {

	protected int rollNo;
	protected float percentage;
		
	public Student() {
		super();
	 rollNo=0;
	 percentage=0;
	}

	public Student(int rollNo, float percentage) {
		super();
		this.rollNo = rollNo;
		this.percentage = percentage;
	}
	
	public void getData()
	{
		System.out.println("RollNo= "+rollNo+"Percentage= "+percentage);
	}
	
	
}
