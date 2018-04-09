
/**
 * 
 */
public class CarsFactoryTestDrive {

    public static void main(String[] args) {

        CarsFactory factory;
        Car carCreated;

        factory = new NissanFactory();

        System.out.println("For Tsuru:");
        carCreated = factory.createProduct("tsuru");
         System.out.println(carCreated.getInformation());
       
        System.out.println("For Versa:");
        carCreated = factory.createProduct("versa");
        System.out.println(carCreated.getInformation());

        factory = new ToyotaFactory();

        System.out.println("For Corolla:");
        carCreated = factory.createProduct("corolla");
        System.out.println(carCreated.getInformation());

        System.out.println("For Camry:");
        carCreated = factory.createProduct("camry");
        System.out.println(carCreated.getInformation());
        

        System.out.println("For levin:");
        carCreated = factory.createProduct("levin");
        if(carCreated != null){
            System.out.println(carCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }

    }

}