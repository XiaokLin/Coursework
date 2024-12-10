package lib;
import java.io.*;

public class PhoneBookEntry{
	private int ID;
	private String fname;
	private String lname;
	private String email;
	private int zipcode;
	private long number;
	private String status;
	private String username;
    private String password;

	//Default constructor 
	public PhoneBookEntry() {
        ID = -1;
        fname = "";
        lname = "";
        email = "";
        zipcode = -1;
        number = -1;
		status = "user";
		username = "";
        password = "";
    }
	// Constructor that takes in all attributes as arguments
	public PhoneBookEntry(int i, String f, String l, String e, int z, long n, String s, String u, String p) {
		ID = i;
		fname = f;
		lname = l;
		email = e;
		zipcode = z;
		number = n;
		status = s;
		username = u;
        password = p;
	}
	//Constructor that accepts only firstName and phoneNumber
	public PhoneBookEntry(String f, int n) {
		ID = -1;
		fname = f;
		lname = "";
		email = "";
		zipcode = -1;
		number = n;
		status = "user";
		username = "";
        password = "";
	}
	// getters & setters generated by eclipse
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	//new Method that prints outt 
	public void printBookEntry(boolean Admin) {
		// System.out.println("ID: " + ID); 
		System.out.println("First Name: " + this.fname);
		System.out.println("Last Name: " + this.lname);
		System.out.println("Email: " + this.email);
		System.out.println("Zipcode: " + this.zipcode);
		System.out.println("Number: " + this.number);
		System.out.println("Status: " + this.status);
		if (Admin) {
			System.out.println("Username: " + this.username);
			System.out.println("Password: " + this.password);
		}
		
	}
}