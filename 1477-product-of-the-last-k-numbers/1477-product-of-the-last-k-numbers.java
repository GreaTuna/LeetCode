class ProductOfNumbers {
    private int size;
    private List<Integer> productList = new ArrayList<>();

    public ProductOfNumbers() {
        this.size = 0;
        this.productList.add(1);
    }
    
    public void add(int num) {
        if (num == 0) {
            size = 0;
            this.productList = new ArrayList<Integer>();
            this.productList.add(1);
        } else {
            productList.add(productList.get(size) * num);
            ++size;
        }
    }
    
    public int getProduct(int k) {
        if (k > size) {
            return 0;
        }

        return (
            productList.get(this.size) /
            productList.get(this.size - k)
        );
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */