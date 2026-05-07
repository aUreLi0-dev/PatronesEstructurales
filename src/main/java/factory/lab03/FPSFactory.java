package factory.lab03;

public class FPSFactory extends GameFactory{
    @Override
    public Game createGame() {
        return new FPSGame();
    }

}
