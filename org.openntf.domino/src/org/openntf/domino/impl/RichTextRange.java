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
package org.openntf.domino.impl;

import lotus.domino.NotesException;

import org.openntf.domino.utils.DominoUtils;
import org.openntf.domino.utils.Factory;

// TODO: Auto-generated Javadoc
/**
 * The Class RichTextRange.
 */
public class RichTextRange extends Base<org.openntf.domino.RichTextRange, lotus.domino.RichTextRange> implements
		org.openntf.domino.RichTextRange {

	/**
	 * Instantiates a new rich text range.
	 * 
	 * @param delegate
	 *            the delegate
	 * @param parent
	 *            the parent
	 */
	public RichTextRange(lotus.domino.RichTextRange delegate, org.openntf.domino.Base<?> parent) {
		super(delegate, parent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#Clone()
	 */
	@Override
	public RichTextRange Clone() {
		try {
			return Factory.fromLotus(getDelegate().Clone(), RichTextRange.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#findandReplace(java.lang.String, java.lang.String)
	 */
	@Override
	public int findandReplace(String target, String replacement) {
		try {
			return getDelegate().findandReplace(target, replacement);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#findandReplace(java.lang.String, java.lang.String, long)
	 */
	@Override
	public int findandReplace(String target, String replacement, long options) {
		try {
			return getDelegate().findandReplace(target, replacement, options);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#getNavigator()
	 */
	@Override
	public RichTextNavigator getNavigator() {
		try {
			return Factory.fromLotus(getDelegate().getNavigator(), RichTextNavigator.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	@Override
	public RichTextItem getParent() {
		return (RichTextItem) super.getParent();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#getStyle()
	 */
	@Override
	public RichTextStyle getStyle() {
		try {
			return Factory.fromLotus(getDelegate().getStyle(), RichTextStyle.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#getTextParagraph()
	 */
	@Override
	public String getTextParagraph() {
		try {
			return getDelegate().getTextParagraph();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#getTextRun()
	 */
	@Override
	public String getTextRun() {
		try {
			return getDelegate().getTextRun();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#getType()
	 */
	@Override
	public int getType() {
		try {
			return getDelegate().getType();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#remove()
	 */
	@Override
	public void remove() {
		try {
			getDelegate().remove();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#reset(boolean, boolean)
	 */
	@Override
	public void reset(boolean begin, boolean end) {
		try {
			getDelegate().reset(begin, end);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#setBegin(lotus.domino.Base)
	 */
	@Override
	public void setBegin(lotus.domino.Base element) {
		try {
			getDelegate().setBegin(toLotus(element));
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#setEnd(lotus.domino.Base)
	 */
	@Override
	public void setEnd(lotus.domino.Base element) {
		try {
			getDelegate().setEnd(toLotus(element));
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.RichTextRange#setStyle(lotus.domino.RichTextStyle)
	 */
	@Override
	public void setStyle(lotus.domino.RichTextStyle style) {
		try {
			getDelegate().setStyle((lotus.domino.RichTextStyle) toLotus(style));
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
	}
}
