package com.beini.order.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 订单明细表
 * 
 * @author lb_chen
 * @Date 2018-04-08 11:16
 * @Order 20
 */
@Entity
@Table(comment = "订单明细表", appliesTo = "order_detail")
public class OrderDetail implements Serializable {
	private static final long serialVersionUID = 4151605565345266219L;
	/**
	 * 订单明细编码
	 */
	@Id
	@Column(columnDefinition = "varchar(255) COMMENT '订单明细编码'")
	private String orderDetailUuid;
	/**
	 * orderNo 订单编码
	 */
	@Column(columnDefinition = "varchar(255) COMMENT 'orderNo 订单编码'")
	private String orderUuid;
	/**
	 * 商品编码
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '商品编码'")
	private String proUuid;
	/**
	 * 商品价格，商品可能删除，所以这里要记录
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '商品价格，商品可能删除，所以这里要记录'")
	private double productPrice;
	/**
	 * 商品信号信息，记录详细商品型号<br>
	 * 如 颜色、规格、包装等
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '商品信号信息，记录详细商品型号：如 颜色、规格、包装等'")
	private String productModeDesc;
	/**
	 * 商品型号参数<br>
	 * JSON格式<br>
	 * 记录单位编号、颜色编号、规格编号等
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '商品型号参数(JSON格式) 记录单位编号、颜色编号、规格编号等'")
	private String productModeParams;
	/**
	 * 打几折
	 */
	@Column(columnDefinition = "double COMMENT '打几折'")
	private double discountRate;
	/**
	 * 折扣金额
	 */
	@Column(columnDefinition = "double COMMENT '折扣金额'")
	private double discountAmount;
	/**
	 * 购买数量
	 */
	@Column(columnDefinition = "int(11) COMMENT '购买数量'")
	private int number;
	/**
	 * 客户商品备注
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '客户商品备注'")
	private String remark;

	public String getOrderDetailUuid() {
		return orderDetailUuid;
	}

	public void setOrderDetailUuid(String orderDetailUuid) {
		this.orderDetailUuid = orderDetailUuid;
	}

	public String getOrderUuid() {
		return orderUuid;
	}

	public void setOrderUuid(String orderUuid) {
		this.orderUuid = orderUuid;
	}

	public String getProUuid() {
		return proUuid;
	}

	public void setProUuid(String proUuid) {
		this.proUuid = proUuid;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductModeDesc() {
		return productModeDesc;
	}

	public void setProductModeDesc(String productModeDesc) {
		this.productModeDesc = productModeDesc;
	}

	public String getProductModeParams() {
		return productModeParams;
	}

	public void setProductModeParams(String productModeParams) {
		this.productModeParams = productModeParams;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
