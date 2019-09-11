<%@ page language="java" import="java.util.*,com.opensymphony.xwork2.ActionContext" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*,java.text.SimpleDateFormat" %>
<%@ page import="org.jfree.data.*" %>
<%@ page import="org.jfree.chart.*" %>
<%@ page import="org.jfree.chart.plot.PlotOrientation" %>
<%@ page import="org.jfree.data.jdbc.JDBCCategoryDataset" %>
<%@ page import="org.jfree.chart.renderer.category.*" %>
<%@ page import="org.jfree.chart.entity.StandardEntityCollection" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Editbroker.jsp' starting page</title>
    
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
          <h2><span>Search for company<br></span></h2>
          <div class="clr"></div>
          <p class="post-data">&nbsp;<span class="date"></span>&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <br></p>
          <br>
                         <%
                Map sess=ActionContext.getContext().getSession();		
               String cidd=(String)sess.get("COMPID");
                java.util.Date dd=new java.util.Date();
               SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
               String sdate=sd.format(dd);
	
    String q3="SELECT to_char(DATEOFTRANS,'dd-mm-yyyy'),sum(no_share) from share_details where comp_id="+cidd+" group by(comp_id,DATEOFTRANS)";
   
    String q5="SELECT to_char(DATEOFTRANS,'dd-mm-yyyy'),sum(no_share) from moreshare where comp_id="+cidd+"  and dateoftrans between to_date('"+sdate+"','DD-MM-YY')-7 and '"+sdate+"' and types='sold' group by(comp_id,DATEOFTRANS,types) order by DATEOFTRANS";
    String q6="SELECT to_char(DATEOFTRANS,'dd-mm-yyyy'),sum(no_share) from moreshare where comp_id=2519 and types='bought' group by(comp_id,DATEOFTRANS,types)";
    String query=q5;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sharetrading","sharetrading");
	JDBCCategoryDataset dataset = new JDBCCategoryDataset(con);
    String s=(String)sess.get("COMPNAME");
	dataset.executeQuery(query);
    JFreeChart chart = ChartFactory .createBarChart3D("Complete Share-Sale Graph",s,"No. of Shares",dataset,PlotOrientation.VERTICAL,true, true, false);
    ChartFrame frame1 = new ChartFrame("Shares Details", chart);
	frame1.setVisible(true);
	frame1.setSize(1250, 750);
%>
         <h2>There is an Icon on TaskBar</h2><br/>
         <h2>Click And Open it</h2><br/>
         <h2>It is nothing but a Graph of your requirment</h2>
           
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
          <h2><span></span>&nbsp;<br></h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li class="active">
            <br></li>
            </ul>
            <a href="comphistory.jsp"><font size="3" color="black">BACK</font></a>
          <br>
        </div>
        <div class="gadget">
          <h2><span><br></span></h2>
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
      <p>Portfolio is a collection of asset i,e it means the total holding of securities belonging to any person.Portfolio management is all about distributing money in one or more investments after analyzing their future returns</p>
    </div>
    <div class="col c3">
      <h2><span>About</span></h2>
      <p>A Portfolio Management refers to the science of analyzing the
strengths, weaknesses, opportunities and threats for performing wide
range of activities related to the one&rsquo;s portfolio for maximizing the
return at a given risk.<a href="#"></a></p>
    </div>
    <div class="clr"> 
     
      .</div>
  </div>
  <div class="footer"><div class="footer_resize">
      <p class="rf"><br></p>
      <div class="clr"></div>
    </div>
  </div>
</div>
  </body>
</html>
