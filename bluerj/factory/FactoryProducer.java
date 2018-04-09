/**
 * 
 */
public class FactoryProducer {
   public static KingdomFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("Elf")){
         return new ElfKingdomFactory();
         
      }else if(choice.equalsIgnoreCase("Men")){
         return new MenKingdomFactory();
      }
      
      return null;
   }
}