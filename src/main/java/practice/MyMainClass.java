package practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyMainClass {

	public static void main(String[] args) {
		
		ParentInterfaceImpl pi = new ParentInterfaceImpl(new ChildImpl1());
		String temp = pi.display();
		System.out.println(temp);
		//SpringApplication.run(MyMainClass.class, args);
	}

}
