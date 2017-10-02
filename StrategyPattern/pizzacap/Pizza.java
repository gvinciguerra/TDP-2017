package pizzacap;

/**
 * Aggiungi qui una descrizione della classe Pizza
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Pizza
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private String name;
    private float price;

    /**
     * Costruttore degli oggetti di classe  Pizza
     */
    public Pizza(String name, float price)
    {
        // inizializza le variabili d'istanza
        this.name = name;
        this.price = price;
    }

    public float getPrice(){
        return price;
    }
}
