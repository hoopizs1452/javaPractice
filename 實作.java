public class 實作 implements searchLogic {

	int hp = 0;
	
	實作(int hp)
	{
		this.hp = hp;
	}
	
	public boolean choose(寶可夢 m) {
		if(m.getHP()>hp) return false;
		else return true;
	}
}
