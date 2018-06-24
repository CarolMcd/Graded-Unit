package model;

import java.util.ArrayList;
/**
 * This is the Member class it is a abstract class so a member can never be mad but 
 * this class is the superclass for player and juniorMember
 * @author Carol
 *
 */
public abstract class Member {
	
	protected static int nextSRUID =1000;
	
	protected int sruId;
	protected String firstName;
	protected String lastName;
	protected String address;
	protected String postcode;
	protected String dateOfBirth;
	protected String telephone;
	protected String mobNum;
	protected String email;
	protected String doctor;
	protected String docAddress;
	protected String docPostcode;
	protected String docTele;
	protected String healthIssues;
	protected String position;
	
	
	
	/**
	 * details
	 * This method is overrided in the subclasses
	 * @return ""
	 */

	public String details()
	{
		return "";
	}
	/**
	 * fullDetails
	 * This method is overrided in the subclasses
	 * @return ""
	 */
	public String fullDetails()
	{
		return "";
	}
	/**
	 * getFirstName
	 * This method returns the firstname
	 * @return firstName
	 */
	public String getFirstname()
	{
		return firstName;
	}
	/**
	 * getLastName
	 * This methnod returns the lastName
	 * @return lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * getID
	 * this method returns the sruID
	 * @return sruID
	 */
	public int getID()
	{
		return sruId;
	}
}
