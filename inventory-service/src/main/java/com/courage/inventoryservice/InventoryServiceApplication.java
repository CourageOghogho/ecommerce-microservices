package com.courage.inventoryservice;

import com.courage.inventoryservice.model.Inventory;
import com.courage.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory= Inventory.builder()
					.skuCode("Iphone_12_black ")
					.quantity(12)
					.build();
			Inventory inventory2= Inventory.builder()
					.skuCode("Iphone_13_red ")
					.quantity(0)
					.build();
			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory2);
		};
	}

}
