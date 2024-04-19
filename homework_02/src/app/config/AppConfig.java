package app.config;

import app.staff.administration.ChiefDoctor;
import app.staff.administration.ChiefPhysician;
import app.staff.administration.ChiefSurgeon;
import app.staff.clinic.Reception;
import app.staff.clinic.doctors.Cardiologist;
import app.staff.clinic.doctors.Neurologist;
import app.staff.clinic.pharmacy.Pharmacologist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ChiefDoctor chiefDoctor() {
        return new ChiefDoctor();
    }

    @Bean
    public ChiefPhysician chiefPhysician() {
        return new ChiefPhysician();
    }

    @Bean
    public ChiefSurgeon chiefSurgeon() {
        return new ChiefSurgeon();
    }

    @Bean
    public Cardiologist cardiologist() {
        return new Cardiologist();
    }

    @Bean
    public Neurologist neurologist() {
        return new Neurologist();
    }

    @Bean
    public Pharmacologist pharmacologist() {
        return new Pharmacologist();
    }

    @Bean
    public Reception reception() {
        return new Reception();
    }

}
