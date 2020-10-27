package manage;


public class Course {
	int Cid;
	String Cname;
	String address;
	String time;
}
class choose extends Course{
	choose(){
	}
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
		System.out.println("------------------------课程信息---------------------------");
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
		System.out.println("------------------------退课信息---------------------------");
	}
	void show() {
		
	}
}
