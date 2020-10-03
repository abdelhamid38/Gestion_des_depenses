package Tooles;

public class Produits {
    private int Id;
    private String information;
    private String unity;
    private Double quantity;
    private Double price;
    private Double mantant;

    public Produits(int id, String information, String unity, Double quantity, Double price, Double mantant) {
        this.Id = id;
        this.information = information;
        this.unity = unity;
        this.quantity = quantity;
        this.price = price;
        this.mantant = mantant;
    }
    public Produits(int id, String information, String unity, Double quantity, Double price) {
        this.Id = id;
        this.information = information;
        this.unity = unity;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * @return the id
     */

    public int getId() {
        return Id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.Id = id;
    }

    /**
     * @return the information
     */
    public String getInformation() {
        return information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /**
     * @return the unity
     */
    public String getUnity() {
        return unity;
    }

    /**
     * @param unity the unity to set
     */
    public void setUnity(String unity) {
        this.unity = unity;
    }

    /**
     * @return the quantity
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the price
     */
    public Double getMantant() {
        return mantant;
    }

    /**
     * @param mantant the price to set
     */
    public void setMantant(Double mantant) {
        this.mantant = mantant;
    }

}
