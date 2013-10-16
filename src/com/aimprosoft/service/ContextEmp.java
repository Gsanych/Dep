package com.aimprosoft.service;

import com.aimprosoft.database.model.Employee;

public class ContextEmp {
    private ActionStrategy<Employee> actionStrategy;
    public ContextEmp() {

    }

    public void setActionStrategy(ActionStrategy actionStrategy) {
        this.actionStrategy = actionStrategy;
    }

    public Employee executeActionStrategy(String text, Employee entity) {
        return actionStrategy.executeAction(text, entity);
    }
}
