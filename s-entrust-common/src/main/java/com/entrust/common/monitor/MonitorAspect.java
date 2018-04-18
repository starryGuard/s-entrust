package com.entrust.common.monitor;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 监控切面
 * Created by lixiaohan on 2018/4/17.
 */
@Slf4j
@Aspect
@Component
public class MonitorAspect {
    @Around(value = "execution(* com.entrust..*.*(..)) && @annotation(monitor)")
    public Object monitor(ProceedingJoinPoint pjp, Monitor monitor) throws Throwable {
        MonitorInfo info = new MonitorInfo(monitor.key());
        try {
            return pjp.proceed();
        } catch (Throwable e) {
            info.error();
            throw e;
        } finally {
            info.getElapsedTime();
            log.info(info.toString());
        }
    }
}
