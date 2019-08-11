package com.vilderlee.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述:
 *
 * @package com.vilderlee.rule
 * @auther vilderlee
 * @date 2019-08-10 17:49
 */

@Configuration
public class MyselfRule {

    @Bean
    public IRule getRule(){
        return new ModifyRule();
    }
}
