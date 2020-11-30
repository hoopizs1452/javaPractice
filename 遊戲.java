import java.util.ArrayList;

public class 遊戲 {

	public static void main(String[] args) {
		寶可夢 m1 = new 寶可夢(110);
		寶可夢 m2 = new 寶可夢(80);
		寶可夢 m3 = new 寶可夢(90);
		
		ArrayList<寶可夢> monsters = new ArrayList<寶可夢>();
		
		資料庫 db = new 資料庫(monsters);
		db.add(m1);
		db.add(m2);
		db.add(m3);
		
		monsters.forEach((m)->{System.out.println(m.getHP());});
		
		int hp = 100;
		
		//方法1
		db.searchHpLargerThan(hp);
		//方法2
		db.search(new searchLogic() {
			@Override
			public boolean choose(寶可夢 m) {
				if(m.getHP()>hp) return false;
				else return true;
			}
		});
		//方法3
		實作 logic = new 實作(100);
		db.search(logic);
		
		//方法4
		db.search((m)->{
			if(m.getHP()>hp)
				return false;
			else
				return true;
		});
		}
	}