package io.micronaut.inject.processing;

import io.micronaut.inject.writer.BeanDefinitionVisitor;

import java.util.Collection;

/**
 * Builder that produces multiple Bean definitions represented by {@link BeanDefinitionVisitor}.
 *
 * @author Denis Stepanov
 * @since 4.0.0
 */
public interface BeanDefinitionBuilder {

    /**
     * @return produces Bean definitions
     */
    Collection<BeanDefinitionVisitor> build();

}
