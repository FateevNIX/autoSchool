package welcome.com;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class LogicClass {
    static final Logger log = (Logger) LogManager.getLogger(LogicClass.class);


    public void doLogic(){
        System.out.println("Логика какая-то!");

        log.info("Информационное сообщение!");
        addLogic();
    }

    private void addLogic() {

        System.out.println("Добавили логики!");

        log.error("Возникшая ошибка");
    }

}

