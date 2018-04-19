package com.beini.core.utils;

import java.util.List;

import org.springframework.util.StringUtils;
/**
 * 字符串工具类
 * <br>
 * 继承  <code>org.springframework.util.StringUtils</code>类
 * @author lb_chen
 * @date 2018-04-17 20:25
 */
public class StringUtil extends StringUtils{
    /******************************************************/
    /*                       返回值                                                                           */
    /******************************************************/
    public static final String RETURN_VAL_SUCCESS                               ="SUCCESS";
    public static final String RETURN_VAL_ERROR                                 ="ERROR";
    public static final String RETURN_VAL_WARN                                  ="WARN";
    public static final String RETURN_VAL_WARN_ONE                              ="WARNONE";
    public static final String RETURN_VAL_WARN_TWO                              ="WARNTWO";
    public static final String RETURN_VAL_WARN_THREE                            ="WARNTHREE";
    public static final String RETURN_VAL_WARN_FOUR                             ="WARNFOUR";
    public static final String RETURN_VAL_WARN_FIVE                             ="WARNFIVE";
    public static final String RETURN_VAL_WARN_SIX                             	="WARNSIX";
    public static final String RETURN_VAL_WARN_SEVEN                            ="WARNSEVEN";
    public static final String RETURN_VAL_WARN_EIGHT                            ="WARNEIGHT";
    /******************************************************/
    /*                       常用字符                                                                       */
    /******************************************************/
    public static final String CHAR_SPACE                                       = " ";
    public static final String BLANK                                            = " ";
    public static final String CHAR_BLANK                                       = "";
    public static final String CHAR_COMMA                                       = ",";
    public static final String CHAR_BAR                                         = "-";
    public static final String CHAR_UNDERSCORE                                  = "_";
    public static final String CHAR_ASTERISK                                    = "*";
    public static final String CHAR_PERCENT                                     = "%";
    public static final String CHAR_VERTICAL_DIVIDE                             = "|";
    public static final String CHAR_AND                                         = "&&";
    public static final String CHAR_SPLIT_POINT                                 = "\\.";
    public static final String CHAR_STRING_ZERO                                 = "0";
    public static final String CHAR_STRING_ONE                                  = "1";
    public static final String CHAR_STRING_TWO                                  = "2";
    public static final String SUPER_USER_CODE                                  ="system";
    public static final String MESSAGE_TITLE                                  	="您好";
	public static final String ZERO                                             = "0";
	public static final String FALSE                                            = "false";
	public static final String TRUE                                             = "true";
	
	public static final Integer CHAR_INT_ZERO                                   = 0;
	public static final double DOUBLE_INT_ZERO                                  = 0.00;
	public static final double DOUBLE_INT_MAX                                   = 99999999.00;
	public static final Integer CHAR_INT_ONE                                 	= 1;
	public static final Integer CHAR_INT_TWO                                 	= 2;
	public static final Integer CHAR_INT_EIGHT                                 	= 8;
	
	/** 
     * 将List<String> 转字符串
     * @return 以逗号相隔的字符串
     */  
    public static String listToString(List<String> stringList){
        if (stringList==null) {
            return null;
        }
        StringBuilder result=new StringBuilder();
        boolean flag=false;
        for (String string : stringList) {
            if (flag) {
                result.append(",");
            }else {
                flag=true;
            }
            result.append(string);
        }
        return result.toString();
    }
}
