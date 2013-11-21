import java.util.Random;

public class CylinderChallenge {
	private static final Random rand = new Random();
	
	private static int random(int min, int max) {
		return rand.nextInt(max - min + 1) + min;
	}
	
	private static double volume(double radius, double height) {
		return Math.PI*Math.pow(radius, 2)*height;
	}
	
	private static double surfaceArea(double radius, double height) {
		return 2D*Math.PI*radius*height;
	}
	
	public static void main(String[] args) {
		int radius = random(20, 40);
		int height = random(20, 40);
		System.out.println("Radius: " + radius);
		System.out.println("Height: " + height);
		System.out.println("Volume: " + Math.round(volume(radius, height)));
		System.out.println("Surface Area: "+ Math.round(surfaceArea(radius, height)));
	}
}