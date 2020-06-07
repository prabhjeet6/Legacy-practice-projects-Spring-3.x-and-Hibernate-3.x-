import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class DisplayName implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("PAI bean name:"+ beanname);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("PBI beanname:"+beanname);
		return bean;
	}

}
