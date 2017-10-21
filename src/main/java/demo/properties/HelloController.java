package demo.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	Environment env;

	@Value("${prop.example.num_00001:shortKeyDefaultValue}")
	private String shortKey;

	@Value("${longPreixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxprop.example.num00001:longKeydefaultValue}")
	private String longKey;

	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {

		StringBuilder output = new StringBuilder();
		output.append(("sayHello ==================================<BR>\n"));
		output.append(String.format("shortKey: %s<BR>\n", shortKey));
		output.append(String.format("shortKey: %s<BR>\n", env.getProperty("prop.example.num_00001")));
		output.append(String.format("longKey: %s<BR>\n", longKey));
		output.append(String.format("longKey: %s<BR>\n", env.getProperty(
			"longPreixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxprop.example.num00001")));

		output.append("sayHello ==================================<BR>\n");
		System.out.println(output.toString()
			.replaceAll("<BR>", ""));
		return output.toString();
	}
}
