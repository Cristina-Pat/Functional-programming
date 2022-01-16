package functional_programming;

public class Gem {
	private String kind;     // The kind of gem.
    private String colour;   // The colour of the gemstone.
    private float weight;   // The weight in carat.

    public Gem(String aKind, String aColour, float aWeight) 
    {
        this.kind = aKind;
        this.colour  = aColour;
        this.weight  = aWeight;
    }

    public String getKind() 
    {
        return kind;
    }

    public String getColour() 
    {
        return colour;
    }

    public double getWeight() 
    {
        return weight;
    }

    public String toString() 
    {
        return kind 
               + ", colour = " + colour 
               + ", ct = " + weight;
    }
}
