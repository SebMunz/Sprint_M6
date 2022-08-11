package cl.ElPiero.Modulo6Maven.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Modulo6
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Controller
@RequestMapping(value="/contacto")
public class ContactoController {

    @GetMapping
    public String contacto(){
        return "contacto";
    }
}
