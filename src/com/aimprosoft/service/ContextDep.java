package com.aimprosoft.service;

import com.aimprosoft.database.model.Department;

/**
 * Date: 10/16/13
 * Time: 4:38 PM
 */
public class ContextDep {
    private ActionStrategy<Department> actionStrategy;

    public ContextDep() {

    }

    public void setActionStrategy(ActionStrategy actionStrategy) {
        this.actionStrategy = actionStrategy;
    }

    public Department executeActionStrategy(String text, Department entity) {
        return actionStrategy.executeAction(text, entity);
    }
}
