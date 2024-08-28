package solid;

public class PersistenceManager {
   InvoicePersistence invoicePersistence;


    public PersistenceManager(InvoicePersistence invoicePersistence){
        this.invoicePersistence = invoicePersistence;
    }
}
