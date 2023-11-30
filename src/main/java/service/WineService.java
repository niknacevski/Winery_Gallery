package service;

import model.Wine;
import model.Winery;

import java.util.List;

public interface WineService {
List<Wine> findAll();
Wine findById(Long id);
void deleteById(Long id);
Wine save(String name, String type, String description, Long wineryId);
Wine edit(Long id, String name, String type, String description, Long wineryId);
void addWineToWinery(Wine wine, Winery winery);
}
