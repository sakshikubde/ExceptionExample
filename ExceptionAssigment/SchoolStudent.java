package ExceptionAssigment;

public class SchoolStudent extends Student {

	private String className;

	public SchoolStudent() {
		super();
		className="";
	}

	public SchoolStudent(int rollNo, float percentage,String className) {
		super(rollNo, percentage);
		// TODO Auto-generated constructor stub
		this.className=className;
	}


	public void getData() {
		// TODO Auto-generated method stub
		super.getData();
		{
			System.out.println("School RollNo= "+rollNo+" School percentage= "+percentage+" School ClassName= "+className);
			}
	}
	
	
	
	
}
