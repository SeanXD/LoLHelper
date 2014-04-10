package com.fourfoureight.lolhelper;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class TeamBuilder extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_team_builder);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.team_builder, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_team_builder,
					container, false);
			return rootView;
		}
	}

//==============================================================================
	
	// utility class ChampionAttributes to store a champion is good at some
	// strategy or not.
	static class ChampionAttributes{
		
		private String name;
		private int[] attribute = new int[10];
		
		/* Strategy ratings are stored in the attribute array	
		 * index0: HardEngage;
		 * index1: SplitPush;
		 * index2: Poke;
		 * index3: CatchOut;
		 * index4: WomboCombo;
		 * index5: DunkSquad;
		 * index6: YordleOnly;
		 * index7: FullReviveBungaloo;
		 * index8: EarlyGame;
		 * index9: LateGame;
		 */	
		
		public ChampionAttributes(){
			this.name = "NONAME";
			for (int i = 0; i < 10; i++){
				this.attribute[i] = 0;
			}
		}
		
		public ChampionAttributes(String name, int attribute[]){
			this.name = name;
			for (int i = 0; i < 10; i++){
				this.attribute[i] = attribute[i];
			}
		}
				
		public String getName(){
			return this.name;
		}
	
		// return the certain strategy rating for a champion
		public int getAttribute(int strategy){
			return this.attribute[strategy];
		}
	}
	
//==============================================================================
	
	public static final int numOfChampions = 118;
	
	//numbers of champions who are good at some strategy, stored in an array
	private int[] numOfAttribute = new int[10];
	
	private ChampionAttributes[] allChampions = new ChampionAttributes[numOfChampions];
	private ChampionAttributes[] ourTeam = new ChampionAttributes[5];
	private ChampionAttributes[] enemyTeam = new ChampionAttributes[5];

	// strategy array encoding: the first position indicates how many strategies
	// this team is good at, followed by a list of strategies.
	// strategies are numbered from 0 to 9
	private int[] ourStrategy = new int[11];		
	private int[] enemyStrategy = new int[11];

//==============================================================================

	public TeamBuilder(){
		// Create ChampionAttributes class for each champion in array "allChampions"
		// not done yet...
		findNumOfAttributes();
	}
	
	// find the numbers of champions for each strategy
	private void findNumOfAttributes(){
		// initialize the array
		for (int i = 0; i < 10; i++){
			numOfAttribute[i] = 0;
		}
		for (int i = 0; i < numOfChampions; i++){
			for (int j = 0; j < 10; j++){
				if (allChampions[i].getAttribute(j) == 20)
					numOfAttribute[j] += 1;
			}
		}
	}
	
	// return a list of champions that matches the given strategy
	// strategy is labeled from 0 to 9, the return list won't include the 
	// champions that already in the given team.
	public ChampionAttributes[] suggestChampionsByStrategy(int strategy, ChampionAttributes[] team){
		ChampionAttributes[] returnArray = new ChampionAttributes[numOfAttribute[strategy]];
				
		// fill the return array
		for (int i = 0, j = 0; i < numOfChampions; i++){
			// Exclude all champions that already in the given team.
			if ((allChampions[i].getName() != team[0].getName()) 
								&& (allChampions[i].getName() != team[1].getName())
								&& (allChampions[i].getName() != team[2].getName())
								&& (allChampions[i].getName() != team[3].getName())
								&& (allChampions[i].getName() != team[4].getName())){

				// determine if the champion is good at given strategy
				if (allChampions[i].getAttribute(strategy) == 20){
					returnArray[j] = allChampions[i];
					j += 1;
				}
			}
		}
		return returnArray;
	}
	
	// First try to get the strategy of the team. Then if the team is not full, 
	// suggest champions which match the team strategy.
	// mode encoding: 1, our team. 2, enemy team.
	// returnArray encoding: first sub-array is champions that are good at first strategy
	// 						and so on. (there may be multiple best strategies for a team.)
	// pre-condition: the team is not empty!
	public ChampionAttributes[][] completeTeam(int mode){
		// determine how many members in the team
		int numOfCurrentTeamMembers = 0;
		for (int i = 0; i < 5; i++){
			if (mode == 1){
				if (ourTeam[i].getName() != "NONAME")
					numOfCurrentTeamMembers += 1;
			}
			else if (mode == 2){
				if (enemyTeam[i].getName() != "NONAME")
					numOfCurrentTeamMembers += 1;
			}
		}
		
		if (numOfCurrentTeamMembers == 0){
			// Bad request!
			return null;
		}
		
		if (numOfCurrentTeamMembers == 5){
			if (mode == 1){
				ourStrategy = suggestStrategyForTeam(ourTeam);
				return null;
			}
			else if (mode == 2){
				enemyStrategy = suggestStrategyForTeam(enemyTeam);
				return null;
			}
		}
		
		if (mode == 1){
			ourStrategy = suggestStrategyForTeam(ourTeam);
			// create returnArray according to the number of strategies
			ChampionAttributes[][] returnArray = 
					new ChampionAttributes[ourStrategy[0]][];
			// suggest champions for every strategies
			for (int i = 1; i <= ourStrategy[0]; i++){
				returnArray[i - 1] = 
						suggestChampionsByStrategy(ourStrategy[i], ourTeam);
			}
			return returnArray;
		}
		else if (mode == 2){
			int[] enemyStrategy = suggestStrategyForTeam(enemyTeam);
			// create returnArray according to the number of strategies
			ChampionAttributes[][] returnArray = 
					new ChampionAttributes[enemyStrategy[0]][];
			// suggest champions for every strategies
			for (int i = 1; i <= enemyStrategy[0]; i++){
				returnArray[i - 1] = 
						suggestChampionsByStrategy(enemyStrategy[i], enemyTeam);
			}
			return returnArray;
		}
		
		return null;		// this only happens when the mode is not 1 or 2.		 
	}
	
	//	suggest a strategy for a given team
	//	pre-condition: the given team is not empty! team is an array of 5.
	private int[] suggestStrategyForTeam(ChampionAttributes[] team){

		// cumulative score of a certain strategy for the given team
		int[] strategyScore = new int[10];
		for (int i = 0; i < 5; i++){
			for (int j = 0; j < 10; j++){
				strategyScore[j] += team[i].getAttribute(j);
			}
		}
		
		// returnArray encoding: the first position indicates how many strategies
		// this team is good at, followed by a list of strategies (0 ~ 9)
		int[] returnArray = new int [11];
		returnArray[0] = 0;
		for (int i = 1; i <= 10; i++){
			returnArray[i] = -1;
		}
		
		// for every strategy score, find if it is the greatest in the array. if so, 
		// append the strategy to returnArray and increment returnArray[0] 
		for (int i = 0; i < 10; i++){
			boolean isGreatest = true;
			for (int j = 0; j < 10; j++){
				if (strategyScore[j] > strategyScore[i])
					isGreatest = false;
			}
			if (isGreatest){
				returnArray[0] += 1;
				returnArray[returnArray[0]] = i;
			}
		}
		
		return returnArray;
	}

}







