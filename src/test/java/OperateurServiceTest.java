import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.rh.achat.entities.Operateur;
import tn.esprit.rh.achat.repositories.OperateurRepository;
import tn.esprit.rh.achat.services.OperateurServiceImpl;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
@Slf4j
public class OperateurServiceTest {
    // comment for test

    @Mock
    OperateurRepository operateurRepository;

    @InjectMocks
    OperateurServiceImpl operateurService;

    Operateur operateur = new Operateur((long) 1472536, "aa","bbb","azer");
  
    
    
    /**
     * 
     */
    @Test
    public void testgetOperateur(){
        Mockito.when(operateurRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(operateur));
        Operateur o =operateurService.retrieveOperateur(1L);
        Assertions.assertNotNull(o);
    
    }
   
}
