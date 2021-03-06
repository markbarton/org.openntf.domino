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

import java.util.Vector;

import org.openntf.domino.types.DatabaseDescendant;

// TODO: Auto-generated Javadoc
/**
 * The Interface ViewEntry.
 */
public interface ViewEntry extends lotus.domino.ViewEntry, Base<lotus.domino.ViewEntry>, DatabaseDescendant {

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getChildCount()
	 */
	@Override
	public int getChildCount();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getColumnIndentLevel()
	 */
	@Override
	public int getColumnIndentLevel();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getColumnValues()
	 */
	@Override
	public Vector<Object> getColumnValues();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getDescendantCount()
	 */
	@Override
	public int getDescendantCount();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getDocument()
	 */
	@Override
	public Document getDocument();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getFTSearchScore()
	 */
	@Override
	public int getFTSearchScore();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getIndentLevel()
	 */
	@Override
	public int getIndentLevel();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getNoteID()
	 */
	@Override
	public String getNoteID();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getNoteIDAsInt()
	 */
	@Override
	public int getNoteIDAsInt();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getParent()
	 */
	@Override
	public Base<?> getParent();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getPosition(char)
	 */
	@Override
	public String getPosition(char separator);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getRead()
	 */
	@Override
	public boolean getRead();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getRead(java.lang.String)
	 */
	@Override
	public boolean getRead(String userName);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getSiblingCount()
	 */
	@Override
	public int getSiblingCount();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#getUniversalID()
	 */
	@Override
	public String getUniversalID();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#isCategory()
	 */
	@Override
	public boolean isCategory();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#isConflict()
	 */
	@Override
	public boolean isConflict();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#isDocument()
	 */
	@Override
	public boolean isDocument();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#isPreferJavaDates()
	 */
	@Override
	public boolean isPreferJavaDates();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#isTotal()
	 */
	@Override
	public boolean isTotal();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#isValid()
	 */
	@Override
	public boolean isValid();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.ViewEntry#setPreferJavaDates(boolean)
	 */
	@Override
	public void setPreferJavaDates(boolean flag);
}
