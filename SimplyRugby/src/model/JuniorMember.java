package model;
/**
 * This is the Junior player class which extends member class
 * @author Carol Mcdaid
 *
 */
public class JuniorMember extends Member{
	protected String guardian1;
	protected String guard1Relation;
	protected String guard1Address;
	protected String guard1Tele;
	protected String guardian2;
	protected String guard2Relation;
	protected String guard2Address;
	protected String guard2Tele;
	protected int id;
/**
 *  This Constructor makes the Junior player class
 * @param afirstName firstname
 * @param aLastName lastName
 * @param aAddress address
 * @param apostcode postcode
 * @param atelephone telephone
 * @param adateOfBirth dateOfBirth
 * @param aposition	position
 * @param adoctor doctor
 * @param adocAddress	docAddress
 * @param adocPostcode	docPostcode
 * @param adocTele	docTele
 * @param ahealthIssues healthIssues
 * @param aguardian1   guardian1
 * @param aguard1Relation guardianRalation
 * @param aguard1Address	guard1Address
 * @param aguard1Tele	guard1Tele
 * @param aguardian2	guardian2
 * @param aguard2Relation	guard2Relation
 * @param aguard2Address	guard2Address
 * @param aguard2Tele	guard2Tele
 */
	public JuniorMember(String afirstName,String aLastName,String aAddress,String apostcode,String atelephone,String adateOfBirth,String aposition,String adoctor,String adocAddress, String adocPostcode,String adocTele,String ahealthIssues,String aguardian1,String aguard1Relation,String aguard1Address,String aguard1Tele,String aguardian2,String aguard2Relation,String aguard2Address,String aguard2Tele)
	{
		firstName = afirstName;
		lastName = aLastName;
		address = aAddress;
		postcode =apostcode;
		telephone = atelephone;
		dateOfBirth = adateOfBirth;
		position = aposition;
		doctor = adoctor;
		docAddress = adocAddress;
		docPostcode = adocPostcode;
		docTele = adocTele;
		healthIssues = ahealthIssues;
		guardian1 = aguardian1;
		guard1Relation = aguard1Relation;
		guard1Address = aguard1Address;
		guard1Tele = aguard1Tele;
		guardian2 =aguardian2;
		guard2Relation = aguard2Relation;
		guard2Address = aguard2Address;
		guard2Tele = aguard2Tele;
		
		id = nextSRUID++;
		
		
	}
	/**
	 * getID
	 * this method returns the playersID
	 * return id
	 */
	public int getID()
	{
		return id;
	}
	@Override
	/**
	 *  details
	 * This method returns a to String with a selection of the Junior players details
	 * return toString
	 */
	public String details()
	{
		return "Players SRU id:- "+ id 
				+" Name:- "+firstName + " "+ lastName
				+" Postion:- " + position 
				+"\n";
	}
	@Override
	/**
	 * fullDetails
	 * This method returns the Junior players full details
	 * return toString
	 */
	public String fullDetails()
	{
		return " Name:- "+firstName + " "+ lastName +"\n"
				+" Address:- "+ address+"\n"
				+" PostCode:- "+ postcode +"\n"
				+ " Telephone:- " + telephone +"\n"
				+ " Date of Birth:- "+ dateOfBirth +"\n"
				+" Position Plays:- " + position +"\n"
				+ " Doctor:- "+ doctor +"\n"
				+ " Doctors Address:- " + docAddress +"\n"
				+ " Doctor's number:- "+ docTele +"\n"
				+ " Doctors postcode :- "+docPostcode +"\n"
				+ " Doctor's Telephone number:- "+ docTele +"\n"
				+ " Guardian 1:- " + guardian1+ "\n"
				+ " Guardian 1 number:- " + guard1Tele+ "\n"
				+ " Guardian  1 Relationship:- "+guard1Relation+"\n"
				+ " Guardian 1 Address:- "+ guard1Address +"\n"
				+ " Guardian 2:- " + guardian2+ "\n"
				+ " Guardian 2 number:- " + guard2Tele+ "\n"
				+ " Guardian  2 Relationship:- "+guard2Relation+"\n"
				+ " Guardian 2 Address:- "+ guard2Address +"\n"
				+ " Health Issues:- " + healthIssues +"\n";
	}
	
	
}
