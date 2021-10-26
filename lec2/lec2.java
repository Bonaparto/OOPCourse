package lec2;

class House{
	int numOfFloors;
	int area;
	long numOfRooms;  // new data field
	long numOfResidents; // new data field
	int address;
	String color;
	static int cnt;
	static String streetName;

	House(int a, String c, int b, int d){
		area = a;
		color = c;
		numOfRooms = b;
		numOfResidents = d;
		cnt++;
		address = cnt;
	}

	void showArea(){
		System.out.println("The area of this house is: " + area);
	}

	void changeColor(String s){
		color = s;
	}

	void showAmountOfResidents() {
		System.out.println(numOfResidents);
	}

	// new instance method
	void showNumOfRooms() {
		System.out.println("Number of rooms in this house is: " + numOfRooms);
	}

	void showAddress() { 
		System.out.println("The address of this house is: " + streetName + " " + address);
	}

	void addResident(long l) { 
		if (l == 0) System.out.println("There is no one to add.");
		else if(l < 0) System.out.println("Cannot add negative number.");
		else numOfResidents += l;
	}

	void removeResident(long l) {
		if (l == 0) System.out.println("There is no one to remove.");
		else if(l > 0) System.out.println("Cannot remove negative number.");
		else numOfResidents += l;
	}

	static void showStreetName(){
		System.out.println(streetName);
	}

	static void showTotalNumberOfHouses() {
		System.out.println("Total amount of houses is: " + cnt);
	}
}

public class lec2{
	public static void main(String[] args) {

		// House.showStreetName();

		House h1 = new House(50, "White", 42104214, 10000000);
		House h2 = new House(120, "Brown", 2412412, 515215);

		System.out.println(h1.color);
		System.out.println(h2.color);

		h1.showArea();
		h2.showArea();

		House.streetName = "Abylai khan";

		House.showStreetName();

		h1.showAddress();
		h2.showAddress();

		House.showTotalNumberOfHouses();

		h1.showNumOfRooms();
		h2.showNumOfRooms();

		h1.showAmountOfResidents();
		h2.showAmountOfResidents();

		h1.addResident(-151);
		h1.addResident(0);
		h1.addResident(2000000);
		h1.showAmountOfResidents();

		h2.addResident(-151);
		h2.addResident(0);
		h2.addResident(2000000);
	}
}