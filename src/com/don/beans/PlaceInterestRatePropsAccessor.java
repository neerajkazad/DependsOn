package com.don.beans;

import java.io.IOException;
import java.util.Properties;

public class PlaceInterestRatePropsAccessor implements IAccessor {
	private String key;
	
	public PlaceInterestRatePropsAccessor(String key) {
		this.key = key;
	}
	public String getKey() {
		return key;
	}

	public Object getData() throws IOException {
		Properties props = null;
		props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("place-ri.properties"));
		return props;
	}

	
	
	

}
