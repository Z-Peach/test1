import java.util.ArrayList;
import java.util.Scanner;

public class Register implements UserDao{
	ArrayList<User> list = new ArrayList<User >();
	@Override
	public void register(User user)  {
			list.add(user);
	}

	@Override
	public boolean login(String name, String password) {
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name) && list.get(i).getPassword().equals(password)) {
				flag = true;
			}
		}
		return flag;
	}
}
