package manage;


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
				
		Student stu1 = new Student();
		stu1.title();
		stu1.setid(22);
		stu1.setSname("Bob Liu ");
		stu1.setSsex("Male  ");
		stu1.setScourse("高等数学");
		stu1.setSclass("财203");
		stu1.show();
		
		Student stu2 = new Student();
		stu2.setid(35);
		stu2.setSname("Li Hang ");
		stu2.setSsex("Male  ");
		stu2.setScourse("计算机基础");
		stu2.setSclass("计172");
		stu2.show();
		
		choose ch1 = new choose();
		ch1.title();
		ch1.setCid(100340);
		ch1.setCaddress("教405");
		ch1.setCtime("每周二晚上7：00~9：00");
		
		choose ch2 = new choose();
		ch2.setCid(100450);
		ch2.setCaddress("教703");
		ch2.setCtime("每周五下午14：00~17：00");
		
		System.out.println("  课程号："+ch1.Cid+"\t"+"课程名称："+tea01.course+"\t"+"上课地点："+ch1.address+"\n"+"  上课时间："+ch1.time+"\t"+"授课教师："+tea01.name+"\n");
		System.out.println("  课程号："+ch2.Cid+"\t"+"课程名称："+tea02.course+"\t"+"上课地点："+ch2.address+"\n"+"  上课时间："+ch2.time+"\t"+"授课教师："+tea02.name+"\n");
		
		Drop d1 = new Drop();
		d1.setDname("Lin Xun");
		d1.setDcourse("高等数学");
		d1.setDid(1);
		d1.title();
		
		System.out.println("  序号："+d1.Did+"\t"+"学生姓名："+d1.Dname+"\t"+"所选课程："+d1.Dcourse+"\t"+"授课教师："+tea01.name);
	}

}
