package com.user.lost_found.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.user.lost_found.model.LostItem;
import com.user.lost_found.repository.LostItemRepository;

@Service
public class LostItemService {

    private final LostItemRepository repo;
    // constructor injection
    public LostItemService(LostItemRepository repo){
        this.repo = repo;
    }

    //CREATE
    public LostItem addItem(LostItem item){
        return repo.save(item);
    }

    //READ - Get all items
    public List<LostItem> getAllItems(){
        return repo.findAll();
    }

    //READ - Get by id
    public Optional<LostItem> getItemById(Long id){
        return repo.findById(id);
    }

    //UPDATE
    public LostItem updateItem(Long id, LostItem updatedItem){
        return repo.findById(id)
                .map(item -> {
                    item.setItemName(updatedItem.getItemName());
                    item.setDescription(updatedItem.getDescription());
                    item.setContactInfo(updatedItem.getContactInfo());
                    return repo.save(item);
                })
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + id));
    }

    //DELETE
    public void deleteItem(Long id){
        repo.deleteById(id);
    }

}
