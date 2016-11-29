package com.caroline.exe.category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * User: Caroline.Han
 * Date: 2016-11-29
 * Time: 下午4:34
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(SlowTests.class)
@Categories.ExcludeCategory(FastTests.class)
@Suite.SuiteClasses({A.class, B.class})
public class CategoryTest2 {
}
