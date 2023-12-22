package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrderDAO extends CrudDAO<OrderDTO>{

}
