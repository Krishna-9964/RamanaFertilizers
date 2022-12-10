
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="DBConnect.dbconnect.*" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title>Insert title here</title>
    <style>
        .invoice-title h2, .invoice-title h3 {
    display: inline-block;
}

.table > tbody > tr > .no-line {
    border-top: none;
}

.table > thead > tr > .no-line {
    border-bottom: none;
}

.table > tbody > tr > .thick-line {
    border-top: 2px solid;
}
    </style>
</head>
<body>
<%@ include file="header.html"%>
<%

long millis=System.currentTimeMillis();  
// creating a new object of the class Date  
Date date = new Date(millis);
// Reading the list of fertilizers and quantity as a string
String fert = request.getParameter("fertilizers").trim();
String qty = request.getParameter("quantity").trim();
//qty = qty.trim();
String price = request.getParameter("price").trim();
//Spilt the Strings
String[] f = fert.split(" ",0);
String[] q = qty.split(" ",0);
String[] p = price.split(" ",0);
float sum=0;
for(int i=0;i<f.length;i++)
{
	sum = sum + Integer.parseInt(q[i])*Float.parseFloat(p[i]);
	DBConnect.dbconnect.addSells(f[i],Integer.parseInt(q[i]),Float.parseFloat(p[i]));
}
String c_name = request.getParameter("c_name");
ResultSet rs = DBConnect.dbconnect.addTransaction(c_name, sum);
rs.next();
%>
<div class="container">
    <div class="row">
        <div class="col-xs-12">
    		<div class="invoice-title">
    			<h2>Invoice</h2><h3 class="pull-right">Transaction# RMNF<%=rs.getInt("tid") %></h3>
    		</div>
    		<hr>
    		<div class="row">
    			<div class="col-xs-6">
    				<address>
    				<strong>Billed To:</strong><br>
    					<%=c_name %><br>
    				</address>
    			</div>
    		</div>
    		<div class="row">
    			<div class="col-xs-6">
    				<address>
    					<strong>Payment Method:</strong><br>
    					Cash<br>
    				</address>
    			</div>
    			<div class="col-xs-6 text-right">
    				<address>
    					<strong>Order Date:</strong><br>
    					<%=date %><br><br>
    				</address>
    			</div>
    		</div>
    	</div>
    </div>
    
    <div class="row">
    	<div class="col-md-12">
    		<div class="panel panel-default">
    			<div class="panel-heading">
    				<h3 class="panel-title"><strong>Order summary</strong></h3>
    			</div>
    			<div class="panel-body">
    				<div class="table-responsive">
    					<table class="table table-condensed">
    						<thead>
                                <tr>
        							<td><strong>Item</strong></td>
        							<td class="text-center"><strong>Price</strong></td>
        							<td class="text-center"><strong>Quantity</strong></td>
        							<td class="text-right"><strong>Totals</strong></td>
                                </tr>
    						</thead>
    						<tbody>
    							<!-- foreach ($order->lineItems as $line) or some such thing here -->
    							<% 
    							for(int i=0;i<f.length;i++)
    							{%>
    							<tr>
    								<td><%=f[i] %></td>
    								<td class="text-center"><%=p[i]%></td>
    								<td class="text-center"><%=q[i]%></td>
    								<td class="text-right"><%=Math.round(Integer.parseInt(q[i])*Float.parseFloat(p[i]))%></td>
    							</tr>
    							<%} %>
                                <tr>
    								<td class="thick-line"></td>
    								<td class="thick-line"></td>
    								<td class="thick-line text-center"><strong>Subtotal</strong></td>
    								<td class="thick-line text-right"><%=sum %></td>
    							</tr>
    							<tr>
    								<td class="no-line"></td>
    								<td class="no-line"></td>
    								<td class="no-line text-center"><strong>CGST(9%)</strong></td>
    								<td class="no-line text-right"><%=Math.round(sum*0.08) %></td>
    							</tr>
                                <tr>
    								<td class="no-line"></td>
    								<td class="no-line"></td>
    								<td class="no-line text-center"><strong>SGST(9%)</strong></td>
    								<td class="no-line text-right"><%=Math.round(sum*0.08) %></td>
    							</tr>
    							<tr>
    								<td class="no-line"></td>
    								<td class="no-line"></td>
    								<td class="no-line text-center"><strong>Total</strong></td>
    								<td class="no-line text-right"><%=Math.round(sum+(sum*0.18)) %></td>
    							</tr>
    						</tbody>
    					</table>
    				</div>
    			</div>
    		</div>
    	</div>
    </div>
</div>
<center><input type="button" value="Print" class="btn btn-success" onclick="Print()" id="Print"></center>
<script>
function Print()
{
	window.print();
}
</script> 
</body>
</html>