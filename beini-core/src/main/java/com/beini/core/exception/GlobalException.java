package com.beini.core.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beini.core.enums.ResultEnum;

public class GlobalException  extends RuntimeException {
	private Logger log = LoggerFactory.getLogger(GlobalException.class);
	private static final long serialVersionUID = 545660L;

	public GlobalException(ResultEnum resultEnum) {
		log.error(resultEnum.getCode()+":"+resultEnum.getMessage());
	}

	@Override
	public void printStackTrace() {
		log.error("系统出现已知异常");
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		return super.fillInStackTrace();
	}
}
