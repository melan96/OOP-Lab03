public class Main{

	public static void main(String[] args){

		Pet p = new Pet("Lissie","Smith",3);
		p.showDetails();
		Cat c = new Cat("Kyan", "Silva", 4, 4);
		c.showDetails(); 

		Pet newbornPet = new Pet("Dod","TOSS");
		newbornPet.showDetails();

		Cat newbornCat = new Cat("CatPac","Max");
		newbornCat.showDetails();

		Dog newbornDog  = new Dog("DogTac","Jase");
		newbornDog.showDetails();


	}




}