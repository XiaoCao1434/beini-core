package com.beini.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 商品相册表
 * 
 * @author lb_chen
 * @Date 2018-04-08 10:43
 * @Order 1
 */
@Entity
@Table(comment="商品相册表", appliesTo = "product_image")
public class ProductImage implements Serializable {
	private static final long serialVersionUID = -1211870709171435314L;
	/**
	 * 表ID
	 */
	@Id
	@Column(columnDefinition="int(11) COMMENT '表ID'")
	private Integer id;
	/**
	 * 类型
	 * <ul>
	 * <li>0--商品</li>
	 * <li>1--商品下的规格</li>
	 * </ul>
	 */
	@Column(columnDefinition="int(11) COMMENT '类型：0-商品，1-商品下的规格'")
	private int type;
	/**
	 * 图片(URL)
	 */
	@Column(columnDefinition="varchar(255) COMMENT '图片(URL)'")
	private String imageUrl;
	/**
	 * 图片名称
	 */
	@Column(columnDefinition="varchar(255) COMMENT '图片名称'")
	private String imageName;
	/**
	 * 0为主图
	 */
	@Column(columnDefinition="int(11) COMMENT '0为主图'")
	private int orderIndex;
	/**
	 * proUuid或者是proSpeUuid
	 */
	@Column(columnDefinition="varchar(255) COMMENT 'proUuid或者是proSpeUuid'")
	private String code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public int getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
