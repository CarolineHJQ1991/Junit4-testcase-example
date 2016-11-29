package com.caroline.exe.parameterized;

import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午0:01
 */
public class MyRunnerFactory implements ParametersRunnerFactory {//TODO: 自定义runnerFactory有什么好处体现吗?

    @Override
    public Runner createRunnerForTestWithParameters(TestWithParameters testWithParameters) throws InitializationError {
        return new MyRunnerWithParameters(testWithParameters);
    }
}
