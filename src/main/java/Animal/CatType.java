package Animal;

/**
 * Created by Админ on 15.11.2016.
 */

   public enum CatType {
        Leopard ("I'm Leo"), Puma ("I'm Puma"), Lion ("I'm the king of the animals"), Cat ("I'm cat. Stroke me!");
    public String who;

    CatType (String c){
        who = c;
    }

        public String getWho(){
            return (who);
        }
}
