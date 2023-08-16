import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;

@Setter
@Getter
public class Coffee {
    private String name;
    private String roast;
    private double price;

    public Coffee(){}
    public Coffee(String name, String roast, double price) {
        this.name = name;
        this.roast = roast;
        this.price = price;
    }
}
