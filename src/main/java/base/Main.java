package base;

import base.figures.Figure;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Figure theFigure = context.getBean("squareFigure", Figure.class);
        System.out.println("Constructor injection---------- \n");
        System.out.println(theFigure.getFigureName());
        System.out.println(theFigure.getFigureColor());

        Figure theFigure2 = context.getBean("triangleFigure", Figure.class);
        System.out.println("\n\nSetter injection-----------\n ");
        System.out.println(theFigure2.getFigureName());
        System.out.println(theFigure2.getFigureColor());

        Figure theFigure3 = context.getBean("circleFigure", Figure.class);
        System.out.println("\n\nField injection------------- \n");
        System.out.println(theFigure3.getFigureName());
        System.out.println(theFigure3.getFigureColor());
        System.out.flush();

        System.out.flush();

        context.close();
    }

}
