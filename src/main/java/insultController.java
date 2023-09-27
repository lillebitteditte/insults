import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class insultController {
    private final insultGenerator insultGenerator;

    public insultController() {
        List<String> insults = Arrays.asList(

        );
        this.insultGenerator = new insultGenerator(insults);
    }

    @GetMapping("/getInsult")
    public insultDTO getInsult() {
        return insultGenerator.generateInsult();
    }
}
