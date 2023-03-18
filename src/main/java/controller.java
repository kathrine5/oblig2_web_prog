import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller {

    public final List<billettinfo> Bilettregister = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(billettinfo a){
        Bilettregister.add(a);
    }

    @GetMapping("/hentAlle")
    public List<billettinfo> hentAlle(){
        return Bilettregister;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        Bilettregister.clear();
    }
}
