package com.sumanth.firstSpringProject;

// import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(FirstSpringProjectApplication.class,
				args);
		// BubbleSort buble = applicationContext.getBean(BubbleSort.class)
		BinarySearch binary = applicationContext.getBean(BinarySearch.class);
		int result = binary.binarySearchC(new int[] { 3, 4, 4 }, 5);
		System.out.println(result);
		// App
		// Employee emp1 = new Employee();
		// emp1.setEmpNo('1');
		// emp1.setEName("king");
		// // emp1.toString()
		// System.out.println(emp1.toString());
	}

}
