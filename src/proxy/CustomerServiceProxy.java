package proxy;

import aspect.LoggerAspect;
import bean.CustomerServiceImpl;

public class CustomerServiceProxy extends CustomerServiceImpl {
    public CustomerServiceProxy() {
        super();
    }

    @Override
    public void doSomething() {
        LoggerAspect loggerAspect = new LoggerAspect();
        loggerAspect.logBefore();
        super.doSomething();
        loggerAspect.logAfter();
    }
}
