package lab1.lab1;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.*;
import org.json.*;


public class Prog {
		public static void main(String args[])throws Exception {
		JSONParser jsonparser = new JSONParser();
		FileReader reader= new FileReader (".\\json\\student.json");
	Object obj = jsonparser.parse(reader);
	JSONObject empobj = (JSONObject)obj;
	String fname=(String)empobj.get("Firstname");
	String lname=(String)empobj.get("Lastname");
	System.out.println("FIRST NAME:"+fname);
	System.out.println("LAST NAME:"+lname);
	}
}
