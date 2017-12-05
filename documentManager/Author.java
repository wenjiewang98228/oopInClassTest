package documentManagement;

public class Author {

	private String firstName = "";
	private String lastName = "";
	private String emailAddress = "";
	private String institution = "";
	
	public Author(String the_firstName,String the_lastName,String the_emailAddress,String the_institution){
		setfirstName(the_firstName);
		setlastName(the_lastName);
		setemailAddress(the_emailAddress);
		setinstitution(the_institution);
	}

	public void setinstitution(String the_institution) {
		// TODO Auto-generated method stub
		institution = the_institution;
	}

	public void setemailAddress(String the_emailAddress) {
		// TODO Auto-generated method stub
		emailAddress = the_emailAddress;
	}

	public void setlastName(String the_lastName) {
		// TODO Auto-generated method stub
		lastName = the_lastName;
	}

	public void setfirstName(String the_firstName) {
		// TODO Auto-generated method stub
		firstName = the_firstName;
	}
	
	public String getinstitution() {
		// TODO Auto-generated method stub
		return institution;
	}

	public String getemailAddress() {
		// TODO Auto-generated method stub
		return emailAddress;
	}

	public String getlastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	public String getfirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}
}
