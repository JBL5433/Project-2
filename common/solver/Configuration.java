package common.solver;

import java.util.Collection;

public interface Configuration {

    /**
     * gets collection of successors
     * @return valid successors
     */
    public Collection<Configuration> getSuccessors();

    /**
     * determines whether a configuration is valid
     * @return true if config is value, false otherwise
     */
    public boolean isValid();

    /**
     * determines whether a configuration is the goal
     * @return true if a config is the goal, false otherwise
     */
    public boolean isGoal();
}
