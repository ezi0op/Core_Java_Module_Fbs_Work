import java.util.ArrayList;
import java.util.Scanner;

class DOB {
	int date;
	int month;
	int year;

	DOB(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
}

class Player {
	int jerseyNo;
	String name;
	int runs;
	int wickets;
	int matchesPlayed;
	DOB dob;

	Player(int jerseyNo, String name, int runs, int wickets, int matchesPlayed, DOB dob) {
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.matchesPlayed = matchesPlayed;
		this.dob = dob;
	}
}

public class PlayerManagementSystem {

	static ArrayList<Player> players = new ArrayList<Player>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		storePlayers();

		while (true) {
			System.out.println("\n========= Player Management Menu =========");
			System.out.println("1. Add Player");
			System.out.println("2. Delete Player");
			System.out.println("3. Update Player");
			System.out.println("4. Display All Players");
			System.out.println("5. Sort Players");
			System.out.println("6. Search Player");
			System.out.println("7. Verify Birthday");
			System.out.println("8. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addPlayer();
				break;
			case 2:
				deletePlayer();
				break;
			case 3:
				updatePlayer();
				break;
			case 4:
				displayAllPlayers();
				break;
			case 5:
				sortPlayers();
				break;
			case 6:
				searchPlayer();
				break;
			case 7:
				verifyBirthday();
				break;
			case 8:
				System.out.println("Exiting... Goodbye!");
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	// ================= ADD PLAYER =================
	static void addPlayer() {
		System.out.print("How many players to add: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Jersey No: ");
			int j = sc.nextInt();

			System.out.print("Name: ");
			String name = sc.next();

			System.out.print("Runs: ");
			int runs = sc.nextInt();

			System.out.print("Wickets: ");
			int wickets = sc.nextInt();

			System.out.print("Matches Played: ");
			int matches = sc.nextInt();

			System.out.print("DOB (date month year): ");
			int d = sc.nextInt();
			int m = sc.nextInt();
			int y = sc.nextInt();

			players.add(new Player(j, name, runs, wickets, matches, new DOB(d, m, y)));
			System.out.println("Player Added Successfully!");
		}
	}

	// ================= DELETE PLAYER =================
	static void deletePlayer() {
		System.out.print("Enter Jersey No to delete: ");
		int no = sc.nextInt();

		boolean found = false;

		for (int i = 0; i < players.size(); i++) {
			if (players.get(i).jerseyNo == no) {
				players.remove(i);
				found = true;
				System.out.println("Player Deleted Successfully!");
				break;
			}
		}

		if (!found) {
			System.out.println("Invalid Jersey No!");
		}
	}

	// ================= UPDATE PLAYER =================
	static void updatePlayer() {
		System.out.println("\n1. Update Runs");
		System.out.println("2. Update Wickets");
		System.out.println("3. Update Matches");
		System.out.print("Choice: ");

		int ch = sc.nextInt();
		System.out.print("Enter Jersey No: ");
		int no = sc.nextInt();

		boolean found = false;

		for (int i = 0; i < players.size(); i++) {
			Player p = players.get(i);

			if (p.jerseyNo == no) {
				found = true;

				if (ch == 1) {
					System.out.print("Enter Runs: ");
					p.runs = sc.nextInt();
				} else if (ch == 2) {
					System.out.print("Enter Wickets: ");
					p.wickets = sc.nextInt();
				} else if (ch == 3) {
					System.out.print("Enter Matches: ");
					p.matchesPlayed = sc.nextInt();
				}

				System.out.println("Player Updated Successfully!");
				break;
			}
		}

		if (!found) {
			System.out.println("Player Not Found!");
		}
	}

	// ================= DISPLAY ALL =================
	static void displayAllPlayers() {
		for (int i = 0; i < players.size(); i++) {
			Player p = players.get(i);
			System.out.println("\nPlayer " + (i + 1));
			System.out.println("Jersey No: " + p.jerseyNo);
			System.out.println("Name: " + p.name);
			System.out.println("Runs: " + p.runs);
			System.out.println("Wickets: " + p.wickets);
			System.out.println("Matches: " + p.matchesPlayed);
			System.out.println("DOB: " + p.dob.date + "/" + p.dob.month + "/" + p.dob.year);
		}
	}

	// ================= SORT =================
	static void sortPlayers() {
		System.out.println("1. Sort by Runs (Min)");
		System.out.println("2. Sort by Runs (Max)");
		System.out.print("Choice: ");
		int ch = sc.nextInt();

		for (int i = 0; i < players.size() - 1; i++) {
			for (int j = 0; j < players.size() - 1 - i; j++) {
				boolean condition;

				if (ch == 1) {
					condition = players.get(j).runs > players.get(j + 1).runs;
				} else {
					condition = players.get(j).runs < players.get(j + 1).runs;
				}

				if (condition) {
					Player temp = players.get(j);
					players.set(j, players.get(j + 1));
					players.set(j + 1, temp);
				}
			}
		}

		displayAllPlayers();
	}

	// ================= SEARCH =================
	static void searchPlayer() {
		System.out.println("1. Search by Jersey No");
		System.out.println("2. Search by Name");
		System.out.print("Choice: ");
		int ch = sc.nextInt();

		boolean found = false;

		if (ch == 1) {
			System.out.print("Enter Jersey No: ");
			int no = sc.nextInt();

			for (Player p : players) {
				if (p.jerseyNo == no) {
					printPlayer(p);
					found = true;
					break;
				}
			}
		} else {
			System.out.print("Enter Name: ");
			String name = sc.next();

			for (Player p : players) {
				if (p.name.equalsIgnoreCase(name)) {
					printPlayer(p);
					found = true;
					break;
				}
			}
		}

		if (!found) {
			System.out.println("Player Not Found!");
		}
	}

	static void printPlayer(Player p) {
		System.out.println("Jersey No: " + p.jerseyNo);
		System.out.println("Name: " + p.name);
		System.out.println("Runs: " + p.runs);
		System.out.println("Wickets: " + p.wickets);
		System.out.println("Matches: " + p.matchesPlayed);
	}

	// ================= VERIFY BIRTHDAY =================
	static void verifyBirthday() {
		System.out.print("Enter Date: ");
		int d = sc.nextInt();
		System.out.print("Enter Month: ");
		int m = sc.nextInt();

		boolean found = false;

		for (Player p : players) {
			if (p.dob.date == d && p.dob.month == m) {
				System.out.println("🎉 Happy Birthday " + p.name + " 🎉");
				found = true;
			}
		}

		if (!found) {
			System.out.println("No Birthdays Today!");
		}
	}

	// ================= STORE DEFAULT DATA =================
	static void storePlayers() {
		players.add(new Player(7, "Dhoni", 10500, 1, 350, new DOB(7, 8, 1988)));
		players.add(new Player(18, "Kohli", 12000, 4, 280, new DOB(12, 2, 1998)));
		players.add(new Player(45, "Rohit", 9500, 8, 250, new DOB(27, 7, 1998)));
		players.add(new Player(12, "Yuvraj", 8700, 111, 300, new DOB(17, 2, 1978)));
		players.add(new Player(99, "Bumrah", 300, 150, 90, new DOB(22, 2, 1998)));
		players.add(new Player(33, "Hardik", 3500, 80, 120, new DOB(11, 10, 1993)));
		players.add(new Player(77, "Jadeja", 2500, 180, 190, new DOB(6, 12, 1988)));
	}
}
