
public class Driver {

	public static void main(String[] args) {
		NameManager manager = new NameManager();
		
		manager.addName("M.Micklesonssonssonssson");
		manager.addName("M.Richard");
		manager.addName("D.Morgan");
		manager.addName("K.Ken");
		manager.addName("R.Poole");
		
		manager.printNames();
		
		manager.removeLongNames();
		
		manager.printNames();
		
		System.out.println("\n");
		
		NumberSorter sorter = new NumberSorter();
		
		sorter.sort(new int [] {1,9,2,3,10,8,12,1,99,2,43,68,109,0});
		sorter.sort(new int [] {1,2,3,4});
		sorter.sort(new int [] {4,3,2,1});
	}

}
