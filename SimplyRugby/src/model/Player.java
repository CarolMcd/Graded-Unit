package model;
/**
 * This is the player class which extends member class
 * @author Carol Mcdaid
 *
 */
public class Player extends Member {
	
	protected String nextOfKin;
	protected String nokTele;
	
	protected int id;
	/**
	 * This Constructor makes the player class
	 * @param afirstName	firstName
	 * @param aLastName	lastName
	 * @param aAddress	address
	 * @param apostcode	postcode
	 * @param atelephone	telephone
	 * @param aMobile	mobile
	 * @param adateOfBirth	dateOfBirth
	 * @param aposition	position
	 * @param anextOfKin	nextOfKin
	 * @param anokTele	nokTele
	 * @param adoctor	doctor
	 * @param adocAddress	docAddress
	 * @param adocPostcode	docPostcode
	 * @param adocTele	docTele
	 * @param ahealthIssues	healthIssues
	 */
	public Player(String afirstName,String aLastName,String aAddress,String apostcode,String atelephone,String aMobile,String adateOfBirth,String aposition,String anextOfKin,String anokTele,String adoctor,String adocAddress, String adocPostcode,String adocTele,String ahealthIssues)
	{
		firstName = afirstName;
		lastName = aLastName;
		address = aAddress;
		postcode =apostcode;
		telephone = atelephone;
		mobNum =aMobile;
		dateOfBirth = adateOfBirth;
		position = aposition;
		nextOfKin = anextOfKin;
		nokTele = anokTele;
		doctor = adoctor;
		docAddress = adocAddress;
		docPostcode = adocPostcode;
		docTele = adocTele;
		healthIssues = ahealthIssues;
		
		
		
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
	 * details
	 * This method returns a to String with a selection of the players details
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
	 * This method returns the players full details
	 * return toString
	 */
	public String fullDetails()
	{
		return " Name:- "+firstName + " "+ lastName +"\n"
				+" Address:- "+ address+"\n"
				+" PostCode:- "+ postcode +"\n"
				+ " Date of Birth:- "+ dateOfBirth +"\n"
				+ " Telephone:- " + telephone +"\n"
				+ " Mobile number:- "+ mobNum +"\n"
				+" Position Plays:- " + position +"\n"
				+ " Next of Kin:- " + nextOfKin +"\n"
				+ " Next of Kin Telephone number:- " + nokTele +"\n"
				+ " Doctor:- "+ doctor +"\n"
				+ " Doctors Address:- " + docAddress +"\n"
				+ " Doctors postcode :- "+docPostcode +"\n"
				+ " Doctor's Telephone number:- "+ docTele +"\n"
				+ " Health Issues:- " + healthIssues +"\n";
		
	}
	

}
