package solid;

public class Main {
    public static void main(String[] args) {
        DataBasePersistence dataBasePersistence = new DataBasePersistence();
        Invoice invoice = new Invoice("mark");
        FilePersistence filePersistence = new FilePersistence();
        PersistenceManager persistenceManager = new PersistenceManager(dataBasePersistence);
        persistenceManager.invoicePersistence.save(invoice);


    }
}
