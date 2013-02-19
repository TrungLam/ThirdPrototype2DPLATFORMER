package com.github.trunglam.ThirdPrototype;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Block {
	
	Image sprite;
	float x, y;
	public Block(String imageFileLocation, float locationX, float locationY) throws SlickException {
		sprite = new Image(imageFileLocation);
		x = locationX;
		y = locationY;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public Image getImage() {
		return sprite;
	}
}
