package factory.lab03;

public class RPGFactory extends GameFactory{
    @Override
    public Game createGame() {
        return new RPGGame();
    }

    @Override
    public void jugar() {
        Game game = createGame();
        System.out.println("Se jugara: "+ game.getInfo());
        game.start();
    }
}
