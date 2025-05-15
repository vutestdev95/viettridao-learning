package cleanCode;

class User {
  private String firstname;
  private String lastName;
  private int age;
  
  public static class UserBuilder {
    private final User user;
    
    public UserBuilder() {
      user = new User();
    }

    public UserBuilder withFirstName(String firstName) {
      user.firstname = firstName;
      return this;
    }

    public UserBuilder withLastName(String lastName) {
      user.lastName = lastName;
      return this;
    }

    public UserBuilder withAge(int age) {
      user.age = age;
      return this;
    }

    public User build() {
      return user;
    }
  }
}
