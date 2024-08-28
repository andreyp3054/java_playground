package solid;

public class DataBasePersistence implements InvoicePersistence{
    @Override
    public void save(Invoice invoice) {
        System.out.println(invoice.student);
    }
}
