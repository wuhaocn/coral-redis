package com.ctrip.xpipe.api.server;

import com.ctrip.xpipe.api.lifecycle.Lifecycle;
import com.ctrip.xpipe.api.observer.Observable;

/**
 * @author wenchao.meng
 * <p>
 * 2016年3月24日 下午3:24:19
 */
public interface Server extends Lifecycle, Observable {

	enum SERVER_ROLE {
		MASTER,
		SLAVE,
		UNKNOWN,
		KEEPER;

		public String toString() {
			return super.toString().toLowerCase();

		}

		public boolean sameRole(String roleDesc) {

			return toString().equalsIgnoreCase(roleDesc);
		}

		public static SERVER_ROLE of(String roleDesc) {

			for (SERVER_ROLE role : SERVER_ROLE.values()) {
				if (role.toString().equalsIgnoreCase(roleDesc)) {
					return role;
				}
			}
			return SERVER_ROLE.UNKNOWN;
		}
	}

	SERVER_ROLE role();
}
