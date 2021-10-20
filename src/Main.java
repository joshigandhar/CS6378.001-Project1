public class Main
{
	public static void main(String[] args)
	{
		//Read NodeID and Config file from command line
		NodeID id = new NodeID(Integer.parseInt(args[0]));
		String configFile = args[1];
		
		//Launch application and wait for it to terminate
		Application_deprecated myApp = new Application_deprecated(id, configFile);
		myApp.run();	
	}
}
