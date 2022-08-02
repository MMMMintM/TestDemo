package cn.edu.guet.testdemo.hhy;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("liwei","liwei123");
        System.out.println(user.getUsername()+user.getPassword());
    }
}
