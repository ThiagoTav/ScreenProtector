package classes;
import java.awt.*;
import java.util.Random;
public abstract class Shape {

	//Atributos
	private Color color;
	private int posX;
	private int posY;
	private int speedX;
	private int speedY;
	
	//Construtor
	public Shape( Color color, int posX, int posY) {
		
		this.color=color;
		this.posX=posX;
		this.posY=posY;
		this.speedX=1;
		this.speedY=1;
				
	}

	
	
	//Metodos especificos
	public void move() {
		this.posX+=this.speedX; //metodo sobrecarga
		this.posY+=this.speedY;

	}
	public void move(int speed) {
		this.setSpeedX(speed); // oq é set????
		this.setSpeedY(speed); // oq é instanciada
		this.move();
	}
	public void move(int speedX, int speedY) {
		this.setSpeedX(speedX); // oq é set????
		this.setSpeedY(speedY);
		this.move();
	}
	public abstract void draw(Graphics g);
	public abstract void changeDir(int limXmin, int limXmax, int limYmin, int limYmax);
	
	
	public Color colorGenerate() {
		int r,g,b;
		Random rand = new Random();
		r=rand.nextInt(255);
		g=rand.nextInt(255);
		b=rand.nextInt(255);

		return new Color(r,g,b);
	}
	
	//Metodos de acesso (GET AND SET)
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
}
