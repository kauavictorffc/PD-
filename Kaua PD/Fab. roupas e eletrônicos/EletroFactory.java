class EletroFactory implements Factory {
    @Override
    public Clothing createClothing() {
        return new Jacket();
    }

    @Override
    public Eletro createEletro() {
        return new Smartphone();
    }
}
