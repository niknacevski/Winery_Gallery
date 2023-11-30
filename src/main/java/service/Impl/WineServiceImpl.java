package service.Impl;

import model.Wine;
import model.Winery;
import org.springframework.stereotype.Service;
import service.WineService;

import java.util.List;

@Service
public class WineServiceImpl implements WineService {

    private final WineService wineService;

    public WineServiceImpl(WineService wineService) {
        this.wineService = wineService;
    }

    @Override
    public List<Wine> findAll() {
        return wineService.findAll();
    }

    @Override
    public Wine findById(Long id) {
        return wineService.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        wineService.deleteById(id);
    }

    @Override
    public Wine save(String name, String type, String description, Long wineryId) {
        return wineService.save(name, type, description, wineryId);
    }

    @Override
    public Wine edit(Long id, String name, String type, String description, Long wineryId) {
        return wineService.edit(id, name, type, description, wineryId);
    }

    @Override
    public void addWineToWinery(Wine wine, Winery winery) {
        wineService.addWineToWinery(wine, winery);
    }
}
