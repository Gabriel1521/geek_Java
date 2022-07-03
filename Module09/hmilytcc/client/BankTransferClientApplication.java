package module09.hmily_tcc.client;


@SpringBootApplication
@Slf4j
public class BankTransferClientApplication {

    @DubboReference(version = "1.0.0") //, url = "dubbo://127.0.0.1:12345")
    private Bank1Service bank1Service;

    public static void main(String[] args) {
        SpringApplication.run(BankTransferClientApplication.class, args);
    }


    @Bean
    public ApplicationRunner runner() {
        return args -> {
            int customerid = 10000;
            int amount = 500;
            String tid = UUID.randomUUID().toString();
            int sourceId = 12345;
            int destinationId = 54321;
            bank1Service.transfer(tid,customerid,amount);
            bank1Service.convert(tid, customerid, amount, sourceId, destinationId);
            log.info("customerid {} transfer amount {} ...",customerid,amount);
            log.info("customerid {} convert amount {} from {} to {} ...",customerid,amount,sourceId,destinationId);
        };
    }
}