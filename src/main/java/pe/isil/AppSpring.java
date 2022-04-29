package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.isil.user.Charly;

public class AppSpring {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("SpringApplicationContext.xml");

       
       Charly charly = app.getBean("charly", Charly.class);
        charly.showRedName();
  

    }

}
