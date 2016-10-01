/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndrndcharmkr;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class CharacterDetails implements Serializable{
    	   String CharacterName;
           String CharacterClass;
           String Allignment;
             	   String type;

	
	   public String getCharacterName(){
		   return this.CharacterName;
	   }    
           public String getCharacterClass(){
		   return this.CharacterClass;
	   } 
                public String getAllignment(){
		   return this.Allignment;
	   } 
                  public String setCharacterName(String charactersname){
		    this.CharacterName= charactersname;
	   }    
           public String setCharacterClass(String CRclass){
		    this.CharacterClass= CRclass;
	   } 
                public String setAllignment(String allign){
		    this.Allignment = allign;
	   } 
                  @Override
	   public String toString() {
    	   return new StringBuffer(" Type : ")
    	   .append(" Name : ")
    	   .append(this.CharacterName)
    	   .append(" Name :")
    	   .append(this.CharacterClass)
    	   .append(" Allignment :")
    	   .append(this.Allignment).toString();
	   }
	   
}

