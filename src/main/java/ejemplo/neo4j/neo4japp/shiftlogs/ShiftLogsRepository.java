package ejemplo.neo4j.neo4japp.shiftlogs;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ShiftLogsRepository extends Neo4jRepository<ShiftLogs, String>{
    
}
