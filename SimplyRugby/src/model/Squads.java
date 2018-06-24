package model;
/**
 * This the Squads Class
 * 
 * @author Carol Mcdaid
 *
 */
public class Squads {
	
	
	protected int squadId;
	protected int playerID;
	protected String nameSquad;
	/**
	 * This Constructor makes the squad class by passing playerid, squadid and the name of the squad
	 * @param asquadId squadId
	 * @param aplayerID	playerID
	 * @param anameSquad	nameSquad
	 */
	public Squads(int asquadId, int aplayerID, String anameSquad){
		
		squadId = asquadId;
		playerID = aplayerID;
		nameSquad = anameSquad;
		
		
	}
	
	/**
	 * getSquadName
	 * This method returns the name of the squad
	 * @return nameSquad	nameSquad
	 */
	public String getSquadName()
	{
		return nameSquad;
	}
	/**getSquadPlayer
	 * This method returns the playerID
	 * 
	 * @return playerID	playerID
	 */
	public int getSquadPlayer()
	{
		return playerID;
	}
	
	
	
	
	
	
	
	
	

}
