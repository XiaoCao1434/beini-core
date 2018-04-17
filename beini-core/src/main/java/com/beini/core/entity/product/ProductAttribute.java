package com.beini.core.entity.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 属性名表
 * 
 * @author lb_chen
 * @Date 2018-04-08 10:20
 * @Order 1
 */
@Entity
@Table(comment="属性名表", appliesTo = "product_attribute")
public class ProductAttribute implements Serializable {
	private static final long serialVersionUID = -7937955622078036131L;
	/**
	 * 自动编号
	 */
	@Id
	@Column(columnDefinition="varchar(255) COMMENT '自动编号'")
	private String paUuid;
	/**
	 * 商品类别编号
	 */
	@Column(columnDefinition="varchar(255) COMMENT '商品类别编号'")
	private String pcUuid;
	/**
	 * 属性名
	 */
	@Column(columnDefinition="varchar(255) COMMENT '属性名'")
	private String name;
	/**
	 * 状态
	 */
	@Column(columnDefinition="int(11) COMMENT '状态'")
	private int status;
	/**
	 * 排列次序
	 */
	@Column(columnDefinition="int(11) COMMENT '排列次序'")
	private int orderIndex;
	/**
	 * 父类属性，根节点为0
	 */
	@Column(columnDefinition="varchar(255) COMMENT '父类属性，根节点为0'")
	private String paPuuid;
	
	public String getPaUuid() {
		return paUuid;
	}

	public void setPaUuid(String paUuid) {
		this.paUuid = paUuid;
	}

	public String getPcUuid() {
		return pcUuid;
	}

	public void setPcUuid(String pcUuid) {
		this.pcUuid = pcUuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	public String getPaPuuid() {
		return paPuuid;
	}

	public void setPaPuuid(String paPuuid) {
		this.paPuuid = paPuuid;
	}

}
