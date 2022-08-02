package builder;

import java.util.List;

/**
 * @author Jalal Choker
 * @since 01-08-2022
 */
public interface Car {

	void setType(CarType type); 

	void setEngine(String engine);
	
	void setTransmission(String transmission);
	
	void setSeats(int seats);

    void setOptions(List<String> options);
}
