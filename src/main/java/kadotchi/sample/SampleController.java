package kadotchi.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {


    @RequestMapping("/display-sample")
    public String displaySample(Model model){
        model.addAttribute("fullName", "埼玉次郎");
        return "sample";
    }

}
