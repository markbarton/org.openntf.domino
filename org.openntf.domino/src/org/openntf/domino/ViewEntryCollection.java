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
package org.openntf.domino;

import org.openntf.domino.annotations.Legacy;
import org.openntf.domino.types.DatabaseDescendant;

// TODO: Auto-generated Javadoc
/**
 * The Interface ViewEntryCollection.
 */
public interface ViewEntryCollection extends Base<lotus.domino.ViewEntryCollection>, lotus.domino.ViewEntryCollection, Iterable<ViewEntry>,
		DatabaseDescendant {

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#addEntry(java.lang.Object)
	 */
	@Override
	public void addEntry(Object obh);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#addEntry(java.lang.Object, boolean)
	 */
	@Override
	public void addEntry(Object obj, boolean checkDups);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#cloneCollection()
	 */
	@Override
	public ViewEntryCollection cloneCollection();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#contains(lotus.domino.Base)
	 */
	@Override
	public boolean contains(lotus.domino.Base obj);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#contains(int)
	 */
	@Override
	public boolean contains(int noteid);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#contains(java.lang.String)
	 */
	@Override
	public boolean contains(String noteid);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#deleteEntry(lotus.domino.ViewEntry)
	 */
	@Override
	public void deleteEntry(lotus.domino.ViewEntry entry);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#FTSearch(java.lang.String)
	 */
	@Override
	public void FTSearch(String query);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#FTSearch(java.lang.String, int)
	 */
	@Override
	public void FTSearch(String query, int maxDocs);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getCount()
	 */
	@Override
	public int getCount();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getEntry(java.lang.Object)
	 */
	@Override
	public ViewEntry getEntry(Object entry);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getFirstEntry()
	 */
	@Override
	public ViewEntry getFirstEntry();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getLastEntry()
	 */
	@Override
	public ViewEntry getLastEntry();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getNextEntry()
	 */
	@Override
	@Deprecated
	@Legacy(Legacy.ITERATION_WARNING)
	public ViewEntry getNextEntry();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getNextEntry(lotus.domino.ViewEntry)
	 */
	@Override
	@Deprecated
	@Legacy(Legacy.ITERATION_WARNING)
	public ViewEntry getNextEntry(lotus.domino.ViewEntry entry);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getNthEntry(int)
	 */
	@Override
	@Deprecated
	@Legacy(Legacy.ITERATION_WARNING)
	public ViewEntry getNthEntry(int n);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getParent()
	 */
	@Override
	public View getParent();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getPrevEntry()
	 */
	@Override
	public ViewEntry getPrevEntry();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getPrevEntry(lotus.domino.ViewEntry)
	 */
	@Override
	public ViewEntry getPrevEntry(lotus.domino.ViewEntry entry);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#getQuery()
	 */
	@Override
	public String getQuery();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#intersect(lotus.domino.Base)
	 */
	@Override
	public void intersect(lotus.domino.Base obj);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#intersect(int)
	 */
	@Override
	public void intersect(int noteid);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#intersect(java.lang.String)
	 */
	@Override
	public void intersect(String noteid);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#markAllRead()
	 */
	@Override
	public void markAllRead();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#markAllRead(java.lang.String)
	 */
	@Override
	public void markAllRead(String userName);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#markAllUnread()
	 */
	@Override
	public void markAllUnread();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#markAllUnread(java.lang.String)
	 */
	@Override
	public void markAllUnread(String userName);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#merge(lotus.domino.Base)
	 */
	@Override
	public void merge(lotus.domino.Base obj);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#merge(int)
	 */
	@Override
	public void merge(int noteid);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#merge(java.lang.String)
	 */
	@Override
	public void merge(String noteid);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#putAllInFolder(java.lang.String)
	 */
	@Override
	public void putAllInFolder(String folderName);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#putAllInFolder(java.lang.String, boolean)
	 */
	@Override
	public void putAllInFolder(String folderName, boolean createOnFail);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#removeAll(boolean)
	 */
	@Override
	public void removeAll(boolean force);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#removeAllFromFolder(java.lang.String)
	 */
	@Override
	public void removeAllFromFolder(String folderName);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#stampAll(java.lang.String, java.lang.Object)
	 */
	@Override
	public void stampAll(String itemName, Object value);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#subtract(lotus.domino.Base)
	 */
	@Override
	public void subtract(lotus.domino.Base obj);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#subtract(int)
	 */
	@Override
	public void subtract(int noteid);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#subtract(java.lang.String)
	 */
	@Override
	public void subtract(String noteid);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntryCollection#updateAll()
	 */
	@Override
	public void updateAll();
}
