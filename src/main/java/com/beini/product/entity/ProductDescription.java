package com.beini.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 商品描述内容表
 * 
 * @author lb_chen
 * @Date 2018-04-08 10:35
 * @Order 1
 */
@Entity
@Table(comment="商品描述内容表", appliesTo = "product_description")
public class ProductDescription implements Serializable {
	private static final long serialVersionUID = -376163989905385882L;
	/**
	 * 表主键
	 */
	@Id
	@Column(columnDefinition="int(11) COMMENT '表主键'")
	private Integer id;
	/**
	 * 商品编码
	 */
	@Column(columnDefinition="varchar(255) COMMENT '商品编码'")
	private String proUuid;
	/**
	 * 商品描述、商品规格、售后保障等
	 */
	@Column(columnDefinition="varchar(255) COMMENT '商品描述、商品规格、售后保障等'")
	private String title;
	/**
	 * eg:<br>
	 * 说明、规格、售后服务
	 */
	@Column(columnDefinition="varchar(255) COMMENT '如：说明、规格、售后服务'")
	private String htmlCode;
	/**
	 * 内容
	 */
	@Column(columnDefinition="varchar(255) COMMENT '内容'")
	private String content;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHtmlCode() {
		return htmlCode;
	}

	public void setHtmlCode(String htmlCode) {
		this.htmlCode = htmlCode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
