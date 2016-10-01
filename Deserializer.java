/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndrndcharmkr;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
public class Deserializer {
    public static void main (String args[]) throws IOException {
    int count;
	   Deserializer deserializer = new Deserializer();
	   count=deserializer.getCount();
	   System.out.println(count);
           CharacterDetails[] chardetails = deserializer.deserialzeAccount();
		   System.out.println(chardetails[0].getCharacterName());
		  System.out.println(chardetails[2].getCharacterClass());
		   System.out.println(chardetails[3].getAllignment());
                   
                    //get total number of accounts in file
    }public int getCount() {
	   CharacterDetails[] accountdetails = new CharacterDetails[4];
		 int i=0;

		   FileInputStream fin = null;
		try {
			fin = new FileInputStream("test.ser");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			return i;
		}
		   ObjectInputStream ois=null;
		try {
			ois = new ObjectInputStream(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try{
			   //FileInputStream fin = new FileInputStream("test.ser");
			  // ObjectInputStream ois = new ObjectInputStream(fin);
			   while(true){
				   accountdetails[i] = (CharacterDetails) ois.readObject(); 
			  i++;
			   }
			   
		   }catch(Exception ex){
			  // ex.printStackTrace();
			   try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   System.out.println(i);
			   return i;
		   } 
	   
                   
                   
                   
} public CharacterDetails[] deserialzeAccount() throws IOException {
	   
	   CharacterDetails[] characterdetails = new CharacterDetails[4];
	 int i=0;

	   FileInputStream fin = new FileInputStream("test.ser");

	   ObjectInputStream ois = new ObjectInputStream(fin);
	   try{
		   //FileInputStream fin = new FileInputStream("test.ser");
		  // ObjectInputStream ois = new ObjectInputStream(fin);
		   while(true){
			   characterdetails[i] = (CharacterDetails) ois.readObject(); 
		  i++;
		   }
		   
	   }catch(Exception ex){
		  // ex.printStackTrace();
		   ois.close();
		   //System.out.println(i);
		   return characterdetails;
	   } 
   } 
}
