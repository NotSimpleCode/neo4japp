package ejemplo.neo4j.neo4japp.shiftlogs;
import org.springframework.stereotype.Service;


@Service
public class ShiftlogsMgmtServiceImpl{

    private final ShiftLogsRepository shiftLogsRepository;

    public ShiftlogsMgmtServiceImpl(ShiftLogsRepository shiftLogsRepository) {
        this.shiftLogsRepository = shiftLogsRepository;
    }

    
    public ShiftLogs saveShiftLogs(ShiftLogs shiftlog) {
        return shiftLogsRepository.save(shiftlog);
    }


    
} 
