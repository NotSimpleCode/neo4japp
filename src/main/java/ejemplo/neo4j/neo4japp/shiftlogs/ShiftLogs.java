
package ejemplo.neo4j.neo4japp.shiftlogs;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;



import java.time.LocalDateTime;

@Node("Logs_Proyecto_SFII")
public class ShiftLogs {
    @Id @GeneratedValue(UUIDStringGenerator.class)
    private String shiftlogs_id;
    private String shiftlogs_table_name;
    private String shiftlogs_action;
    private LocalDateTime action_date;


    public ShiftLogs(String shiftlogs_id, String shiftlogs_table_name, String shiftlogs_action) {
        this.shiftlogs_id = shiftlogs_id;
        this.shiftlogs_table_name = shiftlogs_table_name;
        this.shiftlogs_action = shiftlogs_action;
        action_date = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return "ShiftLogs [shiftlogs_id=" + shiftlogs_id + ", shiftlogs_table_name=" + shiftlogs_table_name
                + ", shiftlogs_action=" + shiftlogs_action + ", action_date=" + action_date + "]";
    }





}
