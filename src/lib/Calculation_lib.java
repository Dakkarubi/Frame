package lib;

public class Calculation_lib {

	private double x,y;
	
	public Calculation_lib(int m,int n){
		this.x =m;
		this.y =n;
	}
	
	public double getPlus() {
		return this.x + this.y;
	}
	
	public double getMinus() {
		return this.x - this.y;
	}
	
	public double getTimes() {
		return this.x*this.y;		
	}
	
	public double getDivide() {
		return this.x/this.y;
	}
	
	
}
