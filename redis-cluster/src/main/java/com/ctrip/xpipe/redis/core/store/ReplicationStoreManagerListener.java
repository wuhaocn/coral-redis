package com.ctrip.xpipe.redis.core.store;

/**
 * @author wenchao.meng
 * <p>
 * Dec 5, 2016
 */
public interface ReplicationStoreManagerListener {

	void onReplicationStoreCreated(ReplicationStore replicationStore);

}
