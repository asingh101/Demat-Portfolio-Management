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
       var x12=document.forms["m"]["compname"].value;
        if(x12=="") {
         alert("Error: compname cannot be blank!");
          document.forms["m"]["compname"].focus();
           return false; 
          } 
           var x13=document.forms["m"]["address"].value;
        if(x13=="") {
         alert("Error: address cannot be blank!");
          document.forms["m"]["address"].focus();
           return false; 
          } 
          var x14=document.forms["m"]["city"].value;
        if(x14=="") {
         alert("Error: city cannot be blank!");
          document.forms["m"]["city"].focus();
           return false; 
          } 
              var x15=document.forms["m"]["offno"].value;
        if(x15=="") {
         alert("Error: Phone No cannot be blank!");
          document.forms["m"]["offno"].focus();
           return false; 
          } 
          if(isNaN(x15)||x15.indexOf(" ")!=-1){
            alert("Enter numeric value in mobile field  ")
			document.forms["m"]["offno"].focus();
            return false; }
if(x15.length < 10) {
            alert("You have entered wrong number");
            document.forms["m"]["offno"].focus();
            return false;}
           var x16=document.forms["m"]["faxno"].value;
        if(x16=="") {
         alert("Error: fax no cannot be blank!");
          document.forms["m"]["faxno"].focus();
           return false; 
          } 
          var x17=document.forms["m"]["answer"].value;
        if(x17=="") {
         alert("Error: Security Answer cannot be blank!");
          document.forms["m"]["answer"].focus();
           return false; 
          } 
          var x=document.forms["m"]["e_mail"].value; 
         var atp=x.indexOf("@");
         var dotp=x.lastIndexOf(".");
         if(atp<1||dotp<atp+2||dotp+2>=x.length)
            {
         alert("Not a Valid Email Address");
         document.forms["m"]["e_mail"].focus();
         return false;         
                   }
                   var x20=document.forms["m"]["website"].value;
        if(x20=="") {
         alert("Error: website cannot be blank!");
          document.forms["m"]["website"].focus();
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
          <h2><span>Company Registration</span></h2>
          <div class="clr"></div>
          <p class="post-data">&nbsp;<span class="date"></span>   </p>
          <br>
          <table>
          <s:form action="compreg" name="m" onsubmit="return f()">
          <tr><td><s:textfield name="compname" label="Company Name" ></s:textfield></td></tr>
          <tr><td><s:textarea name="address" label="Address" ></s:textarea></td></tr>
          <tr><td><s:textfield name="city" label="City"> </s:textfield></td></tr>
          <tr><td><s:select name="state"  label="State" list='{"Andhra Pradesh","Andaman & Nicobar","Arunachal Pradesh","Assam","Bihar","Chandigarh","Chattisgarh","Dadra and Nagar Haveli","Daman and Diu","Delhi","Gujarat","Goa","Haryana","Himachal Pradesh","Jammu & Kashmir","Jharkhand","Karnataka","Kerela","Lakshadweep","Rajasthan","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Pondicherry","Sikkim","Tamil Nadu","Tripura","Uttarakhand","Uttar Pradesh","West Bengal"}' headerKey="-1" headerValue="----------Please Select----------"  ></s:select></td></tr>
          <tr><td><s:textfield name="offno" label="Office No" ></s:textfield></td></tr>
          <tr><td><s:textfield name="faxno" label="Fax No" ></s:textfield></td></tr>
          <tr><td><s:textfield name="website" label="website"></s:textfield></td></tr>
          <tr><td><s:textfield name="e_mail" label="Email" ></s:textfield></td></tr>
          
          <tr><td><s:select label="Security question"  name="security" list='{"which is your favourite bank","your company branch name","when was the company founded?","total no. of employees u have"}' headerKey="-1" headerValue="------------Please Select--------" ></s:select></td></tr>
           <tr><td><s:textfield name="answer" label="Security Answer" ></s:textfield></td></tr>
          <tr><td><s:submit value="REGISTER" align="center"></s:submit></td></tr>
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
          <h2><span></span> </h2>
           <a href="user.jsp"><font size="3" color="black">back</font></a>
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
      <p> A Portfolio Management refers to the science of analyzing the
strengths, weaknesses, opportunities and threats for performing wide
range of activities related to the one&rsquo;s portfolio for maximizing the
return at a given risk.<a href="#"></a></p>
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
