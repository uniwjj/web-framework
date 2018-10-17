package com.beidou.controller;

import com.beidou.model.Customer;
import com.beidou.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 客户
 *
 * @author ginger
 * @create 2018-10-16 21:56
 */
@Slf4j
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {

    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList();
        log.info("customers are {}", customerList);
        req.setAttribute("customerList", customerList);
        req.getRequestDispatcher("/WEB-INF/jsp/customer.jsp").forward(req, resp);
    }
}
