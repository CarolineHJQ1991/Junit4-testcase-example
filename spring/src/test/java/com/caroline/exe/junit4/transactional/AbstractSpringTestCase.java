package com.caroline.exe.junit4.transactional;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Caroline.Han
 * Date: 2016-11-30
 * Time: 上午10:52
 */
@ContextConfiguration(locations = {"classpath:applicationContext/applicationContext.xml", "classpath:testDao.xml"})//TODO:这里为什么要引用这个classpath
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
// rollback为true测试的时候不会污染数据库
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public abstract class AbstractSpringTestCase {
}
