package com.pfa.microMap.repository;

import com.pfa.microMap.model.Call;
import com.pfa.microMap.model.MyNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CallRepository extends Neo4jRepository<Call,Long> {
}
