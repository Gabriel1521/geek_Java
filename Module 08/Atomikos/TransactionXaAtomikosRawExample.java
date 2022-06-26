import java.io.IOException;
import java.sql.SQLException;

public final class TransactionXaAtomikosRawExample {
    
    public static void main(final String[] args) throws IOException, SQLException {
        XAOrderService orderService = new XAOrderService("/META-INF/sharding-databases-tables.yaml");
        orderService.init();
        orderService.insert();
        orderService.cleanup();
    }
}
