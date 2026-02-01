package assignment2;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	
	 	double price = 400;
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("If you are student type Y or N");
		char isstudent=sc.next().charAt(0);
		
		
		disc(price,isstudent);
		
		sc.close();
	
	}
	static void disc(double price,char isstudent) {
	
		double discount = 0 ;
		double Tprice;
		if(isstudent == 'Y')
		{
			if(price>500)
			{			
				discount = price*0.20;
				Tprice = price-discount;
			}
			else
			{
				Tprice = price - price * 0.10;
			}
		}
		else
		{
			if(price>600)
			{
				discount = price*0.20;
				Tprice = price-discount;
			}
			else
			{
				Tprice = price;
			}
		
		}
		if(discount == 0){
			System.out.println("Final Price of the Customer  will be "+Tprice);
		}else{
			System.out.println("Final Price of the Customer with "+Tprice+" discount will be "+discount);
		}
		
	}

}
