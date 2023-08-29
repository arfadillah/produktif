package animal;
public class Demo {
    public static void main(String[] args){
    Animal animal =  new Animal();
    animal.makeNoise();
    dog Dog = new dog();
    Dog.makeNoise();
    Animal animalDog = new dog();
    animalDog.makeNoise();

    if (animal instanceof Animal){
        System.out.println("animal is Animal");
    }
    if (Dog instanceof Animal){
        System.out.println("dog is Animal");
    }
    if (animalDog instanceof Animal){
        System.out.println("animaldog is Animal");
    }
    if (animal instanceof dog){
        System.out.println("animal is Dog");
    }
    }
}
