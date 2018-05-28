package com.beini.core.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 拒绝连接异常
 * 
 * @author lb_chen
 * @date 2018-04-19 16:40
 */
public class RefuseConnectionException extends RuntimeException {
	private Logger log = LoggerFactory.getLogger(RefuseConnectionException.class);
	private static final long serialVersionUID = 500L;

	public RefuseConnectionException(String message) {
		log.error(message);
	}

	@Override
	public void printStackTrace() {
		log.error("redis或者mysql连接异常");
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		return super.fillInStackTrace();
	}

}
