package com.user.lost_found.controller;

import com.user.lost_found.model.LostItem;
import com.user.lost_found.service.LostItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lost")
public class LostItemController {

    private final LostItemService service;
    // constructor injection
    public LostItemController(LostItemService service){
        this.service = service;
    }

    @PostMapping
    public LostItem addLostItem(@RequestBody LostItem item){
        return service.addItem(item);
    }

    @GetMapping
    public List<LostItem> getLostItem(){
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public LostItem getItemById(@PathVariable Long id){
        return service.getItemById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + id));
    }

    @PutMapping("/{id}")
    public LostItem updateItem(@PathVariable Long id, @RequestBody LostItem updatedItem){
        return service.updateItem(id, updatedItem);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id){
        service.deleteItem(id);
    }

}
