package shiyan6;

public class JudgeException extends Exception{
	String message;
	public String JudgeException(String input) {
		message = "������ġ�"+input+"������ȷ����������ȷ�Ա�";
		return message;
	}
	
	//public String JudgeException(int input) {
	//	message = "������ġ�"+input+"������ȷ����������ȷ���䣡";
	//	return message;
	//}
}
