package Inheritance;

class Artifact {
	String artifactId;
	String name;
	String originCountry;
	int year;

	Artifact() {
		this.artifactId = "Not Given";
		this.name = "Not Given";
		this.originCountry = "Not Given";
		this.year = 00;
	}

	Artifact(String artifactId, String name, String originCountry, int year) {
		this.artifactId = artifactId;
		this.name = name;
		this.originCountry = originCountry;
		this.year = year;
	}

	String getArtifactId() {
		return artifactId;
	}

	void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getOriginCountry() {
		return originCountry;
	}

	void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	void display() {
		System.out.println("Artifact ID: " + this.artifactId);
		System.out.println("Name: " + this.name);
		System.out.println("Origin Country: " + this.originCountry);
		System.out.println("Year: " + this.year);
	}
}

class Painting extends Artifact {
	String painter;
	String style;
	String medium;

	Painting() {
		super();
		this.painter = "Not Given";
		this.style = "Not Given";
		this.medium = "Not Given";
	};

	Painting(String artifactId, String name, String originCountry, int year, String painter, String style,
			String medium) {
		super(artifactId, name, originCountry, year);
		this.painter = painter;
		this.style = style;
		this.medium = medium;
	}

	String getPainter() {
		return painter;
	}

	void setPainter(String painter) {
		this.painter = painter;
	}

	String getStyle() {
		return style;
	}

	void setStyle(String style) {
		this.style = style;
	}

	String getMedium() {
		return medium;
	}

	void setMedium(String medium) {
		this.medium = medium;
	}

	void display() {
		super.display();
		System.out.println("Painter :" + this.painter);
		System.out.println("Style : " + this.style);
		System.out.println("Medium : " + this.medium);
	}

}

class Sculpture extends Artifact {
	String material;
	double weight;
	double height;

	Sculpture() {
		super();
		this.material = "Not given";
		this.weight = 00;
		this.height = 00;
	}

	Sculpture(String artifactId, String name, String originCountry, int year, String material, double weight,
			double height) {
		super(artifactId, name, originCountry, year);
		this.material = material;
		this.weight = weight;
		this.height = height;
	}

	String getMaterial() {
		return material;
	}

	void setMaterial(String material) {
		this.material = material;
	}

	double getWeight() {
		return weight;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	void display() {
		super.display();
		System.out.println("Material : " + this.material);
		System.out.println("Weight : " + this.weight);
		System.out.println("Height : " + this.height);
	}

}

class Coin extends Artifact {
	String metalType;
	String denomination;
	String era;

	Coin() {
		super();
		this.metalType = "Not given";
		this.denomination = "Not given";
		this.era = "Not given";
	}

	Coin(String artifactId, String name, String originCountry, int year, String metalType, String denomination,
			String era) {
		super(artifactId, name, originCountry, year);
		this.metalType = metalType;
		this.denomination = denomination;
		this.era = era;
	}

	String getMetalType() {
		return metalType;
	}

	void setMetalType(String metalType) {
		this.metalType = metalType;
	}

	String getDenomination() {
		return denomination;
	}

	void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	String getEra() {
		return era;
	}

	void setEra(String era) {
		this.era = era;
	}

	void display() {
		super.display();
		System.out.println("Metal Type : " + this.metalType);
		System.out.println("Denomination : " + this.denomination);
		System.out.println("Era :" + this.era);
	}
}

class TestArt {
	public static void main(String[] args) {
		Painting p1 = new Painting("101", "S", "Inf",1780,"Hassa","Fas","Oil");
		p1.display();
		System.out.println("\n\n");
		Sculpture s1 = new Sculpture("34","FS","dfsa",30,"af",4500,180);
		s1.display();
		System.out.println("\n\n");
		Coin c1 = new Coin("301","Iafds","Chids",600,"Brof","5Wen","TangfdDaynasty");
		c1.display();
	}

}
