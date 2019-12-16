package com.sumanth.firstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component -> Says that it is a bean/object for spring to load
// @Autowired -> Says that sortAlgorithm is a dependency for Binary Search

@Component
public class BinarySearch {
  @Autowired
  private SortAlgorithm sortAlgorithm;

  public BinarySearch(SortAlgorithm sortAlgorithm) {
    super();
    this.sortAlgorithm = sortAlgorithm;
  }

  public int binarySearchC(int[] numbers, int search) {
    System.out.println(numbers);
    int[] sortedNumbers = sortAlgorithm.sort(numbers);
    return 9;
  }

}
