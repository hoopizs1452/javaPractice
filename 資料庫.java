import java.util.ArrayList;

public class 資料庫 {
	ArrayList<寶可夢> monsters = new ArrayList<寶可夢>();
	
	public 資料庫(ArrayList<寶可夢>monsters) {
		this.monsters = monsters;
	}
	
	public void add(寶可夢 m) {
		monsters.add(m);
	}
	
	public ArrayList<寶可夢>searchHpLargerThan(int hp){
		ArrayList<寶可夢> results = new ArrayList<寶可夢>();
		for(寶可夢 m:monsters)
		{
			if(m.getHP()>hp) results.add(m);
		}
		
		return results;
	}
	
	public ArrayList<寶可夢>search(searchLogic s){
		ArrayList<寶可夢> results = new ArrayList<寶可夢>();
		for(寶可夢 m:monsters) {
			if(s.choose(m)) results.add(m);
		}
		return results;
	}
}