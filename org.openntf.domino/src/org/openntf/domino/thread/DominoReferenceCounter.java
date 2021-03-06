/*
 * Copyright OpenNTF 2013
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 */
package org.openntf.domino.thread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class DominoReferenceCounter.
 */
public class DominoReferenceCounter {
	// NTF - move reference counter to session. It would appear that the same handles are used across threads if they have a common
	// Session. Which is RIDICULOUS, but, whatever...

	// TODO replace the underlying map with an implementation that uses primitive long and a non-synchronized counter.

	/** The Constant log_. */
	private static final Logger log_ = Logger.getLogger(DominoReferenceCounter.class.getName());
	private final boolean synced_;

	/**
	 * Instantiates a new domino reference counter.
	 */
	public DominoReferenceCounter() {
		synced_ = true;
		this.map = Collections.synchronizedMap(new HashMap<Long, AtomicInteger>());
	}

	/**
	 * Instantiates a new domino reference counter.
	 */
	public DominoReferenceCounter(boolean synced) {
		synced_ = synced;
		if (synced) {
			this.map = Collections.synchronizedMap(new HashMap<Long, AtomicInteger>());
		} else {
			this.map = new HashMap<Long, AtomicInteger>();
		}
	}

	private final Map<Long, AtomicInteger> map;

	private Map<Long, AtomicInteger> getMap() {
		return map;
	}

	public int increment(Long id) {
		Map<Long, AtomicInteger> map = getMap();
		if (synced_) {
			synchronized (map) {
				if (map.containsKey(id)) {
					return map.get(id).incrementAndGet();
				} else {
					map.put(id, new AtomicInteger(1));
					return 1;
				}
			}
		} else {
			if (map.containsKey(id)) {
				return map.get(id).incrementAndGet();
			} else {
				map.put(id, new AtomicInteger(1));
				return 1;
			}
		}
	}

	public int decrement(Long id) {
		Map<Long, AtomicInteger> map = getMap();
		if (synced_) {
			synchronized (map) {
				if (map.containsKey(id)) {
					int result = map.get(id).decrementAndGet();
					if (result == 0)
						map.remove(id);
					return result;
				} else {
					log_.log(Level.WARNING, "Attempt to decrement a key not found in the counter map: " + id);
					return 0;
				}
			}
		} else {
			if (map.containsKey(id)) {
				int result = map.get(id).decrementAndGet();
				if (result == 0)
					map.remove(id);
				return result;
			} else {
				log_.log(Level.WARNING, "Attempt to decrement a key not found in the counter map: " + id);
				return 0;
			}
		}
	}

	/**
	 * Gets the count.
	 * 
	 * @param id
	 *            the id
	 * @return the count
	 */
	public int getCount(Long id) {
		Map<Long, AtomicInteger> map = getMap();
		if (synced_) {
			synchronized (map) {
				if (map.containsKey(id)) {
					return map.get(id).intValue();
				} else {
					return -1;
				}
			}
		} else {
			if (map.containsKey(id)) {
				return map.get(id).intValue();
			} else {
				return -1;
			}
		}
	}

}
