public enum Capacity {

    BOEING767(100),
    AIRBUS310(80);


    private final int value;

    Capacity(int value){
        this.value = value;
    }

        public int getValue() {
        return this.value;
    }
}
