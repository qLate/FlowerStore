package ua.qLate.Store.Item.Decorator;

public class PaperDecorator extends ItemDecorator {
    @Override
    public String getDescription() {
        return "This is a paper decorator.";
    }
    @Override
    public double price() {
        return 13; //+ super.price();
    }
}
