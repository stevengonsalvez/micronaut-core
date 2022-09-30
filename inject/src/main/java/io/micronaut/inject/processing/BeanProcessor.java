package io.micronaut.inject.processing;

import io.micronaut.inject.writer.BeanDefinitionVisitor;

import java.util.Collection;

public interface BeanProcessor {

    Collection<BeanDefinitionVisitor> process();

}
