public class SpellInfo {

private String name;
private String description [];
private String cost;

private String cooldown;

private String range;
private String statsPerLevel [];

//We need to figure out how we will be displaying the spell image: URL or storing the image in our app

public SpellInfo()
{
	name = "";
	cooldown = ""; 
	range = 0; 	
}

public SpellInfo(String n, String r, String cd, String cos, String sPL[], String d[])
{
	name = n;
	range = r; 
	cooldown = cd;
	
	description = new String[d.length];
	for(int i = 0; i < description.length; i++)
	{
		description[i] = d[i];
	}
	
			
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

public void setDescription(String d [])
{
	description = new String[d.length];
	for(int i = 0; i < description.length; i++)
	{
		description[i] = d[i];
	}
}
public void setCoolDown(String cool)
{
	cooldown = cool;
}
public void setSpellRange(String spellRange)
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

// getters for Spell Info
public String getSpellName()
{
	return name;
}
public String[] getDescription()
{
	return description;
}
public String getCoolDown()
{
	return cooldown;
}
public String getSpellRange()
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


}
