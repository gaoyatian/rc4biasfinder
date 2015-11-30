package org.yatian.dao;

import java.sql.ResultSet;

import org.yatian.entity.keystream;

/**
 * This interface is used to design the format of data stored in database.
 * @author Yatian Gao
 *
 */
public interface keystreamDao {
	/**
	 * This method is used to save the generated stream into the database.
	 * @param keystreamin
	 */
	void savestream(keystream keystreamin);
	ResultSet findValueDistributation(int value,int id);
	public keystream findById(int id);
}
