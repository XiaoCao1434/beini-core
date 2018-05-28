package com.beini.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;
import org.hibernate.annotations.Type;

/**
 * 商品类别表
 * 
 * @author lb_chen
 * @Date 2018-04-08 10:10
 * @Order 1
 */
@Entity
@Table(comment="商品类别表", appliesTo = "product_category")
public class ProductCategory implements Serializable {
	private static final long serialVersionUID = -8256685455289054950L;
	/**
	 * 自动编号
	 */
	@Id
	@Column(columnDefinition="varchar(255) COMMENT '自动编号'")
	private String pcUuid;
	/**
	 * 类别名称
	 */
	@Column(columnDefinition="varchar(255) COMMENT '类别名称'")
	private String pcName;
	/**
	 * 父编号根节点，默认0
	 */
	@Column(columnDefinition="varchar(255) COMMENT '父编号根节点，默认0'")
	private String pcPpuid;
	/**
	 * 包含的商品数量
	 */
	@Column(columnDefinition="int(11) COMMENT '包含的商品数量'")
	private int productCount;
	/**
	 * 是否锁定
	 */
	@Column(name = "is_lock",columnDefinition="char(1) COMMENT '是否锁定'")
	@Type(type="yes_no")
	private boolean isLock;
	/**
	 * 封面图片(URL)
	 */
	@Column(columnDefinition="varchar(255) COMMENT '封面图片(URL)'")
	private String imageUrl;
	/**
	 * 排列次序
	 */
	@Column(columnDefinition="int(11) COMMENT '排列次序'")
	private int orderIndex;
	/**
	 * 品类状态<br>
	 * <ul>
	 * <li>0--冻结</li>
	 * <li>1--正常</li>
	 * </ul>
	 */
	@Column(columnDefinition="int(11) COMMENT '品类状态:0-冻结,1-正常'")
	private int status;

	public String getPcUuid() {
		return pcUuid;
	}

	public void setPcUuid(String pcUuid) {
		this.pcUuid = pcUuid;
	}

	public String getPcName() {
		return pcName;
	}

	public void setPcName(String pcName) {
		this.pcName = pcName;
	}

	public String getPcPpuid() {
		return pcPpuid;
	}

	public void setPcPpuid(String pcPpuid) {
		this.pcPpuid = pcPpuid;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	
	public boolean isLock() {
		return isLock;
	}

	public void setLock(boolean isLock) {
		this.isLock = isLock;
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
