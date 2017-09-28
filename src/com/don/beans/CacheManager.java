package com.don.beans;

import java.io.IOException;
import java.util.List;

public class CacheManager {
	private Cache cache;
	private List<IAccessor> accessors;
	
	public CacheManager(Cache cache, List<IAccessor> accessors) throws Exception {
		this.cache = cache;
		this.accessors = accessors; 
		//loads the data into load method
		load();
	}
	public void load() throws Exception {
		for(IAccessor accessor : accessors) {
			cache.put(accessor.getKey(), accessor.getData());
		}
	}
}
