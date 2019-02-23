package base.figures;
import base.colors.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class SquareFigure implements Figure {

    private ColorService colorService;

    @Autowired
    public SquareFigure( @Qualifier("greenService") ColorService colorService) {
        this.colorService = colorService;
    }

    public String getFigureName() {
        return "I am square!";
    }

    public String getFigureColor() {
        return colorService.getColor();
    }
}
