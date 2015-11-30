package org.yatian.service;

import org.yatian.entity.keystream;

/**
 * This is used to define interface for service
 * @author Yatian Gao
 *
 */
public interface generateService {

	void generate(keystream keystreamin);
	public org.yatian.entity.valueDistribution valueDistribution(int id,int value);

}
