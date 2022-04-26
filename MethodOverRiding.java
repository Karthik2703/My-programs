package karthik;

class animals{
	public void displayInfo() {
		System.out.println("Lion is king");
	}
	}
class Tiger extends animals{
	@Override
	public void displayInfo() {
		System.out.println("U am king");
	}
}
