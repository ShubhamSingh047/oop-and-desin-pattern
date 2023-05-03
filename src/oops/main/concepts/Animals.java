package oops.main.concepts;

abstract class Animals {
		Animals(){
			System.out.println("All animals");
		}
		public abstract void soundAnimal();
	}

	class Dog extends Animals{
		public void soundAnimal() {
			System.out.println("barking");
		}
	}

	class Lion extends Animals{
		public void soundAnimal() {
			System.out.println("Roaring");
		}
	}
