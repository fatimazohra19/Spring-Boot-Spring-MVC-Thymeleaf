package com.example.PatientMvc;

import com.example.PatientMvc.entities.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.PatientMvc.repositories.PatientRepository;

import java.util.Date;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com/example/PatientMvc/repositories")
public class PatientMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientMvcApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args -> {
			patientRepository.save(
					new Patient(null,"Hassan",new Date(),false,12));
			patientRepository.save(
					new Patient(null,"Hanae",new Date(),true,182));
			patientRepository.save(
					new Patient(null,"Faine",new Date(),true,120));
			patientRepository.save(
					new Patient(null,"Ali",new Date(),false,102));
			patientRepository.findAll().forEach(p->{
				System.out.println(p.getNom());
			});

		};}
}
