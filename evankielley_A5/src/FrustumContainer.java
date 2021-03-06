public class FrustumContainer
{
	private int num;
	private static int counter = 1;
	public final int container_number;
	private double height; // Height is in centimeters
	private double rad1; // Radius is in centimeters
	private double rad2; // Radius is in centimeters
	final static double PI = Math.PI;
	
	public FrustumContainer(double height, double rad1, double rad2)
	{
		this.height = height;
		this.rad1 = rad1;
		this.rad2 = rad2;
		
		this.container_number = counter++;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getRad1() {
		return rad1;
	}

	public void setRad1(double rad1) {
		this.rad1 = rad1;
	}

	public double getRad2() {
		return rad2;
	}

	public void setRad2(double rad2) {
		this.rad2 = rad2;
	}
	
	public static double getVol(FrustumContainer jimbo) // Volume is in Liters
	{
		double vol = ((PI * jimbo.height) / 3) * (Math.pow(jimbo.rad1, 2) + Math.pow(jimbo.rad2, 2) + (jimbo.rad1 * jimbo.rad2)); // in cm^3
		vol = vol / 1000; // in liters
		return vol;
	}
	
	public static void printStats(FrustumContainer jimbo)
	{
		System.out.println("Container: " + jimbo.container_number);
		System.out.println("Height: " + jimbo.height + " cm");
		System.out.println("Lower Radius: " + jimbo.rad1+ " cm");
		System.out.println("Upper Radius: " + jimbo.rad2 + " cm");
		double vol = getVol(jimbo);
		System.out.println("Volume: " + vol + " liters");
		System.out.println();
	}
}