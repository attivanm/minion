/**
 * 
 */
public class KingdomTestDrive {

    public static void main(String[] args) {
        KingdomFactory factory = FactoryProducer.getFactory("Elf");
        King king = factory.makeKing();
        Castle castle = factory.makeCastle();
        Army army = factory.makeArmy();
        System.out.println("The kingdom was created: ");
        System.out.println(king);
        System.out.println(castle);
        System.out.println(army);

    }
}