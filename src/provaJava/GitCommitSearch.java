package provaJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GitCommitSearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		try {
		    ProcessBuilder pb = new ProcessBuilder("git","log", "--grep=added");
		    pb.redirectErrorStream(true);
		    Process process = pb.start();

		    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

		    String line;
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }

		    int exitCode = process.waitFor();
		    System.out.println("Exited with error code " + exitCode);
		} catch (IOException | InterruptedException e) {
		    e.printStackTrace();
		}



	}

}
