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
		System.out.println("������" +niqiu.weight);//���1
		Lake taihu  = new Lake();
		taihu.setFish(niqiu);
		taihu.eat(15);
		System.out.println("������" +niqiu.weight);//���2
		System.out.println("̫�����������" +taihu.fish.weight);//���3
		Lake lake1 = new Lake();
		lake1.setFish(niqiu);
		lake1.eat(215);
		System.out.println("������" + niqiu.weight);//���4
		System.out.println("lake1���������" +lake1.fish.weight);//���5
		System.out.println("̫�����������" +taihu.fish.weight);//���6
	}
}


