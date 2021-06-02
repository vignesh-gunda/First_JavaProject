import java.util.*

;
public class Credentials{


  ArrayList<String> list1 = new ArrayList<String>();

String username;
String password;
String email;

   public Credentials(String username, String password, String email) {
       // list = new ArrayList<>();
       this.username = username;
       this.password = password;
       this.email = email;

       list1.add(username);
       list1.add(password);
       list1.add(email);

       list1.add("mihika");
       list1.add("mihika1234");
       list1.add("mihika@gmail.com");

       list1.add("vignesh");
       list1.add("vignesh1234");
       list1.add("vignesh@gmail.com");

       list1.add("drishti");
       list1.add("drishti1234");
       list1.add("drishti@gmail.com");

       System.out.println(list1);

   }

   public List<String> getList() {
    // System.out.println(list1);
       return list1;
   }


   public List<String> concatlist() {

      System.out.println(list1);
       return list1;
   }
}
