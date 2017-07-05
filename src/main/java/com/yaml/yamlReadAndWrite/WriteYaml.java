package com.yaml.yamlReadAndWrite;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

public class WriteYaml {

	public static void main(String... S) throws IOException {
		
		
		List list =new ArrayList<>();
		List list2 =new ArrayList<>();

		Map<String,Object> individualMap=new HashMap<>();
		Map<String,Object> outer=new HashMap<>();
		
		
		
		individualMap.put("name", "shad");
		individualMap.put("id", "4180");
		individualMap.put("active", "true");
		
		list.add( individualMap);
		
		
		
		
		Map<String,Object> individualMap2=new HashMap<>();
		individualMap2.put("name", "hey");
		individualMap2.put("id", "3275");
		individualMap2.put("active", "fals");
		
		list.add( individualMap2);
		outer.put("individual", list);
		
		

		Yaml yaml = new Yaml();
		FileWriter writer = new FileWriter("src/main/resources/db.yaml");

		yaml.dump(outer, writer);
		

	}

}
