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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;

import lotus.domino.AdministrationProcess;
import lotus.domino.AgentContext;
import lotus.domino.Base;
import lotus.domino.ColorObject;
import lotus.domino.DateRange;
import lotus.domino.DbDirectory;
import lotus.domino.Directory;
import lotus.domino.Document;
import lotus.domino.DocumentCollection;
import lotus.domino.DxlExporter;
import lotus.domino.DxlImporter;
import lotus.domino.International;
import lotus.domino.Log;
import lotus.domino.Newsletter;
import lotus.domino.NotesCalendar;
import lotus.domino.NotesException;
import lotus.domino.PropertyBroker;
import lotus.domino.Registration;
import lotus.domino.RichTextParagraphStyle;
import lotus.domino.RichTextStyle;
import lotus.domino.Stream;

import org.openntf.domino.DateTime;
import org.openntf.domino.Name;
import org.openntf.domino.annotations.Legacy;
import org.openntf.domino.utils.DominoFormatter;
import org.openntf.domino.utils.DominoUtils;
import org.openntf.domino.utils.Factory;

// TODO: Auto-generated Javadoc
//import lotus.domino.Name;

/**
 * The Class Session.
 * 
 * @author nfreeman
 */
public class Session extends org.openntf.domino.impl.Base<org.openntf.domino.Session, lotus.domino.Session> implements
		org.openntf.domino.Session {

	/** The formatter_. */
	private static DominoFormatter formatter_;

	/** The default session. */
	private static ThreadLocal<Session> defaultSession = new ThreadLocal<Session>() {
		@Override
		protected Session initialValue() {
			return null;
		}
	};

	/**
	 * Gets the default session.
	 * 
	 * @return the default session
	 */
	public static Session getDefaultSession() {
		return defaultSession.get();
	}

	/**
	 * Instantiates a new session.
	 */
	public Session() {
		// TODO come up with some static methods for finding a Session based on run context (XPages, Agent, DOTS, etc)
		super(null, null);
	}

	// FIXME NTF - not sure if there's a context where this makes sense...
	/**
	 * Instantiates a new session.
	 * 
	 * @param lotus
	 *            the lotus
	 * @param parent
	 *            the parent
	 */
	public Session(lotus.domino.Session lotus, org.openntf.domino.Base<?> parent) {
		super(lotus, parent);
		initialize(lotus);
	}

	/**
	 * Initialize.
	 * 
	 * @param session
	 *            the session
	 */
	private void initialize(lotus.domino.Session session) {
		try {
			formatter_ = new DominoFormatter(session.getInternational());
			if (defaultSession.get() == null) {
				defaultSession.set(this);
			}
		} catch (NotesException e) {
			DominoUtils.handleException(e);

		}
	}

	/**
	 * Gets the formatter.
	 * 
	 * @return the formatter
	 */
	public static DominoFormatter getFormatter() {
		return formatter_;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createAdministrationProcess(java.lang.String)
	 */
	@Override
	public AdministrationProcess createAdministrationProcess(String arg0) {
		try {
			return getDelegate().createAdministrationProcess(arg0);
		} catch (NotesException ne) {
			DominoUtils.handleException(ne);

		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createColorObject()
	 */
	@Override
	public ColorObject createColorObject() {
		try {
			return getDelegate().createColorObject();
		} catch (NotesException ne) {
			DominoUtils.handleException(ne);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createDateRange()
	 */
	@Override
	public org.openntf.domino.DateRange createDateRange() {
		try {
			return Factory.fromLotus(getDelegate().createDateRange(), org.openntf.domino.DateRange.class, this);
		} catch (NotesException ne) {
			DominoUtils.handleException(ne);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createDateRange(java.util.Date, java.util.Date)
	 */
	@Override
	public DateRange createDateRange(Date arg0, Date arg1) {
		try {
			return getDelegate().createDateRange(arg0, arg1);
		} catch (NotesException ne) {
			DominoUtils.handleException(ne);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createDateRange(lotus.domino.DateTime, lotus.domino.DateTime)
	 */
	public DateRange createDateRange(lotus.domino.DateTime arg0, lotus.domino.DateTime arg1) {
		try {
			return Factory.fromLotus(createDateRange(arg0, arg1), org.openntf.domino.DateRange.class, this);
		} catch (Exception e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createDateTime(java.util.Calendar)
	 */
	@Override
	public DateTime createDateTime(Calendar arg0) {
		try {
			return Factory.fromLotus(getDelegate().createDateTime(arg0), DateTime.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createDateTime(java.util.Date)
	 */
	@Override
	public DateTime createDateTime(Date arg0) {
		try {
			return Factory.fromLotus(getDelegate().createDateTime(arg0), DateTime.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createDateTime(java.lang.String)
	 */
	@Override
	public DateTime createDateTime(String arg0) {
		try {
			return Factory.fromLotus(getDelegate().createDateTime(arg0), DateTime.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createDxlExporter()
	 */
	@Override
	public DxlExporter createDxlExporter() {
		try {
			return getDelegate().createDxlExporter();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createDxlImporter()
	 */
	@Override
	public DxlImporter createDxlImporter() {
		try {
			return getDelegate().createDxlImporter();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createLog(java.lang.String)
	 */
	@Override
	public Log createLog(String arg0) {
		try {
			return getDelegate().createLog(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createName(java.lang.String, java.lang.String)
	 */
	@Override
	public Name createName(String arg0, String arg1) {
		try {
			return Factory.fromLotus(getDelegate().createName(arg0, arg1), Name.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createName(java.lang.String)
	 */
	@Override
	public org.openntf.domino.Name createName(String arg0) {
		try {
			return Factory.fromLotus(getDelegate().createName(arg0), Name.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createNewsletter(lotus.domino.DocumentCollection)
	 */
	@Override
	public Newsletter createNewsletter(DocumentCollection arg0) {
		try {
			return getDelegate().createNewsletter(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createRegistration()
	 */
	@Override
	public Registration createRegistration() {
		try {
			return getDelegate().createRegistration();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createRichTextParagraphStyle()
	 */
	@Override
	public RichTextParagraphStyle createRichTextParagraphStyle() {
		try {
			return getDelegate().createRichTextParagraphStyle();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createRichTextStyle()
	 */
	@Override
	public RichTextStyle createRichTextStyle() {
		try {
			return getDelegate().createRichTextStyle();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#createStream()
	 */
	@Override
	public Stream createStream() {
		try {
			return getDelegate().createStream();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#evaluate(java.lang.String, lotus.domino.Document)
	 */
	@Override
	@Legacy({ Legacy.INTERFACES_WARNING, Legacy.GENERICS_WARNING })
	public Vector<Object> evaluate(String arg0, Document arg1) {
		try {
			return getDelegate().evaluate(arg0, arg1); // TODO still needs Factory wrapper
		} catch (Exception e) {
			DominoUtils.handleException(e);
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#evaluate(java.lang.String)
	 */
	@Override
	@Legacy({ Legacy.INTERFACES_WARNING, Legacy.GENERICS_WARNING })
	public Vector<Object> evaluate(String arg0) {
		try {
			return getDelegate().evaluate(arg0); // TODO still needs Factory wrapper
		} catch (Exception e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#freeTimeSearch(lotus.domino.DateRange, int, java.lang.Object, boolean)
	 */
	@Override
	@Legacy(Legacy.INTERFACES_WARNING)
	public Vector<org.openntf.domino.DateRange> freeTimeSearch(DateRange arg0, int arg1, Object arg2, boolean arg3) {
		try {
			return getDelegate().freeTimeSearch(arg0, arg1, arg2, arg3); // TODO still needs Factory wrapper
		} catch (Exception e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getAddressBooks()
	 */
	@Override
	@Legacy(Legacy.INTERFACES_WARNING)
	public Vector<org.openntf.domino.Database> getAddressBooks() {
		try {
			return getDelegate().getAddressBooks(); // TODO still needs Factory wrapper
		} catch (Exception e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getAgentContext()
	 */
	@Override
	public AgentContext getAgentContext() {
		try {
			return getDelegate().getAgentContext();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getCalendar(lotus.domino.Database)
	 */
	@Override
	public NotesCalendar getCalendar(lotus.domino.Database arg0) {
		try {
			return getDelegate().getCalendar(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getCommonUserName()
	 */
	@Override
	public String getCommonUserName() {
		try {
			return getDelegate().getCommonUserName();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getCredentials()
	 */
	@Override
	public Object getCredentials() {
		try {
			return getDelegate().getCredentials();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getCurrentDatabase()
	 */
	@Override
	public Database getCurrentDatabase() {
		try {
			return Factory.fromLotus(getDelegate().getCurrentDatabase(), Database.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getDatabase(java.lang.String, java.lang.String, boolean)
	 */
	@Override
	public Database getDatabase(String arg0, String arg1, boolean arg2) {
		try {
			return Factory.fromLotus(getDelegate().getDatabase(arg0, arg1, arg2), Database.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getDatabase(java.lang.String, java.lang.String)
	 */
	@Override
	public org.openntf.domino.Database getDatabase(String arg0, String arg1) {
		try {
			return Factory.fromLotus(getDelegate().getDatabase(arg0, arg1), org.openntf.domino.Database.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getDbDirectory(java.lang.String)
	 */
	@Override
	public DbDirectory getDbDirectory(String arg0) {
		try {
			return getDelegate().getDbDirectory(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getDirectory()
	 */
	@Override
	public Directory getDirectory() {
		try {
			return getDelegate().getDirectory();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getDirectory(java.lang.String)
	 */
	@Override
	public Directory getDirectory(String arg0) {
		try {
			return getDelegate().getDirectory(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getEffectiveUserName()
	 */
	@Override
	public String getEffectiveUserName() {
		try {
			return getDelegate().getEffectiveUserName();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getEnvironmentString(java.lang.String, boolean)
	 */
	@Override
	public String getEnvironmentString(String arg0, boolean arg1) {
		try {
			return getDelegate().getEnvironmentString(arg0, arg1);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getEnvironmentString(java.lang.String)
	 */
	@Override
	public String getEnvironmentString(String arg0) {
		try {
			return getDelegate().getEnvironmentString(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getEnvironmentValue(java.lang.String, boolean)
	 */
	@Override
	public Object getEnvironmentValue(String arg0, boolean arg1) {
		try {
			return getDelegate().getEnvironmentValue(arg0, arg1);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getEnvironmentValue(java.lang.String)
	 */
	@Override
	public Object getEnvironmentValue(String arg0) {
		try {
			return getDelegate().getEnvironmentValue(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getHttpURL()
	 */
	@Override
	public String getHttpURL() {
		try {
			return getDelegate().getHttpURL();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getInternational()
	 */
	@Override
	public International getInternational() {
		try {
			return getDelegate().getInternational();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getNotesVersion()
	 */
	@Override
	public String getNotesVersion() {
		try {
			return getDelegate().getNotesVersion();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getOrgDirectoryPath()
	 */
	@Override
	public String getOrgDirectoryPath() {
		try {
			return getDelegate().getOrgDirectoryPath();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getPlatform()
	 */
	@Override
	public String getPlatform() {
		try {
			return getDelegate().getPlatform();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getPropertyBroker()
	 */
	@Override
	public PropertyBroker getPropertyBroker() {
		try {
			return getDelegate().getPropertyBroker();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getServerName()
	 */
	@Override
	public String getServerName() {
		try {
			return getDelegate().getServerName();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getSessionToken()
	 */
	@Override
	public String getSessionToken() {
		try {
			return getDelegate().getSessionToken();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getSessionToken(java.lang.String)
	 */
	@Override
	public String getSessionToken(String arg0) {
		try {
			return getDelegate().getSessionToken(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getURL()
	 */
	@Override
	public String getURL() {
		try {
			return getDelegate().getURL();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getURLDatabase()
	 */
	@Override
	public Database getURLDatabase() {
		try {
			return Factory.fromLotus(getDelegate().getURLDatabase(), Database.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getUserGroupNameList()
	 */
	@Override
	public Vector<org.openntf.domino.Name> getUserGroupNameList() {
		try {
			return getDelegate().getUserGroupNameList();
		} catch (Exception e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getUserName()
	 */
	@Override
	public String getUserName() {
		try {
			return getDelegate().getUserName();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getUserNameList()
	 */
	@Override
	public Vector<org.openntf.domino.Name> getUserNameList() {
		try {
			return Factory.fromLotusAsVector(getDelegate().getUserNameList(), Name.class, this);
		} catch (Exception e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getUserNameObject()
	 */
	@Override
	public org.openntf.domino.Name getUserNameObject() {
		try {
			return Factory.fromLotus(getDelegate().getUserNameObject(), org.openntf.domino.Name.class, this);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getUserPolicySettings(java.lang.String, java.lang.String, int, java.lang.String)
	 */
	@Override
	public Document getUserPolicySettings(String arg0, String arg1, int arg2, String arg3) {
		try {
			return getDelegate().getUserPolicySettings(arg0, arg1, arg2, arg3);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getUserPolicySettings(java.lang.String, java.lang.String, int)
	 */
	@Override
	public Document getUserPolicySettings(String arg0, String arg1, int arg2) {
		try {
			return getDelegate().getUserPolicySettings(arg0, arg1, arg2);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#hashPassword(java.lang.String)
	 */
	@Override
	public String hashPassword(String arg0) {
		try {
			return getDelegate().hashPassword(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#isConvertMIME()
	 */
	@Override
	public boolean isConvertMIME() {
		try {
			return getDelegate().isConvertMIME();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#isConvertMime()
	 */
	@Override
	public boolean isConvertMime() {
		try {
			return getDelegate().isConvertMime();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#isOnServer()
	 */
	@Override
	public boolean isOnServer() {
		try {
			return getDelegate().isOnServer();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#isRestricted()
	 */
	@Override
	public boolean isRestricted() {
		try {
			return getDelegate().isRestricted();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return true;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#isTrackMillisecInJavaDates()
	 */
	@Override
	public boolean isTrackMillisecInJavaDates() {
		try {
			return getDelegate().isTrackMillisecInJavaDates();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return true;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#isTrustedSession()
	 */
	@Override
	public boolean isTrustedSession() {
		try {
			return getDelegate().isTrustedSession();
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#isValid()
	 */
	@Override
	public boolean isValid() {
		return getDelegate().isValid();
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#resetUserPassword(java.lang.String, java.lang.String, java.lang.String, int)
	 */
	@Override
	public boolean resetUserPassword(String arg0, String arg1, String arg2, int arg3) {
		try {
			return getDelegate().resetUserPassword(arg0, arg1, arg2, arg3);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#resetUserPassword(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean resetUserPassword(String arg0, String arg1, String arg2) {
		try {
			return getDelegate().resetUserPassword(arg0, arg1, arg2);
		} catch (NotesException e) {
			DominoUtils.handleException(e);

		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#resolve(java.lang.String)
	 */
	@Override
	public Base resolve(String arg0) {
		try {
			return getDelegate().resolve(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#sendConsoleCommand(java.lang.String, java.lang.String)
	 */
	@Override
	public String sendConsoleCommand(String arg0, String arg1) {
		try {
			return getDelegate().sendConsoleCommand(arg0, arg1);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return null;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#setAllowLoopBack(boolean)
	 */
	@Override
	public void setAllowLoopBack(boolean arg0) {
		try {
			getDelegate().setAllowLoopBack(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#setConvertMIME(boolean)
	 */
	@Override
	public void setConvertMIME(boolean arg0) {
		try {
			getDelegate().setConvertMIME(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#setConvertMime(boolean)
	 */
	@Override
	public void setConvertMime(boolean arg0) {
		try {
			getDelegate().setConvertMime(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#setEnvironmentVar(java.lang.String, java.lang.Object, boolean)
	 */
	@Override
	public void setEnvironmentVar(String arg0, Object arg1, boolean arg2) {
		try {
			getDelegate().setEnvironmentVar(arg0, arg1, arg2);
		} catch (NotesException e) {
			DominoUtils.handleException(e);

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#setEnvironmentVar(java.lang.String, java.lang.Object)
	 */
	@Override
	public void setEnvironmentVar(String arg0, Object arg1) {
		try {
			getDelegate().setEnvironmentVar(arg0, arg1);
		} catch (NotesException e) {
			DominoUtils.handleException(e);

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#setTrackMillisecInJavaDates(boolean)
	 */
	@Override
	public void setTrackMillisecInJavaDates(boolean arg0) {
		try {
			getDelegate().setTrackMillisecInJavaDates(arg0);
		} catch (NotesException e) {
			DominoUtils.handleException(e);

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#verifyPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean verifyPassword(String arg0, String arg1) {
		try {
			return getDelegate().verifyPassword(arg0, arg1);
		} catch (NotesException e) {
			DominoUtils.handleException(e);
			return false;

		}
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getUserGroupNameCollection()
	 */
	@Override
	public Collection<String> getUserGroupNameCollection() {
		Collection<String> result = new ArrayList<String>();
		Vector<Name> v = this.getUserGroupNameList();
		if (!v.isEmpty()) {
			for (Name name : v) {
				result.add(name.getCanonical());
				DominoUtils.incinerate(name);
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getUserNameCollection()
	 */
	@Override
	public Collection<String> getUserNameCollection() {
		Collection<String> result = new ArrayList<String>();
		Vector<Name> v = this.getUserNameList();
		if (!v.isEmpty()) {
			for (Name name : v) {
				result.add(name.getCanonical());
				DominoUtils.incinerate(name);
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#getAddressBookCollection()
	 */
	@Override
	public Collection<org.openntf.domino.Database> getAddressBookCollection() {
		Collection<org.openntf.domino.Database> result = new ArrayList<org.openntf.domino.Database>();
		Vector<org.openntf.domino.Database> v = this.getAddressBooks();
		if (!v.isEmpty()) {
			for (org.openntf.domino.Database db : v) {
				result.add(db);
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#freeTimeSearch(org.openntf.domino.DateRange, int, java.lang.String, boolean)
	 */
	@Override
	public Collection<org.openntf.domino.DateRange> freeTimeSearch(org.openntf.domino.DateRange arg0, int arg1, String arg2, boolean arg3) {
		// TODO verify that we don't end up with an ambiguous method signature
		Collection<org.openntf.domino.DateRange> result = new ArrayList<org.openntf.domino.DateRange>();
		Vector<org.openntf.domino.DateRange> v = this.freeTimeSearch((lotus.domino.DateRange) arg0, arg1, (Object) arg2, arg3);
		if (!v.isEmpty()) {
			for (org.openntf.domino.DateRange dr : v) {
				result.add(dr);
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.openntf.domino.Session#freeTimeSearch(org.openntf.domino.DateRange, int, java.util.Collection, boolean)
	 */
	@Override
	public Collection<org.openntf.domino.DateRange> freeTimeSearch(org.openntf.domino.DateRange arg0, int arg1, Collection<String> arg2,
			boolean arg3) {
		// TODO verify that we don't end up with an ambiguous method signature
		Collection<org.openntf.domino.DateRange> result = new ArrayList<org.openntf.domino.DateRange>();
		Vector<org.openntf.domino.DateRange> v = this.freeTimeSearch((lotus.domino.DateRange) arg0, arg1, (Object) arg2, arg3);
		if (!v.isEmpty()) {
			for (org.openntf.domino.DateRange dr : v) {
				result.add(dr);
			}
		}
		return result;
	}

}
