class Fish{
	int weight;
}
class Lake{
	Fish fish;
	void setFish(Fish s){
		fish = s;
	}
	void eat(int n){
		fish.weight = fish.weight + n;
	}
}
public class FishandLake{
	public static void main(String[] args) {
		Fish niqiu = new Fish();
		System.out.println("泥鳅：" +niqiu.weight);//输出1
		Lake taihu  = new Lake();
		taihu.setFish(niqiu);
		taihu.eat(15);
		System.out.println("泥鳅：" +niqiu.weight);//输出2
		System.out.println("太湖里的泥鳅：" +taihu.fish.weight);//输出3
		Lake lake1 = new Lake();
		lake1.setFish(niqiu);
		lake1.eat(215);
		System.out.println("泥鳅：" + niqiu.weight);//输出4
		System.out.println("lake1里的泥鳅：" +lake1.fish.weight);//输出5
		System.out.println("太湖里的泥鳅：" +taihu.fish.weight);//输出6
	}
}


