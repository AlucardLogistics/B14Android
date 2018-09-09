package test;

public class Student {
	
	int id;
	String firstName, lastName;
	
	
	public Student(int id,String fn, String ln) {
		this.id = id;
		this.firstName = fn;
		this.lastName = ln;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
