package model;

import java.util.ArrayList;
/**
 * This is the skillCategory Class
 * @author Carol Mcdaid
 *
 */
public class SkillCategory {
	
	protected int skillCatID;
	protected String category;

	
	/**
	 * This Constructor passes the skillcatId and the category name
	 * @param askillCatID skillCatID
	 * @param aCategory	Category
	 */
	public SkillCategory(int askillCatID, String aCategory)
	{
		skillCatID = askillCatID;
		category = aCategory;
	
	}
	
	
	
	/**
	 * getID
	 * This method returns the skillCatId which is the category ID
	 * @return skillCatID
	 */
	public int getID()
	{
		return skillCatID;
	}
	/**
	 *getCategory
	 *This method returns the name of the category
	 * @return category
	 */
	public String getCategory()
	{
		return category;
	}
	
	
	
}
