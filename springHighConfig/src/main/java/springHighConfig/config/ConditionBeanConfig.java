/**  
* Title: ConditionBeanConfig.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月13日  
* @version 1.0  
*/  
package springHighConfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.core.type.AnnotatedTypeMetadata;

import springHighConfig.config.condition.CreatebyCondition;
import springHighConfig.test.Person;

/**  
* Title: ConditionBeanConfig
* Description: 条件配置
* @author xuchang 
* @date 2018年6月13日  
*/


public class ConditionBeanConfig  {

	@Bean
	@Primary
	@Conditional(CreatebyCondition.class)
	public Person getChinese() {
		//环境设置是否为‘dev’返回这个Person
		//对象有歧义时，@Primary最高优先级
		return new Person("中国人");
	}
}
