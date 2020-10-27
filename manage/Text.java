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
			
		Student stu1 = new Student();
		stu1.setid(22);
		stu1.setSsex("Female  ");
		stu1.setSclass("财203");
	
		/*		Student stu2 = new Student();
		stu2.title();
		stu2.setid(22);
		stu2.setSname("Bob Liu ");
		stu1.setSsex("Male  ");
		stu1.setScourse("高等数学");
		stu1.setSclass("财203");
		stu1.show();
*/		
		Course c1 = new Course();
		c1.title();
		c1.setCid(100340);
		c1.setCaddress("教405");
		c1.setCtime("每周二晚上7：00~9：00");
		System.out.println("  课程号："+c1.Cid+"\t"+"课程名称："+tea01.course+"\t"+"上课地点："+c1.address+"\n"+"  上课时间："+c1.time+"\t"+"授课教师："+tea01.name);
		
		Choose ch1 = new Choose();
		ch1.setCCid(1);
		ch1.setCname("Chu Li");
		ch1.setCcourse("计算机基础");
		ch1.title();
		System.out.println("  序号："+ch1.Cid+"\t"+"  学生姓名："+ch1.Cname+"\t"+" 性别："+stu1.sex+"班级："+stu1.sclass+"  所选课程："+ch1.Ccourse+"  授课教师："+tea01.name);
		
		Drop d1 = new Drop();
		d1.setDname("Lin Xun");
		d1.setDcourse("高等数学");
		d1.setDid(1);
		d1.title();
		System.out.println("  序号："+d1.Did+"\t"+"  学生姓名："+d1.Dname+"\t"+"  所选课程："+d1.Dcourse+"\t"+"授课教师："+tea01.name);
	}

}
