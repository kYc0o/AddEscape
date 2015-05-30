import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddEscape {

	public static void main(String[] args) throws IOException {
		/*
		 * Load the file to be formatted
		 */
		BufferedReader reader = new BufferedReader(new FileReader("/home/facosta/git/kevoree-c-reloaded/models/20nodes1component.json"));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();

		while ((line = reader.readLine()) != null) {
			line=line.replaceAll("\\\\", "\\\\\\\\");
			line=line.replaceAll(" ", "");
			line=line.replaceAll("'", "\\\\'");
			line=line.replaceAll("\"", "\\\\\"");
			stringBuilder.append(line);
			//stringBuilder.append(ls);
		
		}
		System.out.println(stringBuilder);
		reader.close();
		/*
		 * reprint the generated string
		 */
		System.out.println("");
	}
}
