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

// TODO: Auto-generated Javadoc
/**
 * The Interface NotesCalendarEntry.
 */
public interface NotesCalendarEntry extends Base<lotus.domino.NotesCalendarEntry>, lotus.domino.NotesCalendarEntry {

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#accept(java.lang.String)
	 */
	@Override
	public void accept(String comments);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#accept(java.lang.String, int, java.lang.String)
	 */
	@Override
	public void accept(String comments, int scope, String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#cancel(java.lang.String)
	 */
	@Override
	public void cancel(String comments);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#cancel(java.lang.String, int, java.lang.String)
	 */
	@Override
	public void cancel(String comments, int scope, String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#counter(java.lang.String, lotus.domino.DateTime, lotus.domino.DateTime)
	 */
	@Override
	public void counter(String comments, lotus.domino.DateTime start, lotus.domino.DateTime end);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#counter(java.lang.String, lotus.domino.DateTime, lotus.domino.DateTime, boolean)
	 */
	@Override
	public void counter(String comments, lotus.domino.DateTime start, lotus.domino.DateTime end, boolean keepPlaceholder);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#counter(java.lang.String, lotus.domino.DateTime, lotus.domino.DateTime, boolean, int,
	 * java.lang.String)
	 */
	@Override
	public void counter(String comments, lotus.domino.DateTime start, lotus.domino.DateTime end, boolean keepPlaceholder, int scope,
			String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#counter(java.lang.String, lotus.domino.DateTime, lotus.domino.DateTime, int, java.lang.String)
	 */
	@Override
	public void counter(String comments, lotus.domino.DateTime start, lotus.domino.DateTime end, int scope, String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#decline(java.lang.String)
	 */
	@Override
	public void decline(String comments);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#decline(java.lang.String, boolean)
	 */
	@Override
	public void decline(String comments, boolean keepInformed);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#decline(java.lang.String, boolean, int, java.lang.String)
	 */
	@Override
	public void decline(String comments, boolean keepInformed, int scope, String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#delegate(java.lang.String, java.lang.String)
	 */
	@Override
	public void delegate(String commentsToOrganizer, String delegateTo);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#delegate(java.lang.String, java.lang.String, boolean)
	 */
	@Override
	public void delegate(String commentsToOrganizer, String delegateTo, boolean keepInformed);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#delegate(java.lang.String, java.lang.String, boolean, int, java.lang.String)
	 */
	@Override
	public void delegate(String commentsToOrganizer, String delegateTo, boolean keepInformed, int scope, String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#delegate(java.lang.String, java.lang.String, int, java.lang.String)
	 */
	@Override
	public void delegate(String commentsToOrganizer, String delegateTo, int scope, String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#getAsDocument()
	 */
	@Override
	public Document getAsDocument();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#getAsDocument(int)
	 */
	@Override
	public Document getAsDocument(int flags);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#getAsDocument(int, java.lang.String)
	 */
	@Override
	public Document getAsDocument(int flags, String recurrenceId);

	public NotesCalendar getParent();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#getNotices()
	 */
	@Override
	public Vector<NotesCalendarNotice> getNotices();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#getUID()
	 */
	@Override
	public String getUID();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#read()
	 */
	@Override
	public String read();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#read(java.lang.String)
	 */
	@Override
	public String read(String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#remove()
	 */
	@Override
	public void remove();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#remove(int, java.lang.String)
	 */
	@Override
	public void remove(int scope, String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#requestInfo(java.lang.String)
	 */
	@Override
	public void requestInfo(String comments);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#tentativelyAccept(java.lang.String)
	 */
	@Override
	public void tentativelyAccept(String comments);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#tentativelyAccept(java.lang.String, int, java.lang.String)
	 */
	@Override
	public void tentativelyAccept(String comments, int scope, String recurrenceId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#update(java.lang.String)
	 */
	@Override
	public void update(String iCalEntry);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#update(java.lang.String, java.lang.String)
	 */
	@Override
	public void update(String iCalEntry, String comments);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#update(java.lang.String, java.lang.String, long)
	 */
	@Override
	public void update(String iCalEntry, String comments, long flags);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.NotesCalendarEntry#update(java.lang.String, java.lang.String, long, java.lang.String)
	 */
	@Override
	public void update(String iCalEntry, String comments, long flags, String recurrenceId);

}
