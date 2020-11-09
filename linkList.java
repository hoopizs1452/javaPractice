import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class linkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> car = new ArrayList<String>();//隨機存取
		//LinkedList<String> car = new LinkedList<String>();//循序存取，時常增加刪減資料
		HashSet<String> car = new HashSet<String>();
		car.add("Ford");
		car.add("Benz");
		car.add("BMW");
		car.add("Tesla");
		System.out.println(car);
//		for(int i=0; i<car.size(); i++)
//		{
//			System.out.println(car.get(i));
//		}
		for(String i:car)
		{
			System.out.println(i);
		}
//		ArrayList<String> list = new ArrayList<String>(car);
//		Collections.sort(list);
//		for(String i:car)
//		{
//			System.out.println(i);
//		}
//		car.get(0);
//		car.set(0, "Toyota");
//		car.remove(0);
//		car.size();
//		car.clear();
	}

}
