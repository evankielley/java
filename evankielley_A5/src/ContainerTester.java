public class ContainerTester
{
	public static void main(String[] args)
	{
		FrustumContainer frusty = new FrustumContainer(1.0, 1.0, 2.0);
		frusty.printStats(frusty);
		
		FrustumContainer frusty1 = new FrustumContainer(1.0, 1.0, 2.0);
		frusty1.printStats(frusty1);
	}
}