package pkg;

import pkg.DbConnect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class DbLogic {

Connection con=null;
Statement st=null;
ResultSet rs=null;
public ResultSet RetLogin(String username,String password,String usertype)
throws SQLException,ClassNotFoundException {
	rs=DbConnect.getStatement().executeQuery("select * from login where username='"+username+"' and password='"+password+"'and usertype='"+usertype+"'");
	return rs;
}
public ResultSet RetUser()throws SQLException,ClassNotFoundException 
{
	rs=DbConnect.getStatement().executeQuery("select * from login where usertype='user'");
	return rs;
}

public int Approveuser(Long id)throws SQLException,ClassNotFoundException{
	int i=DbConnect.getStatement().executeUpdate("update login set status='approved' where login_id="+id+"");
	return i;
}

public int RejectUser(Long id)throws SQLException,ClassNotFoundException{
	int i=DbConnect.getStatement().executeUpdate("delete from login where loginid="+id+"");
	return i;
}

public ResultSet addbroker(String firstname, String lastname, String username,
		String password, String address, String gender, String eMail,
		Number phone, String experience, String security, String answer, Long demat, Long bankacc, Double amt) throws SQLException {
	// TODO Auto-generated method stub
	Long logid=null;
	int i=DbConnect.getStatement().executeUpdate("insert into login values(login_seq.nextval,'"+username+"'||username_seq.nextval,'"+password+"','not approved','broker','"+security+"','"+answer+"') ");
	int j=DbConnect.getStatement().executeUpdate("insert into broker values(broker_seq.nextval,'"+firstname+"','"+lastname+"','"+address+"','"+gender+"','"+eMail+"',"+phone+",'"+experience+"',login_seq.nextval-1,"+demat+","+bankacc+")");
    int k=DbConnect.getStatement().executeUpdate("insert into account values("+bankacc+","+amt+")");
	ResultSet rss=DbConnect.getStatement().executeQuery("select login_seq.nextval-2 from dual");
	if(rss.next())
	{
		logid=rss.getLong(1);
	}
	rs=DbConnect.getStatement().executeQuery("select username from login where login_id="+logid+"");
	return rs;
	
}
public int addComp(String compname, long shareamt,long no_share,Long sindex)throws SQLException{
	int i=DbConnect.getStatement().executeUpdate("insert into SHARE_DETAILS values(comp_seq.nextval-1,"+shareamt+","+no_share+",sysdate,"+sindex+")");
	return i;
	
}

public ResultSet Editcomp()throws SQLException,ClassNotFoundException{
	rs=DbConnect.getStatement().executeQuery("select comp_id,compname from company");
return rs;
}

public ResultSet adduser(String firstname, String lastname, String username,
		String password, String address, String city, String eMail, Long phone,
		String security, String answer, String dob,
		Long pincode)throws SQLException {
	// TODO Auto-generated method stub
	Long logid=null;
	int i=DbConnect.getStatement().executeUpdate("insert into login values(login_seq.nextval,'"+username+"'||username_seq.nextval,'"+password+"','not approved','user','"+security+"','"+answer+"') ");
	int j=DbConnect.getStatement().executeUpdate("insert into customer values(user_seq.nextval,'"+firstname+"','"+lastname+"','"+city+"','"+eMail+"',"+phone+",'"+dob+"',sysdate,"+pincode+",login_seq.nextval-1,'"+address+"')");
	ResultSet rss=DbConnect.getStatement().executeQuery("select login_seq.nextval-2 from dual");
	if(rss.next())
	{
		logid=rss.getLong(1);
	}
	rs=DbConnect.getStatement().executeQuery("select username from login where login_id="+logid+"");
	return rs;
}
public ResultSet retid(String username) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select user_seq.nextval-1 from dual");
	return rs;
}
public int nextadd(Long id,Long broker_name,Long bankaccountNo, String bankname, String branchname,
		String pancard_no, Long demataccountNo,double balance) throws SQLException {
	// TODO Auto-generated method stub
	int j=DbConnect.getStatement().executeUpdate("insert into customer_details values("+id+",'"+pancard_no+"','"+bankname+"','"+branchname+"',"+bankaccountNo+","+demataccountNo+","+broker_name+")");
	int k=DbConnect.getStatement().executeUpdate("insert into account values("+bankaccountNo+","+balance+")");
	return j;
}
public int Approveduser(Long id) throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("update login set userstatus='approved'where loginid="+id+"");
	return i;
}
public int Rejectuser(Long id) throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("delete from login where loginid="+id+"");
	return i;

}
public int Approvedbroker(Long id) throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("update login set userstatus='approved'where loginid="+id+"");
	return i;
}
public int Rejectbroker(Long id) throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("delete from login where loginid="+id+"");
	return i;
}
public ResultSet Retuser() throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from login where usertype='user'");
	return rs;
	
}
public ResultSet Retbroker() throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from login where usertype='broker'");
	return rs;
}
public ResultSet SelectUser(long userid) throws SQLException {
	// TODO Auto-generated method stub
	//Long id=Long.parseLong(userid);
	rs=DbConnect.getStatement().executeQuery("select l.loginid,l.username,l.password,c.firstname,c.lastname,c.city,c.e_mail,c.phno,c.dob,c.doReg,c.pincode,c.address,cd.pancard_no,cd.bank_name,cd.branch_name,cd.bank_acc_no,cd.demat_acc_no from login l,customer c,customer_details cd" +
			"where l.loginid=c.loginid and  c.user_id=cd.user_id and l.loginid="+userid+"");
	return rs;
}

public ResultSet Retshare()throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from company_share");
	return rs;
}


public ResultSet Delete(Long cid) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from company_share where comp_id="+cid+" ");
	return rs;
}
public int DelCompany(Long cid, String compname, Long shareamt, Long getnoShare) throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("delete from company where comp_id="+cid+"");
	return i;
}
public int Edbroker(Long broker_id, String firstname, String lastname,
		String address, String gender, String eMail, Long phone,
		String experience) throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("update broker set first_name='"+firstname+"',last_name='"+lastname+"',address='"+address+"',gender='"+gender+"',e_mail='"+eMail+"',phone="+phone+",experience='"+experience+"' where broker_id="+broker_id+"");
	return i;
}
public ResultSet Editbr()throws SQLException,ClassNotFoundException{
	rs=DbConnect.getStatement().executeQuery("select broker_id,firstname from broker");
return rs;
}
public ResultSet Editbroker(Long broker_id) throws SQLException {
	// TODO Auto-generated method stub
	
System.out.println("edit broker");
	rs=DbConnect.getStatement().executeQuery("select * from broker where broker_id="+broker_id+" ");
	return rs;
}
public int Delbroker(Long broker_id, String firstname, String lastname,
		String address, String gender, String eMail, Long phone,
		String experience) throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("delete from broker where broker_id="+broker_id+"");
	return i;
}
public ResultSet Deletebr()throws SQLException,ClassNotFoundException{
	rs=DbConnect.getStatement().executeQuery("select broker_id,firstname from broker");
return rs;
}
public ResultSet Deletebroker(Long broker_id) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from broker where broker_id="+broker_id+" ");
	return rs;
}
public ResultSet Rebroker(Long broker_id) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from login l,broker b where l.usertype='broker' and l.login_id=b.login_id and b.broker_id="+broker_id+"");
	return rs;
}
public ResultSet Rebroker1()throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select b.broker_id,b.first_name,b.last_name from broker b,login l where l.login_id=b.login_id and l.usertype='broker' and l.status='approved'");
	return rs;
}
public ResultSet Rebroker2()throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select b.broker_id,b.first_name,b.last_name from broker b,login l where l.login_id=b.login_id and l.usertype='broker' and l.status='not approved'");
	return rs;
}
public ResultSet Reuser()throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select c.user_id,c.first_name,c.last_name from customer c,login l where l.login_id=c.login_id and l.usertype='user' and l.status='not approved'");
	return rs;
}
public ResultSet Reuser1()throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select c.user_id,c.first_name,c.last_name from customer c,login l where l.login_id=c.login_id and l.usertype='user' and l.status='approved'");
	return rs;
}
public ResultSet app(Long broker_id)throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from broker where broker_id="+broker_id+"");
	return rs;
}

public int Appbr(Long broker_id)throws SQLException {
	// TODO Auto-generated method stub
int i=DbConnect.getStatement().executeUpdate("update login set status='approved' where login_id="+broker_id+"");
	return i;
}
public int Rejbr(Long broker_id) throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("delete from login where login_id="+broker_id+"");
	return i;
	
}
public ResultSet Apmail(Long id)throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from broker where login_id="+id+"");
	return rs;
}
public ResultSet Compreg(String compname, String address, String city, String state,
		Long offno, Long faxno, String website, String eMail, String username,
		String password, String security, String answer) throws SQLException {
	// TODO Auto-generated method stub
	Long logid=null;
	int i=DbConnect.getStatement().executeUpdate("insert into login values(login_seq.nextval,'"+username+"'||username_seq.nextval,'"+password+"','not approved','company','"+security+"','"+answer+"') ");
	int j=DbConnect.getStatement().executeUpdate("insert into company values(comp_seq.nextval,'"+compname+"','"+address+"','"+city+"','"+state+"',"+offno+","+faxno+",'"+website+"','"+eMail+"',login_seq.nextval-1,sysdate)");
	ResultSet rss=DbConnect.getStatement().executeQuery("select login_seq.nextval-2 from dual");
	if(rss.next())
	{
		logid=rss.getLong(1);
	}
	rs=DbConnect.getStatement().executeQuery("select username from login where login_id="+logid+"");
	return rs;
}
public ResultSet Recomp() throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select c.comp_id,c.compname  from company c,login l where l.login_id=c.login_id and l.status='approved'");
	//System.out.println("compname");
	return rs;
	
}
public ResultSet Recomp1() throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select c.comp_id,c.compname  from company c,login l where l.login_id=c.login_id and l.status='not approved'");
	return rs;
	
}
public ResultSet appcomp(Long comp_id)throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from company where comp_id="+comp_id+"");
	return rs;
}
public int Approvecomp(Long id) throws SQLException {
	// TODO Auto-generated method stub
	Long idd=null;
	rs=DbConnect.getStatement().executeQuery("select login_id from company where comp_id="+id+"");
	if(rs.next())
	{
		idd=rs.getLong(1);
	}
	System.out.println(idd);
	int i=DbConnect.getStatement().executeUpdate("update login set status='approved' where login_id="+idd+"");
	return i;
	
}
public int Rejectcomp(Long id) throws SQLException {
	// TODO Auto-generated method stub
	Long idd=null;
	rs=DbConnect.getStatement().executeQuery("select login_id from company where comp_id="+id+"");
	if(rs.next())
	{
		idd=rs.getLong(1);
	}
	System.out.println(idd);
	int i=DbConnect.getStatement().executeUpdate("delete from login where login_id="+idd+"");
	return i;
}


public ResultSet deleteCo(Long cid) throws SQLException {
	// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select * from company c,share_details s where c.comp_id=s.comp_id and c.comp_id="+cid+" ");
		return rs;
	}
public int delComp(Long cid, String compname, String address, String city,
		String state, Long offno, Long faxno, String website, String eMail,
		Long shareamt, Long getnoShare)throws SQLException {
	// TODO Auto-generated method stub
	Long id=null;
	rs=DbConnect.getStatement().executeQuery("select login_id from company where comp_id="+cid+"");
	if(rs.next())
	{
		id=rs.getLong(1);
	}
	int i=DbConnect.getStatement().executeUpdate("Delete from login where login_id="+id+"");
	return i;
}
public ResultSet edComp(String login_id)throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select c.comp_id,c.compname,c.address,c.city,c.state,c.offno,c.faxno,c.website,c.email from login l,company c where l.login_id=c.login_id and l.login_id="+login_id+"");
	return rs;
}
public int Editcomp(Long comp_id, String compname, String address, String city,
		String state, Long offno, Long faxno, String website, String e_mail) throws SQLException {
	// TODO Auto-generated method stub
int i =DbConnect.getStatement().executeUpdate("update company set address='"+address+"',city='"+city+"',state='"+state+"',offno="+offno+",faxno="+faxno+",website='"+website+"',email='"+e_mail+"'where comp_id="+comp_id+" ");
	return i;
}
public ResultSet Retcomp() throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from company c,login l where l.login_id=c.login_id and l.status='approved'");
	return rs;
}
public ResultSet Editshare(Long idd) throws SQLException {
	// TODO Auto-generated method stub
	
	rs=DbConnect.getStatement().executeQuery("select compname from company where comp_id="+idd+"");
	return rs;
}
public int Edshare(Long cid, Long shareamt,String datee, Long shareno, Long sindex) throws SQLException,ClassNotFoundException{
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("update share_details set no_share="+shareno+",shareprice="+shareamt+",shareindex="+sindex+" where comp_id="+cid+" and DATEOFTRANS='"+datee+"'");
	return i;
	
}
public ResultSet reviewDate(String datee, Long idd) throws Exception{
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from share_details where comp_id="+idd+" and DATEOFTRANS='"+datee+"'");
	return rs;
}
public int updShare(Long cid, Long shareamt, String datee, Long noShare,Long sindex) throws Exception{
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("insert into share_details values("+cid+","+noShare+","+shareamt+",'"+datee+"',"+sindex+")");
	return i;
}

public ResultSet Appuser(Long userid) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from customer where user_id="+userid+"");
	return rs;
}
public int Rejuser(Long id) throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("delete from login where login_id="+id+"");
	return i;
	
}
public ResultSet Brus(Long broker_id) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from broker where broker_id="+broker_id+" ");
	return rs;
	
}
public ResultSet Custmr(Long Userid) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select * from customer c,customer_details cd where c.user_id=cd.user_id and c.user_id="+Userid+" ");
	return rs;
	
}
public ResultSet Cmus(Long comp_id) throws SQLException {
	// TODO Auto-generated method stub
	java.util.Date d=new java.util.Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	String sdate=sd.format(d);
	System.out.println(comp_id);
	//String sql="select c.compname,s.shareprice,s.no_share from company c,share_details s where c.comp_id=s.comp_id and c.comp_id="+comp_id+" and s.DATEOFTRANS='"+sdate+"'";
	//System.out.println(sql);
	rs=DbConnect.getStatement().executeQuery("select c.comp_id,c.compname,s.shareprice,s.no_share from company c,share_details s where c.comp_id=s.comp_id and c.comp_id="+comp_id+" and s.DATEOFTRANS='"+sdate+"'");
	return rs;
}

public ResultSet Trans(Long userid) throws Exception{
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select c.user_id,c.first_name,c.last_name,cd.DEMAT_ACC_NO from customer c,CUSTOMER_DETAILS cd,login l where l.login_id=c.login_id and c.user_id=cd.user_id and l.login_id="+userid+"");
	return rs;
}
public ResultSet Rebroker11(Long idd)throws SQLException {
	// TODO Auto-generated method stub
	Long brid=null;
	ResultSet rss=DbConnect.getStatement().executeQuery("select cd.broker_id from from login l,CUSTOMER c,CUSTOMER_DETAILS cd where l.login_id=c.login_id and c.user_id=cd.user_id and l.login_id="+idd+"");
	if(rss.next())
	{
		brid=rss.getLong(1);
	}
	rs=DbConnect.getStatement().executeQuery("select b.broker_id,b.first_name,b.last_name from broker where broker_id="+brid+"");
	return rs;
}
public ResultSet ret(Long idd, String sdate) throws SQLException {
	System.out.println(idd+" "+sdate);
	rs=DbConnect.getStatement().executeQuery("select shareprice from share_details where comp_id="+idd+" and dateoftrans='"+sdate+"'");
	return rs;
}

public ResultSet retBalance(Long userid) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("Select balance from account where accno="+userid+"");
	return rs;
}
public ResultSet returnAccno(Long userid)throws Exception {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select bank_acc_no from CUSTOMER_DETAILS where user_id="+userid+"");
	return rs;
}
public ResultSet retrivecompname(String compname)throws Exception {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select compname from company where comp_id="+compname+"");
	return rs;
}
public int sharedown(Long comp_id, Long no_share)throws Exception {
	// TODO Auto-generated method stub
	int i,j = 0,k = 0;
	java.util.Date d=new java.util.Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	String s1=sd.format(d);
	i=DbConnect.getStatement().executeUpdate("update share_details set no_share=no_share-"+no_share+" where comp_id="+comp_id+" and DATEOFTRANS='"+s1+"'");
	rs=DbConnect.getStatement().executeQuery("select * from moreshare where types='bought' and DATEOFTRANS='"+s1+"'");
	if(rs.next()==true)
	{
		k=DbConnect.getStatement().executeUpdate("update moreshare set no_share=no_share+"+no_share+" where COMP_ID="+comp_id+" and types='bought' and DATEOFTRANS='"+s1+"'");
	}
	else
	{
		j=DbConnect.getStatement().executeUpdate("insert into moreshare values("+comp_id+","+no_share+",'bought','"+s1+"')");	
	}
	
	System.out.println("k value"+k+"and j value"+j);
return i;
}
public int shareupp(Long comp_id, Long no_share)throws Exception {
	// TODO Auto-generated method stub
	int i,j = 0,k = 0;
	java.util.Date d=new java.util.Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	String s1=sd.format(d);
	i=DbConnect.getStatement().executeUpdate("update share_details set no_share=no_share+"+no_share+" where comp_id="+comp_id+" and DATEOFTRANS='"+s1+"'");
	rs=DbConnect.getStatement().executeQuery("select * from moreshare where types='bought' and DATEOFTRANS='"+s1+"'");
	if(rs.next()==true)
	{
		k=DbConnect.getStatement().executeUpdate("update moreshare set no_share=no_share+"+no_share+" where COMP_ID="+comp_id+" and types='bought' and DATEOFTRANS='"+s1+"'");
	}
	else
	{
		j=DbConnect.getStatement().executeUpdate("insert into moreshare values("+comp_id+","+no_share+",'bought','"+s1+"')");	
	}
	
	System.out.println("k value"+k+"and j value"+j);
return i;
}
public int baldown(double newbalance, Long accountno, Long broaccno, Double bramt) throws Exception{
	// TODO Auto-generated method stub
	int j=DbConnect.getStatement().executeUpdate("update account set  balance="+newbalance+" where accno="+accountno+"");
	int i=DbConnect.getStatement().executeUpdate("update account set  balance=balance+"+bramt+" where accno="+broaccno+"");
	return i;
}
public int balup(double newbalance, Long accountno, Long broaccno, Double bramt) throws Exception{
	// TODO Auto-generated method stub
	int j=DbConnect.getStatement().executeUpdate("update account set  balance="+newbalance+" where accno="+accountno+"");
	int i=DbConnect.getStatement().executeUpdate("update account set  balance=balance+"+bramt+" where accno="+broaccno+"");
	return i;
}
public ResultSet returnAccount(Long demataccountNo)throws Exception {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select BANK_ACC_NO from CUSTOMER_DETAILS where DEMAT_ACC_NO="+demataccountNo+"");
	return rs;
}
public ResultSet broker1()throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select b.broker_id,b.first_name,b.last_name from broker b,login l where l.login_id=b.login_id and l.usertype='broker' and l.status='approved'");
	return rs;
}


public int sharup(Long comp_id, Long no_share)throws Exception {
	// TODO Auto-generated method stub
	int i,j = 0,k = 0;
	java.util.Date d=new java.util.Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	String s1=sd.format(d);
	i=DbConnect.getStatement().executeUpdate("update share_details set no_share=no_share+"+no_share+" where comp_id="+comp_id+" and DATEOFTRANS='"+s1+"'");
	rs=DbConnect.getStatement().executeQuery("select * from moreshare where types='sold' and DATEOFTRANS='"+s1+"'");
	if(rs.next()==true)
	{
		k=DbConnect.getStatement().executeUpdate("update moreshare set no_share=no_share+"+no_share+" where COMP_ID="+comp_id+" and types='sold' and DATEOFTRANS='"+s1+"'");
	}
	else
	{
		j=DbConnect.getStatement().executeUpdate("insert into moreshare values("+comp_id+","+no_share+",'sold','"+s1+"')");	
	}
	
	System.out.println("k value"+k+"and j value"+j);
return i;
}

public ResultSet Tran(Long userid) throws Exception{
	// TODO Auto-generated method stub
	String query="select c.user_id,c.first_name,c.last_name,cd.DEMAT_ACC_NO,cd.broker_id,b.FIRST_NAME,b.LAST_NAME from customer c,CUSTOMER_DETAILS cd,login l,broker b where l.login_id=c.login_id and c.user_id=cd.user_id and l.login_id="+userid+" and cd.broker_id=b.broker_id";
	rs=DbConnect.getStatement().executeQuery(query);
	System.out.println(query);
	return rs;
}
public ResultSet view(Long userid) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select c.compname,f.no_share from company c,finalallocation f,login l,customer cu where l.login_id=cu.login_id and c.comp_id=f.comp_id and cu.user_id=f.user_id and cu.login_id="+userid+"");
	return rs;
}
public int Edituser(Long userid, Long brokerId, String firstname,
		String lastname, String address, String city, String eMail, Long phone,
		Long pincode) throws SQLException {
	// TODO Auto-generated method stub
	Long useridd=null;
	rs=DbConnect.getStatement().executeQuery("select user_id from customer where login_id="+userid+"");
	if(rs.next())
	{
		useridd=rs.getLong(1);
	}
	int i=DbConnect.getStatement().executeUpdate("update customer set address='"+address+"',city='"+city+"',e_mail='"+eMail+"',phone="+phone+",pincode="+pincode+" where user_id="+useridd+"");
	return i;
}
public ResultSet Share(Long userid)throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select c.compname,t.SHAREAMOUNT,t.amount,t.dateoftrans,t.type,t.bywhom from company c,transaction t,login l,customer cu where c.comp_id=t.comp_id and l.login_id=cu.login_id and cu.user_id=t.user_id and l.login_id="+userid+" order by t.dateoftrans");
	return rs;
}
public int TransBuy(Long userid,Long compid,Long newbalance,Double amount)throws SQLException {
	// TODO Auto-generated method stub
	java.util.Date d=new java.util.Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	String sdate=sd.format(d);
	ResultSet rs1=DbConnect.getStatement().executeQuery("select * from transaction where type='purchase' and bywhom='self' and comp_id="+compid+" and DATEOFTRANS='"+sdate+"' and user_id="+userid+"");
	if(rs1.next()==true)
	{
		int l=DbConnect.getStatement().executeUpdate("update transaction set amount=amount+"+amount+",SHAREAMOUNT=SHAREAMOUNT+"+newbalance+" where type='purchase' and bywhom='self' and comp_id="+compid+" and DATEOFTRANS='"+sdate+"' and user_id="+userid+" ");
	}
	else
	{
		int i=DbConnect.getStatement().executeUpdate("Insert into transaction values(trans_seq.nextval,"+userid+",'"+sdate+"',"+amount+",'purchase','self',"+compid+","+newbalance+")");

	}
		ResultSet rss=DbConnect.getStatement().executeQuery("select * from FINALALLOCATION where user_id="+userid+" and comp_id="+compid+" ");
	if(rss.next()==true)
	{
		int j=DbConnect.getStatement().executeUpdate("update FINALALLOCATION set no_share=no_share+"+newbalance+" where user_id="+userid+" and comp_id="+compid+" ");	
	}
	else
	{
		int k=DbConnect.getStatement().executeUpdate("insert into FINALALLOCATION values("+userid+","+compid+","+newbalance+")");
	}
	return 1;
}


public int TransSale(Long userid,Long compid,Long newbalance,Double amount)throws SQLException {
	// TODO Auto-generated method stub
	java.util.Date d=new java.util.Date();
	SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	String sdate=sd.format(d);
	ResultSet rs1=DbConnect.getStatement().executeQuery("select * from transaction where type='sale' and bywhom='self' and comp_id="+compid+" and DATEOFTRANS='"+sdate+"' and user_id="+userid+"");
	if(rs1.next()==true)
	{
		int l=DbConnect.getStatement().executeUpdate("update transaction set amount=amount+"+amount+",SHAREAMOUNT=SHAREAMOUNT+"+newbalance+" where type='sale' and bywhom='self' and comp_id="+compid+" and DATEOFTRANS='"+sdate+"' and user_id="+userid+" ");
	}
	else
	{
		int i=DbConnect.getStatement().executeUpdate("Insert into transaction values(trans_seq.nextval,"+userid+",'"+sdate+"',"+amount+",'sale','self',"+compid+","+newbalance+")");

	}
		ResultSet rss=DbConnect.getStatement().executeQuery("select * from FINALALLOCATION where user_id="+userid+" and comp_id="+compid+" ");
	if(rss.next()==true)
	{
		int j=DbConnect.getStatement().executeUpdate("update FINALALLOCATION set no_share=no_share-"+newbalance+" where user_id="+userid+" and comp_id="+compid+" ");	
	}
	
	return 1;
}
public int Trans1(Long userid,Long amount,Double price,Double comp_id)throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("Insert into transaction values(trans_seq.nextval,"+userid+",sysdate,"+amount+",'sale','self',"+comp_id+","+price+")");
	return i;
}
/*public ResultSet retshare(Long userid) throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("Select no_share from account where accno="+userid+"");
	return rs;
}*/
public int req(Long comp_id, Long userid, Long brokerId, Long amount,String type)throws SQLException  {
	// TODO Auto-generated method stub
 int i=DbConnect.getStatement().executeUpdate("Inset into requested values(req_seq.nextval,"+brokerId+","+userid+","+comp_id+","+amount+",'notprocessed','notbought','"+type+"'"); 
		
	return i;
}
public ResultSet getAccno(Long ano)throws SQLException {
	// TODO Auto-generated method stub
	rs=DbConnect.getStatement().executeQuery("select balance from bank where Accno="+ano+"");
	return rs;
}
public int req(Long req_id)throws SQLException {
	// TODO Auto-generated method stub
int i=DbConnect.getStatement().executeUpdate("update requested set status='processed',remark='bought fail' where reqid="+req_id+"");	
	return i;
}
public int a(double newbal, Long ano, Long reqId, Double double1, Long compId,
		Long noShare,Long userid)throws SQLException {
	// TODO Auto-generated method stub
	int i=DbConnect.getStatement().executeUpdate("update bank set balance="+newbal+"where accno="+ano+"");
	int j=DbConnect.getStatement().executeUpdate("update requested set status='processed',remark='bought'wherereq_id="+reqId+"");
	int k=DbConnect.getStatement().executeUpdate("insert into transaction values(trans_seq.nextval,"+userid+",sysdate,"+double1+",'purchase','broker',"+compId+","+noShare+"");
	int m=DbConnect.getStatement().executeUpdate("update moreshare set no_share="+noShare+"where comp_id="+compId+"");
	
	return i;
}
public ResultSet b(Long comp_id,Long user_id)throws SQLException{
rs=DbConnect.getStatement().executeQuery("select * from finalallocation where userid="+user_id+"and comp_id="+comp_id+"");

	return rs;
}
	public int b1(Long comp_id,Long user_id, Long noShare)throws SQLException{
	int i=DbConnect.getStatement().executeUpdate("update finalallocation set no_share="+noShare+"where comp_id="+comp_id+"and user_id="+user_id+"");
		return i;
}
	public ResultSet returnbroaccount(Long brokerId) throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select BANK_ACC_NO from broker where broker_id="+brokerId+"");
		return rs;
	}
	public int addrequest(Long userid, Long brokerId, String compname,
			Long noShare,String type)throws Exception {
		// TODO Auto-generated method stub
		int i=DbConnect.getStatement().executeUpdate("insert into requested values(req_seq.nextval,"+brokerId+","+userid+","+compname+","+noShare+",'not processed','no transaction','"+type+"')");
		return i;
	}
	public ResultSet Rebrokerr() throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select b.broker_id,b.first_name,b.last_name from broker b,login l where l.login_id=b.login_id and l.status='approved'");
		return rs;
	}
	public ResultSet reqdetail(Long idd) throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select c.compname,r.SHAREAMOUNT,b.first_name,b.last_name,r.status,r.remark,r.want from company c,requested r,login l,customer cu,broker b where c.comp_id=r.comp_id and b.broker_id=r.broker_id and l.login_id=cu.login_id and cu.user_id=r.user_id and cu.login_id="+idd+"");
		return rs;
	}
	public ResultSet seerequest(Long idd) throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select c.comp_id,c.compname,r.shareamount,r.user_id,cu.first_name,cu.last_name,r.req_id,r.broker_id from login l,company c,requested r,customer cu,broker b where cu.user_id=r.user_id and c.comp_id=r.comp_id and l.login_id=b.login_id and b.broker_id=r.broker_id and r.status='not processed' and r.want='Sale' and l.login_id="+idd+" ");
		return rs;
	}
	public ResultSet seerequest1(Long idd) throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select c.comp_id,c.compname,r.shareamount,cu.user_id,cu.first_name,cu.last_name,r.req_id,r.broker_id from login l,company c,requested r,customer cu,broker b where cu.user_id=r.user_id and c.comp_id=r.comp_id and l.login_id=b.login_id and b.broker_id=r.broker_id and r.status='not processed' and r.want='Purchase' and l.login_id="+idd+" ");
		return rs;
	}
	public ResultSet retriveinform(Long brokerId) throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select demat_id,BANK_ACC_NO from broker where broker_id="+brokerId+"");
		return rs;
	}
	
	public int TransBroSale(Long userid,Long compid,Long newbalance,Double amount)throws SQLException {
		// TODO Auto-generated method stub
		java.util.Date d=new java.util.Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
		String sdate=sd.format(d);
		ResultSet rs1=DbConnect.getStatement().executeQuery("select * from transaction where type='sale' and bywhom='broker' and comp_id="+compid+" and DATEOFTRANS='"+sdate+"' and user_id="+userid+"");
		if(rs1.next()==true)
		{
			int l=DbConnect.getStatement().executeUpdate("update transaction set amount=amount+"+amount+",SHAREAMOUNT=SHAREAMOUNT+"+newbalance+" where type='sale' and bywhom='broker' and comp_id="+compid+" and DATEOFTRANS='"+sdate+"' and user_id="+userid+" ");
		}
		else
		{
			int i=DbConnect.getStatement().executeUpdate("Insert into transaction values(trans_seq.nextval,"+userid+",'"+sdate+"',"+amount+",'sale','broker',"+compid+","+newbalance+")");

		}
			ResultSet rss=DbConnect.getStatement().executeQuery("select * from FINALALLOCATION where user_id="+userid+" and comp_id="+compid+" ");
		if(rss.next()==true)
		{
			int j=DbConnect.getStatement().executeUpdate("update FINALALLOCATION set no_share=no_share-"+newbalance+" where user_id="+userid+" and comp_id="+compid+" ");	
		}
		
		return 1;
	}
	
	public int TransBroBuy(Long userid,Long compid,Long newbalance,Double amount)throws SQLException {
		// TODO Auto-generated method stub
		java.util.Date d=new java.util.Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
		String sdate=sd.format(d);
		ResultSet rs1=DbConnect.getStatement().executeQuery("select * from transaction where type='purchase' and bywhom='broker' and comp_id="+compid+" and DATEOFTRANS='"+sdate+"' and user_id="+userid+"");
		if(rs1.next()==true)
		{
			int l=DbConnect.getStatement().executeUpdate("update transaction set amount=amount+"+amount+",SHAREAMOUNT=SHAREAMOUNT+"+newbalance+" where type='purchase' and bywhom='broker' and comp_id="+compid+" and DATEOFTRANS='"+sdate+"' and user_id="+userid+" ");
		}
		else
		{
			int i=DbConnect.getStatement().executeUpdate("Insert into transaction values(trans_seq.nextval,"+userid+",'"+sdate+"',"+amount+",'purchase','broker',"+compid+","+newbalance+")");

		}
			ResultSet rss=DbConnect.getStatement().executeQuery("select * from FINALALLOCATION where user_id="+userid+" and comp_id="+compid+" ");
		if(rss.next()==true)
		{
			int j=DbConnect.getStatement().executeUpdate("update FINALALLOCATION set no_share=no_share+"+newbalance+" where user_id="+userid+" and comp_id="+compid+" ");	
		}
		else
		{
			int k=DbConnect.getStatement().executeUpdate("insert into FINALALLOCATION values("+userid+","+compid+","+newbalance+")");
		}
		return 1;
	}
	
//*******************************************************FEEDBACK MANAGEMENT*****************************************************************
	
	public int retGiveFeedback1(String type,String subject,String content,String id )throws Exception
	{   
		    java.util.Date d=new java.util.Date();
		    SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
		    String sdate=sd.format(d);
			int i=DbConnect.getStatement().executeUpdate("insert into Feedback(FB_ID,FEEDBACK_LEVEL,SUBJECT,CONTENT,FEEDBACK_DATE,SENDER_ID)values(FEED_SEQ.nextval,'"+type+"','"+subject+"','"+content+"','"+sdate+"','"+id+"')");
			return 0;	 
	 }
	public ResultSet  retdivseefeedback(String level) throws Exception
	{	    
		rs=DbConnect.getStatement().executeQuery("select * from FEEDBACK where FEEDBACK_LEVEL='"+level+"'");
		return rs;        
	}
	public ResultSet seeFeeback(String uname) throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select CONTENT from FEEDBACK where FB_ID='"+uname+"'");
		return rs;
	}
	public int retreplyFeedback(String content,String uname)throws Exception
	{
		java.util.Date d=new java.util.Date();
	    SimpleDateFormat sd=new SimpleDateFormat("dd-MMM-yy");
	    String sdate=sd.format(d);
			 int i=DbConnect.getStatement().executeUpdate("update FEEDBACK set REPLY='"+content+"',REPLY_DATE='"+sdate+"' where FB_ID="+uname+"");
			return 0;
		 
	 }
	public ResultSet  replysee(String id) throws Exception
	{	    
		rs=DbConnect.getStatement().executeQuery("select * from FEEDBACK where SENDER_ID='"+id+"'");
		return rs;        
	}
	public ResultSet reply1(String uname) throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select CONTENT from FEEDBACK where FB_ID='"+uname+"'");
		return rs;
	}
	public ResultSet reply2(String uname) throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select REPLY from FEEDBACK where FB_ID='"+uname+"'");
		return rs;
	}
	public ResultSet namevalidate(String uname) throws Exception{
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select * from LOGIN where USERNAME='"+uname+"'");
		return rs;
	}
	public ResultSet EditU(Long idd) throws SQLException {
		// TODO Auto-generated method stub
		rs=DbConnect.getStatement().executeQuery("select * from customer c,login l where l.login_id=c.login_id and l.login_id="+idd+"");
		return rs;
	}
	
	
	
	
	
	
}


