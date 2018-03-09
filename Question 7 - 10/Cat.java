public class Cat extends Pet{

	private int livesLeft;
	public Cat(String name,String owner, int age,int livesLeft){
		super(name,owner,age);
		
		this.livesLeft =1;

	}

	public Cat(String name,String owner){
		
		
		super(name,owner,0);
		this.livesLeft = 7;
	
			
	}


	@Override
	public void showDetails(){

		super.showDetails();
		System.out.println("No of Lives remaining  :"+this.livesLeft);

	}
	

}//end of the pet class


