
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.rh.achat.entities.Reglement;

import tn.esprit.rh.achat.repositories.ReglementRepository;

import tn.esprit.rh.achat.services.ReglementServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
@Slf4j
public class ReglementServiceTest {

    @Mock
    ReglementRepository reglementRepository;

    @InjectMocks
    ReglementServiceImpl reglementService;

    Reglement  reglement = new Reglement( 012322023L,478898,7892546,true,null);
    List <Reglement> reglementList = new ArrayList<Reglement>(){
        {add (reglement);
           add (reglement = new Reglement(012242023L,47856,5002,true,null));
            add (reglement = new Reglement(012220523L,45556,5002,true,null));

        } };
    @Test
    public void testgetRegment(){
        Mockito.when(reglementRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(reglement));
        Reglement r =reglementService.retrieveReglement(1L);
        Assertions.assertNotNull(r);
    log.info("get===>"+ r.toString());}
}