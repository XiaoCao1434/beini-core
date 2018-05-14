package com.beini.core.utils;

import com.beini.core.enums.ResultEnum;
import com.beini.core.vo.ResultVO;

/**
 * 结果集VO工具类
 * @author lb_chen
 * @date 2018-04-17 20:16
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class ResultVOUtil {
	/**
	 * 成功
	 * @param object 需要跟随结果集VO传出的对象
	 * @return 状态码+消息+对象Obj
	 */
	public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        ResultEnum resultEnum = ResultEnum.SUCCESS;
        resultVO.setCode(resultEnum.getCode());
        resultVO.setMsg(resultEnum.getMessage());
        return resultVO;
    }
	/**
	 * 成功
	 * @return 只返回状态码和消息
	 */
    public static ResultVO success() {
        return success(null);
    }
    /**
     * 失败
     * @param code 自定义的错误编码
     * @param msg 自定义的错误信息
     * @return 结果集VO
     */
    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
    /**
     * 失败
     * @param resultEnum 结果集枚举类
     * @return 结果集VO
     */
    public static ResultVO error(ResultEnum resultEnum) {
    	return error(resultEnum.getCode(),resultEnum.getMessage());
    }
}
