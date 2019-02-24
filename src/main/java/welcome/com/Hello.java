package welcome.com;

public class Hello {

    private String userName;


    public void setupName(String userName) {
        this.userName = userName;
    }

    public void welcome() {
        System.out.println("Hello, " + userName);

    }

    public void byeBay() {
        System.out.println("Bye, " + userName);

    }
}