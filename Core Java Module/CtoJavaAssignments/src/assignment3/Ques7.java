package assignment3;

public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum,i;
		i = 1;
		n = 28;
		sum = 0;
		
		while(i<n){
			if(n%i==0){
				sum +=i;
			}	
			i++;
		}
		if(sum==n){
			System.out.println(n+" is Perfect number");
		}else{
			System.out.println(n+" is not Perfect number");	
		}
	}

}
