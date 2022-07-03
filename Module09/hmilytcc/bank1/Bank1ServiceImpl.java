package module09.hmily_tcc.bank1;

@DubboService(version = "1.0.0", tag = "red", weight = 100)
public class Bank1ServiceImpl implements Bank1Service {

    @Autowired
    BankAccountService bankAccountService;

    @Override
    public Boolean transfer(String tid,int customerId, int amount) {
        this.bankAccountService.subtractAccountBalance(tid,customerId,amount);
        return true;
    }

    @Override
    public Boolean convert(String tid,int customerId, int source_amount, int sourceaccountId, int targetaccountId) {
        // 1美元兑换7人民币
        this.bankAccountService.subtractAccountBalance(tid,customerId,sourceaccountId, amount);
        convert_amount = amount*7;
        this.bankAccountService.addAccountBalance(tid,customerId,targetaccountId,convert_amount);
        return true;
    }
}