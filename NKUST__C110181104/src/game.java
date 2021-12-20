public class game {
    public static void main(String[] args) {
    System.out.println("Archer"+"遇到了Berserker和Magician");
    System.out.println("Berserker"+"遇到了Archer和Magician");
    System.out.println("Magician"+"遇到了Berserker和Archer");    
    gameset Archer = new gameset("Archer",15,10,30);
    Archer.get();
    gameset Berserker = new gameset("Berserker",20,5,15);
    Berserker.get();
    gameset Magician = new gameset("Magician",10,30,40);
    Magician.get();
    System.out.println("----------------開始自動戰鬥-------------");
    System.out.println("----------------第一回合-------------");
    System.out.println("Archer"+"裝備了炸彈衣");
    System.out.println("Berserker"+"裝備了炸彈衣");
    System.out.println("Magician"+"裝備了炸彈衣");
    System.out.println("----------------第二回合-------------");
    System.out.println("Archer"+"發動自爆");
    System.out.println("Berserker"+"發動自爆");
    System.out.println("Magician"+"發動自爆");
    System.out.println("Archer "+"Berserker "+"Magician "+":阿拉花瓜");
    System.out.println("Archer"+"HP歸零");
    System.out.println("Berserker"+"HP歸零");
    System.out.println("Magician"+"HP歸零");
    System.out.println("GAMEOVER");    
    }
}
