package utility;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils {

	
		public static ObjectMapper mapper = new ObjectMapper();

	    public static String getValue(String parent, String child) throws IOException {

	        File file = new File("src/main/testdata.json");

	        JsonNode root = mapper.readTree(file);

	        return root.path(parent).path(child).asText();
}
}