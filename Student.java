public class Student{
	private String name;
	private String sageid;
	private String graduationyear;

	public Complex(String name, String sageid, String graduationyear){
		this.name = name;
		this.sageid = sageid;
		this.graduationyear = graduationyear;
	}

	public Complex(double re){
		this.re=re;
		this.im=0;
	}

	public double getR(){
 		return Math.sqrt(this.re*this.re + this.im*this.im);
 	}

 	public double getTheta(){
 		return Math.atan2(this.im,this.re);
 	}

	public static Complex fromPolar(double r,double theta){
		double re=r*Math.cos(theta);
		double im=r*Math.sin(theta);
		return new Complex(re,im);
	}
	public double getReal(){
		return this.re;
	}

	public double getImag(){
		return this.im;
	}

	public void setReal(double re){
		this.re=re;
	}

	public void setImag(double im){
		this.im=im;
	}

	public boolean equals(Complex z){
		return (z.re==this.re)&&(z.im==this.im);
	}

	public static Complex add(Complex u, Complex v){
		Complex z =new Complex(u.re+v.re, u.im+v.im);
		return z;
	}

	public static Complex subtract(Complex u, Complex v){
		Complex z=new Complex(u.re-v.re, u.im=v.im);
		return z;
	}

	public static Complex multiply(Complex u, Complex v){
		Complex z =new Complex(u.re*v.re-u.im*v.im, u.re*v.im+u.im*v.re);
		return z;
	}

	/**
	returns a string representation of the object z
	called as z.toString()
	*/
	public String toString(){
		return this.re+"+"+this.im+"i";
	}
}