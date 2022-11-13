package ua.qLate.Store.Item.Flower;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#FFC0CB"), WHITE("#FFFFFF");
    private final String stringRepresentation;

    FlowerColor(final String stringRepresentationn) {
        this.stringRepresentation = stringRepresentationn;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
