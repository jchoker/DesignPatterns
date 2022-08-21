/**
 * EnemyTank implements EnemyAttacker, our job is to make classes with different methods from EnemyAttacker
 * to work with the EnemyAttacker interface
 */

package adapter;

import java.util.Random;

/**
 * @author Jalal Choker
 * @since 06-08-2022
 */

public class EnemyTank implements EnemyAttacker {

	private final Random generator = new Random();	
	
	public void fireWeapon() {
		int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Enemy Tank Does " + attackDamage + " Damage");
	}

	public void driveForward() {
		int movement = generator.nextInt(5) + 1;
		
		System.out.println("Enemy Tank moves " + movement + " spaces");
	}

	public void assignDriver(String driverName) {
		System.out.println(driverName + " is driving the tank");
	}
}
