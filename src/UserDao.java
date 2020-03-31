import java.io.IOException;


public interface UserDao {
	public abstract void register(User user ) throws IOException; 
	public abstract boolean login(String name,String password);
}
