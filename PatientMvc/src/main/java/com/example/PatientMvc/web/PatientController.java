package com.example.PatientMvc.web;

;
import com.example.PatientMvc.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class PatientController {
  private PatientRepository patientRepository;

    @GetMapping(path = "/index")
    public String patients() {
    return  "patients";
    }
}
