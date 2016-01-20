package org.com.jbatista.Serializacao;

import java.io.Serializable;

/*
*
* @author: Jozadaque Batista
* This example, shows how to make an object serializable.
*
 */

public class Acc implements Serializable
{

	private String owner;
	private String bank;
	private String passwd;
	private double quantity;
	private boolean log_in;

	public Acc( String _owner, String _bank )
	{
		this.owner = _owner;
		this.bank = _bank;
		this.quantity = 10000d;
		this.passwd = "12345";
		this.log_in = false;
	}

	public void LogIn(String _owner, String _passwd)
	{
		switch((log_in==false)?0:1)
		{
			case 0:
				if( _passwd == this.passwd )
				{
					System.out.println( "You're in." );
					this.log_in = true;
				}
				else
				{
					System.out.println( "Fail to login." );
				}
				break;

			case 1:
				System.out.println("You're already logged in.");
				break;
			default:
				break;
		}
	}

	public String Exit()
	{
		if(this.log_in == true)
		{
			this.log_in = false;
			return "Exiting from account ...";
		}
		else
		{
			return "You're not logged in. Please, do the log in first.";
		}
	}

	public double getMoneyQuantity()
	{
		if(this.log_in == true)
			return this.quantity;
		return 0.0d;
	}

	public double getMoney( double Quantity )
	{
		if(this.log_in == true)
		{
			this.quantity -= Quantity;
			return this.quantity;
		}
		return 0.0d;
	}

	public String[] getOwnerInfo()
	{
		String info[] = new String[3];
			   info[0]= this.owner;
			   info[1]= this.bank;
			   info[2]= String.valueOf(this.quantity);

		return info;
	}

	public String rescuePasswd(){ return this.passwd; }
}
