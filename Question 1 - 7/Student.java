public class Student extends Person{

	
	private int studentID;

	public Student(int StudentID){
		
		
			this.studentID = StudentID;
	}

	
	@Override
	public void printDetails(){

		super.printDetails();
		System.out.println("Student ID   :"+this.studentID);
				
	}




}