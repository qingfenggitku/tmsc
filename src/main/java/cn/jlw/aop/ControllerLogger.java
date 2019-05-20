package cn.jlw.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class ControllerLogger {

        private static final Logger log=Logger.getLogger("ControllerLogger");
        //代表前置增强的方法
        public void before(JoinPoint jp){
            log.info("before 调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。方法入参："+ Arrays.toString(jp.getArgs()));

        }
        //代表后置增强的方法
        public void after(JoinPoint jp ,Object result){
            log.info("after 调用："+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。返回值："+result);
        }
    }

