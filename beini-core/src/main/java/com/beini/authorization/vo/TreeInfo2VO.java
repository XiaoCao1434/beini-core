package com.beini.authorization.vo;

import lombok.Data;

@Data
public class TreeInfo2VO {
	private String id;
	private String pId;
	private String cUrl;
	private String name;
	private int treeType;
	private int orderNum;
	private boolean isOpen;
	private boolean checked=false;
	/**
	 * 决定是否让此节点成为ZTree的文件夹
	 **/
	private boolean isParent;

	@Override
	public String toString() {
		return "TreeInfo2VO [id=" + id + ", pId=" + pId + ", cUrl=" + cUrl
				+ ", name=" + name + ", treeType=" + treeType + ", orderNum="
				+ orderNum + ", isOpen=" + isOpen + ", checked=" + checked
				+ ", isParent=" + isParent + "]";
	}
	
}