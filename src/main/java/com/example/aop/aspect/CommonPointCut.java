package com.example.aop.aspect;

import com.example.aop.annotation.LogExecutionTime;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
public class CommonPointCut {

    @LogExecutionTime
    public void forLogPurpose(){
        System.out.println("Executed Successfully");
    }
}
