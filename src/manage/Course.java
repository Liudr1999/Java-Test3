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
		System.out.println("------------------------选课信息---------------------------");
	}
}
class drop{
	drop(){
	}
	
	void title(){
		System.out.println("------------------------退课信息---------------------------");
	}
}
