
/**
 * Write a description of class Prueba2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba2
{
        public static void main(String[] args) {
      FactoryFigura figuras = new FactoryFigura();

      Figura2 cuadrado = figuras.obtenerFigura("Circulo");

   
      cuadrado.descripcion();

    }
}
