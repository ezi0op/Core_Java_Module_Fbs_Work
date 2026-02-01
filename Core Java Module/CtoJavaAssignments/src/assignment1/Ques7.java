package assignment1;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bs = 5000;
		
		totalsal(bs);
	}
	static void totalsal(double bs) {
		double da,ta,hra,TS;
		if(bs < 5000)
		{	
			da = bs *0.10;
			ta = bs *0.15;
			hra = bs*0.20;
			TS = da+ta+hra;
			System.out.println("Total Salaray will be "+ TS);
		}
		else
		{
			da = bs *0.15;
			ta = bs *0.25;
			hra = bs*0.30;
			TS = da+ta+hra;
			System.out.println("Total Salaray will be "+ TS);
		}
	}

}
