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
			System.out.println("��ӭ���룺��ѡ��1.ע��    2.��¼  ");
			int num = in.nextInt();
			switch (num) {
			case 1:
				while (true) {
					System.out.println("��ӭ����ע��ҳ�棬�������û�����");
					String name = in.next();
					System.out.println("���������룺");
					String password = in.next();
					System.out.println("���ٴ��������룺");
					String password1 = in.next();
					if (password.equals(password1)) {// ���벻һ��ѭ������
						User user = new User(name, password);
						r.register(user);
					} else {
						System.out.println("�����������벻һ�£�����������");
						test();// ���÷���
					}
					break;
				}
			case 2:
				if (r.list.isEmpty()) {
					System.out.println("δע�ᣬ��ע��");
					test();
				} else {
					System.out.println("��ӭ�����¼ҳ�棬�������û�����");
					String inputname = in.next();
					System.out.println("���������룺");
					String inputpassword = in.next();
					if (r.login(inputname, inputpassword)) {
						System.out.println("��ӭ��" + inputname);
					} else {
						System.out.println("�û�����������������µ�¼");
					}
					break;
				}
			default:
				System.out.println("��������");
				break;
			}
		}
	}
}
