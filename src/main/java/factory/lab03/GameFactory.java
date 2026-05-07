package factory.lab03;

public abstract class GameFactory {
    public abstract Game createGame();
    public void jugar(){
        Game game = createGame();
        System.out.println("Se jugará: " + game.getInfo());
        game.start();
    }
}
