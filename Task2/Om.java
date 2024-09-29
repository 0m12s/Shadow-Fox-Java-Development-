package Task2;

public class Om {
	private int id;
	private String name;
	private String email;
	private String phoneno;

	// constructor
	public Om(int id, String name, String email, String phoneno) {
	        this.id = id;
	        this.name = name;
	        this.email = email;
	        this.phoneno = phoneno;
	     }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "\nName: " + this.name + "\nEmail: " + this.email + "\nPhoneNo: " + this.phoneno;
	}

}
