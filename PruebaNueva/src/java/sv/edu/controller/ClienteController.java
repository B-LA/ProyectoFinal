/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sv.edu.entity.Cliente;
import sv.edu.model.ClienteModel;

/**
 *
 * @author neon
 */
@Controller
@RequestMapping("cliente")
public class ClienteController {
     ClienteModel mecModel = new ClienteModel();
    
    @RequestMapping("list")
    public String listarCliente(Model model) {

        model.addAttribute("listarCliente", mecModel.listarClientes());

        return "cliente/listar";
    }
    
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String nuevoCliente(Model model){
        //se le pasa a la vista el objeto que debe llenarse desde el formulario
        model.addAttribute("cliente", new Cliente());
        
        return "cliente/nuevo";
    }
    
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String insertarCliente(@ModelAttribute("cliente") Cliente cliente,
            Model model, RedirectAttributes atributos){
        
        if (mecModel.insertarCliente(cliente)>0) {
            //si se insertó, se pasa el mensaje de éxito
            atributos.addFlashAttribute("exito", "Cliente registrado exitosamente");
            
            //redireccion en el cliente hacia el metodo listarCliente()
            return "redirect:/cliente/list";
        }else{
            //si no insertó regresamos al formulario de ingreso
            model.addAttribute("cliente", cliente);
            return "clientes/nuevo";
        }
    }
    
    @RequestMapping(value = "edit/{codigo}", method = RequestMethod.GET)
    public String obtenerCliente(@PathVariable("codigo") String codigo, Model model){
        model.addAttribute("cliente", mecModel.obtenerCliente(codigo));
        
        return "cliente/editar";
    }
    
    @RequestMapping( value = "edit/{codigo}", method = RequestMethod.POST)
    public String modificarCliente(Cliente cliente, Model model, 
            RedirectAttributes atributos){
        if (mecModel.modificarCliente(cliente)>0) {
            atributos.addFlashAttribute("exito", "Cliente modificado exitosamente");
            
            return "redirect:/cliente/list";
        } else {
            model.addAttribute("cliente", cliente);
            
            return "cliente/editar";
        }
    }
    
    @RequestMapping("delete/{codigo}")
    public String eliminarCliente(@PathVariable("codigo") String codigo, Model model, RedirectAttributes atributos){
        if (mecModel.eliminarCliente(codigo)>0) {
            atributos.addFlashAttribute("exito", "Cliente eliminado exitosamente");
        } else {
            atributos.addFlashAttribute("fracaso", "No se puede eliminar esta cliente");
        }
        
        return "redirect:/cliente/list";
    }
}
