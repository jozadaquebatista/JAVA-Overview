package org.com.jbatista.Serializacao;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

import java.util.Scanner;

public class ObjSer
{
	public static void main(String[] args)
	{
		boolean fileExists = new File("/tmp/org/com/jbatista/Serializacao/acc.ser").exists();

		Acc acc=null,
			accExtended = null;

		if( fileExists )
		{
			Scanner questionLoad = new Scanner(System.in);
			String load;

			System.out.println( "You want to load current settings?" );
			load = questionLoad.next();

			switch( load )
			{
				case "y":
					// Carrega o objeto se existir o arquivo .ser
					try {
						FileInputStream fis = new FileInputStream("org/com/jbatista/Serializacao/"+"acc.ser");
						ObjectInputStream ois = new ObjectInputStream( fis );
						acc = (Acc)ois.readObject();
						ois.close();
					} catch( FileNotFoundException fnfe ) {
					fnfe.getMessage();
					} catch( ClassNotFoundException cnfe ){
						cnfe.getMessage();
					} catch( IOException ioe ) {
						ioe.getMessage();
					} finally {
						acc.getMoney(2120.00d);
					}
					break;
				case "n":
					new File("/tmp/org/com/jbatista/Serializacao/acc.ser").delete();
					System.exit(0);
					break;
			}

			System.out.println("File Exists...");
		}
		else
		{
			System.out.println("File doesn't exists...");
			acc = new Acc("Jozadaque", "Papoula");
		}

		/*for(String f : file.list() )
		{
			System.out.println(f);
		}   System.out.println(""); // Line Break*/

		String info[] = null;

		acc.LogIn("Jozadaque", "12345");
		
		System.out.println( (acc.getMoneyQuantity()==0.0)?("You already logged in?"):(acc.getMoneyQuantity()) );

		try {
			FileOutputStream fos = new FileOutputStream("org/com/jbatista/Serializacao/"+"acc.ser");
			ObjectOutputStream oos = new ObjectOutputStream( fos );
			oos.writeObject( acc );
			oos.close();
		} catch( FileNotFoundException fnfe ){
			fnfe.getMessage();
		} catch( IOException ioe ) {
			ioe.getMessage();
		} finally {
			acc.Exit();
		}

		try{
			FileInputStream fis = new FileInputStream("org/com/jbatista/Serializacao/"+"acc.ser");
			ObjectInputStream ois = new ObjectInputStream( fis );
			accExtended = (Acc)ois.readObject();
			ois.close();
		} catch( FileNotFoundException fnfe ) {
			fnfe.getMessage();
		} catch( ClassNotFoundException cnfe ){
			cnfe.getMessage();
		} catch( IOException ioe ) {
			ioe.getMessage();
		} finally{
			accExtended.getMoney(2120.00d);
		}

		info = accExtended.getOwnerInfo();
		System.out.println( "The accExtended have: " );
		System.out.print( (accExtended.getMoneyQuantity()==0.0)?("You already logged in?"):(accExtended.getOwnerInfo()) );

		for( String field : info )
		{
			System.out.println("OwnerInfo:" + field);
		}

		// System.out.println( accExtended.rescuePasswd() );

		accExtended.Exit();
	}
}
