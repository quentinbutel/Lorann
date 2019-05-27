package entity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	private Image image;
	private String imageName;
	private char charImage;
	private boolean imageLoaded;
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public char getCharImage() {
		return charImage;
	}

	public void setCharImage(char charImage) {
		this.charImage = charImage;
	}

	
	public Sprite(char character, String imageName) {
		
	}
	
	public void loadImage() throws IOException {
		this.setImage(ImageIO.read(new File("C:\\Users\\qbute\\git\\BoulderDash1\\masterpom\\entity\\SpritesCut/" + this.getImageName())).getScaledInstance(48, 48, Image.SCALE_DEFAULT));
	}
	
	public boolean isImageLoaded() {
		return imageLoaded;
		
	}
	
	public void setImageLoaded(boolean isImageLoaded) {
		
	}
}