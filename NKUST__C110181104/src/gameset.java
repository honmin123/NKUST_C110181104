public class gameset {
    int hp;
    int mp;
    int atk;
   String role;
   gameset(String Role,int Hp,int Mp, int Atk){
      role = Role;
      hp = Hp;
      mp = Mp;
      atk = Atk;
   }
   void get(){
       System.out.println("Role:"+role);
       System.out.println("Hp:"+hp);
       System.out.println("Mp:"+mp);
       System.out.println("Atk:"+atk);
    }
}   
