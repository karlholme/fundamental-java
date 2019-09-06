package dependency.injection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class DatabaseTest {

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    /*
        Mocka alla klasser som används av Database-klassen och getAccounts-metoden.
        Få mockarna att bete sig så att getAccounts returnerar två konton.
        asserta att .size()  på getAccounts-metoden är 2.

        Tips: för att få en mock-metod att returnera olika saker vid successiva anrop
        kan man skriva when(...).thenReturn(värde 1, värde 2, ...)
     */
    @Test
    public void databaseTest() throws SQLException {
        assertTrue(false);
    }

}
