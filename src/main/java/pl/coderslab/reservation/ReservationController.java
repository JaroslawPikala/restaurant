package pl.coderslab.reservation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.tables.Tables;
import pl.coderslab.tables.TablesService;


import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/reservation")
public class ReservationController {


    private ReservationService reservationService;

    private TablesService tablesService;

    @Autowired
    public ReservationController(ReservationService reservationService, TablesService tablesService) {
        this.reservationService = reservationService;
        this.tablesService = tablesService;
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Reservation> reservations = reservationService.findAll();
        model.addAttribute("reservations",reservations);
        return "reservationTable";

    }

    @GetMapping("/{string}/add")
    public String addReservation(@PathVariable String string, Model model){
        model.addAttribute("reservation", new Reservation());
        return "reservations";
    }

    @PostMapping("/{string}/add")
    public String addReservation(@PathVariable String string, @ModelAttribute @Valid  Reservation reservation, BindingResult result){
        if(result.hasErrors()){
            return "reservations";
        }
        Tables table = tablesService.findTableByName(string);
        reservation.setTable(table);
        reservationService.saveReservation(reservation);
        return "index";
    }

}
