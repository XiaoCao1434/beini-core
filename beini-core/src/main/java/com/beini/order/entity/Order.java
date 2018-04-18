package com.beini.order.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

/**
 * 订单表
 * 
 * @author lb_chen
 * @Date 2018-04-08 11:25
 * @Order 20
 */
@Entity(name="`order`")
@Table(comment="订单表", appliesTo = "`order`")
public class Order implements Serializable {
	private static final long serialVersionUID = -376163985882L;
	/**
	 * orderUuid 唯一值，供客户查询
	 */
	@Id
	@Column(columnDefinition="varchar(255) COMMENT 'orderUuid 唯一值，供客户查询'")
	private String orderUuid;
	/**
	 * 店铺编码，暂时为空
	 */
	@Column(columnDefinition="varchar(255) COMMENT '店铺编码，暂时为空'")
	private String shopUuid;
	/**
	 * 客户ID
	 */
	@Column(columnDefinition="varchar(255) COMMENT '客户ID'")
	private String openId;
	/**
	 * 订单状态 orderStatus
	 * <ul>
	 * <li>0--未付款</li>
	 * <li>1--已付款</li>
	 * <li>2--已发货</li>
	 * <li>3--已签收</li>
	 * <li>4--退货申请</li>
	 * <li>5--退货中</li>
	 * <li>6--已退货</li>
	 * <li>7--取消交易</li>
	 * </ul>
	 */
	@Column(columnDefinition="int(11) COMMENT '订单状态:0-未付款，1-已付款，2-已发货，3-已签收，4-退货申请，5-退货中，6-已退货，7-取消交易'")
	private int orderStatus;
	/**
	 * 商品总价
	 */
	@Column(columnDefinition="double COMMENT '商品总价'")
	private double productAmountTotal;
	/**
	 * 订单金额：实际付款金额
	 */
	@Column(columnDefinition="double COMMENT '订单金额：实际付款金额'")
	private double orderAmountTotal;
	/**
	 * 运费金额
	 */
	@Column(columnDefinition="double COMMENT '运费金额'")
	private double logisticsFee;
	/**
	 * 收货地址编号
	 */
	@Column(columnDefinition="varchar(255) COMMENT '收货地址编号'")
	private String deAdUuid;
	/**
	 * 订单物流表自动编号
	 */
	@Column(columnDefinition="varchar(255) COMMENT '订单物流表自动编号'")
	private String orderlogisticsNo;
	/**
	 * 订单支付渠道 <br>
	 * 前期主要以微信为主
	 */
	@Column(columnDefinition="varchar(255) COMMENT ' 订单支付渠道,前期主要以微信为主'")
	private String payChannel;
	/**
	 * 订单支付单号，第三方支付流水号
	 */
	@Column(columnDefinition="varchar(255) COMMENT '订单支付单号，第三方支付流水号'")
	private String outTradeNo;
	/**
	 * 创建时间或下单时间
	 */
	@Column(columnDefinition="datetime COMMENT '创建时间或下单时间'")
	private Date createTime;
	/**
	 * 发货时间
	 */
	@Column(columnDefinition="datetime COMMENT '发货时间'")
	private Date sendTime;
	
	public String getOrderUuid() {
		return orderUuid;
	}

	public void setOrderUuid(String orderUuid) {
		this.orderUuid = orderUuid;
	}

	public String getShopUuid() {
		return shopUuid;
	}

	public void setShopUuid(String shopUuid) {
		this.shopUuid = shopUuid;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public double getProductAmountTotal() {
		return productAmountTotal;
	}

	public void setProductAmountTotal(double productAmountTotal) {
		this.productAmountTotal = productAmountTotal;
	}

	public double getOrderAmountTotal() {
		return orderAmountTotal;
	}

	public void setOrderAmountTotal(double orderAmountTotal) {
		this.orderAmountTotal = orderAmountTotal;
	}

	public double getLogisticsFee() {
		return logisticsFee;
	}

	public void setLogisticsFee(double logisticsFee) {
		this.logisticsFee = logisticsFee;
	}

	public String getDeAdUuid() {
		return deAdUuid;
	}

	public void setDeAdUuid(String deAdUuid) {
		this.deAdUuid = deAdUuid;
	}

	public String getOrderlogisticsNo() {
		return orderlogisticsNo;
	}

	public void setOrderlogisticsNo(String orderlogisticsNo) {
		this.orderlogisticsNo = orderlogisticsNo;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

}
