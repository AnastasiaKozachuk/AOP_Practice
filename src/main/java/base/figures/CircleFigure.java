package base.figures;

import base.colors.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CircleFigure implements Figure {

    @Autowired
    @Qualifier("orangeService")
    private ColorService colorService;

    public String getFigureName() {
        return "I am a circle!";
    }

    public String getFigureColor() {
        return colorService.getColor();
    }
}
