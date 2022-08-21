package test;

import org.junit.jupiter.api.Test;

import adapter.*;


/**
 * @author Jalal Choker
 * @since 07-08-2022
 */
class AdapterTest {	

	@Test
	void testAdapter(){

		// classes are incompatible
		var tank = new EnemyTank(); // the target class
		var robot = new EnemyRobot(); // the adaptee class

		// Referring to an instance of the adapter class, which accepts and adaptee as a parameter, from the target interface
		// target -> adapter -> adaptee
		// it routes the method calls in target to the corresponding ones in the adaptee
		EnemyAttacker robotAdapter  =new EnemyRobotAdapter(robot);
		
		
		System.out.println("The Robot");

		robot.reactToHuman("Paul");
		robot.walkForward();
		robot.smashWithHands();
		System.out.println();

		System.out.println("The Enemy Tank");

		tank.assignDriver("Frank");
		tank.driveForward();
		tank.fireWeapon();
		System.out.println();
		
		System.out.println("The Robot with adapter");

		robotAdapter.assignDriver("Sam");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		System.out.println();
	}
}
