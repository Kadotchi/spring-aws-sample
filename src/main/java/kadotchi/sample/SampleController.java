package kadotchi.sample;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SampleController {


    @RequestMapping("/display-sample")
    public String displaySample(Model model){
        model.addAttribute("fullName", "埼玉次郎");
        return "sample";
    }

    @GetMapping("/reservation/display-form")
    public String displayForm(@RequestParam String trainingId, Model model){
        ReservationInput reservationInput = new ReservationInput();
        reservationInput.setTrainingId(trainingId);
        reservationInput.setStudentTypeCode("EMPLOYEE");
        model.addAttribute("reservationInput", reservationInput);
        return "reservation/reservationForm";
    }

}
