package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;

import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("processFiles111")
public class HelloWorldDelegate implements JavaDelegate {

    private final Logger LOGGER = LoggerFactory.getLogger(HelloWorldDelegate.class.getName());

    public void execute(DelegateExecution execution) throws Exception {
    	LOGGER.info("Process: " + execution.getVariable("process"));
        LOGGER.info("Hello World");
    }

}