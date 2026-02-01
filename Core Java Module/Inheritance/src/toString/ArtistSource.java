package toString;

class Artist{
	String name;
	String genre;
	int experience;
	String country;
	int awards;
	int age;

	Artist() {
		this.name = "Not given";
		this.genre = "Not given";
		this.experience = 0;
		this.country = "Not given";
		this.awards = 0;
		this.age = 0;
	}

	Artist(String name, String genre, int experience, String country, int awards, int age) {
		this.name = name;
		this.genre = genre;
		this.experience = experience;
		this.country = country;
		this.awards = awards;
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getGenre() {
		return genre;
	}

	void setGenre(String genre) {
		this.genre = genre;
	}

	int getExperience() {
		return experience;
	}

	void setExperience(int experience) {
		this.experience = experience;
	}

	String getCountry() {
		return country;
	}

	void setCountry(String country) {
		this.country = country;
	}

	int getAwards() {
		return awards;
	}

	void setAwards(int awards) {
		this.awards = awards;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	void perform() {
		 System.out.println(this.name +"is performing artistically.");
	}
	
	
	
	@Override
	public String toString() {
		return "Name is " + this.name+"\nGenre is " + this.genre+"\nExperience is " + this.experience +"\nAwards are " + this.awards+"\nAge is " + this.age;
	}

//	void display() {
//		System.out.println("Name is " + this.name);
//		System.out.println("Genre is " + this.genre);
//		System.out.println("Experience is " + this.experience );
//		System.out.println("Country is " + this.country);
//		System.out.println("Awards are " + this.awards);
//		System.out.println("Age is " + this.age);
//	}

}
class Singer extends Artist{
	 int songRecorded;
	    String voiceType;
	    String famousSong;
	    int albumCount;
		Singer() {
			super();
			this.songRecorded = 0;
			this.voiceType = "Not Given";
			this.famousSong = "Not Given";
			this.albumCount = 0;
		}
		Singer(String name, String genre, int experience, String country, int awards, int age,int songRecorded, String voiceType, String famousSong, int albumCount) {
			super(name, genre, experience, country, awards, age);
			this.songRecorded = songRecorded;
			this.voiceType = voiceType;
			this.famousSong = famousSong;
			this.albumCount = albumCount;
		}
		int getSongRecorded() {
			return songRecorded;
		}
		void setSongRecorded(int songRecorded) {
			this.songRecorded = songRecorded;
		}
		String getVoiceType() {
			return voiceType;
		}
		void setVoiceType(String voiceType) {
			this.voiceType = voiceType;
		}
		String getFamousSong() {
			return famousSong;
		}
		void setFamousSong(String famousSong) {
			this.famousSong = famousSong;
		}
		int getAlbumCount() {
			return albumCount;
		}
		void setAlbumCount(int albumCount) {
			this.albumCount = albumCount;
		}
		void perform(){
			 System.out.println(this.name +"is singing the famous song beautifully");
		}
		
		@Override
		public String toString() {
			return super.toString()+"Songs Recorded is  " + this.songRecorded+"\nVoice Type is " + this.voiceType+"\nFamous Song is " + this.famousSong+"\nAlbum Count is " + this.albumCount;
		}
//		void display() {
//			 super.display();
//		        System.out.println("Songs Recorded is  " + this.songRecorded);
//		        System.out.println("Voice Type is " + this.voiceType);
//		        System.out.println("Famous Song is " + this.famousSong);
//		        System.out.println("Album Count is " + this.albumCount);
//		}
	    
}
class Musician extends Artist{
	 String instrument;
	    int albumsComposed;
	    String bandName;
	    double studioHours;
	    Musician() {
	    	super();
			this.instrument = "Not Given";
			this.albumsComposed = 0;
			this.bandName = "Not Given";
			this.studioHours = 0;
		}
		Musician(String name, String genre, int experience, String country, int awards, int age,String instrument, int albumsComposed, String bandName, double studioHours) {
			super(name, genre, experience, country, awards, age);
			this.instrument = instrument;
			this.albumsComposed = albumsComposed;
			this.bandName = bandName;
			this.studioHours = studioHours;
		}
		String getInstrument() {
			return instrument;
		}
		void setInstrument(String instrument) {
			this.instrument = instrument;
		}
		int getAlbumsComposed() {
			return albumsComposed;
		}
		void setAlbumsComposed(int albumsComposed) {
			this.albumsComposed = albumsComposed;
		}
		String getBandName() {
			return bandName;
		}
		void setBandName(String bandName) {
			this.bandName = bandName;
		}
		double getStudioHours() {
			return studioHours;
		}
		void setStudioHours(double studioHours) {
			this.studioHours = studioHours;
		}
		void perform(){
			 System.out.println(this.name +"is Playing Band Generously");
		}
		
		@Override
		public String toString() {
			return super.toString()+"Instrument is " + this.instrument+"\nAlbums Composed is " + this.albumsComposed+"\nBand Name is " + this.bandName+"\nStudio Hours is " + this.studioHours;
		}
//		void display() {
//			super.display();
//	        System.out.println("Instrument is " + this.instrument);
//	        System.out.println("Albums Composed is " + this.albumsComposed);
//	        System.out.println("Band Name is " + this.bandName);
//	        System.out.println("Studio Hours is " + this.studioHours);
//		}
	    
}
class TestArtist{
	public static void main(String[] args) {
		Artist a1;
		a1 =  new Artist("Amit","Bolly",43,"Eng",34,332);
		System.out.println(a1);
		a1.perform();
		a1 =  new Singer("Amit","Bolly",43,"Eng",34,332,321,"Smooth","FOR A RESON",34);
		System.out.println(a1);
		a1.perform();
		a1 =  new Musician("Amit","Bolly",43,"Eng",34,332,"Guiatr",324,"KING",324);
		System.out.println(a1);
		a1.perform();
	}
}
