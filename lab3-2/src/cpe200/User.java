package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {

    }

    public boolean setUserName(String name)
    {
        if(name.matches("^([A-Za-z])([A-Za-z0-9]+)$")&&name.length()>=8){
            userName = name;
            return true;
        }else return false;
    }

    public boolean setPassword(String name)
    {
        if(name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]+)$")&&name.length()>=12){
            password = name;
            return true;
        }else return false;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }
}
