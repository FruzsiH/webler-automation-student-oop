package hu.webler.model;

public class Person {
  private String firstName;

  public String getFirstName() {
      return firstName;
  }

  public Person() {
      this("");
  }

  public Person (String firstName) {
      this.firstName = firstName;
  }

  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }
}
