package be.sven.firsttrial.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

class MyControllerUnitTest {

	@Test
	void sayHello() {
		MyController controller = new MyController();
		Model model = new BindingAwareModelMap();
		String result = controller.sayHello("Sven", model);
		assertEquals("hello", result);
		assertEquals("Sven", model.getAttribute("user"));
	}

}
