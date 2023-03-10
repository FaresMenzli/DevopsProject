

package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.rh.achat.entities.Facture;
import tn.esprit.rh.achat.repositories.FactureRepository;

import java.util.Optional;


@ExtendWith(MockitoExtension.class)
public class FactureServiceTest {

    @Mock
    FactureRepository facturerepo;

    @InjectMocks
   FactureServiceImpl  factureService;

    Facture facture = new Facture(001222023L,1200, 0, null, null, null, null, null, null);

    @Test
    public void findFactureTest(long l){
        Mockito.when(facturerepo.findById(Mockito.anyLong())).thenReturn(Optional.of(facture));
        Facture f = factureService.retrieveFacture(1L);
        Assertions.assertNotNull(f);
    }
}

