package model;
/**
 * This is the skillSet Class that makes the skills
 * 
 * @author Carol Mcdaid
 *
 */
public class SkillSet {
	
		protected int playerID;
		protected int catID;
		protected int skillID;
		protected String skill;
		protected int skillLevel;
		protected String dateAchieved;		
		protected String comments;
		
		/**
		 * This Constructor makes the skillSet
		 * @param aplayerId playerID
		 * @param acatID	catID
		 * @param askillID	skillID
		 * @param askill	skill
		 * @param askillLevel	skillLevel
		 * @param aComment	comment
		 * @param adateAchieved	dateAchieved
		 */
		
		public SkillSet(int aplayerId,int acatID,int askillID, String askill, int askillLevel, String aComment, String adateAchieved) 
		{
			playerID = aplayerId;
			catID = acatID;
			skillID = askillID;
	        skill = askill;
	        skillLevel = askillLevel;
	        comments = aComment;
	        dateAchieved = adateAchieved;
			
		}
		/**
		 * details
		 * This method returns a toString with the details of the player skills and level plus comments and date achieved
		 * @return toString toString
		 */
		
		public String details()
		{
			return "Skill "+skill +  "\n"+  "\n"+  "Current level is : "+ skillLevel +   "\n"+  "\n"+ "Coach's Comments "+comments +  "\n" +  "\n"+ "Date Achieved "+ dateAchieved + "\n";
				
		}
		/**
		 * getPlayerID
		 * This method returns the playersID
		 * @return playerID playerID
		 */
		public int getPlayerID()
		{
			return playerID;
					
		}
		/**
		 * getskillID
		 * This method returns the skillid
		 * @return skillID skillID
		 */
		public int getskillID()
		{
			return skillID;
					
		}
		/**
		 * getcatID
		 * This method returns the catID
		 * @return catID	catID
		 */
		public int getcatID()
		{
			return catID;
					
		}
		/**
		 * getSkill
		 * This method returns the name of the skill
		 * 
		 * @return skill	skill
		 */
		public String getSkill()
		{
			return skill;
					
		}
		/**
		 * getskillLevel
		 * This method returns the skill level
		 * @return skillLevel skillLevel
		 */
		public int getskillLevel()
		{
			return skillLevel;
		}
		/**
		 * getdateAchieved
		 * This method returns the date was achieved
		 * @return dateAchieved dateAchieved
		 */
		public String getdateAchieved()
		{
			return dateAchieved;
		}
		
		/**
		 * getComments
		 * This method returns the comments 
		 * @return comments	comments
		 */
		public String getComments()
		{
			return comments;
		}
		/**
		 * setSkill
		 * This method skills the skill
		 * @param aSkill skill
		 */
		public void setSkill(String aSkill)
		{
			skill = aSkill;
		}
		/**
		 * setskillLevel
		 * This method sets the level of the chosen skill
		 * @param askillLevel skillLevel
		 */
		public void setskillLevel(int askillLevel)
		{
			skillLevel = askillLevel;
					
		}
		/**
		 * setDateAch
		 * This method sets the date that skill was achieved
		 * @param adateAchieved dateAchieved
		 */
		public void setDateAch(String adateAchieved)
		{
			dateAchieved = adateAchieved;
		}
		/**
		 * setComments
		 * This method sets the comments made.
		 * @param aComment comment
		 */
	
		public void setComments(String aComment)
		{
			comments = aComment;
		}
		
		
		
	}



