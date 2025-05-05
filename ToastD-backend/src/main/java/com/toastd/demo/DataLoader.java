package com.toastd.demo;

import com.toastd.demo.Entity.Product;
import com.toastd.demo.Entity.ProductList;
import com.toastd.demo.repository.ProductListRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader {

    private final ProductListRepository listRepo;

    public DataLoader(ProductListRepository listRepo) {
        this.listRepo = listRepo;
    }

    @PostConstruct
    public void loadData() {
        List<ProductList> lists = List.of(
                new ProductList(null, "ISB Essentials", "isb-essentials", "Must-haves for your MBA journey.", List.of(
                        new Product(null, "Bluetooth Speaker", "https://phonokart.com/cdn/shop/files/TribeBlue1.jpg?v=1724054342", 49.99, 10.0, "Gadgets", List.of("tech", "audio")),
                        new Product(null, "Smart Mug", "https://phonokart.com/cdn/shop/files/TribeBlue1.jpg?v=1724054342", 29.99, 5.0, "Lifestyle", List.of("coffee", "office"))
                )),
                new ProductList(null, "WFH Must-Haves", "wfh-must-haves", "Gear up your home office for peak productivity.", List.of(
                        new Product(null, "Ergonomic Chair", "https://rukminim2.flixcart.com/image/416/416/xif0q/gaming-chair/t/u/w/multi-purpose-ergonomic-gaming-chair-with-adjustable-seat-head-original-imagxush8s9eaqjq.jpeg?q=70&crop=false", 199.99, 15.0, "Furniture", List.of("comfort", "health")),
                        new Product(null, "Desk Organizer", "https://rukminim2.flixcart.com/image/416/416/xif0q/gaming-chair/t/u/w/multi-purpose-ergonomic-gaming-chair-with-adjustable-seat-head-original-imagxush8s9eaqjq.jpeg?q=70&crop=false", 19.99, 5.0, "Accessories", List.of("office", "tidy"))
                )),
                new ProductList(null, "Fitness Finds", "fitness-finds", "Top picks to boost your workout game.", List.of(
                        new Product(null, "Resistance Bands", "https://rukminim2.flixcart.com/image/416/416/xif0q/gaming-chair/t/u/w/multi-purpose-ergonomic-gaming-chair-with-adjustable-seat-head-original-imagxush8s9eaqjq.jpeg?q=70&crop=false", 14.99, 10.0, "Fitness", List.of("gym", "portable")),
                        new Product(null, "Smart Water Bottle", "https://rukminim2.flixcart.com/image/416/416/xif0q/gaming-chair/t/u/w/multi-purpose-ergonomic-gaming-chair-with-adjustable-seat-head-original-imagxush8s9eaqjq.jpeg?q=70&crop=false", 39.99, 8.0, "Hydration", List.of("tech", "health"))
                )),
                new ProductList(null, "Dorm Room Picks", "dorm-room-picks", "Smart, space-saving solutions for students.", List.of(
                        new Product(null, "Mini Fridge", "https://rukminim2.flixcart.com/image/416/416/xif0q/gaming-chair/t/u/w/multi-purpose-ergonomic-gaming-chair-with-adjustable-seat-head-original-imagxush8s9eaqjq.jpeg?q=70&crop=false", 129.99, 20.0, "Appliances", List.of("college", "essentials")),
                        new Product(null, "Clip-On Fan", "https://example.com/fan.jpg", 24.99, 10.0, "Comfort", List.of("summer", "portable"))
                )),
                new ProductList(null, "Creator Starter Pack", "creator-starter-pack", "Everything a budding content creator needs.", List.of(
                        new Product(null, "Ring Light", "https://example.com/ringlight.jpg", 34.99, 12.0, "Video", List.of("lighting", "selfie")),
                        new Product(null, "Lavalier Mic", "https://example.com/mic.jpg", 22.99, 6.0, "Audio", List.of("voice", "recording"))
                )),
                new ProductList(null, "Travel Essentials", "travel-essentials", "Smart gear for smooth travel.", List.of(
                        new Product(null, "Packing Cubes", "https://example.com/cubes.jpg", 27.99, 10.0, "Accessories", List.of("organization", "bags")),
                        new Product(null, "Neck Pillow", "https://example.com/pillow.jpg", 19.99, 5.0, "Comfort", List.of("sleep", "flight"))
                )),
                new ProductList(null, "Zen Desk Setup", "zen-desk-setup", "Calm meets productivity at your workspace.", List.of(
                        new Product(null, "Aroma Diffuser", "https://example.com/diffuser.jpg", 25.99, 8.0, "Wellness", List.of("calm", "essential oils")),
                        new Product(null, "Desk Plant", "https://example.com/plant.jpg", 15.99, 5.0, "Decor", List.of("green", "mood"))
                ))
        );

        listRepo.saveAll(lists);
    }
}