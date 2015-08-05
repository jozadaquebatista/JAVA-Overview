package teste1;


import java.util.Scanner;

public class Teste1
{

    public static void main(String[] args)
    {
        
        String o = new String();
        
        String str = "Uma frase aqui";
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(str.getClass().getSuperclass());
        System.out.println(o.getClass().getSuperclass());
        
        int[] meuArray = new int[10];
        
        for(int i=0; i < meuArray.length; i++)
        {
            System.out.print("Insert the " + (i+1) + " item in the " + i + " array position: ");
            meuArray[i] = input.nextInt();
            
        }
        
        for(int i=0; i < meuArray.length; i++)
        {
            
            System.out.println("meuArray[" + i + "] = " + meuArray[i]);
            
        }
        
    }
    
}
