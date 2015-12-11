package spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import spring.beans.IEcho;

public class XmlConfigWithBeanFactory {

	private static final String XML_BEAN_DEFS = "src/main/resources/xmlBeanDef.xml";

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefReader = new XmlBeanDefinitionReader(beanFactory);
		xmlBeanDefReader.loadBeanDefinitions(new FileSystemResource(XML_BEAN_DEFS));
		
		IEcho echo = beanFactory.getBean("surfEcho", IEcho.class);
		echo.echo();
		
		echo = beanFactory.getBean("snowEcho", IEcho.class);
		echo.echo();
	}

}
