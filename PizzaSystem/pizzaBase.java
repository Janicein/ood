public abstract class pizzaBase {
    sizeType size;
    double price;

    public sizeType getSizeType(){
        return size;
    }
    public double getPrice(){
        return price;
    }
}


public smallSize extends pizzaBase{
    public smallSize(){
        super(sizeType.SMALL, 15);
    }
}

public mediumSize extends pizzaBase{
    public mediumSize(){
        super(sizeType.MEDIUM, 18);
    }
}

public largeSize extends pizzaBase{
    public largeSize(){
        super(sizeType.LARGE, 20);
    }
}
