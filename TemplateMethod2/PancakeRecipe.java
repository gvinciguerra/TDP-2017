public abstract class PancakeRecipe {
    public PancakeRecipe() {
    }
    
    final void prepareRecipe() {
        takeLargeBowl();
        pourFlour();
        pourBakingPowder();
        pourSaltAndSugar();
        pourMilk();
        pourEggs();
        pourMeltedButter();
        heatGriddle();
        for (int i = 1; i <= 3; i++) {
            scoopBatter();
            cook();
        }
        System.out.println("Batter over");
    }
    
    abstract void pourFlour();
    
    abstract void pourBakingPowder();
    
    abstract void pourSaltAndSugar();
    
    abstract void pourMilk();
    
    abstract void pourMeltedButter();
    
    void pourEggs() {
        System.out.println("Pour 1 large egg");
    }
    
    void heatGriddle() {
        System.out.println("Eat an oiled griddle");
    }
    
    void takeLargeBowl() {
        System.out.println("Take a large bowl");
    }
    
    void scoopBatter() {
        System.out.println("Scoop some batter onto the griddle");
    }
    
    void cook() {
        System.out.println("Brown on both sides");
    }
}
