package manage;


class Person {
	int id;
	String name;
	String sex;
	String course;
	String sclass;
}
class Teacher extends Person{
	Teacher(){
	}
	public int setid(int id){
		this.id = id;
		return id;
	}
	public String setTname(String name){
		this.name=name;
		return this.name;
	}
	public String setTsex(String sex){
		this.sex=sex;
		return this.sex;
	}
	public String setTcouse(String course){
		this.course=course;
		return course;
	}
	void title(){
		System.out.println("--------------------------------��ְ����Ϣ-----------------------------------");
	}
	void show(){
		System.out.println("  ��ְ���ţ�"+id+"  ��ʦ������"+name+"  �Ա�:"+sex+"  ���ڿγ̣�"+course);
	}
}
class Student extends Person{
	Student(){
	}
	public int setid(int id){
		this.id = id;
		return id;
	}
	public String setSname(String name){
		this.name=name;
		return this.name;
	}
	public String setSsex(String sex){
		this.sex=sex;
		return this.sex;
	}
	public String setScourse(String course){
		this.course=course;
		return course;
	}
	public String setSclass(String sclass) {
		this.sclass=sclass;
		return sclass;
	}
	void title(){
		System.out.println("----------------------------ѧ����Ϣ--------------------------------");
	}
}