package com.beini.core.entity.product;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 商品与属性关联表
 * 
 * @author lb_chen
 * @Date 2018-04-08 10:30
 * @Order 1
 */
@Entity
@Table(comment="商品与属性关联表", appliesTo = "product_and_attribute")
public class ProductAndAttribute implements Serializable {
	private static final long serialVersionUID = 3467959782827852971L;
	/**
	 * 表ID
	 */
	@Id
	@Column(columnDefinition="int(11) COMMENT '表ID'")
	private Integer id;
	/**
	 * 商品编号
	 */
	@Column(columnDefinition="varchar(255) COMMENT '商品编号'")
	private String proUuid;
	/**
	 * 属性编码
	 */
	@Column(columnDefinition="varchar(255) COMMENT '属性编码'")
	private String paUuid;
	/**
	 * 属性值
	 */
	@Column(columnDefinition="varchar(255) COMMENT '属性值'")
	private String paVal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProUuid() {
		return proUuid;
	}

	public void setProUuid(String proUuid) {
		this.proUuid = proUuid;
	}

	public String getPaUuid() {
		return paUuid;
	}

	public void setPaUuid(String paUuid) {
		this.paUuid = paUuid;
	}

	public String getPaVal() {
		return paVal;
	}

	public void setPaVal(String paVal) {
		this.paVal = paVal;
	}

}
