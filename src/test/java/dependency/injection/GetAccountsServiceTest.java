package dependency.injection;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/*
    Den här test-klassen är ett exempel på hur man använder Mockito för att mocka klassen man vill testas omgivning.
    På så sätt slipper man skapa upp en hela universum för att testa en den lilla klassen på toppen.
 */
@Ignore
public class GetAccountsServiceTest {

    @Mock
    Database database;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAccounts() {
        when(database.getAccounts(anyString())).thenReturn(Arrays.asList("123", "456"));
        GetAccountsService service = new GetAccountsService(database);

        int numberOfResultsFromService = service.getAccounts("199209041234").size();

        assertEquals(2, numberOfResultsFromService);
    }

    @Test(expected = RuntimeException.class)
    public void getAccountsThrowsException() {
        when(database.getAccounts(anyString())).thenReturn(Arrays.asList("123", "456"));
        GetAccountsService service = new GetAccountsService(database);

        service.getAccounts("Some invalid customerId");
    }
}
