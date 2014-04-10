public class SpellDatabase {


	public SpellInfo[] champSpells = new SpellInfo[118];
	public SpellDatabase()
	{
		
		double arrD[] = {};
		String arrS[] = {};
		//create champion array
		//store spell array of # spells for that champion in champion array, for easy access
		//still create spells individually
		
		SpellInfo[] kassadinSpells = new SpellInfo[5];
		kassadinSpells[0] = new SpellInfo("Void Stone", "", arrD, 0, arrS, "Kassadin takes 15% reduced magic damage and ignores unit collision."); 
		kassadinSpells[1] = new SpellInfo ("Null Sphere", "70 / 75 / 80 / 85 / 90 MANA", new double[]{9}, 650, new String[]{"MAGIC DAMAGE: 80 / 105 / 130 / 155 / 180 (+ 70% AP)", "SHIELD STRENGTH: 40 / 70 / 100 / 130 / 160 (+ 30% AP)", "ACTIVE: Kassadin fires an orb of void energy at a target enemy, dealing magic damage and interrupting channels. The excess energy forms around himself, granting a shield that absorbs magic damage for 1.5 seconds."};   
	//	kassadinSpells[2] =
		//kassadinSpells[3]

	}







}
