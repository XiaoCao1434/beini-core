package com.beini.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 商品规格表
 * 
 * @author lb_chen
 * @Date 2018-04-08 10:00
 * @Order 2
 */
@Entity
@Table(comment="商品规格表", appliesTo = "product_specification")
public class ProductSpecification implements Serializable {
	private static final long serialVersionUID = -5185796108713544852L;
	/**
	 * 规格uuid
	 */
	@Id
	@Column(columnDefinition = "varchar(255) COMMENT '规格uuid'")
	private String proSpeUuid;
	/**
	 * 商品自动编码
	 */
	@Column(columnDefinition="varchar(255) COMMENT '商品自动编码'")
	private String proUuid;
	/**
	 * 规格的值表达方式<br>
	 * eg：<br>
	 * [1:1,2:3]
	 */
	@Column(columnDefinition="varchar(255) COMMENT '规格的值表达方式：如[1:1,2:3]'")
	private String speVal;
	/**
	 * 价格
	 */
	@Column(columnDefinition="double COMMENT '价格'")
	private double price;
	/**
	 * 规格库存
	 */
	@Column(columnDefinition="int(11) COMMENT '规格库存'")
	private int stock;
	/**
	 * 销量
	 */
	@Column(columnDefinition="int(11) COMMENT '销量'")
	private int proSpeSaleCount;
	
	public String getProSpeUuid() {
		return proSpeUuid;
	}

	public void setProSpeUuid(String proSpeUuid) {
		this.proSpeUuid = proSpeUuid;
	}

	public String getProUuid() {
		return proUuid;
	}

	public void setProUuid(String proUuid) {
		this.proUuid = proUuid;
	}

	public String getSpeVal() {
		return speVal;
	}

	public void setSpeVal(String speVal) {
		this.speVal = speVal;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getProSpeSaleCount() {
		return proSpeSaleCount;
	}

	public void setProSpeSaleCount(int proSpeSaleCount) {
		this.proSpeSaleCount = proSpeSaleCount;
	}

}
