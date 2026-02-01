package polymorphism;

class SocialMediaAcc {
	String userName;
	String email;
	String country;
	int noOfPost;
	int like;
	int post;
	int comments;
	int createDate;
	int noOfImperssion;
	
	SocialMediaAcc() {
		this.userName = "Not Given";
		this.email = "Not Given";
		this.country = "Not Given";
		this.noOfPost = 00;
		this.like = 00;
		this.post = 00;
		this.comments = 00;
		this.createDate = 00;
		this.noOfImperssion = 00;
	}
	SocialMediaAcc(String userName, String email, String country, int noOfPost, int like, int post, int comments,
			int createDate, int noOfImperssion) {
		this.userName = userName;
		this.email = email;
		this.country = country;
		this.noOfPost = noOfPost;
		this.like = like;
		this.post = post;
		this.comments = comments;
		this.createDate = createDate;
		this.noOfImperssion = noOfImperssion;
	}
	String getUserName() {
		return userName;
	}
	void setUserName(String userName) {
		this.userName = userName;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}
	int getNoOfPost() {
		return noOfPost;
	}
	void setNoOfPost(int noOfPost) {
		this.noOfPost = noOfPost;
	}
	int getLike() {
		return like;
	}
	void setLike(int like) {
		this.like = like;
	}
	int getPost() {
		return post;
	}
	void setPost(int post) {
		this.post = post;
	}
	int getComments() {
		return comments;
	}
	void setComments(int comments) {
		this.comments = comments;
	}
	int getCreateDate() {
		return createDate;
	}
	void setCreateDate(int createDate) {
		this.createDate = createDate;
	}
	int getNoOfImperssion() {
		return noOfImperssion;
	}
	void setNoOfImperssion(int noOfImperssion) {
		this.noOfImperssion = noOfImperssion;
	}
	void postContent() {
		System.out.println("Content uploaded on social media Platform");
	}
	void display() {
		System.out.println("UserName is "+this.userName);
		System.out.println("Email is "+this.email);
		System.out.println("Country is "+this.country);
		System.out.println("No of Post are "+this.noOfPost);
		System.out.println("Like : "+this.like);
		System.out.println("Post : "+this.post);
		System.out.println("Comments : "+this.comments);
		System.out.println("Creation Date : "+this.createDate);
		System.out.println("No of imperssions :"+this.noOfImperssion);
	}
}
class InstaAcc extends SocialMediaAcc{
	int noOfFollower;
	int noOfFollowing;
	int noOfArchive;
	int noOFStoryArchive;
	int noOfAudio;
	
	InstaAcc() {
		super();
		this.noOfFollower = 00;
		this.noOfFollowing = 00;
		this.noOfArchive = 00;
		this.noOFStoryArchive = 00;
		this.noOfAudio = 00;
	}

	InstaAcc(String userName, String email, String country, int noOfPost, int like, int post, int comments,
			int createDate, int noOfImperssion,int noOfFollower, int noOfFollowing, int noOfArchive, int noOFStoryArchive, int noOfAudio) {
		super( userName,  email,  country,  noOfPost,  like,  post,  comments,
				 createDate,  noOfImperssion);
		this.noOfFollower = noOfFollower;
		this.noOfFollowing = noOfFollowing;
		this.noOfArchive = noOfArchive;
		this.noOFStoryArchive = noOFStoryArchive;
		this.noOfAudio = noOfAudio;
	}


	int getNoOfFollower() {
		return noOfFollower;
	}

	void setNoOfFollower(int noOfFollower) {
		this.noOfFollower = noOfFollower;
	}

	int getNoOfFollowing() {
		return noOfFollowing;
	}

	void setNoOfFollowing(int noOfFollowing) {
		this.noOfFollowing = noOfFollowing;
	}

	int getNoOfArchive() {
		return noOfArchive;
	}

	void setNoOfArchive(int noOfArchive) {
		this.noOfArchive = noOfArchive;
	}

	int getNoOFStoryArchive() {
		return noOFStoryArchive;
	}

	void setNoOFStoryArchive(int noOFStoryArchive) {
		this.noOFStoryArchive = noOFStoryArchive;
	}

	int getNoOfAudio() {
		return noOfAudio;
	}

	void setNoOfAudio(int noOfAudio) {
		this.noOfAudio = noOfAudio;
	}
	void postContent() {
		System.out.println("Content uploaded on InstaAcc Platform");
	}

	void display() {
		super.display();
		System.out.println("noOfFollower is "+this.noOfFollower);
		System.out.println("noOfFollowing is "+this.noOfFollowing);
		System.out.println("noOfArchive is "+this.noOfArchive);
		System.out.println("No of Story Archive are "+this.noOFStoryArchive);
		System.out.println("noOfAudio : "+this.noOfAudio);
	
	}
}
class LinkedIn extends SocialMediaAcc{
	int noOfConnection;
	int noOfProfileview;
	int noOfJobsApplied;
	LinkedIn() {
		super();
		this.noOfConnection = 00;
		this.noOfProfileview = 00;
		this.noOfJobsApplied = 00;
	}
	
	LinkedIn(String userName, String email, String country, int noOfPost, int like, int post, int comments,
			int createDate, int noOfImperssion,int noOfConnection, int noOfProfileview, int noOfJobsApplied) {
		super( userName,  email,  country,  noOfPost,  like,  post,  comments,createDate,  noOfImperssion);
		this.noOfConnection = noOfConnection;
		this.noOfProfileview = noOfProfileview;
		this.noOfJobsApplied = noOfJobsApplied;
	}

	int getNoOfConnection() {
		return noOfConnection;
	}

	void setNoOfConnection(int noOfConnection) {
		this.noOfConnection = noOfConnection;
	}

	int getNoOfProfileview() {
		return noOfProfileview;
	}

	void setNoOfProfileview(int noOfProfileview) {
		this.noOfProfileview = noOfProfileview;
	}

	int getNoOfJobsApplied() {
		return noOfJobsApplied;
	}

	void setNoOfJobsApplied(int noOfJobsApplied) {
		this.noOfJobsApplied = noOfJobsApplied;
	}
	void postContent() {
		System.out.println("Content uploaded on Linked media Platform");
	}

	void display() {
		super.display();
		System.out.println("noOfConnection is "+this.noOfConnection);
		System.out.println("noOfProfileview is "+this.noOfProfileview);
		System.out.println("noOfJobsApplied is "+this.noOfJobsApplied);	
	}
}
class YouTube extends SocialMediaAcc{
	int subscribers;
	double watchTime;
	int isMonetised;
	double revenue;

	YouTube() {
		super();
		this.subscribers = 00;
		this.watchTime = 00;
		this.isMonetised = 00;
		this.revenue = 00;
	}

	
	YouTube(String userName, String email, String country, int noOfPost, int like, int post, int comments,
			int createDate, int noOfImperssion,int subscribers, double watchTime, int isMonetised, double revenue) {
		super( userName,  email,  country,  noOfPost,  like,  post,  comments,createDate,  noOfImperssion);
		this.subscribers = subscribers;
		this.watchTime = watchTime;
		this.isMonetised = isMonetised;
		this.revenue = revenue;
	}

	int getSubscribers() {
		return subscribers;
	}

	void setSubscribers(int subscribers) {
		this.subscribers = subscribers;
	}

	double getWatchTime() {
		return watchTime;
	}

	void setWatchTime(double watchTime) {
		this.watchTime = watchTime;
	}

	int getIsMonetised() {
		return isMonetised;
	}

	void setIsMonetised(int isMonetised) {
		this.isMonetised = isMonetised;
	}

	double getRevenue() {
		return revenue;
	}

	void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	void postContent() {
		System.out.println("Content uploaded on Youtube media Platform");
	}

	void display() {
		super.display();
		System.out.println("Subscribers is "+this.subscribers);
		System.out.println("watchTime is "+this.watchTime);
		System.out.println("isMonetised is "+this.isMonetised);
		System.out.println("revenue : "+this.revenue);
	
	}
}

class TestSMA{
	public static void main(String[] args) {
		SocialMediaAcc a1 =  new SocialMediaAcc();
		a1.display();
		a1.postContent();
		System.out.println("\n\n");
		InstaAcc i1 =  new InstaAcc("Amit","@AJAY","USA",234,234,546,432,4,23,34,54,64,23,1);
		i1.display();
		i1.postContent();
		System.out.println("\n\n");
		LinkedIn l1 =  new LinkedIn("Amit","@AJAY","USA",234,234,546,432,4,23,34,54,64);
		l1.display();
		l1.postContent();
		System.out.println("\n\n");
		YouTube z1 =  new YouTube("Amit","@AJAY","USA",234,234,546,432,4,23,34,54,64,234);
		z1.display();
		z1.postContent();
	}
}















