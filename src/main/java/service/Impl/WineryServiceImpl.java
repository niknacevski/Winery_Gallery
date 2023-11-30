package service.Impl;

import model.Winery;
import org.springframework.stereotype.Service;
import service.WineryService;

import java.util.List;

@Service
public class WineryServiceImpl implements WineryService {

    private final WineryService wineryService;

    public WineryServiceImpl(WineryService wineryService) {
        this.wineryService = wineryService;
    }

    @Override
    public List<Winery> findAll() {
        return wineryService.findAll();
    }

    @Override
    public Winery findById(Long id) {
        return wineryService.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        wineryService.deleteById(id);

    }

    @Override
    public Winery save(String name, String address, String country, String description) {
        return wineryService.save(name, address, country, description);
    }

    @Override
    public Winery edit(Long id, String name, String address, String country, String description) {
        return wineryService.edit(id, name, address, country, description);
    }
}
