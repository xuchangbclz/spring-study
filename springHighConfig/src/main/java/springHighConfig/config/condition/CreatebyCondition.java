/**  
* Title: CreatebyCondition.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月13日  
* @version 1.0  
*/  
package springHighConfig.config.condition;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**  
* Title: CreatebyCondition
* Description: 
* @author xuchang 
* @date 2018年6月13日  
*/
public class CreatebyCondition implements Condition {

	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		// TODO Auto-generated method stub
		return Arrays.asList(arg0.getEnvironment().getActiveProfiles()).contains("dev");
	}

}
