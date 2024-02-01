abstract class Animal {
    
    public abstract void animalSound();
    }
  
  class Cat extends Animal {
    public void animalSound() {

      System.out.println("The cat sounds: Meow");
    }
  }
  
 public class abstraction {
    public static void main(String[] args) {
      Cat c = new Cat();
      c.animalSound();

    }
  }
