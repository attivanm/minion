/**
 * 
 */

public class ElfKingdomFactory extends KingdomFactory {
    @Override
    public Castle makeCastle() {
        return new ElfCastle();
    }

    @Override
    public King makeKing() {
        return new ElfKing();
    }

    @Override
    public Army makeArmy() {
        return new ElfArmy();
    }
}