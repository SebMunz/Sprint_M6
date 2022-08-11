package cl.ElPiero.Modulo6Maven.web.controller;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.domain.service.UsuarioService;
import cl.ElPiero.Modulo6Maven.persistence.repository.CapacitacionRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * El Piero tiene sueño
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Controller
@RequestMapping(value="/usuario")
public class UsuarioController {
    Log logger = LogFactory.getLog(CapacitacionRepository.class);
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping("/list")
    public String listarUsuarios(Model model){
        model.addAttribute("usuarios",usuarioService.getAll());
        return "listarUsuarios";
    }

    @GetMapping("/nuevoUsuario")
    public String nuevoUsuario(Model model){
        model.addAttribute("user", new User());
        return "crearUsuario";
    }
    @PostMapping("/saveUsuario")
    public String save(@ModelAttribute User user){
        usuarioService.save(user);
        return "redirect:/usuario/list";
    }
    @GetMapping("/{id}")
    public String editar(@PathVariable("id") Integer userId, Model model){
        model.addAttribute("usuario",usuarioService.getOne(userId).get());

        return "editUsuario";
    }

    @GetMapping("/del/{identif}")
    public String delete(@PathVariable("identif") Integer user){
        usuarioService.delete(user);

        return "redirect:/usuario/list";
    }
}
