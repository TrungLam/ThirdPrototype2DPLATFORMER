package com.github.trunglam.ThirdPrototype;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player {
	
	Image sprite;
	float x, y;
	
	public Player(String imageFileLocation) throws SlickException {
		sprite = new Image(imageFileLocation);
		x = ThirdGame.CENTER_X;
		y = ThirdGame.SURFACE_Y - 96;
	}
	
	public float getHeight() {
		return sprite.getHeight();
	}
	
	public Image getImage() {
		return sprite;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
}
