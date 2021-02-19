package com.xiang.RibbonRule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;

public class MyRule extends AbstractLoadBalancerRule {
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    public Server choose(Object o) {
        return null;
    }
}
