package logistics;

import java.awt.Rectangle;

public class ShopItem {
	private int x, y, width, height, cost;
	private String name;

	public ShopItem(int x, int y, int width, int height, int c, String n) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.name = n;
		this.cost = c;
	}
	
	//Getters and Setters
	public Rectangle bounds() {
		return new Rectangle(this.x, this.y, this.width, this.height);
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
