### 运行时注入
1. 注入外部的值
	Javaconfig方式:
	@PropertySource注解导入配置文件,开启属性占位符配置需要注入bean PropertySourcesPlaceholderConfigurer(首选3.1之后)或者PropertyPlaceholderConfigurer,通过@Value("名称")注入相应的属性值,还可以用Environment可以getProperty(名称)获取注入的属性值     (见PropertyHoldApp.java)
	xmlconfig方式:
	如果你想使用XML配置的话， Spring context命名空间中的<context:propertyplaceholder />元素将会为你生成PropertySourcesPlaceholderConfigurer bean
	
2. Spring表达式语言（Spring Expression Language，SpEL）
	SpEL能够以一种强大和简洁的方式将值装配到bean属性和构造器参数中， 在这个过程中所使用的表达式会在运行时计算得到值。
	SpEL拥有很多特性， 包括：
	* 使用bean的ID来引用bean；
	* 调用方法和访问对象的属性；
	* 对值进行算术、 关系和逻辑运算；
	* 正则表达式匹配；
	* 集合操作。
	简单形式:属性占位符需要放到“${ ... }”,SpEL表达式要放到“#{ ... }”之中
	SpEL表达式可以引用其他的bean或其他bean的属性。 例如， 如下的表达式会得到System当前的毫秒数和计算得到spring容器ID为person的bean的name属性：
	
	
		#{T(System).currentTimeMillis()}
		#{person.name}
		
		还可以用systemProperties获取引用系统属性:
		
		#{systemProperties['wbsite.URL']}
	
	
   语法用法:
 * 表示字面值
        比如#{1} #{'aaa'} #{true}
 * 引用bean、 属性和方法
       比如#{person.name}    如果person可能为null,可以用#{person?.name}
 * 在表达式中使用类型
  SpEL可以访问类作用域的方法和常量,例如， 为了在SpEL中表达Java的Math类， 需要按照如下的方式使用T()运算符：#{T(java.lang.Math)},T()运算符的结果会是一个Class对象
  
	  	#{T(java.lang.Math).PI}
	  	#{T(java.lang.Math).random()}
	  	
   	因此T()运算符的真正价值在于它能够访问目标类型的静态方法和常量。
 	SpEl表达式也可以用运算符进行计算，比如+-*><等等:
 	
	 	#{2*T(java.lang.Math).PI*circle.radius}
	 	#{circle.radius==3}
	 	#{name ?: 'zhangsan'}          (?:)Elvis运算符,判断name是否为null,为null采用默认值
 	  
 * 计算正则表达式
         通过matches
         
		#{person.name matches '正则内容'}   
		      	
 * 计算集合
  		
		#{music.song[1].title}
		#{'this'[1]} 相当于h
		
		查询运算符 (.?[])   
		#{music.songs.?[title eq 'Time']}  会得到所有title为Time的歌曲
		(.^[])和(.$[])  它们分别用来在集合中查询第一个匹配项和最后一个匹配项
	