package com.wenhao.netshop.email;

import com.wenhao.netshop.domain.Order;

/**
 * Created by lw on 2016/11/8.
 */
public interface OrderManager {
    void placeOrder(Order order);
}
