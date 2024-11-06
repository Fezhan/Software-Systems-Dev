import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameManager {
	private List<String> names = new ArrayList<String>();
	
	
	public void addName(String name) {
		this.names.add(name);
	}
	
	
	public void printNames() {
		System.out.println("\n");
		for (String name: this.names) {
			System.out.println(name);
		}
	}
	
	public void removeLongNames() {
		Iterator<String> it = this.names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			if (name.length() > 15) {
				it.remove();
			}
		}
	}
}
