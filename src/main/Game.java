package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import screens.PlayScreen;
import screens.ShopScreen;

public class Game extends StateBasedGame {
	
	private final int startScreen = 0;
	private final int playScreen = 1;
	private final int shopScreen = 2;

	public Game(String name) {
		super(name);
		this.addState(new PlayScreen(playScreen));
		this.addState(new ShopScreen(shopScreen));
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app;
		
		app = new AppGameContainer(new Game("REO SHOOTWAGON"));
		app.setDisplayMode(1280, 720, false);
		app.setTargetFrameRate(60);
	    app.setVSync(true);
	    app.setShowFPS(false);
	    app.start();
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(playScreen).init(gc, this);
		this.getState(shopScreen).init(gc, this);
		this.enterState(playScreen);
	}

}
