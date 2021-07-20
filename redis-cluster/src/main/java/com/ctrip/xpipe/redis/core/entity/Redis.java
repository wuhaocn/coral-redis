package com.ctrip.xpipe.redis.core.entity;

import com.ctrip.xpipe.endpoint.HostPort;
import com.ctrip.xpipe.utils.ObjectUtils;

/**
 * @author wenchao.meng
 * <p>
 * Jul 17, 2016
 */
public interface Redis {

	String getId();

	String getIp();

	String getMaster();

	Long getOffset();

	Integer getPort();

	Redis setId(String id);

	Redis setIp(String ip);

	Redis setMaster(String master);

	Redis setOffset(Long offset);

	Redis setPort(Integer port);

	Redis setSurvive(Boolean survive);

	boolean isSurvive();

	default boolean equalsWithIpPort(HostPort hostPort) {

		if (!ObjectUtils.equals(getIp(), hostPort.getHost())) {
			return false;
		}

		return ObjectUtils.equals(getPort(), hostPort.getPort());
	}

	default boolean equalsWithIpPort(Redis redis) {

		if (redis == null) {
			return false;
		}

		if (!ObjectUtils.equals(getIp(), redis.getIp())) {
			return false;
		}

		return ObjectUtils.equals(getPort(), redis.getPort());
	}

	default String desc() {
		return String.format("%s(%s:%d)", getClass().getSimpleName(), getIp(), getPort());
	}
}
