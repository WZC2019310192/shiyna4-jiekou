package shiyan6;
import java.util.Scanner;
public class Student {
	String name;
	int number;
	String sex;
	String stuNo;
	Student(){}

//}
	public void inputInformation() {
		Scanner reader = new Scanner(System.in);
		a:for(;;) {
			try {
				System.out.println("����������");
		        name=reader.nextLine();
		        System.out.println("¼��ɹ�~");
		        break a;
			}
			catch(Exception e) {
				System.out.println("������� ��"+name+"�� ��ʽ����ȷ�����������룡");
			}
		}
		b:for(;;) {
		try{
		System.out.println("�������Ա����ģ�");
		sex=reader.nextLine();
		sexJudge(sex);
		break b;
		}
		catch(JudgeException e) {
			System.out.println(e.JudgeException(sex));
		}
		}
		//c:for(;;) {
			//try{
				//System.out.println("���������䣨15-75�꣩");
				//age=reader.nextInt();
			   // ageJudge(age);
			   // break c;
			//}
			//catch(JudgeException e) {
				//System.out.println(e.JudgeException(age));
			//}
			//}
		d:for(;;) {
			try {
				Scanner reader0 = new Scanner(System.in);
				System.out.println("������ѧ��");
				stuNo=reader0.nextLine();
		        System.out.println("¼��ɹ�~");
		        break d;
			}
			catch(Exception e) {
				System.out.println("������ġ�"+stuNo+"����ʽ����ȷ�����������룡");
			}
		}
		
	}
	public void sexJudge(String sex) throws JudgeException{
		String x="��";
		String y="Ů";
		if (sex.equals(x)||sex.equals(y)){
			System.out.println("¼��ɹ�~");
			}
		else throw new JudgeException();
	}
	//public void ageJudge(int age) throws JudgeException{
		//int x=15;
		//int y=75;
		////if (age>=x&&age<=y){
		//	System.out.println("¼��ɹ�~");
		//	}
		//else throw new JudgeException();
	//}
}
