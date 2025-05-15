package cleanCode;

public class Main2 {
  public static void main(String[] args) {
    User user = new User.UserBuilder().build();
    
    System.out.println(user.toString());
  }
}
