import java.util.ArrayList;
import java.util.Iterator;

public class 疊代器範例 {
	public static void main(String[] args) {
		ArrayList<Integer> 數字矩陣 = new ArrayList<Integer>();
		數字矩陣.add(12);
		數字矩陣.add(8);
		數字矩陣.add(2);
		數字矩陣.add(23);
		Iterator<Integer> 疊代器 = 數字矩陣.iterator();
		while (疊代器.hasNext()) {
			Integer 整數 = 疊代器.next();
			if (整數 < 10) {
				疊代器.remove();
			}
		}
		System.out.println(數字矩陣);
	}
}
