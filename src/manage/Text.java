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
		tea01.setTcouse("���������");
		tea01.show();
		
		Teacher tea02 = new Teacher();
		tea02.setid(2);
		tea02.setTname("Lisen");
		tea02.setTsex("Male  ");
		tea02.setTcouse("�ߵ���ѧ");
		tea02.show();
		
		Teacher tea03 = new Teacher();
		tea03.setid(3);
		tea03.setTname("Smith");
		tea03.setTsex("Female");
		tea03.setTcouse("Ӧ����д��");
		tea03.show();
		
		Student stu1 = new Student();
		stu1.title();
		stu1.setid(14);
		stu1.setSname("Lily Han");
		stu1.setSsex("Female");
		stu1.setScouse("Ӧ����д��");
		stu1.show();
		
		Student stu2 = new Student();
		stu2.setid(22);
		stu2.setSname("Bob Liu ");
		stu2.setSsex("Male  ");
		stu2.setScouse("�ߵ���ѧ");
		stu2.show();
		
		Student stu3 = new Student();
		stu3.setid(35);
		stu3.setSname("Lihang  ");
		stu3.setSsex("Male  ");
		stu3.setScouse("��������");
		stu3.show();
		
		choose ch1 = new choose();
		ch1.title();
		ch1.setCid(100200);
		ch1.setCaddress("��201");
		ch1.setCtime("ÿ��������13��00~14��00");
		
		choose ch2 = new choose();
		ch2.setCid(100340);
		ch2.setCaddress("��405");
		ch2.setCtime("ÿ�ܶ�����7��00~9��00");
		
		choose ch3 = new choose();
		ch3.setCid(100450);
		ch3.setCaddress("��703");
		ch3.setCtime("ÿ��������14��00~17��00");
		
		drop d1 = new drop();

		
		
		System.out.println("�γ̺ţ�"+ch1.Cid+"  �γ����ƣ�"+tea01.course+"  �Ͽεص㣺"+ch1.address+"  �Ͽ�ʱ�䣺"+ch1.time+"  �ڿν�ʦ��"+tea01.name);
		System.out.println("�γ̺ţ�"+ch2.Cid+"  �γ����ƣ�"+tea02.course+"    "+"  �Ͽεص㣺"+ch2.address+"  �Ͽ�ʱ�䣺"+ch2.time+"    �ڿν�ʦ��"+tea02.name);
		System.out.println("�γ̺ţ�"+ch3.Cid+"  �γ����ƣ�"+tea03.course+"  �Ͽεص㣺"+ch3.address+"  �Ͽ�ʱ�䣺"+ch3.time+"  �ڿν�ʦ��"+tea03.name);
		System.out.println("�γ̺ţ�"+ch3.Cid+"  �γ����ƣ�"+tea03.course+"  �Ͽεص㣺"+ch3.address+"  �Ͽ�ʱ�䣺"+ch3.time+"  �ڿν�ʦ��"+tea03.name);
	}

}
