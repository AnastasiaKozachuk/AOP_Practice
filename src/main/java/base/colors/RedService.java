package base.colors;


import org.springframework.stereotype.Component;

@Component
public class RedService implements ColorService {

    public String getColor() {
        return "My color is red!";
    }
}
