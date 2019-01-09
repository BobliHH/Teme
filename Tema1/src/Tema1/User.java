package Tema1;

//Create a class Tema1.User with the following fields: username, firstName, lastName.
//a.	Make the fields private
//d.	Make the object immutable (final)
public final class User {
    private String userName;
    private String firstName;
    private String lastName;
//c.	Write a constructor with 3 parameters
    public User(String userName,String firstName,String lastName){
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }
//b.	Write getters and setters
    public String getUserName() {
        return userName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;


    }
//e.	Write a public method generateDisplayName that returns a string with the full name of the user.
    public String generateDisplayName(){

        return userName+": "+firstName+" "+lastName;
    }


}
