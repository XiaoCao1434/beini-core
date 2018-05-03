package com.beini.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 商品品牌表
 * 
 * @author lb_chen
 * @Date 2018-04-08 10:15
 * @Order 1
 */
@Entity
@Table(comment="商品品牌表", appliesTo = "product_brand")
public class ProductBrand implements Serializable {
	private static final long serialVersionUID = -4465600652849531408L;
	/**
	 * 自动编码
	 */
	@Id
	@Column(columnDefinition="varchar(255) COMMENT '自动编码'")
	private String pbUuid;
	/**
	 * 商品类别编号<br>
	 * 商品品牌归属于商品类别
	 */
	@Column(columnDefinition="varchar(255) COMMENT '商品类别编号:商品品牌归属于商品类别'")
	private String pcUuid;
	/**
	 * 品牌名称
	 */
	@Column(columnDefinition="varchar(255) COMMENT '品牌名称'")
	private String name;
	/**
	 * 图片(URL)
	 */
	@Column(columnDefinition="varchar(255) COMMENT '图片(URL)'")
	private String imageUrl;
	/**
	 * 排列次序
	 */
	@Column(columnDefinition="int(11) COMMENT '排列次序'")
	private int orderIndex;
	/**
	 * 品牌状态<br>
	 * <ul>
	 * <li>0--冻结</li>
	 * <li>1--正常</li>
	 * </ul>
	 */
	@Column(columnDefinition="int(11) COMMENT '品牌状态:0-冻结,1-正常'")
	private int status;
	
	public ProductBrand() {
	}

	public String getPbUuid() {
		return pbUuid;
	}

	public void setPbUuid(String pbUuid) {
		this.pbUuid = pbUuid;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
