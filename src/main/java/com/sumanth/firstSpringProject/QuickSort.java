package com.sumanth.firstSpringProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {
  public int[] sort(int[] number) {

    // super();
    System.out.println("Quick sort");
    return number;
  }

}
