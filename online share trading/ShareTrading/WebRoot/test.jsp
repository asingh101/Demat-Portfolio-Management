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
  </head>
  
  <body>
   <div class="main">
  <div class="header">
    <div class="logo">
      <h1><a href="index.html"><font size="6"><span>Portfolio Management</span></font><small>Simple web template</small></a></h1>
    </div>
    <div class="menu_nav">
      <ul>
        <li class="active"><a href="index.html">Home</a></li>
        <li><a href="support.html">Support</a></li>
        <li><a href="about.html">About Us</a></li>
        <li><a href="blog.html">Blog</a></li>
        <li><a href="contact.html">Contact Us</a></li>
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
          <h2><span>Template License</span></h2>
          <div class="clr"></div>
          <p class="post-data"><a href="#" class="com fr">Comments (3)</a> <span class="date">March 16, 2018</span> &nbsp;|&nbsp; Posted by <a href="#">Owner</a> &nbsp;|&nbsp; Filed under <a href="#">templates</a>, <a href="#">internet</a></p>
          <br>
          
          <p><font size="3" color="black">Enter UserName &nbsp;&nbsp;</font><s:textfield name="uname"></s:textfield></p>
          <p><font size="3" color="black">Enter Password &nbsp;&nbsp;</font><s:textfield name="uname"></s:textfield></p>
          <p><font size="3" color="black">Enter Phone No &nbsp;&nbsp;</font><s:textfield name="uname"></s:textfield></p>
          <p><font size="3" color="black">Enter E-mail &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><s:textfield name="uname"></s:textfield></p>
          <p><font size="3" color="black">Enter Gender &nbsp;&nbsp;</font><s:radio name="uname" list="{'Male','Female'}"></s:radio></p>
          <p><font size="3" color="black">Enter UserName &nbsp;&nbsp;</font><s:textfield name="uname"></s:textfield></p>
          <p><font size="3" color="black">Enter Password &nbsp;&nbsp;</font><s:textfield name="uname"></s:textfield></p>
        
  
          <p><br></p><br></div><div class="article"><br><p class="spec"><br></p>
          <div class="clr"></div>
        </div>
        <div class="pagenavi"><span class="pages"></span><span class="current">1</span><a href="#">2</a><a href="#" >&raquo;</a></div>
      </div>
      <div class="sidebar">
        <div class="gadget">
          <div class="search">
           
            <div class="clr"></div>
          </div>
          <div class="clr"></div>
        </div>
        <div class="gadget">
          <h2><span>Sidebar</span> Menu</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li class="active">
            <a href="#"><font size="3">Home</font></a></li>
            <li><a href="#"><font size="3">TemplateInfo</font></a></li>
            <li><a href="#"><font size="3">Style Demo</font></a></li>
            <li><a href="#"><font size="3">Blog</font></a></li>
            <li><a href="#"><font size="3">Archives</font></a></li>
            <li><a href="#"><font size="3">Style Demo</font></a></li>
            <li><a href="#"><font size="3">Blog</font></a></li>
            <li><a href="#"><font size="3">Archives</font></a></li>
          </ul>
        </div>
        <div class="gadget">
          <h2><span>Sponsors</span></h2>
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
      <h2><span>Lorem Ipsum</span></h2>
      <p>Lorem ipsum dolor<br />
        Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. <a href="#">Morbi tincidunt, orci ac convallis aliquam</a>, lectus turpis varius lorem, eu posuere nunc justo tempus leo. Donec mattis, purus nec placerat bibendum, dui pede condimentum odio, ac blandit ante orci ut diam.</p>
    </div>
    <div class="col c3">
      <h2><span>About</span></h2>
      <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. Morbi tincidunt, orci ac convallis aliquam, lectus turpis varius lorem, eu posuere nunc justo tempus leo. llorem, eu posuere nunc justo tempus leo. Donec mattis, purus nec placerat bibendum. <a href="#">Learn more...</a></p>
    </div>
    <div class="clr"></div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <p class="lf">&copy; Copyright <a href="#">MyWebSite</a>.</p>
      <p class="rf">Layout by Cool <a href="http://www.coolwebtemplates.net/">Website Templates</a></p>
      <div class="clr"></div>
    </div>
  </div>
</div>
  </body>
</html>
