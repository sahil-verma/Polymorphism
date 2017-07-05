/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.ArrayList;
import animal.*;

/**
 *
 * @author sahil
 */
public class Tester {
    public static void main(String[] args)
    {
        ArrayList<Animal> myList = new ArrayList();
        
        //as dog is an animal and dog class extends the animal class 
        /*
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        */
        //cant do down casting like the sub class cant be extend animal as dog always cant be a animal
       // Dog myPooch = new Animal();
       
       /*
       myList.add(myDog);
       myList.add(myCat);
       */
       
       //Annonyms object creation from above code
       myList.add(new Dog());
       myList.add(new Cat());
       //if the return type wont be string and instead it should void in methods
       //myList.get(0).makeSound()
       //myList.get(1).makeSound()
       
       System.out.println("A "  + myList.get(0).getClass().getSimpleName() + " makes the sound: " + myList.get(0).makeSound());
       System.out.println("A "  + myList.get(1).getClass().getSimpleName() + " makes the sound: " + myList.get(1).makeSound());
       
       
       

    }
}
