package com.beini.order.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 收货地址表
 * 
 * @author lb_chen
 * @Date 2018-04-08 11:46
 * @Order 20
 */
@ApiModel(value="收货地址信息表",description="收货地址信息表")
@Api
@Entity
@Table(comment="收货地址表", appliesTo = "delivery_address")
public class DeliveryAddress implements Serializable {
	private static final long serialVersionUID = 3577681229089489488L;
	/**
	 * 收货地址编码
	 */
	@ApiModelProperty(value="收货地址编码")
	@Id
	@Column(columnDefinition="varchar(255) COMMENT '收货地址编码'")
	private String deAdUuid;
	/**
	 * 用户编码
	 */
	@ApiModelProperty(value="用户编码")
	@Column(columnDefinition="varchar(255) COMMENT '用户编码'")
	private String openId;
	/**
	 * 收件人姓名
	 */
	@ApiModelProperty(value="收件人姓名")
	@Column(columnDefinition="varchar(255) COMMENT '收件人姓名'")
	private String realName;
	/**
	 * 收件人电话
	 */
	@ApiModelProperty(value="收件人电话")
	@Column(columnDefinition="varchar(255) COMMENT '收件人电话'")
	private String telPhone;
	/**
	 * 收件人备用电话
	 */
	@ApiModelProperty(value="收件人备用电话")
	@Column(columnDefinition="varchar(255) COMMENT '收件人备用电话'")
	private String telPhone2;
	/**
	 * 国家
	 */
	@ApiModelProperty(value="国家")
	@Column(columnDefinition="varchar(255) COMMENT '国家'")
	private String country;
	/**
	 * 省份
	 */
	@ApiModelProperty(value="省份")
	@Column(columnDefinition="varchar(255) COMMENT '省份'")
	private String province;
	/**
	 * 城市
	 */
	@ApiModelProperty(value="城市")
	@Column(columnDefinition="varchar(255) COMMENT '城市'")
	private String city;
	/**
	 * 地区
	 */
	@ApiModelProperty(value="地区")
	@Column(columnDefinition="varchar(255) COMMENT '地区'")
	private String area;
	/**
	 * 街道/详细地址
	 */
	@ApiModelProperty(value="街道/详细地址")
	@Column(columnDefinition="varchar(255) COMMENT '街道/详细地址'")
	private String street;
	/**
	 * 邮政编码
	 */
	@ApiModelProperty(value="邮政编码")
	@Column(columnDefinition="varchar(255) COMMENT '邮政编码'")
	private String zip;
	/**
	 * 是否默认收货地址
	 */
	@ApiModelProperty(value="是否默认收货地址")
	@Column(columnDefinition="char(1) COMMENT '是否默认收货地址'")
	private boolean isDefaultAddress;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value="创建时间")
	@Column(columnDefinition="datetime COMMENT '创建时间'")
	private Date createTime;

	public String getDeAdUuid() {
		return deAdUuid;
	}

	public void setDeAdUuid(String deAdUuid) {
		this.deAdUuid = deAdUuid;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getTelPhone() {
		return telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getTelPhone2() {
		return telPhone2;
	}

	public void setTelPhone2(String telPhone2) {
		this.telPhone2 = telPhone2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public boolean isDefaultAddress() {
		return isDefaultAddress;
	}

	public void setDefaultAddress(boolean isDefaultAddress) {
		this.isDefaultAddress = isDefaultAddress;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
