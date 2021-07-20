package com.ctrip.xpipe.redis.meta.server.keeper;


import com.ctrip.xpipe.redis.core.entity.KeeperMeta;

import java.util.List;

/**
 * @author wenchao.meng
 * <p>
 * Aug 6, 2016
 */
public interface KeeperActiveElectAlgorithm {

	KeeperMeta select(String clusterId, String shardId, List<KeeperMeta> toBeSelected);
}
