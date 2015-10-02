package com.sz21c.common;

import com.sz21c.common.config.SpringRootConfig;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ContextConfiguration(classes = {SpringRootConfig.class})
@Transactional
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public @interface TestCommonSetting {
}
