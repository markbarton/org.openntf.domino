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
 * The Interface DbDirectory.
 */
public interface DbDirectory extends Base<lotus.domino.DbDirectory>, lotus.domino.DbDirectory, Iterable<org.openntf.domino.Database> {

	public static enum Type {
		DATABASE(DbDirectory.DATABASE), TEMPLATE(DbDirectory.TEMPLATE), REPLICA_CANDIDATE(DbDirectory.REPLICA_CANDIDATE), TEMPLATE_CANDIDATE(
				DbDirectory.TEMPLATE_CANDIDATE);

		private final int value_;

		private Type(int value) {
			value_ = value;
		}

		public int getValue() {
			return value_;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#createDatabase(java.lang.String)
	 */
	@Override
	public Database createDatabase(String dbFile);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#createDatabase(java.lang.String, boolean)
	 */
	@Override
	public Database createDatabase(String dbFile, boolean open);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#getClusterName()
	 */
	@Override
	public String getClusterName();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#getClusterName(java.lang.String)
	 */
	@Override
	public String getClusterName(String server);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#getFirstDatabase(int)
	 */
	@Override
	public Database getFirstDatabase(int type);

	public Database getFirstDatabase(Type type);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#getName()
	 */
	@Override
	public String getName();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#getNextDatabase()
	 */
	@Override
	public Database getNextDatabase();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#getParent()
	 */
	@Override
	public Session getParent();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#isHonorShowInOpenDatabaseDialog()
	 */
	@Override
	public boolean isHonorShowInOpenDatabaseDialog();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#openDatabase(java.lang.String)
	 */
	@Override
	public Database openDatabase(String dbFile);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#openDatabase(java.lang.String, boolean)
	 */
	@Override
	public Database openDatabase(String dbFile, boolean failover);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#openDatabaseByReplicaID(java.lang.String)
	 */
	@Override
	public Database openDatabaseByReplicaID(String replicaId);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#openDatabaseIfModified(java.lang.String, lotus.domino.DateTime)
	 */
	@Override
	public Database openDatabaseIfModified(String dbFile, lotus.domino.DateTime date);

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#openMailDatabase()
	 */
	@Override
	public Database openMailDatabase();

	/*
	 * (non-Javadoc)
	 * 
	 * @see lotus.domino.DbDirectory#setHonorShowInOpenDatabaseDialog(boolean)
	 */
	@Override
	public void setHonorShowInOpenDatabaseDialog(boolean flag);

}
