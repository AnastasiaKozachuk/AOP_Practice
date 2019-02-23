package base.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ColorAspect {

    @Pointcut("execution(public String base.colors.*.getColor())")
    private void forColorName(){}

    @Before("forColorName()")
    private void beforeKnowColorName(){
        System.out.println("Inside annotated @Before advice. Now you will know the color of the figure...");
    }

}
