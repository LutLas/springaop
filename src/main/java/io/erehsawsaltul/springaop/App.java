package io.erehsawsaltul.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.erehsawsaltul.springaop.daos.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext dbConfigFile = new ClassPathXmlApplicationContext("io/erehsawsaltul/springaop/global_config.xml");
    	ProductService productService = (ProductService) dbConfigFile.getBean("productService");
    	//System.out.println(productService.multiply(4, 8));
    	productService.multiply(4, 8);
    }
}
