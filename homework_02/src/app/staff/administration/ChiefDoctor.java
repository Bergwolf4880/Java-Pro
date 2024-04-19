package app.staff.administration;

import org.springframework.beans.factory.annotation.Autowired;

public class ChiefDoctor {
    @Autowired
    private ChiefPhysician chiefPhysician;
    @Autowired
    private ChiefSurgeon chiefSurgeon;

    public void setChiefPhysician(ChiefPhysician chiefPhysician) {
        this.chiefPhysician = chiefPhysician;
    }

    public void setChiefSurgeon(ChiefSurgeon chiefSurgeon) {
        this.chiefSurgeon = chiefSurgeon;
    }

    public void manageClinic() {
        chiefPhysician.giveOrders();
        chiefSurgeon.giveOrders();
    }

}
