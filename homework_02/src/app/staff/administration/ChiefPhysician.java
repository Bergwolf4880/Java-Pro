package app.staff.administration;

import app.staff.clinic.doctors.Neurologist;
import app.staff.clinic.pharmacy.Pharmacologist;
import org.springframework.beans.factory.annotation.Autowired;

public class ChiefPhysician {

    @Autowired
    private Neurologist neurologist;
    @Autowired
    private Pharmacologist pharmacologist;

    public void setNeurologist(Neurologist neurologist) {
        this.neurologist = neurologist;
    }

    public void setPharmacologist(Pharmacologist pharmacologist) {
        this.pharmacologist = pharmacologist;
    }

    public void giveOrders() {
        neurologist.treat();
        pharmacologist.treat();
    }
}
