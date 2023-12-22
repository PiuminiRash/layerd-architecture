package com.example.layeredarchitecture.bo.custom.impl;

import com.example.layeredarchitecture.bo.ItemBo;
import com.example.layeredarchitecture.dao.ItemDAO;
import com.example.layeredarchitecture.dao.Impl.ItemsDAOImpl;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBo {
    ItemDAO itemDAO=new ItemsDAOImpl();

    @Override
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    @Override
    public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.save(dto);
    }

    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }

    @Override
    public String generateItemId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean existItem(String dto) throws SQLException, ClassNotFoundException {
        return false;
    }
}
