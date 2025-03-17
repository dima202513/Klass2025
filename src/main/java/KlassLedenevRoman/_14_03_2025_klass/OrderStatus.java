package KlassLedenevRoman._14_03_2025_klass;

public enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED;

    public OrderStatus next() {

        switch (this) {
            case NEW : return PROCESSING;
            case PROCESSING: return SHIPPED;
            case SHIPPED: return DELIVERED;
            default: return this;
        }
    }


}

//Создать метод next(), который получает следующее состояние:
//        -    NEW → PROCESSING → SHIPPED → DELIVERED
//-    CANCELED и DELIVERED – конечные состояния.
//Создать методы: