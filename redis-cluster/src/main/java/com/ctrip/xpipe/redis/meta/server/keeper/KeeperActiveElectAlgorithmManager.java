package com.ctrip.xpipe.redis.meta.server.keeper;


/**
 * @author wenchao.meng
 * <p>
 * Aug 6, 2016
 */
public interface KeeperActiveElectAlgorithmManager {

	KeeperActiveElectAlgorithm get(String clusterId, String shardId);

}
