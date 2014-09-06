/**
 * 
 * @author Yu Luo
 * 
 *         This is a simple Java problem that computes the the machine epsilon
 *         on a given machine using double precision.
 */
public class CalculateMachineEpsilon {

	public static void main(String[] args) {
		System.out.println(calculateMachineEpsilon());
	}

	/**
	 * Calculates the machine epsilon using double precision
	 * 
	 * @return machine epsilon value in double precision
	 */
	public static double calculateMachineEpsilon() {

		double machineEpsilon = 1.0;

		while (1.0 + machineEpsilon != 1.0) {
			machineEpsilon = machineEpsilon / 2.0;
		}

		// because the loop divided 2.0 one extra time, I am multiplying it back
		// in the return statement
		return machineEpsilon * 2.0;

	}

}
