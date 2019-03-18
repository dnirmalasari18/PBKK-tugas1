package com.mala.model;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.mala.model")
@PropertySource("classpath:Config")
public class LessonConfig {
	@Bean("Math")
	public Lesson math1() {
		MathLesson math=new MathLesson("Algebra",80);
		return math;
	}
	@Bean
	public Lesson math2() {
		return new MathLesson("Fraction",75);
	}
}
