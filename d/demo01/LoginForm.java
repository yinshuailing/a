package demo01;

public class LoginForm {
	
	UserDAO dao = new UserDAO();
	
	void init(){
		System.out.println("��ʼ���ɹ���");
	}
	
	void display(){
		System.out.println("����display������");
	}
	
	void validate(){
		
		dao.findUser("username", "userPassword");
		System.out.println("����validate������");
		
	}
	
}
