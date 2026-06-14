package com.example.demo;

public class Instructor extends Person implements Teacher{
    
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
         learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        double hoursSplit;
        double countLearner = 0;

        for(Learner x : learners) {
            countLearner++;
        }

        hoursSplit = numberOfHours / countLearner;

        for(Learner x : learners) {
            teach(x, hoursSplit);
        }
    }
}
