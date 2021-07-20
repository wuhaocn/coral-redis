package com.ctrip.xpipe.concurrent;

/**
 * @author wenchao.meng
 * <p>
 * Jul 1, 2016
 */
public interface FutureListener<F extends ListenableFuture<?>> {

	void operationComplete(F future) throws Exception;
}
