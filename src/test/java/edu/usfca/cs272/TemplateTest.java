package edu.usfca.cs272;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Tests for the {@link Template} class.
 *
 * @author CS 272 Software Development (University of San Francisco)
 * @version Fall 2023
 */
@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class TemplateTest {

	/**
	 * Placeholder.
	 */
	@Nested
	@Tag("A")
	@Order(1)
	@TestMethodOrder(OrderAnnotation.class)
	public class FirstTestGroup {
		/**
		 * Placeholder.
		 */
		@Test
		@Order(1)
		public void testFail() {
			Assertions.fail("Placeholder.");
		}

		/**
		 * Placeholder.
		 *
		 * @param text placeholder
		 */
		@Order(2)
		@ParameterizedTest(name = "[{index}: \"{0}\"]")
		@ValueSource(strings = { "hello", "world" })
		public void testParam(String text) {
			System.out.println(text);
			Assertions.assertNotNull(text);
		}
	}

	/**
	 * Placeholder.
	 */
	@Nested
	@Tag("B")
	@Order(2)
	@TestMethodOrder(OrderAnnotation.class)
	public class SecondTestGroup {
		/**
		 * Placeholder.
		 */
		@Order(1)
		@RepeatedTest(2)
		public void testRepeated() {
			Assertions.fail("Placeholder.");
		}

		/**
		 * Placeholder.
		 */
		@Order(2)
		@Test
		@DisplayName("Hello!")
		public void testDisplay() {
			Assertions.assertNull(null, "Placeholder.");
		}

		/**
		 * Placeholder.
		 */
		@Order(3)
		@Test
		@Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
		public void testTimeout() {
			Executable e = () -> Integer.parseInt("hello");
			Assertions.assertThrows(NumberFormatException.class, e);
		}
	}

	/**
	 * Placeholder.
	 */
	@Nested
	@Tag("C")
	@Order(3)
	@TestMethodOrder(OrderAnnotation.class)
	public class ThirdTestGroup {
		/**
		 * Placeholder.
		 */
		@Test
		public void testThrow() {
			Assertions.assertDoesNotThrow(() -> true);
		}
	}

	/**
	 * Placeholder.
	 */
	@Nested
	@Tag("D")
	@Order(4)
	@TestMethodOrder(OrderAnnotation.class)
	public class FourthTestGroup {
		/**
		 * Placeholder.
		 */
		@Test
		public void testThrow() {
			Assertions.assertDoesNotThrow(() -> true);
		}
	}

	/**
	 * Placeholder.
	 */
	@Nested
	@Tag("E")
	@Order(5)
	@TestMethodOrder(OrderAnnotation.class)
	public class FifthTestGroup {
		/**
		 * Placeholder.
		 */
		@Test
		@Order(1)
		public void testFail() {
			Integer.parseInt("hello");
		}
	}

	/**
	 * Placeholder.
	 */
	@Nested
	@Tag("F")
	@Order(6)
	@TestMethodOrder(OrderAnnotation.class)
	public class SixthTestGroup {
		/**
		 * Placeholder.
		 */
		@Test
		public void testThrow() {
			Assertions.assertDoesNotThrow(() -> true);
		}
	}
}
