package org.springpractice.aspect;

import org.springframework.stereotype.Component;


public @interface Loggable {

}/*
if there are multiple pointcuts, specifying them to Advices becomes 
difficult hence  we can configure custom annotations with advices to 
directly inform the methods with custom annotation for which advices  would
run.*/