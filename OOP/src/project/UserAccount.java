/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

public class UserAccount 
{

    private String username;
    private String password;
    private String[][] accounts = {{"user1", "password1"},{"user2", "password2"}};
    
    public UserAccount(String username, String password) {
    this.username = username;
    this.password = password;
    }

    public boolean checkPassword()
    {
        for (int i = 0; i < 10; i++) {
        if((username.equals(accounts[i][0])) && (password.equals(accounts[i][1])))
            return true;
        else
            return false;
        }
        return true;
    }

    public void deactivateAccount()
    {
        boolean active = false;
    }

}
