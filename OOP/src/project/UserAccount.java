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
    private String[][] accounts = {{"anthony", "supernova"},{"steve", "java1"}};
    
    public UserAccount(String username, String password) {
    this.username = username;
    this.password = password;
    }

    public boolean checkPassword()
    {

        if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])))
            return true;
        else
            return false;
    }

    public void deactivateAccount()
    {
        boolean active = false;
    }

}
