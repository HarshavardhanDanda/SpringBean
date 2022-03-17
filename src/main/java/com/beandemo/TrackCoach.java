package com.beandemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("newBean")
@Scope("prototype")
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "This is the Track coach speaking";
    }
}
