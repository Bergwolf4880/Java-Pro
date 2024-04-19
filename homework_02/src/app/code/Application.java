package app.code;

import app.staff.administration.ChiefDoctor;
import app.staff.administration.ChiefPhysician;
import app.staff.administration.ChiefSurgeon;
import app.staff.clinic.Reception;
import app.staff.clinic.doctors.Cardiologist;
import app.staff.clinic.doctors.Neurologist;
import app.staff.clinic.pharmacy.Pharmacologist;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Application {

    public static void main(String[] args) {

//        Reception reception = new Reception();
//        Pharmacologist pharmacologist = new Pharmacologist();
//
//        Cardiologist cardiologist = new Cardiologist();
//        Neurologist neurologist = new Neurologist();
//
//        ChiefSurgeon chiefSurgeon = new ChiefSurgeon();
//        chiefSurgeon.setCardiologist(cardiologist);
//        chiefSurgeon.setReception(reception);
//
//        ChiefPhysician chiefPhysician = new ChiefPhysician();
//        chiefPhysician.setNeurologist(neurologist);
//        chiefPhysician.setPharmacologist(pharmacologist);
//
//        ChiefDoctor chiefDoctor = new ChiefDoctor();
//        chiefDoctor.setChiefPhysician(chiefPhysician);
//        chiefDoctor.setChiefSurgeon(chiefSurgeon);
//
//        chiefDoctor.manageClinic();

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        ChiefDoctor chiefDoctor = context.getBean(ChiefDoctor.class);
        chiefDoctor.manageClinic();

    }
}
