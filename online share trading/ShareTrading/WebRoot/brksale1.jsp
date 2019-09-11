<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <base href="<%=basePath%>">
    <meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>biz solution</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>

<script type="text/javascript">
       function f(){
       var x12=document.forms["m"]["acshare"].value;
        if(x12=="") {
         alert("Error: Actual Share cannot be blank! So U can not Sell");
          document.forms["m"]["acshare"].focus();
           return false; 
          } 
          var x12=document.forms["m"]["acshare"].value;
        if(x12==0) {
         alert("Error: Actual Share cannot be blank! So U can not Sell");
          document.forms["m"]["acshare"].focus();
           return false; 
          } 
          return true;
          </script>
  </head>
  
  <body>
   <div class="main">
  <div class="header">
    <div class="logo">
      <h1><font size="6"><span>Portfolio Management</span></font><small></small></h1>
    </div>
    <div class="menu_nav">
      <ul>
        <li class="active"><a href="user.jsp">Home</a></li>
      
        <li><a href="about.jsp">About Us</a></li>
        
        <li><a href="contact.jsp">Contact Us</a></li>
      </ul>
      <div class="clr"></div>
    </div>
    <div class="clr"></div>
    <div class="hbg"><img src="images/header_images.jpg" width="653" height="271" alt="" />
      <div class="text">
        <h3>Creating Futures</h3>
      </div>
    </div>
  </div>
  <div class="content">
    <div class="content_bg">
      <div class="mainbar">
        <div class="article">
          <h2><span></span></h2>
          <div class="clr"></div>
          <p class="post-data">&nbsp;<span class="date"></span>   </p>
          <br>
          <table>
          <s:form action="saleprocessed" name="m" onsubmit="return f()">
          <tr><td><s:hidden name="userid"/></td></tr>
          <tr><td><s:hidden name="cid"></s:hidden></td></tr>
          <tr><td><s:hidden name="broker_id"/></td></tr>
          <tr><td><s:hidden name="broamount"></s:hidden></td></tr>
           <tr><td><s:hidden name="brkaccno"/></td></tr>
           <tr><td><s:hidden name="id"/></td></tr>
         
          <tr><td><s:textfield name="username" label="Customer Name" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="bankaccount_no" label="Customer AccNo" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="compname" label="Company Name" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="acshare" label="No of shares Having" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="no_share" label="No of shares Want" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="demataccount_no" label="Broker DematID" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="shareamt" label="Present Share Price" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="amtdep" label="Amount deposited" readonly="true"></s:textfield></td></tr>
          
          <tr><td><s:submit value="GO FOR IT" align="center"></s:submit></td></tr>
</s:form>        
 </table>
  
          <p><br></p><br></div><div class="article"><br><p class="spec"><br></p>
          <div class="clr"></div>
        </div>
        <div class="pagenavi"><span class="pages"></span><br></div>
      </div>
      <div class="sidebar">
        <div class="gadget">
          <div class="search">
           
            <div class="clr"></div>
          </div>
          <div class="clr"></div>
        </div>
        <div class="gadget">
          <h2><span>Back</span> </h2>
          <div class="clr"></div>
          
            
            <a href="#"><font size="3"></font></a>
            <a href="#"><font size="3"></font></a>
            <a href="#"><font size="3"></font></a>
            <a href="#"><font size="3"></font></a>
            <a href="#"><font size="3"></font></a>
            <a href="#"><font size="3"></font></a>
            <a href="#"><font size="3"></font></a>
            <a href="#"><font size="3"></font></a>
          
        </div>
        <div class="gadget">
          <h2><span></span></h2>
          <div class="clr"></div>
          <ul class="ex_menu"></ul></div></div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="col c1">
      <h2><span>Image Gallery</span></h2>
      <a href="#"><img src="images/pic_1.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_2.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_3.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_4.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_5.jpg" width="58" height="58" alt="" /></a> <a href="#"><img src="images/pic_6.jpg" width="58" height="58" alt="" /></a> </div>
    <div class="col c2">
      <h2><span>Portfolio</span></h2>
      <p><br />
         <a href="#"></a>Portfolio is a collection of asset i.e it means the total holding of securities belonging to any person.Portfolio management is all about distributing money in one or more investments after analyzing their future returns</p>
    </div>
    <div class="col c3">
      <h2><span>About</span></h2>
      <p>A Portfolio Management refers to the science of analyzing the
strengths, weaknesses, opportunities and threats for performing wide
range of activities related to the one&rsquo;s portfolio for maximizing the
return at a given risk. <a href="#"></a></p>
    </div>
    <div class="clr"></div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <p class="lf"> <a href="#"></a></p>
      <p class="rf"> <a href="http://www.coolwebtemplates.net/"></a></p>
      <div class="clr"></div>
    </div>
  </div>
</div>
  </body>
</html>
