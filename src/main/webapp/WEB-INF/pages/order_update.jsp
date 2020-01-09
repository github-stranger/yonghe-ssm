<%@ page pageEncoding="utf-8"%>
<%-- 引入JSTL标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<title>修改订单</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<style type="text/css">
	body{ font-family: "微软雅黑"; background-color: #EDEDED; }
	h2{ text-align: center;font-size:26px; }
	table{ margin: 30px auto; text-align: center; border-collapse:collapse; width:50%; }
	td, th{ padding: 5px;font-size:18px;}
	hr{ margin-bottom:20px; border:1px solid #aaa; }
	input,select,textarea{ width:284px; height:30px; background:#EDEDED; border:1px solid #999; text-indent:5px; font-size:18px; }
	input[type='submit']{ width:130px; height:36px; cursor:pointer; border-radius:5px 5px 5px 5px; background:#ddd; }
	select{text-indent:0px;}
	textarea{height:100px;font-size:22px;}
</style>
</head>
<body><!-- body-start  --> 

<h2>修改订单</h2>
<hr/>
<form action="orderUpdate" method="POST">
	<!-- hidden隐藏域,在提交表单时连order.id一起提交 -->
	<input type="hidden" name="id" value="${order.getId() }"/>
	<table border="1">
		<tr>
			<td width="30%">所属门店</td>
			<td>
			<!-- 
				将订单中包含的门店ID(${order.getDoor_id()})和下面每一个option中包含的门店ID进行比较，如果两者相等，就设置当前这个option为默认选中
			 -->
				<select id="doorId" name="door_id">
				<!--  -->
				<c:forEach items="${doorlist }" var="door">
					<option 
					${ order.getDoor_id() ==door.getId() ? "selected='selected'" : ""}
					value="${door.getId() }">${door.getName() }</option>
				</c:forEach>
				<!--  -->
				</select>
			</td>
		</tr>
		<tr>
			<td>订单编号</td>
			<td>
				<input type="text" name="order_no" 
						value="${order.getOrder_no() }"/>
			</td>
		</tr>
		<tr>
			<td>订单类型</td>
			<td>
				<input type="text" name="order_type" 
						value="${order.getOrder_type() }"/>
			</td>
		</tr>
		<tr>
			<td>用餐人数</td>
			<td>
				<input type="text" name="pnum" 
						value="${order.getPnum() }"/>
			</td>
		</tr>
		<tr>
			<td>收银员</td>
			<td>
				<input type="text" name="cashier" 
						value="${order.getCashier() }"/>
			</td>
		</tr>
		<tr>
			<td>下单时间</td>
			<td>
				<input type="text" name="order_time" 
						value='<fmt:formatDate value="${order.getOrder_time() }"
							pattern="yyyy/MM/dd HH:mm:ss" />'/>					
			</td>
		</tr>
		<tr>
			<td>结账时间</td>
			<td>
				<input type="text" name="pay_time" 
						value='<fmt:formatDate value="${order.getPay_time() }"
							pattern="yyyy/MM/dd HH:mm:ss" />'/>					
			</td>
		</tr>
		<tr>
			<td>支付方式</td>
			<td>
				<input type="text" name="pay_type"
						value="${order.getPay_type() }"/>
				
			</td>
		</tr>
		<tr>
			<td>支付金额</td>
			<td>
				<input type="text" name="price"
						value="${order.getPrice() }"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="提 	交"/>
			</td>
		</tr>
	</table>
</form>

</body><!-- body-end  -->
</html>



