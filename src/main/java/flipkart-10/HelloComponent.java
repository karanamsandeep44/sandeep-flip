package flipkart-10;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Instantiate;

@Component
@Instantiate
public class HelloComponent {

	public HelloComponent() {
		System.out.println("Hello fridge");
	}

}
