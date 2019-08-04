package sundayte;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class sundayTest {
    @RequestMapping("/hello")
    public String  testSunday(){
    System.out.println("sdfsdf");
        return "you are  big  dog";
    }
}
