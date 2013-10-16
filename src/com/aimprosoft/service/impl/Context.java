package com.aimprosoft.service.impl;

import com.aimprosoft.service.ActionStrategy;

/**
 * Date: 10/16/13
 * Time: 6:50 PM
 */
public interface Context<T> {
   T executeActionStrategy(String text, T entity);
}
