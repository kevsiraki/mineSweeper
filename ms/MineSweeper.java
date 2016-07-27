public class MineSweeper {
    private static Game game;

	public static void main(String[] args) {
        setGame(new Game());

    }

	public static Game getGame() {
		return game;
	}

	public static void setGame(Game game) {
		MineSweeper.game = game;
	}

}
