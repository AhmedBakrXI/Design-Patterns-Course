public class ConcreteBuilder1 extends Builder{
    private Product _product = new Product();
    @Override
    public void BuildPartA() {
        _product.addPart("PartA");
    }

    @Override
    public void BuildPartB() {
        _product.addPart("PartB");
    }

    @Override
    public Product getResult() {
        return _product;
    }
}
