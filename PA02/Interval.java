public class Interval{
	private double lo;
	private double hi;

	/**
	param@two doubless representing the low and high limit
	*/
	public Interval(double lo,double hi){
		this.lo=lo;
		this.hi=hi;
	}

	/**
	param@a double representing the low limit
	*/
	public Interval(double lo){
		this.lo=lo;
		this.hi=lo;
	}

	/**
	return@a double that is the low limit
	*/
	private double getLo(){
		return this.lo;
	}

	/**
	return@a double that is the high limit
	*/
	private double getHi(){
		return this.hi;
	}

	/**
	param@two intervals z and w
	return@a boolean that shows if they are equal
	*/
	public boolean equals(Interval z, Interval w){
		return (z.lo==w.lo)&&(w.lo==w.lo);
	}

	/**
	param@two intervals w and y
	return@a new interval z that x add y
	*/
	public static Interval add(Interval x, Interval y){
		Interval z=new Interval(x.lo+y.lo,x.hi+y.hi);
		return z;
	}

	/**
	param@two intervals w and y
	return@a new interval that is x subtract y
	*/
	public static Interval subtract(Interval x, Interval y){
		Interval z=new Interval(x.lo-y.hi,x.hi-y.lo);
		return z;
	}

	/**
	param@two intervals w and y
	return@a new interval that is x multiply y
	*/
	public static Interval multiply(Interval x, Interval y){
		double min = Math.min(Math.min(x.lo*y.lo, x.lo*y.hi), Math.min(x.hi*y.lo, x.hi*y.hi));
		double max = Math.max(Math.max(x.lo*y.lo, x.lo*y.hi), Math.max(x.hi*y.lo, x.hi*y.hi));
		Interval z = new Interval(min, max);
		return z;
	}

	/**
	param@two intervals w and y
	return@a new interval that is x divided by y
	*/
	public static Interval divide(Interval x, Interval y){
		double min = Math.min(Math.min(x.lo/y.lo, x.lo/y.hi), Math.min(x.hi/y.lo, x.hi/y.hi));
		double max = Math.max(Math.max(x.lo/y.lo, x.lo/y.hi), Math.max(x.hi/y.lo, x.hi/y.hi));
		Interval z = new Interval(min,max);
		return z;
	}

	/**
	param@an interval x
	return@a new interval that is the negation of x
	*/
	public static Interval negate(Interval x){
		Interval z = new Interval(-x.hi, -x.lo);
		return z;
	}

	/**
	return@a string that is a bracket with the high and low limit inside
	*/
	public String toString(){
		return "["+this.lo+","+this.hi+"]";
	}
}