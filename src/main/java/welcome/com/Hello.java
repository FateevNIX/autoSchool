package welcome.com;

public class Hello {

    private String userName;


    public void setupName(String name) { //setupName(String name) - присваивает внутренней private переменной имя человека,
        this.userName = name;
    }

    public void welcome() { //welcome() - формирует и выводит в консоль приветствие "Hello, %name%" (имя должно подставляться),
        System.out.println("Hello, " + userName + "!");
    }

    public void byeBay() { //byeBay() - прощается с выводом в консоль фразы "Bye, %name%"
        System.out.println("Bye, " + userName + "!");
    }
}