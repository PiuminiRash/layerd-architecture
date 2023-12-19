package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {
    ArrayList<ItemDTO> loadAllItem() throws SQLException, ClassNotFoundException;
    boolean itemDelete(String code) throws SQLException, ClassNotFoundException;
    boolean itemSaved(ItemDTO dto) throws SQLException, ClassNotFoundException;
    boolean itemUpdate(ItemDTO dto) throws SQLException, ClassNotFoundException;
    boolean isExist(String code) throws SQLException, ClassNotFoundException;
    String generateId() throws SQLException, ClassNotFoundException;
    ItemDTO searchItem(String newItemCode) throws SQLException, ClassNotFoundException;
}
