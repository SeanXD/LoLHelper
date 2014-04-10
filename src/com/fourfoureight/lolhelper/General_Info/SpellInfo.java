
public class SpellInfo {

private String name;
private String description;
private String cost;
private String costType;
private String cooldown;

private int range;
private String statsPerLevel [];

//We need to figure out how we will be displaying the spell image: URL or storing the image in our app

public SpellInfo()
{
	name = "";
	description = "";
	cooldown = ""; 
	range = 0; 	
}

public SpellInfo(String n, String cos, String cd, int r, String cosTy, String sPL[], String d)
{
	name = n;
	description = d;
	costType = cosTy; 
	range = r; 
		
	cooldown = cd;
			
	statsPerLevel = new String[sPL.length];
	for(int i = 0; i < statsPerLevel.length; i++)
	{
		statsPerLevel[i] = sPL[i];
	}
		
		cost = cos;
}

// setters for Spell Info
public void setSpellName(String namer)
{
	name = namer;
}

public void setDescription(String des)
{
	description = des; 
}
public void setCoolDown(String cool)
{
	cooldown = cool;
}
public void setSpellRange(int spellRange)
{
	range = spellRange; 
}
public void setStatsPerLevel(String stats [])
{
	statsPerLevel = new String[stats.length];
	
	for(int i = 0; i < stats.length; i++)
	{
		
		statsPerLevel[i] = stats[i];
		
	}
}
public void setCost(String costOf)
{
	cost = costOf;
}
public void setCostType(String cosType)
{
	costType = cosType;
}

// getters for Spell Info
public String getSpellName()
{
	return name;
}
public String getDescription()
{
	return description;
}
public String getCoolDown()
{
	return cooldown;
}
public int getSpellRange()
{
	return range;
}
public String[] getStatsPerLevel()
{
	return statsPerLevel;
}

// Cost Info
public String getCost()
{
	return cost;
}
public String getCostType()
{
	return costType;
}


}
