package manage;


public class Course {
	int Cid;
	String Cname;
	String address;
	String time;
	String Ccourse;
	public int setCid(int Cid){
		this.Cid=Cid;
		return Cid;
	}
	public String setCname(String Cname){
		this.Cname=Cname;
		return Cname;
	}
	public String setCaddress(String address){
		this.address=address;
		return address;
	}
	public String setCtime(String time){
		this.time=time;
		return time;
	}
	void title(){
		System.out.println("--------------------------------开设课程-------------------------------------");
	}
}
class Choose extends Course{
	Choose(){
	}
	public int setCCid(int Cid){
		this.Cid=Cid;
		return Cid;
	}
	public String setCSname(String Cname){
		this.Cname=Cname;
		return Cname;
	}
	public String setCcourse(String Ccourse) {
		this.Ccourse=Ccourse;
		return Ccourse;
	}
	public String setCCaddress(String address){
		this.address=address;
		return address;
	}
	public String setCCtime(String time){
		this.time=time;
		return time;
	}
	void title(){
		System.out.println("---------------------------------选课信息------------------------------------");
	}
}
class Drop{
	int Did;
	String Dname;
	String Dclass;
	String Dcourse;
	String Dcourseid;
	public int setDid(int Did) {
		this.Did=Did;
		return Did;
	}
	public String setDname(String Dname){
		this.Dname=Dname;
		return Dname;
	}
	public String setDcourse(String Dcourse) {
		this.Dcourse=Dcourse;
		return Dcourse;
	}
	String setDcourseid(String Dcourseid) {
		this.Dcourseid=Dcourseid;
		return Dcourseid;
	}
	void title(){
		System.out.println("---------------------------------退课信息------------------------------------");
	}
	void show() {
		
	}
}
