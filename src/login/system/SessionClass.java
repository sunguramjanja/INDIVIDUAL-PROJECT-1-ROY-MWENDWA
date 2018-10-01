/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.system;

/**
 *
 * @author ROY
 */
public class SessionClass {
    
    public boolean isLoggedin=false;
    
    public void setLoggedIn()
    {
        isLoggedin = true;
    }
      public void setLoggedOut()
    {
        isLoggedin=false;
    }
    
}
