package jdbc.example.step2;

public interface IMembersDAO {
	//사용방법 정의
	public Members select(String id);
	
	public int insert(String id, String pw, String name, String email);
	
	public int update(String id, String pw, String name, String email, String rid);
	
	
	
}
