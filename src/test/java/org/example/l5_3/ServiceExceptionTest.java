package org.example.l5_3;

import static org.mockito.Mockito.*;

import org.example.l5_3.l5_3_3.DatabaseConnectionException;
import org.example.l5_3.l5_3_3.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.api.mockito.PowerMockito;


@RunWith(PowerMockRunner.class)
@PrepareForTest({DatabaseConnectionException.class, ServiceException.class})
public class ServiceExceptionTest {

    @Test(expected = Exception.class)
    public void testObtenirDonneesAvecException() throws Exception {
        // Préparer
        PowerMockito.whenNew(DatabaseConnectionException.class)
                .withArguments(isNull(String.class))
                .thenThrow(new Exception("URL invalide"));

        // Agir
        ServiceException service = new ServiceException(null); // Doit lever une exception
    }
}
