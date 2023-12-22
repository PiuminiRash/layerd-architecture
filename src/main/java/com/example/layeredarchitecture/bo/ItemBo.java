package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {
    ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    boolean saveItem(ItemDTO dto) throws SQLException,ClassNotFoundException;
    boolean updateItem(ItemDTO dto) throws SQLException,ClassNotFoundException;
    String generateItemId() throws SQLException,ClassNotFoundException;
    boolean existItem(String dto) throws SQLException,ClassNotFoundException;
}
