

import java.util.Scanner;

/**
 *
 * @author Computer Market
 */
public class OopAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    pets Hamaster = new pets("domestic","white","midium",4);
    pets Cat = new pets("domestic","gray","large",6);
    pets Dog = new pets("domestic","brown","small",3);
    
    
      turtle dempo=new turtle();
      dempo.PetColor="orange";
      dempo.PetSize="small";
      dempo.food="karafs";
      
      birds starling = new birds();
      starling.PetSize="small";
      starling.PetAge=2;
      starling.PetColor="red";
      
        System.out.println( starling.getPetColor()+" "+ starling.getPetSize()+"  "+dempo.food );
      
      Hamaster.seteyecolor("blue");
        System.out.println(Hamaster.geteyecolor());
      dempo.seteyecolor("brown");
      starling.seteyecolor("black");
        System.out.println(starling.geteyecolor()+"\n"+ dempo.geteyecolor());
      
      
    
    
    
    
        System.out.println("for Hamaster press 1");
        System.out.println("for Cat press 2");
        System.out.println("for Dog press 3");
        
        Scanner input = new Scanner(System.in);
        int choice=input.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println(Hamaster.getPetType()+" "+ Hamaster.getPetColor()+" "+Hamaster.getPetSize()+" "+Hamaster.getPetAge());
            break;
            case 2:
                System.out.println(Cat.getPetType()+" "+ Cat.getPetColor()+" "+Cat.getPetSize()+" "+Cat.getPetAge());
            break;  
            case 3:
                System.out.println(Dog.getPetType()+" "+ Dog.getPetColor()+" "+Dog.getPetSize()+" "+Dog.getPetAge());
            break;    
        }
        
        
        
    
    }
    

   
           
    
}
