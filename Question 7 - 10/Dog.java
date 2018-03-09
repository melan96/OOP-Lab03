public class Dog extends Pet{

	private int noMasters;
	

	Dog(String name,String owner,int age,int noMasters){

		super(name,owner,age);
		this.noMasters = noMasters;
		

	}	
	//overloaded constructor
	Dog(String name,String owner){
		super(name,owner,0);
		this.noMasters = 1;


	}
	
	@Override
	public void showDetails(){
		super.showDetails();

		System.out.println("  Dog Masters   "+this.noMasters);
	
	}


}