package cl.ElPiero.Modulo6Maven.web.controller;

import cl.ElPiero.Modulo6Maven.domain.dto.Payment;
import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.domain.service.PagoService;
import cl.ElPiero.Modulo6Maven.persistence.repository.CapacitacionRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Controller
@RequestMapping(value="/pago")
public class PagoController {
    Log logger = LogFactory.getLog(CapacitacionRepository.class);

    private final PagoService pagoService1;

    public PagoController(PagoService pagoService1) {
        this.pagoService1 = pagoService1;
    }

    @GetMapping("/list")
    public String listarPagos(Model model){
        model.addAttribute("pagos",pagoService1.getAll());
        return "listarPagos";
    }
    @PostMapping("/savePago")
    public String save(@ModelAttribute Payment payment){
        pagoService1.save(payment);
        return "redirect:/pago/list";
    }
}
