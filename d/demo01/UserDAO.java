package demo01;

public class UserDAO {
	
	private DBUtil db = new DBUtil();
	
	boolean findUser(String userName,String userPassword) {
		
		try {
			db.getConnection();
			System.out.println("�û���֤�ɹ���");
			
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
}
