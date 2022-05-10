package concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try {
						
			FileInputStream ipFile = new FileInputStream("E:\\Training\\Java\\Core\\Paypal\\src\\concepts\\ip.txt");
			
			FileOutputStream opFile = new FileOutputStream("E:\\Training\\Java\\Core\\Paypal\\src\\concepts\\op.txt", true);
			
			int temp;
			/*
			while((temp = ipFile.read()) != -1)
			{
				opFile.write((byte) temp);
				System.out.print((char)temp);
			}
			*/
			String username = "Dinesh";
			String password = "123";
			
			opFile.write((username + "\t" + password).getBytes());
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
