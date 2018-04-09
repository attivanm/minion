
/**
 * Write a description of class FiguraAbtracta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FactoryFigura {
	
 
   public Figura2 obtenerFigura(String type){

      if(type.equalsIgnoreCase("Circulo")){
         return new Circulo2();
         
      } else if(type.equalsIgnoreCase("Cuadrado")){
         return new Cuadrado2();
         
      } else if(type.equalsIgnoreCase("Triangulo")){
         return new Triangulo2();
      }
      
      return null;
   }
}

