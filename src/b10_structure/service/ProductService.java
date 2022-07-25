/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.service;

import b10_structure.model.Product;
import b10_structure.repository.ProductRepository;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phongtt
 */
public class ProductService {
    
    private final ProductRepository repository;
    
    public ProductService() {
        repository = new ProductRepository();
    }
    
    public List<Product> getAllProducts() {
        try {
            // Gọi Repo lấy danh sách Sản phẩm từ CSDL
            return repository.getAll();
        } catch (SQLException ex) {
            // trả về null nếu có lỗi
            return null; 
        }
    }
}
