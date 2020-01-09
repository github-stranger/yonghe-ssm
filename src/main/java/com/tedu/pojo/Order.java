package com.tedu.pojo;

import java.util.Date;

/**
 * 订单entity
 * @author Administrator
 *
 */
public class Order {

	private Integer id;  //订单id
	private Integer door_id; //门店id
	private String order_no; //订单编号
	private String order_type; //订单类型(堂食/打包/外卖..)
	private Integer pnum; //用餐人数
	private String cashier; //收银员
	private Date order_time; //下单时间
	private Date pay_time; //支付时间
	private String pay_type; //支付类型(微信支付/支付宝支付)
	private Double price; //支付金额
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDoor_id() {
		return door_id;
	}
	public void setDoor_id(Integer door_id) {
		this.door_id = door_id;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getOrder_type() {
		return order_type;
	}
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}
	public Integer getPnum() {
		return pnum;
	}
	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}
	public String getCashier() {
		return cashier;
	}
	public void setCashier(String cashier) {
		this.cashier = cashier;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}
	public Date getPay_time() {
		return pay_time;
	}
	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", door_id=" + door_id + ", order_no=" + order_no + ", order_type=" + order_type
				+ ", pnum=" + pnum + ", cashier=" + cashier + ", order_time=" + order_time + ", pay_time=" + pay_time
				+ ", pay_type=" + pay_type + ", price=" + price + "]";
	}
	public Order(Integer id, Integer door_id, String order_no, String order_type, Integer pnum, String cashier,
			Date order_time, Date pay_time, String pay_type, Double price) {
		super();
		this.id = id;
		this.door_id = door_id;
		this.order_no = order_no;
		this.order_type = order_type;
		this.pnum = pnum;
		this.cashier = cashier;
		this.order_time = order_time;
		this.pay_time = pay_time;
		this.pay_type = pay_type;
		this.price = price;
	}
	public Order() {
		super();
	}
	
}
