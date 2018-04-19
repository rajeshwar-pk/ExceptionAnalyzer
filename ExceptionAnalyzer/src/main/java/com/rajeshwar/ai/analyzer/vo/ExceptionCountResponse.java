package com.rajeshwar.ai.analyzer.vo;

import java.util.HashMap;
import java.util.Map;

public class ExceptionCountResponse {
	
	private Map<String,Integer> countMap ;

	public ExceptionCountResponse() {
		super();
		countMap = new HashMap<>();
	}

	public Map<String, Integer> getCountMap() {
		return countMap;
	}

	public void update(final String key, final Integer cnt) {
		countMap.put(key,cnt);
	}
	

}
