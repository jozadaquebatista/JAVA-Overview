

class Person
{

    static StringBuffer name;
    int age;
    
    public Person()
    {
        this.name = new StringBuffer("anon");
    }
    
    public Person(StringBuffer name)
    {
        this.name = name;
        System.out.println("hi, I'm " + this.name + ".");
    }

    public static int Say(StringBuffer say)
    {
        if(name == new StringBuffer("anon") || name == null) {
            System.out.println("hi, I don't have a name and " + say);
        }
        
        return 0;
    }

}

public class staticClassMethod
{

    public static void main(String[] args)
    {
        {
            Person.Say( new StringBuffer("just saying something ... ") );
            
            Person littleWorldPerson = new Person( new StringBuffer("Jozadaque") );
        }
    }
    
    static
    {
        {
            Person.Say( new StringBuffer("Hello there! =D") );
        }
    }

}
