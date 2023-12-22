package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBo {
    ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
    boolean saveCustomer(CustomerDTO dto) throws SQLException,ClassNotFoundException;
    boolean updateCustomer(CustomerDTO dto) throws SQLException,ClassNotFoundException;
    String generateId() throws SQLException,ClassNotFoundException;
    boolean existCustomer(String dto) throws SQLException,ClassNotFoundException;
}
