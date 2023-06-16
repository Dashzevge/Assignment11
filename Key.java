package assignment11;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (o == this)
	        return true;
	    if (!(o instanceof Key))
	        return false;
	    Key other = (Key)o;
		return Objects.equals(other.firstName, firstName) && Objects.equals(other.lastName, lastName);
		
	}
	
	@Override
	public final int hashCode() {
		
		return Objects.hashCode(firstName) + Objects.hashCode(lastName);
		
	}
}
