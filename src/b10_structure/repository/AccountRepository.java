/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b10_structure.repository;

import b10_structure.model.Account;

/**
 *
 * @author phongtt
 */
public class AccountRepository {
    
    private final static Account[] accounts = new Account[] {
        new Account("phongtt35", "123456"),
        new Account("admin", "admin")
    };
    
    public Account getAccountByUsername(String username) {
        for(Account account : accounts) { // Duyệt danh sách tài khoản
            // Nếu tài khoản trùng với tên cần tìm thì trả về
            if (account.getUsername().equalsIgnoreCase(username)) {
                return account;
            }
        }
        
        // Không tìm thấy thì trả về NULL
        return null;
    }
}
