package models.shop;

 public class Product {
        private String productName;
        private int amount;
        private double price;
        private double totalPrice;


        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public int getAmount() {
            return amount;
        }

        public Product setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Product setPrice(double price) {
            this.price = price;
            return this;
        }

        public Product setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Product setAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public void increaseAmount(Product product) {
            this.amount += product.getAmount();
            this.totalPrice = amount * price;
        }

    }
