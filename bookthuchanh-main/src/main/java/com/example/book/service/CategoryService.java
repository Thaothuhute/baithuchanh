package com.example.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.Model.Category;
import com.example.book.repository.ICategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        
        return categoryRepository.findAll();
    }
    public Category getCategoryById(Long id){
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if(optionalCategory.isPresent()){
            return optionalCategory.get();
        }else{
            throw new RuntimeException("Category not found");
        }
        
    }

    public void deleteCate(Long id){
        categoryRepository.deleteById(id);
    }

    
   public void updateCategory(Category category){
        categoryRepository.save(category);
   }

    //them loai
    public void addCategory(Category category){
        
        categoryRepository.save(category);
    }
    public void deleteCategory(Long id){
        
        categoryRepository.deleteById(id);
    }
}
