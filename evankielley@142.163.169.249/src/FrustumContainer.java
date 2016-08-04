public class FrustumContainer
{
	private int num;
	private double height; // Height is in centimeters
	private double rad1; // Radius is in centimeters
	private double rad2; // Radius is in centimeters
	final static double PI = Math.PI;
	
	public FrustumContainer(int container_number, double height_in_cm, double bottom_radius_in_cm, double top_radius_in_cm)
	{
		container_number = num;
		height_in_cm = height;
		bottom_radius_in_cm = rad1;
		top_radius_in_cm = rad2;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
	
	public static double getVol(double height, double rad1, double rad2) // Volume is in Liters
	{
		double vol = ((PI * height) / 3) * (Math.pow(rad1, 2) + Math.pow(rad2, 2) + (rad1 * rad2));
		return vol;
	}
	
	public static void printStats(int num, double height, double rad1, double rad2, double vol)
	{
		System.out.println();
	}
}