public class Person{

	private String name;
	private String address;


	public void setName(String name){
		this.name = name;
	}

	public void setAddress(String address){

		this.address = address;

	}

	public String getName(){
		return this.name;
	}

	public String getAddress(){
		return this.address;
	}

	public void printDetails(){

		System.out.println("Name    :"+this.name);
		System.out.println("Name    :"+this.address);
		
	}

}