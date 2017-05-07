import java.io.*;

class ConvertTemps {
	public static void main(String args[]) {
		if (args.length < 3) {
			System.err.println("ERROR: Too few arguments were "
						+ "given on the command line.");
			System.err.println("USAGE: java ConvertTemp "
						+ " temperature "
						+ " [F|C] "
						+ " [F|C]");
			return;
		}

		switch (args[1]) {
			case "F": case "C":
				break;
			default:
				System.err.println("ERROR: Improper "
							+ " temperature scale "
							+ "'" + args[1] + "'");
				System.err.println("Temp scale must be: "
							+ "F (Fahrenheit), or "
							+ "C (Celsius).");
				return;
		}

		switch (args[2]) {
			case "F": case "C":
				break;
			default:
				System.err.println("ERROR: Improper "
							+ " temperature scale "
							+ "'" + args[1] + "'");
				System.err.println("Temp scale must be: "
							+ "F (Fahrenheit), or "
							+ "C (Celsius).");
				return;
		}

		float temperature = Float.parseFloat(args[0]);

		System.out.print(temperature + " " + args[1] + " = ");

		if (args[1].equals("F") && args[2].equals("C")) {
			temperature = (temperature - 32) * 5 / 9;
		} else if (args[1].equals("C") && args[2].equals("F")) {
			temperature = (temperature * 9 / 5) + 32;
		} else {
			System.err.println("ERROR: This should never happen.");
		}

		System.out.println(temperature + " " + args[2]);
	}
}