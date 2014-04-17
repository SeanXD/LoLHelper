package com.fourfoureight.lolhelper.Stats;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;

public class SummonerStats {
	private String summonerId;
	private Map<String, StatSummary> summaries;
	
	private void parseSummaries(Reader reader) {
		JsonReader jsonReader    = Json.createReader(reader);
		JsonObject jsonObject    = jsonReader.readObject();
		JsonArray  jsonSummaries = jsonObject.getJsonArray("playerStatSummaries");
		
		for (int i = 0; i < jsonSummaries.size(); ++i) {
			JsonObject  jsonSummary = jsonSummaries.getJsonObject(i);
			String      summaryType = jsonSummary.get("playerStatSummaryType").toString();
			StatSummary statSummary = new StatSummary(summaryType);
			
			for (Entry<String, JsonValue> entry : jsonSummary.entrySet()) {
				statSummary.addStat(entry.getKey().replace("\"", "")
				                   ,entry.getValue().toString());
			}
			
			// Remove double quotes from around summary types
			summaries.put(summaryType.replace("\"", ""), statSummary);
		}
	}
	
	public SummonerStats(String summonerId, Reader reader) {
		this.summonerId = summonerId;
		this.summaries  = new HashMap<String, StatSummary>();
		parseSummaries(reader);
	}
	
	public String getSummonerId() {
		return summonerId;
	}
	
	public Map<String, StatSummary> getSummaries() {
		return summaries;
	}
}
