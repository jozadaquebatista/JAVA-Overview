import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

class Animal
{

    public void Animal()
    {
        System.out.println("Grrr ... ");    
    }

}

class Dog extends Animal
{

    
    public void Say()
    {
        System.out.println("Woof ...");
    }

}

class Cat extends Animal
{

    
    public void Say()
    {
        System.out.println("Meow ...");
    }

}

public class cLinkedAnimals
{

    static Dog dog = null;
    static Cat cat = null;

    public cLinkedAnimals()
    {
        //Animal dog = new Dog();
        //Animal cat = new Cat();
    }
    
    static public void main(String[] args)
    {
    
        List<Animal> myLittleVirtualPets = new LinkedList<Animal>();
        
        int count = 0;
        
        dog = new Dog();
        cat = new Cat();
        
        dog.Say();
        cat.Say();
                
        /*System.out.println("Elements of LL clients: \n");
        
        while(list_it.hasNext())
        {
            System.out.println("\t-> " + list_it.next());
        }
                
        for(Person element : clients)
        {
            count += 1;
        }
                
        System.out.println("There are " + count + " in the List clients.\nExiting Now...");*/
        
    }

}
