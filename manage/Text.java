package manage;


public class Text {
	public static void main(String args[]){
		Teacher tea01 = new Teacher();
		tea01.title();
		tea01.setid(1);
		tea01.setTname("Susan");
		tea01.setTsex("Male  ");
		tea01.setTcouse("���������");
		tea01.show();
			
		Student stu1 = new Student();
		stu1.setid(22);
		stu1.setSsex("Female  ");
		stu1.setSclass("��203");
	
		/*		Student stu2 = new Student();
		stu2.title();
		stu2.setid(22);
		stu2.setSname("Bob Liu ");
		stu1.setSsex("Male  ");
		stu1.setScourse("�ߵ���ѧ");
		stu1.setSclass("��203");
		stu1.show();
*/		
		Course c1 = new Course();
		c1.title();
		c1.setCid(100340);
		c1.setCaddress("��405");
		c1.setCtime("ÿ�ܶ�����7��00~9��00");
		System.out.println("  �γ̺ţ�"+c1.Cid+"\t"+"�γ����ƣ�"+tea01.course+"\t"+"�Ͽεص㣺"+c1.address+"\n"+"  �Ͽ�ʱ�䣺"+c1.time+"\t"+"�ڿν�ʦ��"+tea01.name);
		
		Choose ch1 = new Choose();
		ch1.setCCid(1);
		ch1.setCname("Chu Li");
		ch1.setCcourse("���������");
		ch1.title();
		System.out.println("  ��ţ�"+ch1.Cid+"\t"+"  ѧ��������"+ch1.Cname+"\t"+" �Ա�"+stu1.sex+"�༶��"+stu1.sclass+"  ��ѡ�γ̣�"+ch1.Ccourse+"  �ڿν�ʦ��"+tea01.name);
		
		Drop d1 = new Drop();
		d1.setDname("Lin Xun");
		d1.setDcourse("�ߵ���ѧ");
		d1.setDid(1);
		d1.title();
		System.out.println("  ��ţ�"+d1.Did+"\t"+"  ѧ��������"+d1.Dname+"\t"+"  ��ѡ�γ̣�"+d1.Dcourse+"\t"+"�ڿν�ʦ��"+tea01.name);
	}

}
