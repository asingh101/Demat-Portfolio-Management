<%@ page language="java" import="java.util.*,java.sql.*,java.text.SimpleDateFormat,com.opensymphony.xwork2.ActionContext" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'risk.jsp' starting page</title>
    
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
          <h2><span>&nbsp;RISK CALCULATION<br></span></h2>
          <div class="clr"></div>
          <br>
          
  		
          <p><br></p><br></div><div class="article"><br>
          
           
<%  
      Map map=ActionContext.getContext().getSession();
	  Long cidd=(Long)map.get("companynames");
    Double sumx=null,sumy=null,sumxx=null,sumyy=null,xy=null;
	java.util.Date dd=new java.util.Date();
               SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
               String sdate=sd.format(dd);
    Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sharetrading","sharetrading");
	
	Statement st=con.createStatement();
	
	String query="SELECT sum(SHAREINDEX),sum(SHAREPRICE),sum(SHAREINDEX*SHAREINDEX),sum(SHAREPRICE*SHAREPRICE),sum(SHAREINDEX*SHAREPRICE) from SHARE_DETAILS where comp_id="+cidd+"  and dateoftrans between to_date('"+sdate+"','DD-MM-YY')-7 and '"+sdate+"' group by comp_id";
	ResultSet rs=st.executeQuery(query);
	if(rs.next())
	{
	  sumx=rs.getDouble(1);   // out.println("Sum X is"+sumx);
	  sumy=rs.getDouble(2);   //out.println("Sum Y is"+sumy);
	  sumxx=rs.getDouble(3);  //out.println("Sum XX is"+sumxx);
	  sumyy=rs.getDouble(4);  //out.println("Sum YY is"+sumyy);
	  xy=rs.getDouble(5);     //out.println("Sum XY is"+xy);
	}
	Double meanx=sumx/7;      //out.println("Sum meanX is"+meanx);
	Double meanxx=meanx*meanx; //out.println("Sum meanXX is"+meanxx);
	Double meany=sumy/7;      //out.println("Sum meanY is"+meany);
	Double meanyy=meany*meany; //out.println("Sum meanYY is"+meanyy);
	Double sdx= Math.sqrt((sumxx/7)-meanxx); //out.println("Std Deviation X is"+sdx);
	Double sdy= Math.sqrt((sumyy/7)-meanyy); //out.println("Std Deviation Y is"+sdy);
	Double conxy=(xy/7)-(meanx*meany);  //out.println("Conv of XY is"+conxy);
	Double pre=sdx*sdy;  //out.println("Pre Cal is"+pre);
	Double riskf=(conxy/(sdx*sdy));
	//out.println("Risk Factor of CTS is "+riskf);
   %>

        <font size="4">Risk Factor: <%=  riskf %></font><br/>
        <font size="4">Std Deviation of Stock Index is: <%=  sdx %></font><br/>
        <font size="4">Std Deviation of Price is:<%= sdy %></font><br/>
          
          
          <p class="spec"><br></p>
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
          <a href="comphistory.jsp"><font size="3" color="black">back</font></a>
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
    <div class="clr"></div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <p class="lf"><br></p>
      <p class="rf"><a href="http://www.coolwebtemplates.net/"><br></a></p>
      <div class="clr"></div>
    </div>
  </div>
</div>
  </body>
</html>
