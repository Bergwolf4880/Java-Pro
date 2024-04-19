package app.staff.administration;

import app.staff.clinic.Reception;
import app.staff.clinic.doctors.Cardiologist;
import org.springframework.beans.factory.annotation.Autowired;

public class ChiefSurgeon {
    @Autowired
    private Cardiologist cardiologist;
    @Autowired
    private Reception reception;

    public void setCardiologist(Cardiologist cardiologist) {
        this.cardiologist = cardiologist;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public void giveOrders() {
        cardiologist.treat();
        reception.treat();
    }

}
