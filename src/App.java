import bean.CustomerService;
import bean.ManualBeanFactory;

public class App {
    public static void main(String[] args) {
        ManualBeanFactory beanFactory = new ManualBeanFactory();
        CustomerService customerService = (CustomerService) beanFactory.getBean("customerService");
        customerService.doSomething();
    }
}
