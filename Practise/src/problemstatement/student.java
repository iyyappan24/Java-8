package problemstatement;

public class student {
	
	private String firstName;
	private String lastName;
	private int score;
	public student(String fName , String lName , int score){
		firstName = fName;
		lastName = lName ;
		this.score = score;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "student [firstName=" + firstName + ", lastName=" + lastName + ", score=" + score + "]";
	}

	
	
}
