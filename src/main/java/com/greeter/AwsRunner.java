package com.greeter;

import com.greeter.domain.Greeter;
import com.greeter.interfaces.LambdaRunner;

public class AwsRunner implements LambdaRunner<String> {
    public String run(){
        Greeter greeter = new Greeter();
        return greeter.greet();
    }
}
