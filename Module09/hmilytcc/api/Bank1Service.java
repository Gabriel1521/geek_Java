package module09.hmily_tcc.api;

public interface Bank1Service {

    @Hmily
    Boolean transfer(String tid,int customerId,int amount);


    @Hmily
    Boolean convert(String tid,int customerId,int amount, int sourceaccountId, int targetaccountId);
}

public interface Bank2Service {

    @Hmily
    Boolean transfer(String tid,int customerId,int amount);

    @Hmily
    Boolean convert(String tid,int customerId,int amount, int sourceaccountId, int targetaccountId);
}