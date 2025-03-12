package KlassLedenevRoman._11_03_2025KlassArbeit;

public enum Country {
CANADA("CAD"),
POLAND("PLN"),
GERMANY("EUR");
//LASPAPAS,
//ZIMKABU;
private String currency;
Country(String currency){
    this.currency= currency;
}

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

//    @Override
//    public String toString() {
//        return name() + "{" + "currency=" + currency + "\" + "}";
    }

