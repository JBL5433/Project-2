package common.solver;

import java.io.ObjectInputFilter;
import java.util.Collection;

public class Solver implements Configuration {


    @Override
    public Collection<Configuration> getSuccessors() {
        return null;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public boolean isGoal() {
        return false;
    }

    public Configuration solve(Configuration config) {
        Configuration solution;
        if(config.isGoal()) {
            return config;
        } else {
            for(Configuration c : config.getSuccessors()) {
                if(c.isValid()) {
                    solution = solve(c);
                    if(solution != null) {
                        return solution;
                    }
                }
            }
        }
        return null;
    }
}
