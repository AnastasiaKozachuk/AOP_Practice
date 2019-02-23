package base.colors;


import org.springframework.stereotype.Component;

@Component
public class GreenService implements ColorService {


    public String getColor() {
        return "My color is green!";
    }
}
