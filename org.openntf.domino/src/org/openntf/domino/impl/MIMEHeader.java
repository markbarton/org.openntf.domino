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

// TODO: Auto-generated Javadoc
/**
 * The Class MIMEHeader.
 */
public class MIMEHeader extends Base<org.openntf.domino.MIMEHeader, lotus.domino.MIMEHeader> implements org.openntf.domino.MIMEHeader {

	/**
	 * Instantiates a new mIME header.
	 * 
	 * @param delegate
	 *            the delegate
	 * @param parent
	 *            the parent
	 */
	public MIMEHeader(lotus.domino.MIMEHeader delegate, org.openntf.domino.Base<?> parent) {
		super(delegate, parent);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#addValText(java.lang.String)
	 */
	@Override
	public boolean addValText(String valueText) {
		try {
			return getDelegate().addValText(valueText);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#addValText(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addValText(String valueText, String charSet) {
		try {
			return getDelegate().addValText(valueText, charSet);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#getHeaderName()
	 */
	@Override
	public String getHeaderName() {
		try {
			return getDelegate().getHeaderName();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#getHeaderVal()
	 */
	@Override
	public String getHeaderVal() {
		try {
			return getDelegate().getHeaderVal();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#getHeaderVal(boolean)
	 */
	@Override
	public String getHeaderVal(boolean folded) {
		try {
			return getDelegate().getHeaderVal(folded);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#getHeaderVal(boolean, boolean)
	 */
	@Override
	public String getHeaderVal(boolean folded, boolean decoded) {
		try {
			return getDelegate().getHeaderVal(folded, decoded);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#getHeaderValAndParams()
	 */
	@Override
	public String getHeaderValAndParams() {
		try {
			return getDelegate().getHeaderValAndParams();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#getHeaderValAndParams(boolean)
	 */
	@Override
	public String getHeaderValAndParams(boolean folded) {
		try {
			return getDelegate().getHeaderValAndParams(folded);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#getHeaderValAndParams(boolean, boolean)
	 */
	@Override
	public String getHeaderValAndParams(boolean folded, boolean decoded) {
		try {
			return getDelegate().getHeaderValAndParams(folded, decoded);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#getParamVal(java.lang.String)
	 */
	@Override
	public String getParamVal(String paramName) {
		try {
			return getDelegate().getParamVal(paramName);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#getParamVal(java.lang.String, boolean)
	 */
	@Override
	public String getParamVal(String paramName, boolean folded) {
		try {
			return getDelegate().getParamVal(paramName, folded);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	@Override
	public MIMEEntity getParent() {
		return (MIMEEntity) super.getParent();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#remove()
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
	 * @see org.openntf.domino.MIMEHeader#setHeaderVal(java.lang.String)
	 */
	@Override
	public boolean setHeaderVal(String headerValue) {
		try {
			return getDelegate().setHeaderVal(headerValue);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#setHeaderValAndParams(java.lang.String)
	 */
	@Override
	public boolean setHeaderValAndParams(String headerParamValue) {
		try {
			return getDelegate().setHeaderValAndParams(headerParamValue);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openntf.domino.MIMEHeader#setParamVal(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean setParamVal(String parameterName, String parameterValue) {
		try {
			return getDelegate().setParamVal(parameterName, parameterValue);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;
		}
	}
}
