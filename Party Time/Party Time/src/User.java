import java.util.Scanner;

public class User {

    String userName;
    String userName2;
    String password2;
    String password;
    Scanner scan = new Scanner(System.in);

    public User() {
        SignUp sign = new SignUp();
        Login log = new Login();
    }
    public class SignUp {
        public SignUp() {
            signUp();
        }


        public void signUp() {
            System.out.println("Oyunu oynayabilmek için kullancı hesabı oluşturmanız gerekmektedir.");
            System.out.print("Kullanıcı adınız:");
            userName = scan.next();
            System.out.print("Şifreniz:");
            password = scan.next();
            System.out.println("\nHesabınız oluşturulmuştur.\n");
        }
    }

    public class Login {
        public Login() {
            login();
        }


        public void login() {

            try {
                System.out.println("Lütfen giriş yapınız\n");
                System.out.print("Kullanıcı adınız:");
                userName2 = scan.next();
                if (userName2.equals(userName)) {
                    System.out.print("Şifreniz:");
                    password2 = scan.next();
                    if (password2.equals(password)) {
                        System.out.println("\nGiriş yapıldı.");
                    } else throw new FaultyInput("error");
                } else throw new FaultyInput("error");

            } catch (FaultyInput e) {
                System.out.println("Hatalı giriş.Lütfen tekrar deneyiniz.\n");
                login();

            }
        }

    }
}

