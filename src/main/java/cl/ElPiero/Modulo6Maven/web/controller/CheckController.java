package cl.ElPiero.Modulo6Maven.web.controller;

import cl.ElPiero.Modulo6Maven.domain.dto.CheckVisit;
import cl.ElPiero.Modulo6Maven.domain.dto.Payment;
import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.domain.service.CheckService;
import cl.ElPiero.Modulo6Maven.persistence.repository.CapacitacionRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Controller
@RequestMapping(value="/check")
public class CheckController {
    Log logger = LogFactory.getLog(CapacitacionRepository.class);

    private final CheckService checkService;

    public CheckController(CheckService checkService) {
        this.checkService = checkService;
    }


    @GetMapping("/list")
    public String listarCheck(Model model){
        model.addAttribute("checks",checkService.getAll());
        return "listarCheck";
    }
    @GetMapping("/nuevoCheck")
    public String nuevoCheck(Model model){
        model.addAttribute("check", new CheckVisit());
        return "crearCheck";
    }
    @PostMapping("/saveCheck")
    public String save(@ModelAttribute CheckVisit checkVisit){
        checkService.save(checkVisit);
        return "redirect:/check/list";
    }
    @GetMapping("/{id}")
    public String editar(@PathVariable("id") Integer checkId, Model model){
        model.addAttribute("check",checkService.getOne(checkId).get());

        return "editarCheck";
    }
}
