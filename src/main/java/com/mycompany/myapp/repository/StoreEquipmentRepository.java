package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Store;
import com.mycompany.myapp.domain.StoreEquipment;

import com.mycompany.myapp.domain.User;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the StoreEquipment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StoreEquipmentRepository extends JpaRepository<StoreEquipment, Long>, JpaSpecificationExecutor<StoreEquipment> {
    public List<StoreEquipment>  findAllByEquipmentNameIgnoreCaseAndStore(String equipmentName, Store store);

    public Boolean existsByEquipmentNameIgnoreCaseAndStore(String equipmentName, Store store);
}
