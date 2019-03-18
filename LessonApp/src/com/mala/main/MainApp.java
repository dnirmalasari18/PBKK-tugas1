package com.mala.main;
import com.mala.model.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mala.model.*;

public class MainApp {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LessonConfig.class);
	Lesson lesson1=context.getBean("math", Lesson.class);
	MathLesson math1=(MathLesson) lesson1;
	System.out.println(math1.getInfo());
}
