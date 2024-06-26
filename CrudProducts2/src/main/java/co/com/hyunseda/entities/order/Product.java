/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.hyunseda.entities.order;

import co.unicauca.microkernel.common.entities.Category;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author Libardo Pantoja, Julio Hurtado
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    
    private String description;
    
    private String slug;
    
    private double price;
    @JsonProperty("stock")
    private int stock;
    
    private String keywords;
    
    private String images;
    
    private String characteristics;
    
    private List<Category> categories;
    
    //private Location location;
    
   // private User user;
    
    public Product(Long id, String name, String description, String slug, double price, int stock, 
            String keywords, String images, String characteristics, List<Category> categories) {
        
        this.id = id;
        this.name = name;
        this.description = description;
        this.slug = slug;
        this.price = price;
        this.stock = stock;
        this.keywords = keywords;
        this.images = images;
        this.characteristics = characteristics;
        this.categories = categories;
    }

    

    public Product() {
    }
        
    public Long getProductId() {
        return id;
    }

    public void setProductId(Long productId) {
        this.id = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /*
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }*/

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    public String getKeywords() {
        return keywords;
    }
    
    /*
    public String getConqKeywords(){
        if(keywords == null){
            return "";
        }
        else
            return keywords.stream().collect(Collectors.joining(" "));
    }
    
    public String getConqImages(){
        if(images == null){
            return "";
        }
        else
            return images.stream().collect(Collectors.joining(" ")); 
    }
    */
    public String getConqCategories(){
       String resultado = "";
       if(categories == null){
            return "";
        }
       else{
            for(Category cat: categories){
                resultado = resultado  + " " + cat.getName();
            }
            return resultado;
       }
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


}