package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TryCatchFinallyApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TryCatchFinallyApplication.class, args);

		/*
		 * System.out.println(test_1a()); System.out.println(test_1b());
		 * System.out.println(test_1c()); try { System.out.println(test_1d()); } catch
		 * (Exception e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
		 * Thread.sleep(2000);
		 */
		System.out.println(test_2a());
		System.out.println(test_2b());
		System.out.println(test_2c());
		try {
			System.out.println(test_2d());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		System.out.println(test_2e());
		try {
			System.out.println(test_2f());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 1 - No exception from Try
	// a - Try - return "fromtry"
	// Finally - void
	private static String test_1a() throws Exception {
		try {
			System.out.println("test_1a -> " + "try" + "-> " + " I am here");
			String result = "returning from test_1a.try()";
			return result;
		} catch (Exception e) {
			System.out.println("test_1a -> " + "catch" + "-> " + " I am here");
			String result = "returning from test_1a.catch()";
			return result;
		} finally {
			System.out.println("test_1a -> " + "finally" + "-> " + " I am here");

		}
	}

	// 1 - No exception from Try
	// b - Try - return "fromtry"
	// Finally - return "fromfinally"
	private static String test_1b() throws Exception {
		try {
			System.out.println("test_1b -> " + "try" + "-> " + " I am here");
			String result = "returning from test_1b.try()";
			return result;
		} catch (Exception e) {
			System.out.println("test_1b -> " + "catch" + "-> " + " I am here");
			String result = "returning from test_1b.catch()";
			return result;
		} finally {
			System.out.println("test_1b -> " + "finally" + "-> " + " I am here");
			String result = "returning from test_1b.finally()";
			return result;
		}
	}

	// 1 - No exception from Try
	// c - Try - return "fromtry"
	// Finally - update return object in "finally" but dont return it
	private static String test_1c() throws Exception {
		String result = null;
		try {
			System.out.println("test_1c -> " + "try" + "-> " + " I am here");
			result = "returning from test_1c.try()";
			return result;
		} catch (Exception e) {
			System.out.println("test_1c -> " + "catch" + "-> " + " I am here");
			result = "returning from test_1c.catch()";
			return result;
		} finally {
			System.out.println("test_1c -> " + "finally" + "-> " + " I am here");
			result = "returning from test_1c.finally()";
		}
	}

	// 1 - No exception from Try
	// d - Try - return "fromtry"
	// Finally - throw Exception
	private static String test_1d() throws Exception {
		String result = null;
		try {
			System.out.println("test_1d -> " + "try" + "-> " + " I am here");
			// result = "returning from test_1d.try()";
			return "returning from test_1d.try()";
		} catch (Exception e) {
			System.out.println("test_1d -> " + "catch" + "-> " + " I am here");
			result = "returning from test_1d.catch()";
			return result;
		} finally {
			System.out.println("test_1d -> " + "finally" + "-> " + " I am here");
			result = "returning from test_1d.finally()";
			throw new MyExceptionFinally();
		}
	}

	// 2 - MyException from Try
	// a - catch - handles excpetion
	// Finally - void
	private static String test_2a() throws Exception {
		String result = null;
		boolean flag = true;
		try {
			System.out.println("test_2a -> " + "try" + "-> " + " I am here");
			result = "returning from test_2a.try()";
			if (flag)
				throw new MyExceptionTry();
			return result;
		} catch (MyExceptionTry e) {
			System.out.println("test_2a -> " + "catch" + "-> " + " I am here");
			result = "returning from test_2a.catch()";
			return result;
		} finally {
			System.out.println("test_2a -> " + "finally" + "-> " + " I am here");
		}
	}

	// 2 - MyExceptionTry from Try
	// b - catch - return
	// Finally - return
	private static String test_2b() throws Exception {
		String result = null;
		boolean flag = true;
		try {
			System.out.println("test_2b -> " + "try" + "-> " + " I am here");
			result = "returning from test_2b.try()";
			if (flag)
				throw new MyExceptionTry();
			return result;
		} catch (MyExceptionTry e) {
			System.out.println("test_2b -> " + "catch" + "-> " + " I am here");
			result = "returning from test_2b.catch()";
			return result;
		} finally {
			System.out.println("test_2b -> " + "finally" + "-> " + " I am here");
			result = "returning from test_2b.finally()";
			return result;
		}
	}

	// 2 - MyException from Try
	// c - catch - handles exception
	// Finally - updates the result here but dont return
	private static String test_2c() throws Exception {
		String result = null;
		boolean flag = true;
		try {
			System.out.println("test_2c -> " + "try" + "-> " + " I am here");
			result = "returning from test_2c.try()";
			if (flag)
				throw new MyExceptionTry();
			return result;
		} catch (MyExceptionTry e) {
			System.out.println("test_2c -> " + "catch" + "-> " + " I am here");
			result = "returning from test_2c.catch()";
			return result;
		} finally {
			System.out.println("test_2c -> " + "finally" + "-> " + " I am here");
			result = "returning from test_2c.finally()";
		}
	}

	// 2 - MyExceptionTry from Try
	// d - catch - throws exception MyExceptionCatch
	// Finally - void
	private static String test_2d() throws Exception {
		String result = null;
		boolean flag = true;
		try {
			System.out.println("test_2d -> " + "try" + "-> " + " I am here");
			result = "returning from test_2d.try()";
			if (flag)
				throw new MyExceptionTry();
			return result;
		} catch (MyExceptionTry e) {
			System.out.println("test_2d -> " + "catch" + "-> " + " I am here");
			result = "returning from test_2d.catch()";
			if (flag)
				throw new MyExceptionCatch();
			return result;
		} finally {
			System.out.println("test_2d -> " + "finally" + "-> " + " I am here");
		}
	}

	// 2 - MyExceptionTry from Try
	// e - catch - throws exception MyExceptionCatch
	// Finally - return
	private static String test_2e() throws Exception {
		String result = null;
		boolean flag = true;
		try {
			System.out.println("test_2e -> " + "try" + "-> " + " I am here");
			result = "returning from test_2e.try()";
			if (flag)
				throw new MyExceptionTry();
			return result;
		} catch (MyExceptionTry e) {
			System.out.println("test_2e -> " + "catch" + "-> " + " I am here");
			result = "returning from test_2e.catch()";
			if (flag)
				throw new MyExceptionCatch();
			return result;
		} finally {
			System.out.println("test_2e -> " + "finally" + "-> " + " I am here");
			result = "returning from test_2e.finally()";
			return result;
		}
	}

	// 2 - MyExceptionTry from Try
	// f - catch - throws exception MyExceptionCatch
	// Finally - throws exception MyExceptionFinally
	private static String test_2f() throws Exception {
		String result = null;
		boolean flag = true;
		try {
			System.out.println("test_2f -> " + "try" + "-> " + " I am here");
			result = "returning from test_2f.try()";
			if (flag)
				throw new MyExceptionTry();
			return result;
		} catch (MyExceptionTry e) {
			System.out.println("test_2f -> " + "catch" + "-> " + " I am here");
			result = "returning from test_2f.catch()";
			if (flag)
				throw new MyExceptionCatch();
			return result;
		} finally {
			System.out.println("test_2f -> " + "finally" + "-> " + " I am here");
			result = "returning from test_2f.finally()";
			if (flag)
				throw new MyExceptionFinally();
			return result;
		}
	}

}
