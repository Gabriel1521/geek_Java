package module10.io.kimmking.cache;



public class OrderSubscribe extends JedisPubSub {

    public void onPSubscribe(String pattern, int subscribedChannels) {

    }

    public void onPMessage(String pattern, String channel, String message) {
        if ("__keyevent@0__:expired".equals(channel)) {
            //do some thing
        }
    }
}

public class RedisInitSubscrib implements InitializingBean{

    JedisPool pool;

    @Override
    public void afterPropertiesSet() throws Exception {
        pool.getResource().psubscribe(new OrderSubscribe(), "*");

    }

}
