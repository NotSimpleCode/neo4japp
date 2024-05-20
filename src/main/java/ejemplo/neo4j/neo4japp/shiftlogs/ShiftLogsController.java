package ejemplo.neo4j.neo4japp.shiftlogs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/logs")
public class ShiftLogsController {

    private final ShiftlogsMgmtServiceImpl shiftlogsMgmtServiceImpl;

    
    public ShiftLogsController(ShiftlogsMgmtServiceImpl shiftlogsMgmtServiceImpl) {
        this.shiftlogsMgmtServiceImpl = shiftlogsMgmtServiceImpl;
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
    public String createUser(@RequestBody ShiftLogs shiftlog) {
        shiftlogsMgmtServiceImpl.saveShiftLogs(shiftlog);
        return "Shiftlog created" + shiftlog.toString();
    }
}
