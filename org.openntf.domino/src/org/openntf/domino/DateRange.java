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

// TODO: Auto-generated Javadoc
/**
 * The Interface DateRange.
 */
public interface DateRange extends Base<lotus.domino.DateRange>, lotus.domino.DateRange {

	/* (non-Javadoc)
	 * @see lotus.domino.DateRange#getEndDateTime()
	 */
	@Override
	public DateTime getEndDateTime();

	/* (non-Javadoc)
	 * @see lotus.domino.DateRange#getParent()
	 */
	@Override
	public Session getParent();

	/* (non-Javadoc)
	 * @see lotus.domino.DateRange#getStartDateTime()
	 */
	@Override
	public DateTime getStartDateTime();

	/* (non-Javadoc)
	 * @see lotus.domino.DateRange#getText()
	 */
	@Override
	public String getText();

	/* (non-Javadoc)
	 * @see lotus.domino.DateRange#setEndDateTime(lotus.domino.DateTime)
	 */
	@Override
	public void setEndDateTime(lotus.domino.DateTime end);

	/* (non-Javadoc)
	 * @see lotus.domino.DateRange#setStartDateTime(lotus.domino.DateTime)
	 */
	@Override
	public void setStartDateTime(lotus.domino.DateTime start);

	/* (non-Javadoc)
	 * @see lotus.domino.DateRange#setText(java.lang.String)
	 */
	@Override
	public void setText(String text);

}
