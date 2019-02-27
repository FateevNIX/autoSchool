package welcome.com;

public class Hello {

    private String userName;


    public void setupName(String name) {
        this.userName = name;
    }

    public void welcome() {
        System.out.println("Hello, " + userName + "!");
    }

    public void byeBay() {
        System.out.println("Bye, " + userName + "!");
    }
}