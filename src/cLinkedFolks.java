import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

class Person
{

    String name;
    int age;

    public Person(String name_arg, int age_arg)
    {
        name = name_arg;
        age = age_arg;
    }
    
    public void Message()
    {
        System.out.println("Hello Folks!");
    }

}

public class cLinkedFolks
{

    static
    Person p1 = null,
           p2 = null,
           p3 = null,
           p4 = null,
           p5 = null;

    public cLinkedFolks()
    {
        //Person p1 = new Person("Jozadaque", 21);
        //Person p2 = new Person("Estevão", 15);
        //Person p3 = new Person("Stella", 25);
        //Person p4 = new Person("Fabio", 18);
        //Person p5 = new Person("Marcos", 20);
    }
    
    static public void main(String[] args)
    {
    
        List<Person> clients = new LinkedList<Person>();
        
        int count = 0;
        
        clients.add( new Person("Jozadaque", 21) );
        clients.add( new Person("Estevão", 15) );
        clients.add( new Person("Stella", 25) );
        clients.add( new Person("Fabio", 18) );
        clients.add( new Person("Marcos", 20) );
        
        ListIterator list_it = clients.listIterator();
                
        System.out.println("Elements of LL clients: \n");
        
        while(list_it.hasNext())
        {
            System.out.println("-> " + list_it.next());
        }
                
        for(Person element : clients)
        {
            count += 1;
        }
                
        System.out.println("There are " + count + " in the List clients.\nExiting Now...");
        
    }

}
