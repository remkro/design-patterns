package com;

import com.course.builder.DisplayType;
import com.course.builder.Tv;

public class Runner {
    public static void main(String[] args) {
        // Builder design pattern
        Tv tv = new Tv.TvBuilder()
                .brand("Samsung")
                .model("QE55S95B")
                .size(55)
                .refreshRate(120)
                .displayType(DisplayType.OLED)
                .smartTv(true)
                .build();
        System.out.println(tv);
    }
}
