class ClothingFactory implements Factory {
    @Override
    public Clothing createClothing() {
        return new Shirt();
    }

    @Override
    public Eletro createEletro() {
        return new ClothingEletro();
    }
}
