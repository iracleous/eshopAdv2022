package gr.codehub.eshopadv2022.service;

import gr.codehub.eshopadv2022.model.Product;

public class MarketImpl implements Market{
    @Override
    public Product findProduct(String productName) {
        return

                Product
                .builder()

                .id(12)
                .build();
    }
}
