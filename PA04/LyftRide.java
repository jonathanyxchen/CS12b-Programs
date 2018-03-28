package PA04;
public class LyftRide{
  private int customerID;
  private double miles;
  private double minutes;

  public LyftRide(int customerID, double miles, double minutes){
    this.customerID = customerID;
    this.miles = miles;
    this.minutes = minutes;
  }

  public String toString(){
    return "LyftRide("+customerID+","+miles+","+minutes+")";
  }
}
