package polymorphism;

class Farmer {
	int farmerId;
	String fname;
	double area;
	String city;
	double annualIncome;
	int noOfEquipment;
	double insuranceAmt;

	Farmer() {
		super();
		this.farmerId = 00;
		this.fname = "Not given";
		this.area = 00;
		this.city = "Not given";
		this.annualIncome = 00;
		this.noOfEquipment = 00;
		this.insuranceAmt = 00;
	}

	Farmer(int farmerId, String fname, Double area, String city, double annualIncome, int noOfEquipment,
			double insuranceAmt) {
		super();
		this.farmerId = farmerId;
		this.fname = fname;
		this.area = area;
		this.city = city;
		this.annualIncome = annualIncome;
		this.noOfEquipment = noOfEquipment;
		this.insuranceAmt = insuranceAmt;
	}

	int getFarmerId() {
		return farmerId;
	}

	void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	String getFname() {
		return fname;
	}

	void setFname(String fname) {
		this.fname = fname;
	}

	Double getArea() {
		return area;
	}

	void setArea(Double area) {
		this.area = area;
	}

	String getCity() {
		return city;
	}

	void setCity(String city) {
		this.city = city;
	}

	double getAnnualIncome() {
		return annualIncome;
	}

	void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	int getNoOfEquipment() {
		return noOfEquipment;
	}

	void setNoOfEquipment(int noOfEquipment) {
		this.noOfEquipment = noOfEquipment;
	}

	double getInsuranceAmt() {
		return insuranceAmt;
	}

	void setInsuranceAmt(double insuranceAmt) {
		this.insuranceAmt = insuranceAmt;
	}

	void calSubsidy() {
		System.out.println("Subsidy received from equips");
	}

	void display() {
		System.out.println("Farmerid is " + this.farmerId);
		System.out.println("Farmer name is " + this.fname);
		System.out.println("Farmer area is " + this.area);
		System.out.println("Farmer city is " + this.city);
		System.out.println("Farmer annualIncome is " + this.annualIncome);
		System.out.println("No of equip is " + this.noOfEquipment);
		System.out.println("Insurance Amt is " + this.insuranceAmt);

	}
}

class DairyFarmer extends Farmer {
	int noOfCattles;
	int milkProd;
	int dairyLid;

	DairyFarmer() {
		super();
		this.noOfCattles = 00;
		this.milkProd = 00;
		this.dairyLid = 00;
	}

	DairyFarmer(int farmerId, String fname, Double area, String city, double annualIncome, int noOfEquipment,
			double insuranceAmt, int noOfCattles, int milkProd, int dairyLid) {
		super(farmerId, fname, area, city, annualIncome, noOfEquipment, insuranceAmt);
		this.noOfCattles = noOfCattles;
		this.milkProd = milkProd;
		this.dairyLid = dairyLid;
	}

	int getNoOfCattles() {
		return noOfCattles;
	}

	void setNoOfCattles(int noOfCattles) {
		this.noOfCattles = noOfCattles;
	}

	int getMilkProd() {
		return milkProd;
	}

	void setMilkProd(int milkProd) {
		this.milkProd = milkProd;
	}

	int getDairyLid() {
		return dairyLid;
	}

	void setDairyLid(int dairyLid) {
		this.dairyLid = dairyLid;
	}

	void calSubsidy() {
		System.out.println("Subsidy received from cattles");
	}

	void display() {
		System.out.println("No of cattles is" + this.noOfCattles);
		System.out.println("Milk Prod is" + this.milkProd);
		System.out.println("Dairy id is" + this.dairyLid);
	}
}

class OrganicFarm extends Farmer {
	int orgId;
	String cropType;
	String fertilizer;

	OrganicFarm() {
		super();
		this.orgId = 00;
		this.cropType = "Not given";
		this.fertilizer = "Not given";
	}

	OrganicFarm(int farmerId, String fname, Double area, String city, double annualIncome, int noOfEquipment,
			double insuranceAmt, int orgId, String cropType, String fertilizer) {
		super(farmerId, fname, area, city, annualIncome, noOfEquipment, insuranceAmt);
		this.orgId = orgId;
		this.cropType = cropType;
		this.fertilizer = fertilizer;
	}

	int getOrgId() {
		return orgId;
	}

	void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	String getCropType() {
		return cropType;
	}

	void setCropType(String cropType) {
		this.cropType = cropType;
	}

	String getFertilizer() {
		return fertilizer;
	}

	void setFertilizer(String fertilizer) {
		this.fertilizer = fertilizer;
	}

	void calSubsidy() {
		System.out.println("Subsidy received from crops");
	}

	void display() {
		System.out.println("Oraganic id is " + this.orgId);
		System.out.println("CropType is " + this.cropType);
		System.out.println("Fertilizer used is " + this.fertilizer);
	}

}

class TestFarm {
	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		f1.calSubsidy();
		f1.display();
		System.out.println("\n\n");
		DairyFarmer c1 = new DairyFarmer();
		c1.display();
		c1.calSubsidy();
		System.out.println("\n\n");
		OrganicFarm d1 = new OrganicFarm();
		d1.calSubsidy();
		d1.display();
	}
}
