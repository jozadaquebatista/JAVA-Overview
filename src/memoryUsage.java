import java.lang.management.MemoryUsage;

public class memoryUsage
{

    public static void main(String[] args)
    {
        MemoryUsage mem = new MemoryUsage(1, 5, 50, 100);
        
        System.out.println(mem.toString());
    }

}
