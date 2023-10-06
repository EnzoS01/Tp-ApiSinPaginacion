package com.example.PrimerApi.controlers;

import com.example.PrimerApi.entities.Persona;

import com.example.PrimerApi.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping(path= "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

}
