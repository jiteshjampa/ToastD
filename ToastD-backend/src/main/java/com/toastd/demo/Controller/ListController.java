package com.toastd.demo.Controller;


import com.toastd.demo.Entity.ProductList;
import com.toastd.demo.Service.ProductListService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/lists")
public class ListController {

    private final ProductListService service;

    public ListController(ProductListService service) {
        this.service = service;
    }

    @GetMapping("/{slug}")
    public ProductList getListBySlug(@PathVariable String slug) {
        return service.getBySlug(slug)
                .orElseThrow(() -> new RuntimeException("List not found"));
    }
}
