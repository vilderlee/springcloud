package com.vilderlee.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 功能描述:
 *
 * @package com.vilderlee.consumerdept80.config
 * @auther vilderlee
 * @date 2019-08-10 18:02
 */
public class ModifyRule extends AbstractLoadBalancerRule {

    private AtomicInteger integer = new AtomicInteger(0);

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
        System.out.println();
    }

    @Override
    public Server choose(Object key) {
        ILoadBalancer iLoadBalancer = getLoadBalancer();
        List<Server> allServers =  iLoadBalancer.getAllServers();
        List<Server> reachableServers = iLoadBalancer.getReachableServers();
        for (int i = 0; i < reachableServers.size(); i++) {
            if (integer.get()<5){
                integer.getAndIncrement();
                return reachableServers.get(i);
            }else {
                integer.set(0);
            }
        }


        return null;
    }
}
