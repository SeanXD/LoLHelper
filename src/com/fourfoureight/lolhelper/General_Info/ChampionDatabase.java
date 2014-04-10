public class ChampionDatabase {


	private ChampionInfo champions = new ChampionInfo[118];

	public ChampionDatabase()
	{

		ChampionInfo Kassadin = new ChampionInfo();
		Kassadin.setNameTitle("Kassadin", "the Void Walker");
		Kassadin.setTypes("Assassin", "Mage");
		Kassadin.setInfo(3, 5, 8, 8);
		Kassadin.setAttackDam(52.3,  3.9);
		Kassadin.setAttackSpeed(0.64, 3.7);
		Kassadin.setArmor(14, 3.2);
		Kassadin.setRange(150, "Melee");
		Kassadin.setMoveSpeed(340);
		Kassadin.setHealthInfo(433,  78 , 6.95, 0.5);
		Kassadin.setManaInfo(230, 45, 6.9, 0.6, "Mana");
		Kassadin.setMagicRes(30, 0 );
		//I need to add his spells later.
		//also maybe have id number for him 
		//giant array?
		
		ChampionInfo Katarina = new ChampionInfo();
		Katarina.setNameTitle("Katarina", "the Sinister Blade");
		Katarina.setTypes("Assassin", "Mage");
		Katarina.setInfo(4, 3, 9, 5);
		Katarina.setAttackDam(53, 3.2);
		Katarina.setAttackSpeed(0.658, 2.74);
		Katarina.setArmor(21, 3.5);
		Katarina.setRange(125, "Melee");
		Katarina.setMoveSpeed(345);
		Katarina.setHealthInfo(425, 80, 6.95, 0.55);
		Katarina.setManaInfo(0,0,0,0, null);
		Katarina.setMagicRes( 30, 1.25);
		//.setSpells
		
		ChampionInfo Kayle = new ChampionInfo();
		Kayle.setNameTitle("Kayle", "the Judicator");
		Kayle.setTypes("Fighter", "Support");
		Kayle.setInfo(6, 6, 7, 5);
		Kayle.setAttackDam(53.3, 2.8);
		Kayle.setAttackSpeed(0.638, 2.5);
		Kayle.setArmor(21, 3.5);
		Kayle.setRange(125, "Melee");
		Kayle.setMoveSpeed(335);
		Kayle.setHealthInfo(418, 93, 7, 0.75);
		Kayle.setManaInfo(255, 40, 6.9, 0.525, "Mana");
		Kayle.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Kennen = new ChampionInfo();
		Kennen.setNameTitle("Kennen", "The Heart of the Tempest");
		Kennen.setTypes("Mage", "Marksman");
		Kennen.setInfo(6, 4, 7, 5);
		Kennen.setAttackDam(47, 3.3);
		Kennen.setAttackSpeed(0.69, 3.4);
		Kennen.setArmor(18, 3.75);
		Kennen.setRange(550, "Ranged");
		Kennen.setMoveSpeed(335);
		Kennen.setHealthInfo(403, 79, 4.5, 0.65);
		Kennen.setManaInfo(200, 0, 50, 0, "Energy");
		Kennen.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo KhaZix= new ChampionInfo();
		KhaZix.setNameTitle("Kha'Zix", "the Voidreaver");
		KhaZix.setTypes("Assassin", null);
		KhaZix.setInfo(9, 4, 3, 7);
		KhaZix.setAttackDam(50, 3.1);
		KhaZix.setAttackSpeed(0.668, 2.7);
		KhaZix.setArmor(19, 3);
		KhaZix.setRange(125, "Melee");
		KhaZix.setMoveSpeed(350);
		KhaZix.setHealthInfo(430, 85, 6.25, 0.75);
		KhaZix.setManaInfo(260, 40, 6.75, 0.5, "Mana");
		KhaZix.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo KogMaw = new ChampionInfo();
		KogMaw.setNameTitle("Kog'Maw", "the Mouth of the Abyss");
		KogMaw.setTypes("Marksman", "Mage");
		KogMaw.setInfo(8, 2, 5, 8);
		KogMaw.setAttackDam(46, 3);
		KogMaw.setAttackSpeed(0.665, 2.65);
		KogMaw.setArmor(14, 3.5);
		KogMaw.setRange(500, "Ranged");
		KogMaw.setMoveSpeed(330);
		KogMaw.setHealthInfo(440, 84, 5, 0.55);
		KogMaw.setManaInfo(255, 40, 7.5, 0.7, "Mana");
		KogMaw.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo LeBlanc = new ChampionInfo();
		LeBlanc.setNameTitle("LeBlanc", "the Deceiver");
		LeBlanc.setTypes("Assassin","Mage");
		LeBlanc.setInfo(1, 4, 10, 9);
		LeBlanc.setAttackDam(51, 3.5);
		LeBlanc.setAttackSpeed(0.625, 1.4);
		LeBlanc.setArmor(16, 3.5);
		LeBlanc.setRange(525, "Ranged");
		LeBlanc.setMoveSpeed(335);
		LeBlanc.setHealthInfo(390, 75, 6.5, 0.55);
		LeBlanc.setManaInfo(250, 50, 6.9, 0.6, "Mana");
		LeBlanc.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo LeeSin = new ChampionInfo();
		LeeSin.setNameTitle("Lee Sin", "the Blind Monk");
		LeeSin.setTypes("Fighter", "Assassin");
		LeeSin.setInfo(8, 5, 3, 9);
		LeeSin.setAttackDam(55.8, 3.2);
		LeeSin.setAttackSpeed(0.651, 3);
		LeeSin.setArmor(20, 3.7);
		LeeSin.setRange(125, "Melee");
		LeeSin.setMoveSpeed(350);
		LeeSin.setHealthInfo(428, 85, 6.25, 0.7);
		LeeSin.setManaInfo(200, 0, 50, 0, "Energy");
		LeeSin.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Leona = new ChampionInfo();
		Leona.setNameTitle("Leona", "the Radiant Dawn");
		Leona.setTypes("Tank", "Support");
		Leona.setInfo(4, 8, 3, 4);
		Leona.setAttackDam(55, 3);
		Leona.setAttackSpeed(0.625, 2.9);
		Leona.setArmor(22, 3.1);
		Leona.setRange(125, "Melee");
		Leona.setMoveSpeed(335);
		Leona.setHealthInfo(430, 87, 7, 0.85);
		Leona.setManaInfo(235, 40, 7, 0.7, "Mana");
		Leona.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Lissandra = new ChampionInfo();
		Lissandra.setNameTitle("Lissandra", "the Ice Witch");
		Lissandra.setTypes("Mage", null);
		Lissandra.setInfo(2, 5, 8, 8);
		Lissandra.setAttackDam(48, 2.7);
		Lissandra.setAttackSpeed(0.625, 1.36);
		Lissandra.setArmor(14, 3.7);
		Lissandra.setRange(550, "Ranged");
		Lissandra.setMoveSpeed(325);
		Lissandra.setHealthInfo(365, 84, 6, 0.55);
		Lissandra.setManaInfo(220, 50, 5, 0.4, "Mana");
		Lissandra.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Lucian = new ChampionInfo();
		Lucian.setNameTitle("Lucian", "the Purifier");
		Lucian.setTypes("Marksman", null);
		Lucian.setInfo(8, 5, 3, 8);
		Lucian.setAttackDam(46, 3);
		Lucian.setAttackSpeed(0.638, 3.3);
		Lucian.setArmor(19, 3);
		Lucian.setRange(550, "Ranged");
		Lucian.setMoveSpeed(330);
		Lucian.setHealthInfo(390, 80, 5.1, 0.65);
		Lucian.setManaInfo(230, 41, 7, 0.7, "Mana");
		Lucian.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Lulu = new ChampionInfo();
		Lulu.setNameTitle("Lulu", "the Fae Sorceress");
		Lulu.setTypes("Support", "Mage");
		Lulu.setInfo(4, 5, 7, 7);
		Lulu.setAttackDam(44, 2.6);
		Lulu.setAttackSpeed(0.625, 2.25);
		Lulu.setArmor(13, 3.7);
		Lulu.setRange(550, "Ranged");
		Lulu.setMoveSpeed(325);
		Lulu.setHealthInfo(415, 82, 5, 0.6);
		Lulu.setManaInfo(200, 55, 5, 0.5, "Mana");
		Lulu.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Lux = new ChampionInfo();
		Lux.setNameTitle("Lux", "the Lady of Luminosity");
		Lux.setTypes("Mage", "Support");
		Lux.setInfo(2, 4, 9, 6);
		Lux.setAttackDam(50, 3.3);
		Lux.setAttackSpeed(0.625, 1.36);
		Lux.setArmor(12, 4);
		Lux.setRange(550, "Ranged");
		Lux.setMoveSpeed(330);
		Lux.setHealthInfo(345, 79, 4.5, 0.55);
		Lux.setManaInfo(250, 50, 6, 0.6, "Mana");
		Lux.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Malphite = new ChampionInfo();
		Malphite.setNameTitle("Malphite", "Shard of the Monolith");
		Malphite.setTypes("Tank", "Fighter");
		Malphite.setInfo(5, 9, 7, 3);
		Malphite.setAttackDam(56.3, 3.375);
		Malphite.setAttackSpeed(0.638, 3.4);
		Malphite.setArmor(22, 3.75);
		Malphite.setRange(125, "Melee");
		Malphite.setMoveSpeed(335);
		Malphite.setHealthInfo(423, 90, 7.45, 0.55);
		Malphite.setManaInfo(215, 40, 6.4, 0.55, "Mana");
		Malphite.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Malzahar = new ChampionInfo();
		Malzahar.setNameTitle("Malzahar", "the Prophet of the Void");
		Malzahar.setTypes("Mage", "Assassin");
		Malzahar.setInfo(2, 2, 9, 6);
		Malzahar.setAttackDam(51.66, 3);
		Malzahar.setAttackSpeed(0.625, 1.36);
		Malzahar.setArmor(16, 3.5);
		Malzahar.setRange(550, "Ranged");
		Malzahar.setMoveSpeed(340);
		Malzahar.setHealthInfo(380, 80, 4.5, 0.55);
		Malzahar.setManaInfo(250, 45, 7, 0.6, "Mana");
		Malzahar.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Maokai = new ChampionInfo();
		Maokai.setNameTitle("Maokai", "the Twisted Treant");
		Maokai.setTypes("Tank", "Mage");
		Maokai.setInfo(3, 8, 6, 4);
		Maokai.setAttackDam(58, 3.3);
		Maokai.setAttackSpeed(0.694, 2.125);
		Maokai.setArmor(22, 4);
		Maokai.setRange(125, "Melee");
		Maokai.setMoveSpeed(335);
		Maokai.setHealthInfo(421, 90, 7.25, 0.85);
		Maokai.setManaInfo(250, 46, 6.45, 0.45, "Mana");
		Maokai.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo MasterYi = new ChampionInfo();
		MasterYi.setNameTitle("Master Yi", "the Wuju Bladesman");
		MasterYi.setTypes("Asassin", "Fighter");
		MasterYi.setInfo(10, 4, 2, 2);
		MasterYi.setAttackDam(55, 3);
		MasterYi.setAttackSpeed(0.679, 2);
		MasterYi.setArmor(19, 3);
		MasterYi.setRange(125, "Melee");
		MasterYi.setMoveSpeed(355);
		MasterYi.setHealthInfo(444, 92, 6.5, 0.65);
		MasterYi.setManaInfo(180, 42, 6.5, 0.45, "Mana");
		MasterYi.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo MissFortune = new ChampionInfo();
		MissFortune.setNameTitle("Miss Fortune", "the Bounty Hunter");
		MissFortune.setTypes("Marksman", null);
		MissFortune.setInfo(8, 2,5,3);
		MissFortune.setAttackDam(46.5, 3);
		MissFortune.setAttackSpeed(0.656, 3.01);
		MissFortune.setArmor(19, 3);
		MissFortune.setRange(550, "Ranged");
		MissFortune.setMoveSpeed(325);
		MissFortune.setHealthInfo(435, 85, 5.1, 0.65);
		MissFortune.setManaInfo(212, 38, 6.95, 0.65, "Mana");
		MissFortune.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Mordekaiser = new ChampionInfo();
		Mordekaiser.setNameTitle("Mordekaiser", "the Master of Metal");
		Mordekaiser.setTypes("Fighter", "Mage");
		Mordekaiser.setInfo(4, 6,7,3);
		Mordekaiser.setAttackDam(51.7, 3.5);
		Mordekaiser.setAttackSpeed(0.694, 3);
		Mordekaiser.setArmor(19, 3.5);
		Mordekaiser.setRange(125, "Melee");
		Mordekaiser.setMoveSpeed(340);
		Mordekaiser.setHealthInfo(421, 80, 7.45, 0.55);
		Mordekaiser.setManaInfo(0,0,0,0, null);
		Mordekaiser.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Morgana = new ChampionInfo();
		Morgana.setNameTitle("Morgana", "Fallen Angel");
		Morgana.setTypes("Mage", "Support");
		Morgana.setInfo(1, 6, 8, 6);
		Morgana.setAttackDam(51.58, 3.5);
		Morgana.setAttackSpeed(0.625, 1.53);
		Morgana.setArmor(19, 3.8);
		Morgana.setRange(450, "Ranged");
		Morgana.setMoveSpeed(335);
		Morgana.setHealthInfo(403, 86, 4.7, 0.6);
		Morgana.setManaInfo(240, 60, 6.8, 0.65, "Mana");
		Morgana.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Nami = new ChampionInfo();
		Nami.setNameTitle("Nami", "the Tidecaller");
		Nami.setTypes("Support", "Mage");
		Nami.setInfo(4, 3, 7, 8);
		Nami.setAttackDam(48, 3.1);
		Nami.setAttackSpeed(0.644, 2.61);
		Nami.setArmor(13, 4);
		Nami.setRange(550, "Ranged");
		Nami.setMoveSpeed(340);
		Nami.setHealthInfo(365, 74, 4.5, 0.55);
		Nami.setManaInfo(305, 43, 6.9, 0.6, "Mana");
		Nami.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Nasus = new ChampionInfo();
		Nasus.setNameTitle("Nasus", "the Curator of the Sands");
		Nasus.setTypes("Fighter", "Tank");
		Nasus.setInfo(7, 5 ,6, 2);
		Nasus.setAttackDam(53.3, 3.5);
		Nasus.setAttackSpeed(0.638, 3.48);
		Nasus.setArmor(19, 3.5);
		Nasus.setRange(125, "Melee");
		Nasus.setMoveSpeed(350);
		Nasus.setHealthInfo(410, 90, 7.5, 0.9);
		Nasus.setManaInfo(200, 45 ,6.6, 0.5, "Mana");
		Nasus.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Nautilus = new ChampionInfo();
		Nautilus.setNameTitle("Nautilus", "the Titan of the Depths");
		Nautilus.setTypes("Tank", "Fighter");
		Nautilus.setInfo(4, 6, 6, 6);
		Nautilus.setAttackDam(52, 3.3);
		Nautilus.setAttackSpeed(0.613, 1);
		Nautilus.setArmor(20, 3.25);
		Nautilus.setRange(175, "Melee");
		Nautilus.setMoveSpeed(325);
		Nautilus.setHealthInfo(432, 86, 7.45, 0.55);
		Nautilus.setManaInfo(200, 50, 7.45, 0.7, "Mana");
		Nautilus.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Nidalee = new ChampionInfo();
		Nidalee.setNameTitle("Nidalee", "the Bestial Huntress");
		Nidalee.setTypes("Assassin", "Support");
		Nidalee.setInfo(5, 4, 7, 7);
		Nidalee.setAttackDam(49, 3.5);
		Nidalee.setAttackSpeed(0.67, 3.22);
		Nidalee.setArmor(15, 3.5);
		Nidalee.setRange(525, "Ranged");
		Nidalee.setMoveSpeed(335);
		Nidalee.setHealthInfo(370, 90, 5, 0.6);
		Nidalee.setManaInfo(220, 45, 7, 0.5, "Mana");
		Nidalee.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Nocturne = new ChampionInfo();
		Nocturne.setNameTitle("Nocturne", "the Eternal Nightmare");
		Nocturne.setTypes("Assassin", "Fighter");
		Nocturne.setInfo(9, 5, 2, 6);
		Nocturne.setAttackDam(54, 3.1);
		Nocturne.setAttackSpeed(0.668, 2.7);
		Nocturne.setArmor(21, 3.5);
		Nocturne.setRange(125, "Melee");
		Nocturne.setMoveSpeed(345);
		Nocturne.setHealthInfo(440, 85, 7, 0.75);
		Nocturne.setManaInfo(215, 35, 6, 0.45, "Mana");
		Nocturne.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Nunu = new ChampionInfo();
		Nunu.setNameTitle("Nunu", "the Yeti Rider");
		Nunu.setTypes("Support", "Fighter");
		Nunu.setInfo(4, 6, 7,1);
		Nunu.setAttackDam(51.06, 3.45);
		Nunu.setAttackSpeed(0.625, 2.25);
		Nunu.setArmor(20.5, 3.5);
		Nunu.setRange(125, "Melee");
		Nunu.setMoveSpeed(350);
		Nunu.setHealthInfo(437, 96, 7.05, 0.8);
		Nunu.setManaInfo(213, 42, 6.6, 0.5, "Mana");
		Nunu.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Olaf = new ChampionInfo();
		Olaf.setNameTitle("Olaf", "the Beserker");
		Olaf.setTypes("Fighter", "Tank");
		Olaf.setInfo(9,5, 3, 4);
		Olaf.setAttackDam(54.1, 3.5);
		Olaf.setAttackSpeed(0.694, 2.7);
		Olaf.setArmor(21, 3);
		Olaf.setRange(125, "Melee");
		Olaf.setMoveSpeed(350);
		Olaf.setHealthInfo(441, 93, 7, 0.9);
		Olaf.setManaInfo(190, 45, 6.5, 0.575, "Mana");
		Olaf.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Orianna = new ChampionInfo();
		Orianna.setNameTitle("Orianna", "the Lady of Clockwork");
		Orianna.setTypes("Mage", "Support");
		Orianna.setInfo(4, 3, 9, 10);
		Orianna.setAttackDam(44, 2.6);
		Orianna.setAttackSpeed(0.658, 3.5);
		Orianna.setArmor(12, 3);
		Orianna.setRange(525, "Ranged");
		Orianna.setMoveSpeed(325);
		Orianna.setHealthInfo(385, 79, 5.95, 0.55);
		Orianna.setManaInfo(250, 50, 7, 0.5, "Mana");
		Orianna.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Pantheon = new ChampionInfo();
		Pantheon.setNameTitle("Pantheon", "the Artisan of War");
		Pantheon.setTypes("Fighter", "Assasin");
		Pantheon.setInfo(9, 4, 3, 5);
		Pantheon.setAttackDam(50.7, 2.9);
		Pantheon.setAttackSpeed(0.679, 2.95);
		Pantheon.setArmor(21.1, 3.9);
		Pantheon.setRange(150, "Melee");
		Pantheon.setMoveSpeed(355);
		Pantheon.setHealthInfo(433, 87, 6.75, 0.65);
		Pantheon.setManaInfo(210, 34, 6.6, 0.45, "Mana");
		Pantheon.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Poppy = new ChampionInfo();
		Poppy.setNameTitle("Poppy", "the Iron Ambassador");
		Poppy.setTypes("Fighter", "Assassin");
		Poppy.setInfo(6, 6, 5, 7);
		Poppy.setAttackDam(56.3, 3.375);
		Poppy.setAttackSpeed(0.638, 3.35);
		Poppy.setArmor(22, 4);
		Poppy.setRange(125, "Melee");
		Poppy.setMoveSpeed(345);
		Poppy.setHealthInfo(423, 81, 7.45, 0.55);
		Poppy.setManaInfo(185, 30, 6.4, 0.45, "Mana");
		Poppy.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Quinn = new ChampionInfo();
		Quinn.setNameTitle("Quinn", "Demacia's Wings");
		Quinn.setTypes("Marksman", "Fighter");
		Quinn.setInfo(9, 4, 2, 7);
		Quinn.setAttackDam(48, 3);
		Quinn.setAttackSpeed(0.668, 3.1);
		Quinn.setArmor(17.5, 3.5);
		Quinn.setRange(525, "Ranged");
		Quinn.setMoveSpeed(335);
		Quinn.setHealthInfo(390, 85, 4.5, 0.55);
		Quinn.setManaInfo(210, 35, 6.3, 0.4, "Mana");
		Quinn.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Rammus = new ChampionInfo();
		Rammus.setNameTitle("Rammus", "the Armordillo");
		Rammus.setTypes("Tank", "Fighter");
		Rammus.setInfo(4, 10, 5, 5);
		Rammus.setAttackDam(50, 3.5);
		Rammus.setAttackSpeed(0.625, 2.215);
		Rammus.setArmor(25, 3.8);
		Rammus.setRange(125, "Melee");
		Rammus.setMoveSpeed(335);
		Rammus.setHealthInfo(420,86, 7, 0.55);
		Rammus.setManaInfo(255, 33, 7, 0.5, "Mana");
		Rammus.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Renekton = new ChampionInfo();
		Renekton.setNameTitle("Renekton", "the Butcher of the Sands");
		Renekton.setTypes("Fighter", "Tank");
		Renekton.setInfo(8,5,2,3);
		Renekton.setAttackDam(53.12, 3.1);
		Renekton.setAttackSpeed(0.665, 2.65);
		Renekton.setArmor(19.2, 3.8);
		Renekton.setRange(125, "Melee");
		Renekton.setMoveSpeed(345);
		Renekton.setHealthInfo(426,87, 6.7, 0.75);
		Renekton.setManaInfo(100, 0,0,0,"Fury");
		Renekton.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Rengar = new ChampionInfo();
		Rengar.setNameTitle("Rengar", "the Pridestalker");
		Rengar.setTypes("Assassin", "Fighter");
		Rengar.setInfo(7,4,2,5);
		Rengar.setAttackDam(55, 3);
		Rengar.setAttackSpeed(0.679,2.85);
		Rengar.setArmor(20,3.5);
		Rengar.setRange(125, "Melee");
		Rengar.setMoveSpeed(345);
		Rengar.setHealthInfo(435,90,3.6,0.4);
		Rengar.setManaInfo(5,0,0,0,"Ferocity");
		Rengar.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Riven = new ChampionInfo();
		Riven.setNameTitle("Riven", "the Exile");
		Riven.setTypes("Fighter", "Assassin");
		Riven.setInfo(8, 5,1,4);
		Riven.setAttackDam(51, 3);
		Riven.setAttackSpeed(0.625, 3.5);
		Riven.setArmor(19,3.2);
		Riven.setRange(125,"Melee");
		Riven.setMoveSpeed(345);
		Riven.setHealthInfo(414,86,2.5,0.5);
		Riven.setManaInfo(0,0,0,0, null);
		Riven.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Rumble= new ChampionInfo();
		Rumble.setNameTitle("Rumble", "the Mechanized Menace");
		Rumble.setTypes("Fighter", "Mage");
		Rumble.setInfo(3, 6, 8, 8);
		Rumble.setAttackDam(55.66,3.2);
		Rumble.setAttackSpeed(0.644, 1.85);
		Rumble.setArmor(20,3.5);
		Rumble.setRange(125,"Melee");
		Rumble.setMoveSpeed(345);
		Rumble.setHealthInfo(450,80,7,0.6);
		Rumble.setManaInfo(100,0,0,0,"Heat");
		Rumble.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Ryze = new ChampionInfo();
		Ryze.setNameTitle("Ryze", "the Rogue Mage");
		Ryze.setTypes("Mage", "Fighter");
		Ryze.setInfo(2, 2, 10, 3);
		Ryze.setAttackDam(52,3);
		Ryze.setAttackSpeed(0.625,2.112);
		Ryze.setArmor(15,3.9);
		Ryze.setRange(550,"Ranged");
		Ryze.setMoveSpeed(340);
		Ryze.setHealthInfo(414,86,4.35,0.55);
		Ryze.setManaInfo(250,55,7,0.6, "Mana");
		Ryze.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Sejuani = new ChampionInfo();
		Sejuani.setNameTitle("Sejuani", "the Winter's Wrath");
		Sejuani.setTypes("Tank","Fighter");
		Sejuani.setInfo(5, 7, 6, 4);
		Sejuani.setAttackDam(52,3.3);
		Sejuani.setAttackSpeed(0.67,1.44);
		Sejuani.setArmor(24.5,3);
		Sejuani.setRange(125,"Melee");
		Sejuani.setMoveSpeed(340);
		Sejuani.setHealthInfo(440,95,7.25,0.85);
		Sejuani.setManaInfo(220,40,6.45,0.45, "Mana");
		Sejuani.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Shaco = new ChampionInfo();
		Shaco.setNameTitle("Shaco", "the Demon Jester");
		Shaco.setTypes("Assasin", null);
		Shaco.setInfo(8, 4, 6, 9);
		Shaco.setAttackDam(51.7,3.5);
		Shaco.setAttackSpeed(0.694,3);
		Shaco.setArmor(19,3.5);
		Shaco.setRange(125,"Melee");
		Shaco.setMoveSpeed(350);
		Shaco.setHealthInfo(441,84,7.45,0.55);
		Shaco.setManaInfo(230,40,6.4,0.45,"Mana");
		Shaco.setMagicRes(30, 1.25);
		//.setSpells


	}

	public ChapmpionInfo[] getChampList()
	{
		return champions;
	}

}
