package base.colors;

import org.springframework.stereotype.Component;

@Component
public class OrangeService implements ColorService {
    public String getColor() {
        return "My color is orange!";
    }
}
