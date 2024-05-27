package com.company.jmixpmflowbase.jobs;

import com.company.jmixpmflowbase.app.OverdueTasksInformer;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

public class OverdueTasksNotificationJob implements Job {

    protected OverdueTasksInformer overdueTasksInformer;

    @Autowired
    public void setOverdueTasksInformer (OverdueTasksInformer overdueTasksInformer) {
        this.overdueTasksInformer = overdueTasksInformer;
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        overdueTasksInformer.inform();
    }
}
