package com.fourfoureight.lolhelper.Stats;

import java.util.HashMap;
import java.util.Map;

public class StatSummary {
	private String              summaryType;
	private Map<String, String> stats;
	
	public StatSummary(String summaryType) {
		this.summaryType = summaryType;
		this.stats       = new HashMap<String, String>();
	}
	
	public String getSummaryType() {
		return summaryType;
	}
	
	public Map<String, String> getStats() {
		return stats;
	}
	
	public void addStat(String name, String stat) {
		stats.put(name, stat);
	}
	
	public String toString() {
		return stats.toString();
	}
}
