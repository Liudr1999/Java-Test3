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
		
		Teacher tea02 = new Teacher();
		tea02.setid(2);
		tea02.setTname("Lisen");
		tea02.setTsex("Male  ");
		tea02.setTcouse("�ߵ���ѧ");
		tea02.show();
				
		Student stu1 = new Student();
		stu1.title();
		stu1.setid(22);
		stu1.setSname("Bob Liu ");
		stu1.setSsex("Male  ");
		stu1.setScourse("�ߵ���ѧ");
		stu1.setSclass("��203");
		stu1.show();
		
		Student stu2 = new Student();
		stu2.setid(35);
		stu2.setSname("Li Hang ");
		stu2.setSsex("Male  ");
		stu2.setScourse("���������");
		stu2.setSclass("��172");
		stu2.show();
		
		choose ch1 = new choose();
		ch1.title();
		ch1.setCid(100340);
		ch1.setCaddress("��405");
		ch1.setCtime("ÿ�ܶ�����7��00~9��00");
		
		choose ch2 = new choose();
		ch2.setCid(100450);
		ch2.setCaddress("��703");
		ch2.setCtime("ÿ��������14��00~17��00");
		
		System.out.println("  �γ̺ţ�"+ch1.Cid+"\t"+"�γ����ƣ�"+tea01.course+"\t"+"�Ͽεص㣺"+ch1.address+"\n"+"  �Ͽ�ʱ�䣺"+ch1.time+"\t"+"�ڿν�ʦ��"+tea01.name+"\n");
		System.out.println("  �γ̺ţ�"+ch2.Cid+"\t"+"�γ����ƣ�"+tea02.course+"\t"+"�Ͽεص㣺"+ch2.address+"\n"+"  �Ͽ�ʱ�䣺"+ch2.time+"\t"+"�ڿν�ʦ��"+tea02.name+"\n");
		
		Drop d1 = new Drop();
		d1.setDname("Lin Xun");
		d1.setDcourse("�ߵ���ѧ");
		d1.setDid(1);
		d1.title();
		
		System.out.println("  ��ţ�"+d1.Did+"\t"+"ѧ��������"+d1.Dname+"\t"+"��ѡ�γ̣�"+d1.Dcourse+"\t"+"�ڿν�ʦ��"+tea01.name);
	}

}
