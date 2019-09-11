<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<title>portfolio management</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>

<script type="text/javascript">
       function f(){
       var x12=document.forms["m"]["username"].value;
        if(x12=="") {
         alert("Error: Username cannot be blank!");
          document.forms["m"]["username"].focus();
           return false; 
          } 
        var x13=document.forms["m"]["password"].value;
        if(x13=="") {
         alert("Error: Password cannot be blank!");
          document.forms["m"]["password"].focus();
           return false; 
          }  
        if(document.forms["m"]["password"].value.length < 6) 
       {
        alert("Error: Password must contain at least six characters!"); 
        document.forms["m"]["password"].focus();
         return false;
          } 

       return true;
          }    
   </script>

  </head>
  
  <body>
   <div class="main">
  <div class="header">
    <div class="logo">
      <h1><font size="6"><span>Portfolio Management</span></font><small><br></small></h1>
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
          <h2><span><strong><u>LOGIN&nbsp; PAGE</u></strong><br></span></h2>
          <div class="clr"></div>
          <p class="post-data"><br><span class="date"></span></p>
         
       <table>  
      <s:form action="LoginAction" name="m" onsubmit="return f()"> 
     <tr><td><s:textfield name="username" label="Enter UserName"></s:textfield></td></tr>
    <tr><td><s:password name="password" label="Enter Password" ></s:password></td></tr>
          <tr><td><s:radio name="usertype" label=" Enter Usertype" list="{'admin','user','broker','company'}"></s:radio></td></tr>
          <s:submit value="Login" align="center"></s:submit>
          </s:form> 
           </table>
           <s:property value="msg"/><br><br><a href="forgetpass.jsp"><font size="3" color="blue">Forgot Password?</font></a>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            <a href="newuser.jsp"><font size="3" color="blue">New User</font></a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; <a href="Addbroker.jsp"><font size="3" color="blue">New Broker</font></a> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <a href="companyreg.jsp"><font size="3" color="blue">New Company</font></a>
        
   
         <p></p></div><div class="article"><br><p class="spec"><br></p>
          <div class="clr"></div>
        </div>
       
      </div>
      
      <div class="sidebar">
        <div class="gadget">
          <div class="search">
           
            <div class="clr"></div>
          </div>
          <div class="clr"></div>
        </div>
        <div class="gadget">
        
          <div class="clr"></div>
          <ul class="sb_menu">
            </ul>
        </div>
        <div class="gadget">
          
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
      <h2><span>PORTFOLIO</span></h2>
      <p>
        Portfolio is a collection of asset i,e it means the total holding of securities belonging to any person.Portfolio management is all about distributing money in one or more investments after analyzing their future returns</p>
    </div>
    <div class="col c3">
      <h2><span>About</span></h2>
      <p>A Portfolio Management refers to the science of analyzing the strengths, weaknesses, opportunities and threats for performing wide range of activities related to the one’s portfolio for maximizing the return at a given risk.</p>
    </div>
    <div class="clr"></div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <p class="lf"><br></p>
      <p class="rf"><br></p>
      <div class="clr"></div>
    </div>
  </div>
</div>
  </body>
</html>
