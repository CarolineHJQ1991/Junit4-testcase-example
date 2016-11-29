package com.caroline.exe.parameterized;

import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;
import org.junit.runners.parameterized.TestWithParameters;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午0:03
 */
public class MyRunnerWithParameters extends BlockJUnit4ClassRunnerWithParameters {

    private final Object[] parameters;

    public MyRunnerWithParameters(TestWithParameters test) throws InitializationError {
        super(test);
        parameters = test.getParameters().toArray(new Object[test.getParameters().size()]);
    }

    @Override
    public Object createTest() throws Exception {
        return getTestClass().getOnlyConstructor().newInstance(parameters);
    }
}
