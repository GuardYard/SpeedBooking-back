package fr.speedbooking.springboot;

import fr.speedbooking.springboot.controller.BookController;
import fr.speedbooking.springboot.exception.RessourceNotFoundException;
import fr.speedbooking.springboot.model.Book;
import fr.speedbooking.springboot.model.GenreBook;
import fr.speedbooking.springboot.model.User;
import fr.speedbooking.springboot.model.UserBook;
import fr.speedbooking.springboot.repository.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.HashSet;


@SpringBootApplication
public class SpeedBookingBackApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpeedBookingBackApplication.class, args);
	}
}
