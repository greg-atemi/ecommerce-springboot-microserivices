package io.github.gregatemi.inventoryservice.service;

import java.util.List;

import io.github.gregatemi.inventoryservice.model.InventoryCreateDto;
import io.github.gregatemi.inventoryservice.model.InventoryResponse;

public interface InventoryService {

    InventoryResponse createInventory(InventoryCreateDto inventoryCreateDto);

    Boolean checkInventory(List<String> productCodes, List<Integer> productQuantities);
    
}
