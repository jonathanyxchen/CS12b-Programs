package PA04;
import java.util.*;
public class LyftDriver2{
  private String name;
  private int id;
  private double pickupFee;
  private double distanceFee;
  private double timeFee;
  private double distance;
  private double time;
  private double totalPay = 0;
  private int numRides = 0;
  private double singlePay;
  private LyftRide[] rides = new LyftRide[10000];

  public LyftDriver2(String name, int id, double pickupFee, double distanceFee, double timeFee){
    this.name = name;
    this.id = id;
    this.pickupFee = pickupFee;
    this.distanceFee = distanceFee;
    this.timeFee = timeFee;
  }

  public String toString(){
    return "driver("+name+","+id+","+singlePay+","+numRides+")";
  }

  public void completeRide(int id, double distance, double time){
    this.singlePay+= this.pickupFee + this.distanceFee*distance + this.timeFee*time;
    this.totalPay+= this.singlePay;
    LyftRide information = new LyftRide(id,distance,time);
    rides[numRides] = information;
    this.numRides++;
  }

  public double getTotalPay(){
    return this.totalPay;
  }

  public int getNumRides(){
    return this.numRides;
  }

  public LyftRide[] getRides(){
    int count = 0;
    LyftRide[] total = new LyftRide[this.numRides];
    for (int i=0;i<numRides;i++){
        total[count] = rides[i];
        count++;
    }
    return total;
  }
}
