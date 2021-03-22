package bean;

import proxy.CustomerServiceProxy;

public class ManualBeanFactory {
    public Object getBean (String beanName) {
        if("customerService".equals(beanName)) {
            return new CustomerServiceProxy();
        }
        return null;
    }
}
