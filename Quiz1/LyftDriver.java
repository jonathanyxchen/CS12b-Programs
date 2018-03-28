public class LyftDriver{
	private String driverName;
	private int driverID;
	private double pickupFee;
	private double distanceFee;
	private double timeFee;
	private double totalPay=0;
	private int numRides=0;

	public LyftDriver(String driverName, int driverID, double pickupFee, double distanceFee, double timeFee){
		this.driverName=driverName;
		this.driverID=driverID;
		this.pickupFee=pickupFee;
		this.distanceFee=distanceFee;
		this.timeFee=timeFee;
	}

	public void completeRide(int passengerID, double distance, double time){
	    this.totalPay+=pickupFee+distanceFee*distance+timeFee*time;
		numRides++;
	}

	public double getTotalPay(){
		return this.totalPay;
	}

	public int getNumRides(){
		return this.numRides;
	}

	public String toString(){
		return "driver("+driverName+","+driverID+","+totalPay+","+numRides+")";
	}
}