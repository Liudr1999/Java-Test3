package manage;

import manage.Course;
import manage.Person;

public class Text {
	public static void main(String args[]){
		Teacher tea01 = new Teacher();
		tea01.title();
		
		tea01.setid(1);
		tea01.setTname("Susan");
		tea01.setTsex("Male  ");
		tea01.setTcouse("计算机基础");
		tea01.show();
		
		Teacher tea02 = new Teacher();
		tea02.setid(2);
		tea02.setTname("Lisen");
		tea02.setTsex("Male  ");
		tea02.setTcouse("高等数学");
		tea02.show();
		
		Teacher tea03 = new Teacher();
		tea03.setid(3);
		tea03.setTname("Smith");
		tea03.setTsex("Female");
		tea03.setTcouse("应用文写作");
		tea03.show();
		
		Student stu1 = new Student();
		stu1.title();
		stu1.setid(14);
		stu1.setSname("Lily Han");
		stu1.setSsex("Female");
		stu1.setScouse("应用文写作");
		stu1.show();
		
		Student stu2 = new Student();
		stu2.setid(22);
		stu2.setSname("Bob Liu ");
		stu2.setSsex("Male  ");
		stu2.setScouse("高等数学");
		stu2.show();
		
		Student stu3 = new Student();
		stu3.setid(35);
		stu3.setSname("Lihang  ");
		stu3.setSsex("Male  ");
		stu3.setScouse("艺术鉴赏");
		stu3.show();
		
		choose ch1 = new choose();
		ch1.title();
		ch1.setCid(100200);
		ch1.setCaddress("教201");
		ch1.setCtime("每周四中午13：00~14：00");
		
		choose ch2 = new choose();
		ch2.setCid(100340);
		ch2.setCaddress("教405");
		ch2.setCtime("每周二晚上7：00~9：00");
		
		choose ch3 = new choose();
		ch3.setCid(100450);
		ch3.setCaddress("教703");
		ch3.setCtime("每周五下午14：00~17：00");
		
		drop d1 = new drop();

		
		
		System.out.println("课程号："+ch1.Cid+"  课程名称："+tea01.course+"  上课地点："+ch1.address+"  上课时间："+ch1.time+"  授课教师："+tea01.name);
		System.out.println("课程号："+ch2.Cid+"  课程名称："+tea02.course+"    "+"  上课地点："+ch2.address+"  上课时间："+ch2.time+"    授课教师："+tea02.name);
		System.out.println("课程号："+ch3.Cid+"  课程名称："+tea03.course+"  上课地点："+ch3.address+"  上课时间："+ch3.time+"  授课教师："+tea03.name);
		System.out.println("课程号："+ch3.Cid+"  课程名称："+tea03.course+"  上课地点："+ch3.address+"  上课时间："+ch3.time+"  授课教师："+tea03.name);
	}

}
