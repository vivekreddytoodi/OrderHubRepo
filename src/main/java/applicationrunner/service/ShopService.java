package applicationrunner.service;

import applicationrunner.model.Shop;

import java.util.List;

public interface ShopService {

    List<Shop> findNearbyShops(double latitude, double longitude, double radius);

    Shop getShopDetails(Long shopId);
}
