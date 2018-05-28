package com.beini.order.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 订单退货表
 * 
 * @author lb_chen
 * @Date 2018-04-08 11:00
 * @Order 20
 */
@Entity
@Table(comment="订单退货表", appliesTo = "order_returns")
public class OrderReturns implements Serializable {
	private static final long serialVersionUID = 4338302366275237613L;
	/**
	 * 退货单编码，供给客户查询
	 */
	@Id
	@Column(columnDefinition = "varchar(255) COMMENT '退货单编码，供给客户查询'")
	private String orderReturnsUuid;
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
	 * 物流单号
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '物流单号'")
	private String expressNo;
	/**
	 * 收货人姓名
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '收货人姓名'")
	private String consigneeRealname;
	/**
	 * 收货人电话
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '收货人电话'")
	private String consigneeTelphone;
	/**
	 * 收货人备用电话
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '收货人备用电话'")
	private String consigneeTelphone2;
	/**
	 * 收货地址
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '收货地址'")
	private String consigneeAddress;
	/**
	 * 邮政编码
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '邮政编码'")
	private String consigneeZip;
	/**
	 * 退货类型：<br>
	 * 全部退单、部分退单
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '退货类型:全部退单、部分退单'")
	private String returnsType;
	/**
	 * 退货处理方式：<br>
	 * <ul>
	 * <li>UPAWAY--退货入库</li>
	 * <li>REDELIVERY--重新发货</li>
	 * <li>RECLAIM-REDELIVERY--不要求归还并重新发货</li>
	 * <li>REFUND--退款</li>
	 * <li>COMPENSATION--不退货并赔偿</li>
	 * </ul>
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '退货处理方式：UPAWAY-退货入库，REDELIVERY-重新发货，RECLAIM-REDELIVERY-不要求归还并重新发货，REFUND--退款，COMPENSATION--不退货并赔偿'")
	private String handlingWay;
	/**
	 * 退款金额
	 */
	@Column(columnDefinition = "double COMMENT '退款金额'")
	private double returnsAmount;
	/**
	 * 退货销货员承担的费用
	 */
	@Column(columnDefinition = "double COMMENT '退货销货员承担的费用'")
	private double sellerPunishFee;
	/**
	 * 退货申请时间
	 */
	@Column(columnDefinition = "datetime COMMENT '退货申请时间'")
	private Date returnSubmitTime;
	/**
	 * 退货处理时间
	 */
	@Column(columnDefinition = "datetime COMMENT '退货处理时间'")
	private Date handlingTime;
	/**
	 * 退货原因分类
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '退货原因分类'")
	private String returnClass;
	/**
	 * 退货原因
	 */
	@Column(columnDefinition = "varchar(255) COMMENT '退货原因'")
	private String returnCase;

	public String getOrderReturnsUuid() {
		return orderReturnsUuid;
	}

	public void setOrderReturnsUuid(String orderReturnsUuid) {
		this.orderReturnsUuid = orderReturnsUuid;
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

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public String getConsigneeRealname() {
		return consigneeRealname;
	}

	public void setConsigneeRealname(String consigneeRealname) {
		this.consigneeRealname = consigneeRealname;
	}

	public String getConsigneeTelphone() {
		return consigneeTelphone;
	}

	public void setConsigneeTelphone(String consigneeTelphone) {
		this.consigneeTelphone = consigneeTelphone;
	}

	public String getConsigneeTelphone2() {
		return consigneeTelphone2;
	}

	public void setConsigneeTelphone2(String consigneeTelphone2) {
		this.consigneeTelphone2 = consigneeTelphone2;
	}

	public String getConsigneeAddress() {
		return consigneeAddress;
	}

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	public String getConsigneeZip() {
		return consigneeZip;
	}

	public void setConsigneeZip(String consigneeZip) {
		this.consigneeZip = consigneeZip;
	}

	public String getReturnsType() {
		return returnsType;
	}

	public void setReturnsType(String returnsType) {
		this.returnsType = returnsType;
	}

	public String getHandlingWay() {
		return handlingWay;
	}

	public void setHandlingWay(String handlingWay) {
		this.handlingWay = handlingWay;
	}

	public double getReturnsAmount() {
		return returnsAmount;
	}

	public void setReturnsAmount(double returnsAmount) {
		this.returnsAmount = returnsAmount;
	}

	public double getSellerPunishFee() {
		return sellerPunishFee;
	}

	public void setSellerPunishFee(double sellerPunishFee) {
		this.sellerPunishFee = sellerPunishFee;
	}

	public Date getReturnSubmitTime() {
		return returnSubmitTime;
	}

	public void setReturnSubmitTime(Date returnSubmitTime) {
		this.returnSubmitTime = returnSubmitTime;
	}

	public Date getHandlingTime() {
		return handlingTime;
	}

	public void setHandlingTime(Date handlingTime) {
		this.handlingTime = handlingTime;
	}

	public String getReturnClass() {
		return returnClass;
	}

	public void setReturnClass(String returnClass) {
		this.returnClass = returnClass;
	}

	public String getReturnCase() {
		return returnCase;
	}

	public void setReturnCase(String returnCase) {
		this.returnCase = returnCase;
	}

}
