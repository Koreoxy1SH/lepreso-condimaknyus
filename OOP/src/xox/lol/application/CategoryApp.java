package xox.lol.application;

import xox.lol.data.Category;

public class CategoryApp {

    public static void main(String[] args) {
        
        var category = new Category();

        category.setId("ID");
        category.setId(null);
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
    
}
