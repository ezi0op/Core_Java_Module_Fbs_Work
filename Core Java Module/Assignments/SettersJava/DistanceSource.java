class Distance{
	double km;
	double m;
	void setKm(int a){
	km=a;
	}
	void setM(int b){
	m=b;
	}
}//Distance class ends here
class testDistance{
	public static void main(String[] a){
	Distance d1;
	d1 = new Distance();	
	d1.setKm(12);
	d1.setM(34);
	System.out.println("Distance details : KM->"+d1.km+"M->"+d1.m);
	}//main ends here	

}//testDistance ends here