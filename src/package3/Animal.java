package package3;

class Animal {

	  // field and method of the parent class
	  String name;
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// inherit from Animal
class Puppy extends Animal {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}

class Main {
	 public static void main(String[] args) {

	    // create an object of the subclass
	    Animal labrador = new Animal();

	    // access field of superclass
	    labrador.name = "Rohu";

	    // call method of superclass
	    // using object of subclass
	    labrador.eat();

	  }
	}