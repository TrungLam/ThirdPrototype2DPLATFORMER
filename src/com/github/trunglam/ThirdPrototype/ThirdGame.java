package com.github.trunglam.ThirdPrototype;

import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class ThirdGame extends BasicGame{

	Image land;
	float x, y;
	static final float SURFACE_Y = 288;
	static final float CENTER_X = 400;
	
	Player player;
	Block firstBlock;
	ArrayList<Block> blocks = new ArrayList<Block>();
	
	public ThirdGame() {
		super("Third Game");
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		land.draw(x, y);
		player.getImage().draw(player.getX(), player.getY());
		
		for (Block block : blocks) {
			block.getImage().draw(block.getX(), block.getY());
		}
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		x = 0;
		y = 0;
		land = new Image("data/level_1.png");
		
		player = new Player("data/walk0001.png");
		
		for (float starting = 0; starting < 800; starting += 32) {
			blocks.add(new Block("data/ground32x32.png", starting, SURFACE_Y));
		}
	}

	@Override
	public void update(GameContainer gc, int arg1) throws SlickException {
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new ThirdGame());
		app.setDisplayMode(800, 320, false);
		app.start();
	}

}
