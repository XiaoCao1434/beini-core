package com.beini.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 商品表
 * 
 * @author lb_chen
 * @Date 2018-04-08 09:40
 * @Order 1
 */
@Entity
@Table(comment="商品表", appliesTo = "product")
public class Product implements Serializable {
	private static final long serialVersionUID = -9174921440717628334L;
	/**
	 * 自动编码
	 */
	@Id
	@Column(columnDefinition="varchar(255) COMMENT '自动编码'")
	private String proUuid;
	/**
	 * 商品型号
	 */
	@Column(columnDefinition="varchar(255) COMMENT '商品型号'")
	private String proMarque;
	/**
	 * 类别编号
	 */
	@Column(columnDefinition="varchar(255) COMMENT '类别编号'")
	private String pcUuid;
	/**
	 * 品牌编号
	 */
	@Column(columnDefinition="varchar(255) COMMENT '品牌编号'")
	private String pbUuid;
	/**
	 * 最低商品价格
	 */
	@Column(columnDefinition="double COMMENT '最低商品价格'")
	private double minPrice;
	/**
	 * 最高商品价格
	 */
	@Column(columnDefinition="double COMMENT '最高商品价格'")
	private double maxPrice;
	/**
	 * 商品总库存
	 */
	@Column(columnDefinition="double COMMENT '商品总库存'")
	private double stock;
	/**
	 * 告警库存
	 */
	@Column(columnDefinition="int(11) COMMENT '告警库存'")
	private int warningStock;
	/**
	 * 商品积分
	 */
	@Column(columnDefinition="int(11) COMMENT '商品积分'")
	private int inregral;
	/**
	 * 商品图片
	 */
	@Column(columnDefinition="varchar(255) COMMENT '商品图片'")
	private String pictureUrl;
	/**
	 * 状态<br>
	 * <ul>
	 * <li>0--上架</li>
	 * <li>1--下架</li>
	 * <li>2--预售</li>
	 * </ul>
	 */
	@Column(columnDefinition="int(11) COMMENT '状态:0-上架，1-下架，2-预售'")
	private int status;

	
	public String getProUuid() {
		return proUuid;
	}

	public void setProUuid(String proUuid) {
		this.proUuid = proUuid;
	}

	public String getProMarque() {
		return proMarque;
	}

	public void setProMarque(String proMarque) {
		this.proMarque = proMarque;
	}

	public String getPcUuid() {
		return pcUuid;
	}

	public void setPcUuid(String pcUuid) {
		this.pcUuid = pcUuid;
	}

	public String getPbUuid() {
		return pbUuid;
	}

	public void setPbUuid(String pbUuid) {
		this.pbUuid = pbUuid;
	}

	public double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double d) {
		this.stock = d;
	}

	public int getWarningStock() {
		return warningStock;
	}

	public void setWarningStock(int warningStock) {
		this.warningStock = warningStock;
	}

	public int getInregral() {
		return inregral;
	}

	public void setInregral(int inregral) {
		this.inregral = inregral;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Product [proUuid=" + proUuid + ", proMarque=" + proMarque + ", pcUuid=" + pcUuid + ", pbUuid=" + pbUuid
				+ ", minPrice=" + minPrice + ", maxPrice=" + maxPrice + ", stock=" + stock + ", warningStock="
				+ warningStock + ", inregral=" + inregral + ", pictureUrl=" + pictureUrl + ", status=" + status + "]";
	}
}
