package com.beini.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 商品统计表
 * 
 * @author lb_chen
 * @Date 2018-04-08 10:40
 * @Order 1
 */
@Entity
@Table(comment = "商品统计表", appliesTo = "product_statistics")
public class ProductStatistics implements Serializable {
	private static final long serialVersionUID = -8399169576576184565L;
	/**
	 * 表主键
	 */
	@Id
	@Column(columnDefinition = "int(11) COMMENT '表主键'")
	private Integer id;
	/**
	 * 商品编码
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '商品编码'")
	private String proUuid;
	/**
	 * 浏览次数
	 */
	@Column(columnDefinition = "int(11) COMMENT '浏览次数'")
	private int visitCount;
	/**
	 * 评论次数
	 */
	@Column(columnDefinition = "int(11) COMMENT '评论次数'")
	private int replyCount;
	/**
	 * 销售总量
	 */
	@Column(columnDefinition = "int(11) COMMENT '销售总量'")
	private int saleQuantity;
	/**
	 * 销售总额
	 */
	@Column(columnDefinition = "double COMMENT '销售总额'")
	private double saleAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProUuid() {
		return proUuid;
	}

	public void setProUuid(String proUuid) {
		this.proUuid = proUuid;
	}

	public int getVisitCount() {
		return visitCount;
	}

	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}

	public int getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}

	public int getSaleQuantity() {
		return saleQuantity;
	}

	public void setSaleQuantity(int saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public double getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(double saleAmount) {
		this.saleAmount = saleAmount;
	}

}
