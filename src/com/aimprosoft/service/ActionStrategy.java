package com.aimprosoft.service;

import com.aimprosoft.database.model.Department;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 10/16/13
 * Time: 12:04 PM
 */
public interface ActionStrategy<T> {

   // Map<String, ActionStrategy> actions = new HashMap<>();

    T executeAction(String text, T entity);

}
