package com.beini.authorization.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuInfo extends BaseInfo {
	private int menuId;
	/**
	 * 菜单名称
	 */
	private String menuName;
	/**
	 * 菜单url
	 */
	private String menuUrl;
	/**
	 * 父类Id
	 */
	private int parentId;
	/**
	 * 排序号
	 */
	private int orderNum;
	/**
	 * 0模块1菜单2按钮
	 */
	private int type;
	/**
	 * 菜单引文名
	 */
	private String menuNameEn;
	/**
	 * 菜单图片
	 */
	private String menuImage;
	/**
	 * 菜单颜色
	 */
	private String menuColor;
	/**
	 * win8菜单
	 */
	private String menuWin8Image;
}
