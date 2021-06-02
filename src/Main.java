
import java.io.*;

public class Main {

  Credentials cred = new Credentials("Team15", "Team151234", "Team15@gmail.com");

  Main()
  {
    this.cred = cred;
    new Home(cred);
  }

 public static void main(String[] args) {
 Main m =  new Main();
 }
}
