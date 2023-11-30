package service;

import model.Winery;

import java.util.List;

public interface WineryService {
List<Winery> findAll();
Winery findById(Long id);
void deleteById(Long id);
Winery save(String name, String address, String country, String description);
Winery edit(Long id, String name, String address, String country, String description);
}
