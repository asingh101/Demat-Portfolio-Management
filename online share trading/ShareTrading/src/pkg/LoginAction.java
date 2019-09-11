package pkg;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements ServletRequestAware{

	private static final long serialVersionUID = 1L;
	HttpServletRequest req;
	private Long id;
	private Double broamount;
    private Long stockIndex;
	public Long getStockIndex() {
		return stockIndex;
	}
	public void setStockIndex(Long stockIndex) {
		this.stockIndex = stockIndex;
	}
	public Double getBroamount() {
		return broamount;
	}
	public void setBroamount(Double broamount) {
		this.broamount = broamount;
	}
	public HttpServletRequest getReq() {
		return req;
	}
	public void setReq(HttpServletRequest req) {
		this.req = req;
	}
	private String usertype;
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
    private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String gender;
	private String e_mail;
	private Long phone;
	private String experience;
	private String bankname;
	private String branchname;
	private Long bankaccount_no;
	private Long demataccount_no;	
	private String pancard_no;
	private String dateofbirth;   
	private String dateofreg;  
	private Long pincode;
	ArrayList<LoginAction> alist;
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	private String answer;
	private String security;
	private Long userid;
	private Long broker_id;
	 private String compname;
	 private Long shareamt;
	 private Long no_share;
	private Long cid;
	private String subject;
	private String content;
	private String name;
	private Long acshare;
	public Long getAcshare() {
		return acshare;
	}
	public void setAcshare(Long acshare) {
		this.acshare = acshare;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Long getOffno() {
		return offno;
	}
	public void setOffno(Long offno) {
		this.offno = offno;
	}
	public Long getFaxno() {
		return faxno;
	}
	public void setFaxno(Long faxno) {
		this.faxno = faxno;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	private String State;
	private Long offno;
	private Long faxno;
	private String website;
	private String brokername;
	private String type;
	private Long PresentAmount;
	private Double amtcut;
	private Double amtdep;
	private String Datetrans;
	private String ByWhom;
	public String getByWhom() {
		return ByWhom;
	}
	public void setByWhom(String byWhom) {
		ByWhom = byWhom;
	}
	
	public Long getPresentAmount() {
		return PresentAmount;
	}
	public void setPresentAmount(Long presentAmount) {
		PresentAmount = presentAmount;
	}

	public Double getAmtcut() {
		return amtcut;
	}
	public void setAmtcut(Double amtcut) {
		this.amtcut = amtcut;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Long getNo_share() {
		return no_share;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	public Long getShareamt() {
		return shareamt;
	}
	public void setShareamt(Long shareamt) {
		this.shareamt = shareamt;
	}

	public void setNo_share(Long noShare) {
		no_share = noShare;
	}
	public Long getBroker_id() {
		return broker_id;
	}
	public void setBroker_id(Long brokerId) {
		broker_id = brokerId;
	}
	private Map<Integer,String> mapForSelect;
	private Map<Integer,String> mapForSelect1;
	
	public Map<Integer, String> getMapForSelect1() {
		return mapForSelect1;
	}
	public void setMapForSelect1(Map<Integer, String> mapForSelect1) {
		this.mapForSelect1 = mapForSelect1;
	}
	public Map<Integer, String> getMapForSelect() {
		return mapForSelect;
	}
	public void setMapForSelect(Map<Integer, String> mapForSelect) {
		this.mapForSelect = mapForSelect;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getUserid() {
		return userid;
	}

	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getPancard_no() {
		return pancard_no;
	}
	public void setPancard_no(String pancardNo) {
		this.pancard_no = pancardNo;
	}

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String eMail) {
		e_mail = eMail;
	}

	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public String getSecurity() {
		return security;
	}
	
	DbLogic dl=new DbLogic();
	public String addBroker() throws SQLException
	{
		System.out.println("111111111");
		Random r=new Random();
		String token=Long.toString(Math.abs(r.nextLong()));
		String pass=token.substring(0,6);
		System.out.println("Password is :"+pass);
		setPassword(pass);
		String uname=getFirstname().charAt(0)+getLastname();
		ResultSet rs=dl.addbroker(getFirstname(),getLastname(),uname,getPassword(),getAddress(),getGender(),e_mail,getPhone(),getExperience(),getSecurity(),getAnswer(),getDemataccount_no(),getBankaccount_no(),getAmtdep());
		if(rs.next())
		{
			
			setUsername(rs.getString(1));
		}
		setMsg("Successfully Registered. Wait for Approval....");
		//reset();
		return "addbroker";
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getDateofreg() {
		return dateofreg;
	}
	public void setDateofreg(String dateofreg) {
		this.dateofreg = dateofreg;
	}
	public String addUser() throws SQLException
	{
		System.out.println();
		mapForSelect= new HashMap<Integer,String>();
		Random r=new Random();
		String token=Long.toString(Math.abs(r.nextLong()));
		String pass=token.substring(0,6);
		System.out.println("Password is :"+pass);
		setPassword(pass);
		String uname=getFirstname().charAt(0)+getLastname();
		ResultSet rs1=dl.adduser(getFirstname(),getLastname(),uname,getPassword(),getAddress(),getCity(),getE_mail(),getPhone(),getSecurity(),getAnswer(),getDateofbirth(),getPincode());
		if(rs1.next())
		{
			setUsername(rs1.getString(1));
		}
		ResultSet rs=dl.retid(getUsername());
		if(rs.next())
		{
		  setUserid(rs.getLong(1));	
		  System.out.println(rs.getLong(1));
		  
			ResultSet rss=dl.broker1();
			while(rss.next())
			{
				mapForSelect.put(rss.getInt(1),rss.getString(2)+"  "+rss.getString(3));	
			}
		}
		return "adduser";
	}
	
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public Long getBankaccount_no() {
		return bankaccount_no;
	}
	public void setBankaccount_no(Long bankaccountNo) {
		bankaccount_no = bankaccountNo;
	}
	public Long getDemataccount_no() {
		return demataccount_no;
	}
	public void setDemataccount_no(Long demataccountNo) {
		demataccount_no = demataccountNo;
	}
	
	public String nextAdd() throws SQLException
	{
		System.out.println(getUserid());
		System.out.println(getBroker_id());
		setUsername(getUsername());setPassword(getPassword());
		System.out.println("Username is"+username+" & password is"+password);
		int i=dl.nextadd(getUserid(),getBroker_id(),getBankaccount_no(),getBankname(),getBranchname(),getPancard_no(),getDemataccount_no(),getAmtdep());
		return "nextadd";
	}
	
	public String LoginData()throws SQLException,ClassNotFoundException{
		System.out.println(getUsername()+getPassword()+getUsertype());
		ResultSet rs=dl.RetLogin(username,password,usertype);
		Map session3=ActionContext.getContext().getSession();
		session3.put("UTYPE",getUsertype());
		if(rs.next())
		{
			String status=rs.getString("STATUS");
			if(usertype.equals("admin"))
			{
				return"admin";
			}
			if(usertype.equalsIgnoreCase("company"))
			{
				
			if(status.equals("approved"))
			{		
				System.out.println(rs.getString(1));
				Map session=ActionContext.getContext().getSession();
				session.put("COMPID", rs.getString(1));
		        return "company";		
			}
			else
			{
				setMsg("Waiting for Approval");
				return "loginfail";
			}
			}
			if(usertype.equalsIgnoreCase("user"))
			{
							
			if(status.equals("approved"))
			{
				System.out.println(rs.getString(1));
				Map session=ActionContext.getContext().getSession();
				session.put("USERID", rs.getString(1));
		        return "user";		
			}
			else
			{
				setMsg("Waiting for Approval");
				return "loginfail";
			}
			
			}
			if(usertype.equalsIgnoreCase("broker"))
			{
							
			if(status.equals("approved"))
			{
				Map session=ActionContext.getContext().getSession();
				session.put("BROKERID", rs.getString(1));
		        return "broker";		
			}
			else
			{
				setMsg("Waiting for Approval");
				return "loginfail";
			}

		}
		}
		setMsg("Invalid UserName or Password");
		return "loginfail";
	}
	
	public String UserMgt() throws SQLException,ClassNotFoundException{
		{
		mapForSelect= new HashMap<Integer,String>();
		ResultSet rs=dl.Retuser();
		while(rs.next())
			mapForSelect.put(rs.getInt(1),rs.getString(2));
		return"displayuser";
	}
	}
	public String brokerMgt() throws SQLException,ClassNotFoundException{
		{
		mapForSelect= new HashMap<Integer,String>();
		ResultSet rs=dl.Retbroker();
		while(rs.next())
			mapForSelect.put(rs.getInt(1),rs.getString(2));
		return"displaybroker";
	}
	}
	
/*	
	public String selectUser()throws SQLException,ClassNotFoundException{
		ResultSet rs=dl.(rs.getUserid());
		LoginAction la=new LoginAction();
		if(rs.next()){
			setUserid(rs.get(1));
			setFirstname(rs.getString(2));
			setLastname(rs.getString(3));
			setLoginid(rs.getLong(10));
			setAddress(rs.getString(11));
			setCity(rs.getString(4));
			setE_mail(rs.getString(5));
			setPhone(rs.getLong(6));
			setDateofbirth(rs.getDate(7));
			setDateofreg(rs.getDate(8));
			setPincode(rs.getLong(9));
			setPancard_no(rs.getString(13));
			setBankname(rs.getString(14));
			setBranchname(rs.getString(15));
			setBankaccount_no(rs.getLong(16));
			setdemataccount_no( rs.getLong(17));
				
		}
		return"displayuser";
	}
	

	public String selectbroker()throws SQLException,ClassNotFoundException{
		ResultSet rs=dl.Selectbroker(getBroker_id());
		if(rs.next()){
			setBroker_id(rs.getLong(1));
			setFirstname(rs.getString(2));
			setLastname(rs.getString(3));
			setAddress(rs.getString(4));
			setGender(rs.getString(5));
			setE_mail(rs.getString(6));
			setPhone(rs.getLong(7));
			setExperience(rs.getString(8));
		}
		return"Addbroker";
	}
*/
	public String Approved1()throws SQLException,ClassNotFoundException{
		HttpServletRequest request=(HttpServletRequest)
		ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Long broker_id=Long.parseLong(request.getParameter("broker_id"));
		int i=dl.Approvedbroker(broker_id);
		if(i>0)
		{
			return "Approved";
		}
	return null;
	}

	public String Reject1()throws SQLException,ClassNotFoundException{
		HttpServletRequest request=(HttpServletRequest)
		ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		Long broker_id=Long.parseLong(request.getParameter("broker_id"));
		int i=dl.Rejectbroker(broker_id);
		if(i>0)
		{
			return "Reject";
		}
	return null;
	}
	
	public void reset() {
		
			this.username="";
			this.password="";
			this.firstname="";
			this.lastname="";
			this.address="";
			this.gender="";
			this.e_mail="";
			this.phone=null;
			this.experience="";
			this.security="";
			this.answer="";			
		}

	public String addComp() throws SQLException
	{
		System.out.println();
		setUsername(getUsername());setPassword(getPassword());
		int i=dl.addComp(getCompname(),getShareamt(),getNo_share(),getStockIndex());
		return "addcomp";
		
	}	
	public String Editshare()throws Exception{
		Long idd = null;
		Map Session=ActionContext.getContext().getSession();
		String login_id=(String)Session.get("COMPID");
		System.out.println(login_id);
		ResultSet rss=DbConnect.getStatement().executeQuery("select comp_id from company where login_id="+login_id+"");
		if(rss.next())
		{
			idd=rss.getLong(1);
		}
		ResultSet rs=dl.Editshare(idd);
		if(rs.next()){
	
		setCid(idd);
		setCompname(rs.getString(1));
		
	}
return "Editshare";
}
 public String Edshare()throws Exception{
	System.out.println();
	java.util.Date d=new java.util.Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	String datee=sd.format(d);
	System.out.println(datee);
	System.out.println("Company Is is:"+cid);
	ResultSet rs=dl.reviewDate(datee,getCid());
	if(rs.next()==true)
	{
		System.out.println("update block");
		int i=dl.Edshare(getCid(),getShareamt(),datee,getNo_share(),getStockIndex());
	}
	else
	{
		System.out.println("insert block");
		int j=dl.updShare(getCid(),getShareamt(),datee,getNo_share(),getStockIndex());
	}
	setMsg("Data Successfully Updated");
	return "Edshare";
	
 }
public String Editbr()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Rebroker1();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2)+"  "+rs.getString(3));	
	}
		
	return "Editbr";
}

public String Editbroker()throws SQLException,ClassNotFoundException{
System.out.println(getBroker_id());
ResultSet rs=dl.Editbroker(getBroker_id());
LoginAction la=new LoginAction();
if(rs.next()){     
	setBroker_id(rs.getLong(1));
	setFirstname(rs.getString(2));
	setLastname(rs.getString(3));
	setAddress(rs.getString(4));
	setGender(rs.getString(5));
	setE_mail(rs.getString(6));
	setPhone(rs.getLong(7));
	setExperience(rs.getString(8));
	
}
return "Editbroker";
}
public String Edbroker()throws SQLException,ClassNotFoundException{
System.out.println();
int i=dl.Edbroker(getBroker_id(),getFirstname(),getLastname(),getAddress(),getGender(),getE_mail(),getPhone(),getExperience());
return "Edbroker";

}
public String Deletebr()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Rebroker1();
	while(rs.next())
		mapForSelect.put(rs.getInt(1),rs.getString(2)+"  "+rs.getString(3));
	return "Deletebr";
}

public String Deletebroker()throws SQLException,ClassNotFoundException{
System.out.println(getBroker_id());
ResultSet rs=dl.Deletebroker(getBroker_id());
LoginAction la=new LoginAction();
if(rs.next()){     
	setBroker_id(rs.getLong(1));
	setFirstname(rs.getString(2));
	setLastname(rs.getString(3));
	setAddress(rs.getString(4));
	setGender(rs.getString(5));
	setE_mail(rs.getString(6));
	setPhone(rs.getLong(7));
	setExperience(rs.getString(8));
	
}
return "Deletebroker";
}
public String Delbroker()throws SQLException,ClassNotFoundException{
System.out.println();
int i=dl.Delbroker(getBroker_id(),getFirstname(),getLastname(),getAddress(),getGender(),getE_mail(),getPhone(),getExperience());
return "Delbroker";

}
@Override
public void setServletRequest(HttpServletRequest req) {
	// TODO Auto-generated method stub
	this.req=req;
}

public HttpServletRequest getServletRequest()
{
	return req;
}

public String Approval()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Rebroker2();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2)+"  "+rs.getString(3));	
	}
		
	return "Approval";
}

public String app()throws SQLException,ClassNotFoundException{
	System.out.println(getBroker_id());
	ResultSet rs=dl.app(getBroker_id());
	if(rs.next()){     
		setBroker_id(rs.getLong(1));
		setFirstname(rs.getString(2));
		setLastname(rs.getString(3));
		setAddress(rs.getString(4));
		setGender(rs.getString(5));
		setE_mail(rs.getString(6));
		setPhone(rs.getLong(7));
		setExperience(rs.getString(8));
		setId(rs.getLong(9));
	}
	return "app";
}
public String Appbr()throws SQLException,ClassNotFoundException{
	
    System.out.println(getId());
	int i=dl.Appbr(getId());
	ResultSet rs=dl.Apmail(getId());
	
	if(rs.next()){     
		setName(rs.getString(2)+"  "+rs.getString(3));
		setE_mail(rs.getString(6));
		setSubject("u r approved");
		setContent("Your username and password is set as per your request and now you can login!");
		
	}
		return "appbr";
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String Rejbr()throws SQLException,ClassNotFoundException{
	System.out.println(getId());	
	int i=dl.Rejbr(getId());
	if(i>0)
	{
		return "rejbr";
	}
return null;
}
public String Apmail()throws SQLException,ClassNotFoundException{
	
	System.out.println(getE_mail()+getSubject()+getContent());
String host="smtp.gmail.com";
String from="ur username";

String to=getE_mail();
String subject=getSubject();
String msg=getContent();
final  String un="ur username";
final  String pwd="ur password";

	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props,
	  new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(un, pwd);
		}
	  });

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(from));
		message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse(to));
		message.setSubject(subject);
		message.setText(msg);

		Transport.send(message);

		System.out.println("Done");

	} catch (MessagingException e) {
		throw new RuntimeException(e);
	}

	
	ResultSet rs=dl.Apmail(getId());
	
	return "Apmail";
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getSubject() {
	return subject;
}
public void setContent(String content) {
	this.content = content;
}
public String getContent() {
	return content;
}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public String Compreg() throws SQLException
{
	System.out.println(11111);
	Random r=new Random();
	String token=Long.toString(Math.abs(r.nextLong()));
	String pass=token.substring(0,6);
	System.out.println("Password is :"+pass);
	setPassword(pass);
	//String uname=getFirstname().charAt(0)+getLastname();
	ResultSet rs=dl.Compreg(getCompname(),getAddress(),getCity(),getState(),getOffno(),getFaxno(),getWebsite(),getE_mail(),getCompname(),getPassword(),getSecurity(),getAnswer());
	if(rs.next())
	{
		setUsername(rs.getString(1));
	}
	return "Compreg";
	
}	

public String Approval1()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Recomp1();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));	
	}
		
	return "Approval";
}
private Long comp_id;
public String appcomp()throws SQLException,ClassNotFoundException{
	System.out.println(getComp_id());
	
	ResultSet rs=dl.appcomp(getComp_id());
	if(rs.next()){    
		System.out.println(rs.getLong(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
		setComp_id(rs.getLong(1));
		setCompname(rs.getString(2));
		setAddress(rs.getString(3));
		setCity(rs.getString(4));
		setState(rs.getString(5));
		setOffno(rs.getLong(6));
		setFaxno(rs.getLong(7));
		setWebsite(rs.getString(8));
		setE_mail(rs.getString(9));
		}
	return "app";
}
public String Approvecomp()throws SQLException,ClassNotFoundException{
	
    System.out.println(getId());
	int i=dl.Approvecomp(getId());
		return "approve";
}


public String Rejectcomp()throws SQLException,ClassNotFoundException{
	System.out.println(getId());	
	int i=dl.Rejectcomp(getId());
return "rejectd";
	}

public void setComp_id(Long comp_id) {
	this.comp_id = comp_id;
}
public Long getComp_id() {
	return comp_id;
}



public String edComp()throws SQLException {
System.out.println("1111");
Map sess=ActionContext.getContext().getSession();
String login_id=(String)sess.get("COMPID");
System.out.println(login_id);
ResultSet rs=dl.edComp(login_id);
if(rs.next())
{
	setComp_id(rs.getLong(1));
	setCompname(rs.getString(2));
	setAddress(rs.getString(3));
	setCity(rs.getString(4));
	setState(rs.getString(5));
	setOffno(rs.getLong(6));
	setFaxno(rs.getLong(7));
	setWebsite(rs.getString(8));
	setE_mail(rs.getString(9));
}
return "edComp";
}
public String Editcomp()throws SQLException,ClassNotFoundException{
	System.out.println();
	int i=dl.Editcomp(getComp_id(),getCompname(),getAddress(),getCity(),getState(),getOffno(),getFaxno(),getWebsite(),getE_mail());
	return "Editcomp";

	}



public String DeleteComp()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Retcomp();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));
	}
	return "DeleteComp";
}

public String deleteCo()throws SQLException,ClassNotFoundException{
ResultSet rs=dl.deleteCo(getCid());
if(rs.next())
{     
	setCid(rs.getLong(1));
	setCompname(rs.getString(2));
	setAddress(rs.getString(3));
	setCity(rs.getString(4));
	setState(rs.getString(5));
	setOffno(rs.getLong(6));
	setFaxno(rs.getLong(7));
	setWebsite(rs.getString(8));
	setE_mail(rs.getString(9));
    setShareamt(rs.getLong(13));
    setNo_share(rs.getLong(14));
}
return "deleteCo";
}
public String delComp()throws SQLException,ClassNotFoundException{
System.out.println();
int i=dl.delComp(getCid(),getCompname(),getAddress(),getCity(),getState(),getOffno(),getFaxno(),getWebsite(),getE_mail(),getShareamt(),getNo_share());
return "delComp";

}

public String apu()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Reuser();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2)+"  "+rs.getString(3));	
	}
		
	return "Apu";
}

public String Appuser()throws SQLException,ClassNotFoundException{
	System.out.println(getUserid());
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yyyy");
	ResultSet rs=dl.Appuser(getUserid());
	if(rs.next()){     
		setUserid(rs.getLong(10));
		setFirstname(rs.getString(2));
		setLastname(rs.getString(3));
		setAddress(rs.getString(11));
		setCity(rs.getString(4));
		setE_mail(rs.getString(5));
		setPhone(rs.getLong(6));
		String s1=sd.format(rs.getDate(7));
		String s2=sd.format(rs.getDate(8));
		setDateofbirth(s1);
		setDateofreg(s2);
		setPincode(rs.getLong(9));
	}
	return "Appuser";
}

public String Approveuser()throws Exception{
	
    System.out.println(getId());
	int i=dl.Approveuser(getId());
/*	ResultSet rs=dl.Apmail(getId());
	
	if(rs.next()){     
		setName(rs.getString(2)+"  "+rs.getString(3));
		setE_mail(rs.getString(6));
		setSubject("u r approved");
		setContent("Your username and password is set as per your request and now you can login!");
		
	}*/
		return apu();
}
public String Rejuser()throws SQLException,ClassNotFoundException{
	System.out.println(getId());	
	int i=dl.Rejuser(getId());
	if(i>0)
	{
		return "Rejuser";
	}
return null;
}

public String Brkrdetail()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Rebroker1();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2)+"  "+rs.getString(3));	
	}
		
	return "Brkrdetail";
}

public String Brus()throws SQLException,ClassNotFoundException{
System.out.println(getBroker_id());
ResultSet rs=dl.Brus(getBroker_id());

if(rs.next()){     
	setBroker_id(rs.getLong(1));
	setFirstname(rs.getString(2));
	setLastname(rs.getString(3));
	setAddress(rs.getString(4));
	setGender(rs.getString(5));
	setE_mail(rs.getString(6));
	setPhone(rs.getLong(7));
	setExperience(rs.getString(8));
	
}
return "Brus";
}
public String Cmpdetail()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Recomp();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));	
	}
		
	return "Cmpdetail";
}
public String Cmus()throws SQLException,ClassNotFoundException{
	System.out.println(getComp_id());
	ResultSet rs=dl.Cmus(getComp_id());
//System.out.println(rs.next());
	if(rs.next()){ 
		//System.out.println(rs.getString(1));
		setCompname(rs.getString(2));
		setShareamt(rs.getLong(3));
		setNo_share(rs.getLong(4));
		}
	return "Cmus";
	}

public String Trans()throws Exception{
	Map session=ActionContext.getContext().getSession();
	String s1=(String)session.get("USERID");
	System.out.println(s1);
	Long idd=Long.parseLong(s1);
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rss=dl.Recomp();
	while(rss.next())
	{  
		mapForSelect.put(rss.getInt(1),rss.getString(2));	
	}
	mapForSelect1= new HashMap<Integer,String>();
	ResultSet rs1=dl.Rebrokerr();
	while(rs1.next())
	{
		mapForSelect1.put(rs1.getInt(1),rs1.getString(2)+" "+rs1.getString(3));		
	}
	ResultSet rs=dl.Trans(idd);
	if(rs.next()){     
		System.out.println(rs.getLong(1));
		setUserid(rs.getLong(1));
		setName(rs.getString(2)+" "+rs.getString(3));
		setDemataccount_no(rs.getLong(4));				
	}
	return "Trans";
}
public void setBrokername(String brokername) {
	this.brokername = brokername;
}
public String getBrokername() {
	return brokername;
}
public void setType(String type) {
	this.type = type;
}
public String getType() {
	return type;
}

public void setAmtdep(Double total) {
	this.amtdep = total;
}
public Double getAmtdep() {
	return amtdep;
}


//by self
public String Self()throws Exception{
	Map session=ActionContext.getContext().getSession();
	
	String s1=(String)session.get("USERID");
	System.out.println(s1);
	Long idd=Long.parseLong(s1);
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Recomp();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));	
	}
  ResultSet rs1=dl.Tran(idd);
	if(rs1.next()){     
		System.out.println("Inside resultset "+rs1.getLong(1));
		setUserid(rs1.getLong(1));
		setName(rs1.getString(2)+" "+rs1.getString(3));
		setDemataccount_no(rs1.getLong(4));			
		setBroker_id(rs1.getLong(5));
	setBrokername(rs1.getString(6)+" "+rs1.getString(7));
	}
	return "Self";
}

public String Proc()throws Exception{
	 Long price = null;
	 Long balance=null;
	 Long accno=null;
	 System.out.println(getUserid());
	 ResultSet rss1=dl.returnAccno(getUserid());
	 //System.out.println(rss1.next());
	 if(rss1.next())
	 {
		 System.out.println("eddddddddddd");
		 accno=rss1.getLong(1);
		 System.out.println(accno);
	 }
	
	if(getType().equalsIgnoreCase("purchase"))
	{
	String compnamee = null;
    Long idd=Long.parseLong(getCompname());
    SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
    java.util.Date d=new java.util.Date();
    String sdate=sd.format(d);
	ResultSet rs=dl.ret(idd,sdate);
	
	if(rs.next())
	{
		price=rs.getLong(1);
	}
	System.out.println(getNo_share()+"   "+price);
	setBroamount(getNo_share()*price*.02);System.out.println("Broker amt"+broamount);
	//double total=(getNo_share()*price)+broamount; System.out.println("Total is:"+total);
	double total=(getNo_share()*price); System.out.println("Total is:"+total);
	System.out.println("Account No is"+accno);
	ResultSet rss=dl.retBalance(accno);
	if(rss.next())
	{
		balance=rss.getLong(1);
	}
	System.out.println("Balance is"+balance);
	ResultSet rss2=dl.retrivecompname(getCompname());
	if(rss2.next())
	{
		compnamee=rss2.getString(1);
		System.out.println(compnamee);
	}
	setUserid(getUserid());
	setUsername(getName());
	setDemataccount_no(getDemataccount_no());
	setComp_id(Long.parseLong(getCompname()));
	//setBroker_id(Long.parseLong(getBrokername()));
	setCompname(compnamee);
	setNo_share(getNo_share());
	setPresentAmount(balance);
	setAmtcut(total);
	setType(getType());
	return "Proc";
	}
	
	if(getType().equalsIgnoreCase("sale"))
	{
	String compnamee = null;
    Long idd=Long.parseLong(getCompname());
    SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
    java.util.Date d=new java.util.Date();
    String sdate=sd.format(d);
	ResultSet rs=dl.ret(idd,sdate);
	
	if(rs.next())
	{
		price=rs.getLong(1);
		System.out.println("Price is"+price);
	}
	System.out.println("inside sale");
	System.out.println("User id is "+userid+"  and comp id is"+compname);
	ResultSet rs1=DbConnect.getStatement().executeQuery("select no_share from FINALALLOCATION where user_id="+getUserid()+" and comp_id="+getCompname()+"");
	if(rs1.next())
	{
		setAcshare(rs1.getLong(1));
	}
	System.out.println(getNo_share()+"   "+price);
	double a=getNo_share()*price*.02;
	setBroamount(getNo_share()*price*.02);
	//double total= getNo_share()*price-a;
	double total= getNo_share()*price;
	
	ResultSet rss=dl.retBalance(accno);
	if(rss.next())
	{
		balance=rss.getLong(1);
	}
	ResultSet rss2=dl.retrivecompname(getCompname());
	if(rss2.next())
	{
		compnamee=rss2.getString(1);
		System.out.println(compnamee);
	}
	setUserid(getUserid());
	setUsername(getName());
	setDemataccount_no(getDemataccount_no());
	Long aa=Long.parseLong(getCompname());
	setComp_id(aa);
	//setBroker_id(Long.parseLong(getBrokername()));
	setCompname(compnamee);
	setNo_share(getNo_share());
	setPresentAmount(balance);
	setAmtdep(total);
	setType(getType());
	return "Proc1";
	}
	
	return null;
}
public String Purchase1()throws Exception{

	 Long balance=getPresentAmount();
	 Double amount=getAmtcut();
	 if(amount>balance)
	 {
		 setMsg("Insufficient balance!!! cannot purchase share");
		 return "purfail";
	 }
	 else
	 {
		 Long accountno=null;
		 Long broaccno=null;
		 Long brobalance=null;
		double  newbalance= balance-amount;
		//no_share=no_share-noshare;
		//Long accountno=getDemataccount_no();
		ResultSet rss=dl.returnbroaccount(getBroker_id());
		if(rss.next())
		{
			broaccno=rss.getLong(1);
		}
		ResultSet r=dl.returnAccount(getDemataccount_no());
		if(r.next())
		{
			accountno=r.getLong(1);
		}
		int i=dl.baldown(newbalance,accountno,broaccno,getBroamount());
		int j=dl.sharedown(comp_id,getNo_share());
		int k=dl.TransBuy(userid,comp_id,getNo_share(),amount);
		if(i>0 && j>0)
		{
			setMsg("ur transaction has been successfully done!!!");
			return "purpass";
		}
		return "purpass";
	  }
		// return "Purchase1";

	}

public String Sale1()throws Exception{
	Long shareno=getNo_share();
		Long balance=getPresentAmount();
		Long broaccno=null;
		ResultSet rss=dl.returnbroaccount(getBroker_id());
		if(rss.next())
		{
			broaccno=rss.getLong(1);
		}
		 Double amount=getAmtdep();
		 if(no_share>getAcshare())
		 {
			 setMsg("U donot hold these no. of shares");
			 return "salefail";
		 }
		 else
		 {
			 Long accountno=null;
			Double  newbalance= balance+amount;
			//no_share=no_share-noshare;
			//Long accountno=getDemataccount_no();
			ResultSet r=dl.returnAccount(getDemataccount_no());
			if(r.next())
			{
				accountno=r.getLong(1);
			}
			int i=dl.balup(newbalance,accountno,broaccno,getBroamount());
			int j=dl.sharup(comp_id,getNo_share());
			int k=dl.TransSale(userid,comp_id,no_share,amount);
			if(i>0 && j>0)
			{
				setMsg("ur transaction has been successfully done!!!");
				return "salepass";
			}
			return "salepass";
		  }
			// return "sale1";
}


public String View()throws SQLException,ClassNotFoundException{
    alist=new ArrayList<LoginAction>();
	Map session=ActionContext.getContext().getSession();
	String s1=(String)session.get("USERID");
	System.out.println(s1);
	Long idd=Long.parseLong(s1);
	ResultSet rs=dl.view(idd);
	while(rs.next()){  
		LoginAction la=new LoginAction();
		la.setCompname(rs.getString(1));
		la.setNo_share(rs.getLong(2));
		alist.add(la);
		}
	session.put("SHAREDETAIL",alist);
	return "view";
}

public ArrayList<LoginAction> getAlist() {
	return alist;
}
public void setAlist(ArrayList<LoginAction> alist) {
	this.alist = alist;
}
public String Cust()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Reuser1();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2)+"  "+rs.getString(3));	
	}
		
	return "Cust";
}

public String Custmr()throws SQLException,ClassNotFoundException{
System.out.println(getUserid());
ResultSet rs=dl.Custmr(getUserid());
SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yyyy");
if(rs.next()){     
	setUserid(rs.getLong(1));
	setFirstname(rs.getString(2));
	setLastname(rs.getString(3));
	setAddress(rs.getString(11));
	setCity(rs.getString(4));
	setE_mail(rs.getString(5));
	setPhone(rs.getLong(6));
	String s1=sd.format(rs.getDate(7));
	String s2=sd.format(rs.getDate(8));
	setDateofbirth(s1);
	setDateofreg(s2);
	//setPincode(rs.getLong(10));
	//setBankname(rs.getString(15));
	
}
return "Custmr";
}

public String Brokmr()throws SQLException,ClassNotFoundException{
	System.out.println(getUserid());
	Map session=ActionContext.getContext().getSession();
	String bid=(String)session.get("BROKERID");
	ResultSet rs=DbConnect.getStatement().executeQuery("select * from broker where login_id="+bid+"");
	//SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yyyy");
	if(rs.next()){     
		setUserid(rs.getLong(1));
		setFirstname(rs.getString(2));
		setLastname(rs.getString(3));
		setAddress(rs.getString(4));
		setGender(rs.getString(5));
		setE_mail(rs.getString(6));
		setPhone(rs.getLong(7));
		setExperience(rs.getString(8));
		setDemataccount_no(rs.getLong(10));
		setBankaccount_no(rs.getLong(11));
		//setPincode(rs.getLong(10));
		//setBankname(rs.getString(15));
		
	}
	return "Custmr";
}
	public String EditCust()throws Exception,ClassNotFoundException{
		Map se=ActionContext.getContext().getSession();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yyyy");
		String s=(String)se.get("USERID");	
		alist=new ArrayList<LoginAction>();
		Long idd=Long.parseLong(s);
		setUserid(idd);
	    ResultSet rs=dl.EditU(idd);
		if(rs.next()){     
			//LoginAction la=new LoginAction();
			setFirstname(rs.getString(2));
			setLastname(rs.getString(3));
			setAddress(rs.getString(11));
			setCity((rs.getString(4)));
			setE_mail(rs.getString(5));
			setPhone(rs.getLong(6));
			String sdate=sd.format(rs.getDate(7));
			setDateofbirth(sdate);
			setPincode(rs.getLong(9));
		}
		return "EditCust" ;
		
	}
	

public String Edituser()throws SQLException,ClassNotFoundException{
	System.out.println();
	int i=dl.Edituser(getUserid(),getBroker_id(),getFirstname(),getLastname(),getAddress(),getCity(),getE_mail(),getPhone(),getPincode());
	return "Edituser";

	}

public String seeHistory()throws SQLException,ClassNotFoundException{
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yyyy"); 
	Map sess=ActionContext.getContext().getSession();
	String s1=(String)sess.get("USERID");
	alist=new ArrayList<LoginAction>();
	Long idd=Long.parseLong(s1);
	System.out.println("See History Loginid"+idd);
	ResultSet rs=dl.Share(idd);
	while(rs.next()){     
		LoginAction la=new LoginAction();
		la.setCompname(rs.getString(1));
		la.setNo_share(rs.getLong(2));
		la.setShareamt(rs.getLong(3));
		la.setDatetrans(sd.format(rs.getDate(4)));
		la.setType(rs.getString(5));
		la.setByWhom(rs.getString(6));
		alist.add(la);
	}
	sess.put("transhistory", alist);
	return "Share";
}
private Long req_id;

public String getDatetrans() {
	return Datetrans;
}
public void setDatetrans(String datetrans) {
	Datetrans = datetrans;
}
public Long getReq_id() {
	return req_id;
}
public void setReq_id(Long reqId) {
	req_id = reqId;
}
public String shr()throws Exception{
Long ano=null;
ResultSet rs=dl.getAccno(ano);
Long balance=rs.getLong(1);
if(balance<getAmtcut())
{
	int i=dl.req(getReq_id());
}
else
{
	double newbal= balance-getAmtcut();
	int j=dl.a(newbal,ano,req_id,getAmtcut(),comp_id,no_share,userid);
	ResultSet rss=dl.b(comp_id, userid);
	if(rs.next())
	{
		int k=dl.b1(comp_id,userid,no_share);
	}
	return"shr";

}
return "";
}

//---------------------By Broker--------------------// 

public String reqBroker()throws Exception
{
	System.out.println(getUserid());
	int i=dl.addrequest(getUserid(),getBroker_id(),getCompname(),getNo_share(),getType());
	
	return SUCCESS;
}
private String remark;
private String want;
private String status;
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public String getWant() {
	return want;
}
public void setWant(String want) {
	this.want = want;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String seeDetails()throws Exception
{
	Map sess=ActionContext.getContext().getSession();
	String s1=(String)sess.get("USERID");
	alist=new ArrayList<LoginAction>();
	Long idd=Long.parseLong(s1);
	ResultSet rs=dl.reqdetail(idd);
	while(rs.next()){     
		LoginAction la=new LoginAction();
		la.setCompname(rs.getString(1));
		la.setNo_share(rs.getLong(2));
		la.setBrokername(rs.getString(3)+"  "+rs.getString(4));
		la.setStatus(rs.getString(5));
		la.setRemark(rs.getString(6));
		la.setWant(rs.getString(7));
		alist.add(la);
	}
	sess.put("seedetails", alist);
	return SUCCESS;
}
public String brkSale()throws Exception
{
	Map sess=ActionContext.getContext().getSession();
	String s1=(String)sess.get("BROKERID");
	alist=new ArrayList<LoginAction>();
	Long idd=Long.parseLong(s1);
	ResultSet rs=dl.seerequest(idd);
	while(rs.next())
	{
		System.out.println("@@@@@@@@@@@@");
		LoginAction la=new LoginAction();
		la.setCid(rs.getLong(1));
		la.setCompname(rs.getString(2));
		la.setNo_share(rs.getLong(3));
		System.out.println("User Id is:"+rs.getLong(4));
		la.setUserid(rs.getLong(4));
		la.setUsername(rs.getString(5)+" "+rs.getString(6));
		la.setId(rs.getLong(7));
		la.setBroker_id(rs.getLong(8));
		alist.add(la);
	}
	sess.put("salerequest", alist);
	return SUCCESS;
}

public String brkPurchase() throws Exception
{
	Map sess=ActionContext.getContext().getSession();
	String s1=(String)sess.get("BROKERID");
	alist=new ArrayList<LoginAction>();
	Long idd=Long.parseLong(s1);
	ResultSet rs=dl.seerequest1(idd);
	while(rs.next())
	{
		System.out.println("@@@@@@@@@@@@@@@");
		LoginAction la=new LoginAction();
		la.setCid(rs.getLong(1));
		la.setCompname(rs.getString(2));
		la.setNo_share(rs.getLong(3));
		System.out.println("User Id is:"+rs.getLong(4));
		la.setUserid(rs.getLong(4));
		la.setUsername(rs.getString(5)+" "+rs.getString(6));
		la.setId(rs.getLong(7));
		la.setBroker_id(rs.getLong(8));
		alist.add(la);
	}
	sess.put("purchaserequest", alist);
	return SUCCESS;
}
private Long brkaccno;
public Long getBrkaccno() {
	return brkaccno;
}
public void setBrkaccno(Long brkaccno) {
	this.brkaccno = brkaccno;
}
public String saleProcess() throws Exception
{
	Long accno=null;Long balance=null;Long qty=null;Long price=null;
	setId(getId());setCid(getCid());setCompname(compname);
	setUserid(userid);setUsername(username);setNo_share(no_share);
	System.out.println("Trid:"+id+" compid is: "+cid+" compname is:"+compname+" Usr id is:"+userid+" Username is: "+username+" No of Share"+no_share+" Broker Id is"+broker_id);
	//ResultSet rst=DbConnect.getStatement().executeQuery("select compname from  company where comp_id="+getCid()+"");
	ResultSet rs2=dl.returnAccno(userid);
	if(rs2.next())
	{
		accno=rs2.getLong(1);
		setBankaccount_no(accno);
	}
	System.out.println("Acc No is:"+accno);
/*	ResultSet rss=dl.retBalance(accno);
	if(rss.next())
	{
		balance=rss.getLong(1);
	}
	System.out.println("Balance is :"+balance);  */
	
	ResultSet rs1=DbConnect.getStatement().executeQuery("select no_share from FINALALLOCATION where user_id="+getUserid()+" and comp_id="+getCid()+"");
	if(rs1.next())
	{
		setAcshare(rs1.getLong(1));
	}
	System.out.println("Users No of Share is: "+acshare);
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
    java.util.Date d=new java.util.Date();
    String sdate=sd.format(d);
	ResultSet rs=dl.ret(getCid(),sdate);
	
	if(rs.next())
	{
		price=rs.getLong(1);
	}
	System.out.println("Price Is: "+price);
	setShareamt(price);
	double a=getNo_share()*price*.05;
	setBroamount(getNo_share()*price*.05);
	//double total= getNo_share()*price-a;
	double total= getNo_share()*price;
	setAmtdep(total);
	ResultSet rss2=dl.retriveinform(getBroker_id());
	if(rss2.next())
	{
		setDemataccount_no(rss2.getLong(1));
		setBrkaccno(rss2.getLong(2));
	}
	return SUCCESS;
}

public String purchaseProcess() throws Exception
{
	Long accno=null;Long balance=null;Long qty=null;Long price=null;
	setId(getId());setCid(getCid());setCompname(compname);
	setUserid(userid);setUsername(username);setNo_share(no_share);
	System.out.println("Trid:"+id+" compid is: "+cid+" compname is:"+compname+" Usr id is:"+userid+" Username is: "+username+" No of Share"+no_share+" Broker Id is"+broker_id);
	//ResultSet rst=DbConnect.getStatement().executeQuery("select compname from  company where comp_id="+getCid()+"");
	ResultSet rs2=dl.returnAccno(userid);
	if(rs2.next())
	{
		accno=rs2.getLong(1);
		setBankaccount_no(accno);
	}
	System.out.println("Acc No is:"+accno);
	ResultSet rss=dl.retBalance(accno);
	if(rss.next())
	{
		balance=rss.getLong(1);
	}
	System.out.println("Balance is :"+balance);  
	setPresentAmount(balance);
	ResultSet rs1=DbConnect.getStatement().executeQuery("select no_share from FINALALLOCATION where user_id="+getUserid()+" and comp_id="+getCid()+"");
	if(rs1.next())
	{
		setAcshare(rs1.getLong(1));
	}
	System.out.println("Users No of Share is: "+acshare);
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
    java.util.Date d=new java.util.Date();
    String sdate=sd.format(d);
	ResultSet rs=dl.ret(getCid(),sdate);
	
	if(rs.next())
	{
		price=rs.getLong(1);
	}
	System.out.println("Price Is: "+price);
	setShareamt(price);
	double a=getNo_share()*price*.05;
	setBroamount(getNo_share()*price*.05);
	//double total= getNo_share()*price+a;
	double total= getNo_share()*price+a;
	setAmtcut(total);
	
	ResultSet rss2=dl.retriveinform(getBroker_id());
	if(rss2.next())
	{
		setDemataccount_no(rss2.getLong(1));
		setBrkaccno(rss2.getLong(2));
	}
	return SUCCESS;
}

public String saleProcessed()throws Exception
{
	System.out.println("SALE PROCESS");
	System.out.println("request id is"+getId());
	System.out.println("usre account is:"+bankaccount_no +"user balance is"+getAmtdep());
	System.out.println("broker account is:"+brkaccno +"broker balance is"+broamount);
	if(no_share>acshare)
	{
		setMsg("Sale Unsuccessful");
		int i=DbConnect.getStatement().executeUpdate("update requested set status='processed',remark='Sale Fail' where req_id="+getId()+"");
	}
	else
	{
		int i=DbConnect.getStatement().executeUpdate("update requested set status='processed',remark='Sale Success' where req_id="+getId()+"");
		int j=DbConnect.getStatement().executeUpdate("update ACCOUNT set balance=balance+"+getAmtdep()+" where ACCNO="+bankaccount_no+"");
		int k=DbConnect.getStatement().executeUpdate("update ACCOUNT set balance=balance+"+broamount+" where ACCNO="+brkaccno+"");
		int l=dl.sharup(getCid(),getNo_share());
		int m=dl.TransBroSale(userid,cid,no_share,getAmtdep());
	}
	return SUCCESS;
}

public String purchaseProcessed()throws Exception
{
	System.out.println("SALE PROCESS");
	System.out.println("request id is"+getId());
	System.out.println("usre account is:"+bankaccount_no +"user balance is"+getAmtdep());
	System.out.println("broker account is:"+brkaccno +"broker balance is"+broamount);
	if(amtcut>PresentAmount)
	{
		setMsg("Purchase Unsuccessful");
		int i=DbConnect.getStatement().executeUpdate("update requested set status='processed',remark='Purchase Fail' where req_id="+getId()+"");
	}
	else
	{
		int i=DbConnect.getStatement().executeUpdate("update requested set status='processed',remark='Purchase Success' where req_id="+getId()+"");
		int j=DbConnect.getStatement().executeUpdate("update ACCOUNT set balance=balance-"+getAmtcut()+" where ACCNO="+bankaccount_no+"");
		int k=DbConnect.getStatement().executeUpdate("update ACCOUNT set balance=balance+"+broamount+" where ACCNO="+brkaccno+"");
		int l=dl.sharedown(getCid(),getNo_share());
		int m=dl.TransBroBuy(userid,cid,getNo_share(),amtcut);
	}
	return SUCCESS;
}
public String historyComp() throws Exception
{
	mapForSelect=new HashMap<Integer, String>();
	ResultSet rs=DbConnect.getStatement().executeQuery("select c.comp_id,c.compname from company c,login l where l.login_id=c.login_id and l.status='approved' ");
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1), rs.getString(2));
	}
	return SUCCESS;
}
public String compHistory() throws Exception
{
	setComp_id(getComp_id());
	System.out.println("Company id :"+comp_id);
	ResultSet rs=DbConnect.getStatement().executeQuery("select compname from company where comp_id="+getComp_id()+"");
	if(rs.next())
	{
		Map sess=ActionContext.getContext().getSession();
		
		String compidd=String.valueOf(comp_id);
		System.out.println("Comp Id is:"+compidd);
		String compnamee=rs.getString(1);
		System.out.println("Company Name is:"+compnamee);
		sess.put("COMPID", compidd);
		sess.put("COMPNAME", compnamee);
	}
	return SUCCESS;
}


//--------------------------------FEEDBACK MANAGEMRNT---------------------------//


public String select_level;
public String reply;

public String getReply() {
	return reply;
}
public void setReply(String reply) {
	this.reply = reply;
}
public String getSelect_level() {
	return select_level;
}
public void setSelect_level(String selectLevel) {
	select_level = selectLevel;
}
public String GiveFeedback1()throws Exception
{
	int i=0;
	Map session=ActionContext.getContext().getSession();
	
	String type1=(String)session.get("UTYPE");
	String id=null;
	if(type1.equalsIgnoreCase("user"))
	{ 
		 id=(String)session.get("USERID");
	}
	else if(type1.equalsIgnoreCase("broker"))
	{ 
		 id=(String)session.get("BROKERID");
	}
	else if(type1.equalsIgnoreCase("company"))
	{ 
		 id=(String)session.get("COMPID");
	}
	
	
	i=dl.retGiveFeedback1(type1,getSubject(),getContent(),id);//insert in feedback table i.e is given by the either do,customer,agent to admin
	
	
	if(type1.equalsIgnoreCase("user"))
	{
	
	   return "givefeed2";
		
	}
	else if(type1.equalsIgnoreCase("broker"))
	{
	
	   return "givefeed1";
      
	}
	else if(type1.equalsIgnoreCase("company"))
	{
	  
	   return "givefeed3";
	}
	return "feedbackfail";
}

private String uname;
private String fname;
private String date;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}

public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String divSeeFeedback() throws Exception
{    
	alist=new ArrayList<LoginAction>();
	SimpleDateFormat sd=new SimpleDateFormat("dd/MMM/yyyy");
	ResultSet rs=dl.retdivseefeedback(getSelect_level());// admin give the feedback to the do,agent,customer
	
    while(rs.next())
    {
    	LoginAction la=new LoginAction();
    	la.setUname(rs.getString(1));//fd id 
    	la.setFname(rs.getString(6));//sender id
    	la.setSubject(rs.getString(3));//subject
    	String s=sd.format(rs.getDate(5));// date of post
    	la.setDate(s);
    	alist.add(la);
    }
    
    //rest two element that is view and reply is written in jsp page..
    
    Map sess=ActionContext.getContext().getSession();
    sess.put("seefeed", alist);
	return "SeeFeedback";
}
Map session4=ActionContext.getContext().getSession();
String type1=(String)session4.get("UTYPE");
 public String viewFeedback() throws Exception //when admin click on view link
    {
    	System.out.println(getUname());
    	
    	ResultSet rs=dl.seeFeeback(getUname());//passing the fd id and extract content
    	if(rs.next())
    	{
    		setContent(rs.getString(1));// it print the content send by the agent,do,customer by help of sender id
    	}
    	return "viewnfeedback";
    }
 
 public String postfeed()throws Exception  //when admin click on reply link
 {
	 setUname(getUname());// it set the value of uname that is here fd id (who is giving feedback to admin) after getting the id of sender admin give the reply to it
	 return "post";
 }
 public String replyFeedback()throws Exception  //admin give reply
	{
		int i=0;
		i=dl.retreplyFeedback(getContent(),getUname());//it update feedback table by matching with the sender id and additional send sys date
		setMsg("Reply is posted successfully.........."); 
		   return "replyfeedback";
	}
  
 public String replysee() throws Exception  //reply seen by do,agent,customer
    {   
    	SimpleDateFormat sd=new SimpleDateFormat("dd/MMM/yyyy");
    	
    	Map session=ActionContext.getContext().getSession();
    	
    	String type1=(String)session.get("UTYPE");
    	String id=null;
    	if(type1.equalsIgnoreCase("user"))
    	{ 
    		 id=(String)session.get("USERID");
    	}
    	else if(type1.equalsIgnoreCase("broker"))
    	{ 
    		 id=(String)session.get("BROKERID");
    	}
    	else if(type1.equalsIgnoreCase("company"))
    	{ 
    		 id=(String)session.get("COMPID");
    	}
    	ResultSet rs=dl.replysee(id);	// it extract the all content of feedback table by match ing with the login id and sender id 
    	alist=new ArrayList<LoginAction>();
    	while(rs.next())
        {
        	LoginAction la=new LoginAction();
        	la.setUname(rs.getString(1)); //it is feedback id
        	la.setSubject(rs.getString(3));// subject send
        	String s=sd.format(rs.getDate(5));
        	la.setDate(s);//date
        	la.setFname(rs.getString(8));
        	alist.add(la);
        }
        Map sess=ActionContext.getContext().getSession();
        sess.put("seefeedreply", alist);
        if(type1.equalsIgnoreCase("user"))
    	{ 
    	   return "replysee2";
    	}
    	else if(type1.equalsIgnoreCase("broker"))
    	{ 
    	   return "replysee1";
    	}
    	else if(type1.equalsIgnoreCase("company"))
    	{ 
    	   return "replysee";
    	}
    	return "replysee";
    }
  public String reply1() throws Exception
    {
    	System.out.println(getUname());
        Map session=ActionContext.getContext().getSession();
    	
    	String type1=(String)session.get("UTYPE");
    	ResultSet rs=dl.reply1(getUname());
    	if(rs.next())
    	{
    		setContent(rs.getString(1));
    	}
    	if(type1.equalsIgnoreCase("user"))
    	{ 
    	   return "reply12";
    	}
    	else if(type1.equalsIgnoreCase("broker"))
    	{ 
    	   return "reply13";
    	}
    	else if(type1.equalsIgnoreCase("company"))
    	{ 
    	   return "reply11";
    	}
    	return "reply1";
    }
  
  public String reply2() throws Exception
    {
    	System.out.println(getUname());
Map session=ActionContext.getContext().getSession();
    	
    	String type1=(String)session.get("UTYPE");
    	ResultSet rs=dl.reply2(getUname());
      if(rs.next())
    	{
    		setReply(rs.getString(1));
    	}
    	if(type1.equalsIgnoreCase("user"))
    	{ 
    	   return "reply22";
    	}
    	else if(type1.equalsIgnoreCase("broker"))
    	{ 
    	   return "reply23";
    	}
    	else if(type1.equalsIgnoreCase("company"))
    	{ 
    	   return "reply21";
    	}
    	return "reply2";
    }
  
  
public String Tips()throws Exception
{
	int i=DbConnect.getStatement().executeUpdate("update tips set tip='"+getAddress()+"'");
	return "tips";
}

public String viewTips()throws Exception
{
	//int i=DbConnect.getStatement().executeUpdate("update tips set tip='"+getAddress()+"'");
	ResultSet rs=DbConnect.getStatement().executeQuery("select * from tips");
	if(rs.next())
	{
		setMsg(rs.getString(1));
	}
	return "tips";
}
  
  public String Logout()throws Exception
	{
	Map map=ActionContext.getContext().getSession();
	map.clear();
		return "Logout";
	}
public String euserlogin()
{
	System.out.println("Logout");
return SUCCESS;
}

public String compShareDetail()throws Exception
{
	
	alist=new ArrayList<LoginAction>();
	java.util.Date d=new java.util.Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	String sdate=sd.format(d);
	ResultSet rs=DbConnect.getStatement().executeQuery("select c.compname,sh.NO_SHARE,sh.SHAREPRICE from login l,company c,SHARE_DETAILS sh where l.login_id=c.login_id and c.comp_id=sh.comp_id and sh.DATEOFTRANS='"+sdate+"' ");
	while(rs.next())
	{
		LoginAction la=new LoginAction();
		la.setCompname(rs.getString(1));
		la.setNo_share(rs.getLong(2));
		la.setShareamt(rs.getLong(3));
		alist.add(la);
	}
	Map map=ActionContext.getContext().getSession();
	map.put("compsharedeatil", alist);
	return SUCCESS;
}
public String riskCal()throws Exception{
	mapForSelect= new HashMap<Integer,String>();
	ResultSet rs=dl.Retcomp();
	while(rs.next())
	{
		mapForSelect.put(rs.getInt(1),rs.getString(2));
	}
	return "riskCal";
}

  public String rCal()
  {
	  System.out.println("Risk Calculate"+cid);
	  Long cidd=getCid();
	  Map map=ActionContext.getContext().getSession();
	  map.put("companynames", cidd); 
	  return "rCal";
  }
  
  public String forgetPassword()throws Exception
  {
	  ResultSet rs=DbConnect.getStatement().executeQuery("select * from login where USERNAME='"+username+"' and USERTYPE='"+usertype+"' and SECURITYQUESTION='"+security+"' and ANSWER='"+answer+"' ");
	  if(rs.next())
	  {
		  setId(rs.getLong(1));
		  return SUCCESS;  
	  }
	  setMsg("Incorrect Login!!!");
	  return "abc";
  }
  
  public String changePwd()throws Exception
  {
	  int i=DbConnect.getStatement().executeUpdate("update login set password='"+password+"' where login_id="+id+"");
	  setMsg("New Password Is Set. U can Login Now !!!");
	  return SUCCESS;
  }
}

