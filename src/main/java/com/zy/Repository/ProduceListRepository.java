package com.zy.Repository;

import com.zy.Entry.ProduceList;
import com.zy.Entry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduceListRepository extends JpaRepository<ProduceList,String> {
    ProduceList findByListId(String proListId);
}
