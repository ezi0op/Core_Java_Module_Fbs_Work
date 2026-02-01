package Inheritance;

class Defence {
	String headOfName;
	int noOfTroops;
	double budget;
	int noOfDepartment;
	int noOfVehicle;
	String locationOfHeadQuarter;
	String countryName;
	int manPowerCount;
	int noOfCasulties;
	int noOfMissionPerformed;
	int noOfBases;
	
	Defence() {
		super();
		this.headOfName = "Not Given";
		this.noOfTroops = 00;
		this.budget = 00;
		this.noOfDepartment = 00;
		this.noOfVehicle = 00;
		this.locationOfHeadQuarter = "Not given";
		this.countryName = "Not given";
		this.manPowerCount = 00;
		this.noOfCasulties = 00;
		this.noOfMissionPerformed = 00;
		this.noOfBases = 00;
	}//Default Const
	 Defence(String headOfName, int noOfTroops, double budget, int noOfDepartment, int noOfVehicle,
			String locationOfHeadQuarter, String countryName, int manPowerCount, int noOfCasulties,
			int noOfMissionPerformed, int noOfBases) {
		super();
		this.headOfName = headOfName;
		this.noOfTroops = noOfTroops;
		this.budget = budget;
		this.noOfDepartment = noOfDepartment;
		this.noOfVehicle = noOfVehicle;
		this.locationOfHeadQuarter = locationOfHeadQuarter;
		this.countryName = countryName;
		this.manPowerCount = manPowerCount;
		this.noOfCasulties = noOfCasulties;
		this.noOfMissionPerformed = noOfMissionPerformed;
		this.noOfBases = noOfBases;
	}
	 String getHeadOfName() {
		return headOfName;
	}
	 void setHeadOfName(String headOfName) {
		this.headOfName = headOfName;
	}
	 int getNoOfTroops() {
		return noOfTroops;
	}
	 void setNoOfTroops(int noOfTroops) {
		this.noOfTroops = noOfTroops;
	}
	 double getBudget() {
		return budget;
	}
	 void setBudget(double budget) {
		this.budget = budget;
	}
	 int getNoOfDepartment() {
		return noOfDepartment;
	}
	 void setNoOfDepartment(int noOfDepartment) {
		this.noOfDepartment = noOfDepartment;
	}
	 int getNoOfVehicle() {
		return noOfVehicle;
	}
	 void setNoOfVehicle(int noOfVehicle) {
		this.noOfVehicle = noOfVehicle;
	}
	 String getLocationOfHeadQuarter() {
		return locationOfHeadQuarter;
	}
	 void setLocationOfHeadQuarter(String locationOfHeadQuarter) {
		this.locationOfHeadQuarter = locationOfHeadQuarter;
	}
	 String getCountryName() {
		return countryName;
	}
	 void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	 int getManPowerCount() {
		return manPowerCount;
	}
	 void setManPowerCount(int manPowerCount) {
		this.manPowerCount = manPowerCount;
	}
	 int getNoOfCasulties() {
		return noOfCasulties;
	}
	 void setNoOfCasulties(int noOfCasulties) {
		this.noOfCasulties = noOfCasulties;
	}
	 int getNoOfMissionPerformed() {
		return noOfMissionPerformed;
	}
	 void setMissionPerformed(int noOfMissionPerformed) {
		this.noOfMissionPerformed =noOfMissionPerformed ;
	}
	 int getNoOfBases() {
		return noOfBases;
	}
	 void setNoOfBases(int noOfBases) {
		this.noOfBases = noOfBases;
	}
	
	void display() {
		System.out.println("Head Of Name is :"+this.headOfName);
		System.out.println("No of troops :"+this.noOfTroops);
		System.out.println("Budget is :"+this.budget);
		System.out.println("No of departemt :"+this.noOfDepartment);
		System.out.println("No of vehicle is :"+this.noOfVehicle);
		System.out.println("location of headQuarter :"+this.locationOfHeadQuarter);
		System.out.println("Country Name is :"+this.countryName);
		System.out.println("Man power count is :"+this.manPowerCount);
		System.out.println("No of casulties is :"+this.noOfCasulties);
		System.out.println("No of Mission Performed :"+this.noOfMissionPerformed);
		System.out.println("No fo bases  is :"+this.noOfBases);		
	}
}//Defence ends here

class Army extends Defence{
	int noOfTank;
	int noOfGuns;
	int noOfGranades;
	int noOfBatalien;
	 Army() {
		super();
		this.noOfTank = 00;
		this.noOfGuns = 00;
		this.noOfGranades = 00;
		this.noOfBatalien = 00;
	}//Default const
	 Army(String headOfName, int noOfTroops, double budget, int noOfDepartment, int noOfVehicle,
				String locationOfHeadQuarter, String countryName, int manPowerCount, int noOfCasulties,
				int noOfMissionPerformed, int noOfBases,int noOfTank, int noOfGuns, int noOfGranades, int noOfBatalien) {
		super( headOfName,  noOfTroops,  budget,  noOfDepartment,  noOfVehicle, locationOfHeadQuarter,  countryName,  manPowerCount,  noOfCasulties, noOfMissionPerformed,  noOfBases);
		this.noOfTank = noOfTank;
		this.noOfGuns = noOfGuns;
		this.noOfGranades = noOfGranades;
		this.noOfBatalien = noOfBatalien;
	}//Parameterized const
	 int getNoOfTank() {
		return noOfTank;
	}
	 void setNoOfTank(int noOfTank) {
		this.noOfTank = noOfTank;
	}
	 int getNoOfGuns() {
		return noOfGuns;
	}
	 void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}
	 int getNoOfGranades() {
		return noOfGranades;
	}
	 void setNoOfGranades(int noOfGranades) {
		this.noOfGranades = noOfGranades;
	}
	 int getNoOfBatalien() {
		return noOfBatalien;
	}
	 void setNoOfBatalien(int noOfBatalien) {
		this.noOfBatalien = noOfBatalien;
	}
	void display() {
		super.display();
		System.out.println("No OF Tank is "+this.noOfTank);
		System.out.println("No OF Guns is "+this.noOfGuns);
		System.out.println("No OF Granades is "+this.noOfGranades);
		System.out.println("No OF Batalien is "+this.noOfBatalien);
	}
	
}//Army ends here
class Navy extends Defence{
	int noOfShips;
	int noOfSubmariens;
	int noOfTorpedos;
	 Navy() {
		super();
		this.noOfShips = 00;
		this.noOfSubmariens = 00;
		this.noOfTorpedos = 00;
	}//Default Const
	 Navy(String headOfName, int noOfTroops, double budget, int noOfDepartment, int noOfVehicle,
				String locationOfHeadQuarter, String countryName, int manPowerCount, int noOfCasulties,
				int noOfMissionPerformed, int noOfBases,int noOfTank, int noOfGuns, int noOfGranades, int noOfBatalien,int noOfShips, int noOfSubmariens, int noOfTorpedos) {
		super( headOfName,  noOfTroops,  budget,  noOfDepartment,  noOfVehicle, locationOfHeadQuarter,  countryName,  manPowerCount,  noOfCasulties, noOfMissionPerformed,  noOfBases);
		this.noOfShips = noOfShips;
		this.noOfSubmariens = noOfSubmariens;
		this.noOfTorpedos = noOfTorpedos;
	}//Parameterized const
	 int getNoOfShips() {
		return noOfShips;
	}
	 void setNoOfShips(int noOfShips) {
		this.noOfShips = noOfShips;
	}
	 int getNoOfSubmariens() {
		return noOfSubmariens;
	}
	 void setNoOfSubmariens(int noOfSubmariens) {
		this.noOfSubmariens = noOfSubmariens;
	}
	 int getNoOfTorpedos() {
		return noOfTorpedos;
	}
	 void setNoOfTorpedos(int noOfTorpedos) {
		this.noOfTorpedos = noOfTorpedos;
	}
	void display() {
		super.display();
		System.out.println("No of Ships :"+this.noOfShips);
		System.out.println("No of Submerines :"+this.noOfSubmariens);
		System.out.println("No of Torpedos :"+this.noOfTorpedos);
	}
	
}// Navy ends here
class Air extends Defence{
	int noOfMissiles;
	int noOfAircrafts;
	int noOfSquadron;
	public Air() {
		super();
		this.noOfMissiles = 00;
		this.noOfAircrafts = 00;
		this.noOfSquadron = 00;
	}//Default Const
	 Air(String headOfName, int noOfTroops, double budget, int noOfDepartment, int noOfVehicle,
				String locationOfHeadQuarter, String countryName, int manPowerCount, int noOfCasulties,
				int noOfMissionPerformed, int noOfBases,int noOfMissiles, int noOfAircrafts, int noOfSquadron) {
		super( headOfName,  noOfTroops,  budget,  noOfDepartment,  noOfVehicle, locationOfHeadQuarter,  countryName,  manPowerCount,  noOfCasulties, noOfMissionPerformed,  noOfBases);
		this.noOfMissiles = noOfMissiles;
		this.noOfAircrafts = noOfAircrafts;
		this.noOfSquadron = noOfSquadron;
	}//Parameterized const
	 int getNoOfMissiles() {
		return noOfMissiles;
	}
	 void setNoOfMissiles(int noOfMissiles) {
		this.noOfMissiles = noOfMissiles;
	}
	 int getNoOfAircrafts() {
		return noOfAircrafts;
	}
	 void setNoOfAircrafts(int noOfAircrafts) {
		this.noOfAircrafts = noOfAircrafts;
	}
	 int getNoOfSquadron() {
		return noOfSquadron;
	}
	 void setNoOfSquadron(int noOfSquadron) {
		this.noOfSquadron = noOfSquadron;
	}
	void display() {
		super.display();
		System.out.println("No of Missiles :"+this.noOfMissiles);
		System.out.println("No of Aircrafts :"+this.noOfAircrafts);
		System.out.println("No of Squafron :"+this.noOfSquadron);
	}
	
}//Air ends here

class TestDef{
	
	public static void main(String[] args) {
		Defence d1= new Defence();
		d1.display();
		System.out.println("\n\n");
		Army a1 = new Army("Amit",3,234,324,234,"Ladak","Ind",324,234,234,234,3,4,3,4);
		a1.display();
		System.out.println("\n\n");
		Navy e1 = new Navy("Amit",3,234,324,234,"Ladak","Ind",324,234,234,234,3,4,34,4, 0, 0, 0);
		e1.display();
		System.out.println("\n\n");
		Air c1 = new Air("Amit",3,234,324,234,"Ladak","Ind",324,234,234,234,3,3,4);
		c1.display();
		
		
	}
}

























