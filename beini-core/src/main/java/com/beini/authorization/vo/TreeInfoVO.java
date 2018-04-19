package com.beini.authorization.vo;

import lombok.Data;

@Data
public class TreeInfoVO {
	private int id;
	private int pId;
	private String cUrl;
	private String name;
	private int treeType;
	private int orderNum;
	private boolean isOpen;
	private boolean checked=false;
	private boolean isParent;
}