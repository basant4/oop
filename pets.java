/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.assignment;

/**
 *
 * @author Computer Market
 */
public class pets {
    
    
    public pets()
    {
 
    
    }
           
           
    
    
    String PetType;
    String PetColor;
    String PetSize;
    int PetAge;
    private String eyecolor ;
   
    
    public pets(String t,String c,String s,int a)
    {
     PetType=t;
     PetColor=c;
     PetSize=s;
     PetAge=a;
    }
    
    public void seteyecolor(String E)
    {
        this.eyecolor=E;
    }
    
    String geteyecolor()
    {
      return eyecolor;
    }
    
    String getPetType()
    {
        return PetType;
    }
    String getPetColor()
    {
        return PetColor;
    }
    String getPetSize()
    {
        return PetSize;
    }
    int getPetAge()
    {
        return PetAge;
    }
    
    
            
}
