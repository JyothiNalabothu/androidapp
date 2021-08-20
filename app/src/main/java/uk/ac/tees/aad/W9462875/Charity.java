package uk.ac.tees.aad.W9462875;

public class Charity {
    private String name;
    private String address;
    private float lat;
    private float lng;
    private String description;
    private String image;
    private String bankAcc;

    public String getName() {
        return name;
    }

    public String getBankAcc() {
        return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
        this.bankAcc = bankAcc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Charity(String name, String address, float lat, float lng, String description, String image) {

        this.name = name;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.description = description;
        this.image = image;
    }

    public Charity() {
    }
}
