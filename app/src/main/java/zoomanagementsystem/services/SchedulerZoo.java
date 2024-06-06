package zoomanagementsystem.services;

import java.util.List;
import zoomanagementsystem.models.Animal;
import zoomanagementsystem.models.Keeper;


public abstract class SchedulerZoo {
    protected static SchedulerZoo instance;

    protected SchedulerZoo() {}

    public abstract void assignJobs(final List<? extends Keeper<? extends Animal>> keepers);
}