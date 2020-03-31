import java.awt.List;
import java.util.Scanner;

public class Test {
	static Register r = new Register();
	User user = null;

	public static void main(String[] args) {
		test();
	}
	public static void test()  {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("欢迎进入：请选择：1.注册    2.登录  ");
			int num = in.nextInt();
			switch (num) {
			case 1:
				while (true) {
					System.out.println("欢迎进入注册页面，请输入用户名：");
					String name = in.next();
					System.out.println("请输入密码：");
					String password = in.next();
					System.out.println("请再次输入密码：");
					String password1 = in.next();
					if (password.equals(password1)) {// 密码不一致循环输入
						User user = new User(name, password);
						r.register(user);
					} else {
						System.out.println("两次输入密码不一致，请重新输入");
						test();// 调用方法
					}
					break;
				}
			case 2:
				if (r.list.isEmpty()) {
					System.out.println("未注册，请注册");
					test();
				} else {
					System.out.println("欢迎进入登录页面，请输入用户名：");
					String inputname = in.next();
					System.out.println("请输入密码：");
					String inputpassword = in.next();
					if (r.login(inputname, inputpassword)) {
						System.out.println("欢迎你" + inputname);
					} else {
						System.out.println("用户名或密码错误，请重新登录");
					}
					break;
				}
			default:
				System.out.println("输入有误");
				break;
			}
		}
	}
}
