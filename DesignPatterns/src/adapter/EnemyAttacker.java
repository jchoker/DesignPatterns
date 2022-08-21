/**
 * The 'Target' interface is what clients are expected to work with.
 * The adapters job is to make new classes compatible with it. (Target -> Adapter -> Adaptee)
 */
package adapter;

/**
 * @author Jalal Choker
 * @since 06-08-2022
 */

public interface EnemyAttacker {
	
	void fireWeapon();

	void driveForward();

	void assignDriver(String driverName);
}
