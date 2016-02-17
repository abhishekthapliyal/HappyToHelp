/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
*/

package JAVA_CLASSES;
import JAVA_CLASSES.LoginManager;
/**
 *
 * @author ABHISHEK
 */
public class DBManger {
    
    public void login(String user, String passowrd)
    {
        LoginManager loginManager = new LoginManager();
        loginManager.login(user, passowrd);
    }
    
}
