package demo01;

public class UserDAO {
	
	private DBUtil db = new DBUtil();
	
	boolean findUser(String userName,String userPassword) {
		
		try {
			db.getConnection();
			System.out.println("用户验证成功！");
			
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
}
